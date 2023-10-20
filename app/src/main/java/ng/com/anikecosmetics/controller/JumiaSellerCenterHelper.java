package ng.com.anikecosmetics.controller;

import android.util.Log;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.*;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import ng.com.anikecosmetics.model.jumia.ProductInfo;
import ng.com.anikecosmetics.model.jumia.error.ErrorHead;

public class JumiaSellerCenterHelper {
    private static final String ScApiHost = "https://sellercenter-api.jumia.com.ng/";
    private static final String HASH_ALGORITHM = "HmacSHA256";
    private static final String CHAR_UTF_8 = "UTF-8";
    private static final String CHAR_ASCII = "ASCII";
    private static final String USER_ID = "olalekanamoo128@gmail.com";
    private static final String APIKEY = "173180b4617fac33d28d22ef5afb391abb5b153d";

    private final SellerCenterListener listener;

    private boolean allowRefresh;

    public JumiaSellerCenterHelper(SellerCenterListener listener) {
        this.listener = listener;
    }

    public void getProductInfoList() {
        getProductInfoList(0);
    }
    public void getProductInfoList(int offset) {
        allowRefresh = false;
        Log.d("JumiaSellerCenterHelper", "Getting Product");
        Map<String, String> params = new HashMap<>();
        params.put("UserID", USER_ID);
        params.put("Timestamp", getCurrentTimestamp());
        params.put("Version", "1.0");
        params.put("Action", "GetProducts");
        params.put("Offset", String.valueOf(offset));
        params.put("Limit", String.valueOf(Util.NO_OF_PRODUCTS_PER_PAGE));
        params.put("Format", "JSON");

        final String XML = "";

//        final String out = getOut();
        String request = getSellercenterApiResponse(params, APIKEY, XML);
        startThreadToGetProduct(XML, request);

        // provide XML as an empty string when not needed
        // print out the XML response

//        Log.d("JumiaSellerCenterHelperyyy", ab);
//        System.out.println(out);
//
//        try {
//            return getProductInfoListFromJson(out);
//        } catch (JsonProcessingException e) {
//            throw new RuntimeException(e);
//        }
    }

    public void searchProductInfoList(String searchParam) {
        allowRefresh=true;
        Log.d("JumiaSellerCenterHelper", "Getting Product");
        Map<String, String> params = new HashMap<>();
        params.put("UserID", USER_ID);
        params.put("Timestamp", getCurrentTimestamp());
        params.put("Version", "1.0");
        params.put("Action", "GetProducts");
        params.put("Format", "JSON");
        params.put("Search", searchParam);

        final String XML = "";

        String request = getSellercenterApiResponse(params, APIKEY, XML);
        startThreadToGetProduct(XML, request);
    }

    private static List<ProductInfo> getProductInfoListFromJson(String jsonString) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode rootNode = objectMapper.readTree(jsonString);

        // Get the 'Product' node from the JSON response
        JsonNode productNode = rootNode.path("SuccessResponse").path("Body").path("Products").path("Product");

        // Check if the 'Product' node is an array or a single object
        List<ProductInfo> productInfos = new ArrayList<>();
        if (productNode.isArray()) {
            // If it's an array, deserialize each element
            for (JsonNode node : productNode) {
                ProductInfo productInfo = objectMapper.treeToValue(node, ProductInfo.class);
                productInfos.add(productInfo);
            }
        } else if (productNode.isObject()) {
            // If it's a single object, deserialize it and add it to the list
            ProductInfo productInfo = objectMapper.treeToValue(productNode, ProductInfo.class);
            productInfos.add(productInfo);
        }

        productInfos.forEach(System.out::println);

        return productInfos;
    }


    /**
     * calculates the signature and sends the request
     *
     * @param params Map - request parameters
     * @param apiKey String - user's API Key
     * @param XML String - Request Body
     */
    public String getSellercenterApiResponse(Map<String, String> params, String apiKey, String XML) {
        String queryString = "";
        Map<String, String> sortedParams = new TreeMap<String, String>(params);
        queryString = toQueryString(sortedParams);
        final String signature = hmacDigest(queryString, apiKey, HASH_ALGORITHM);
        System.out.println("Signature " + signature);
        queryString = queryString.concat("&Signature=".concat(signature));
        final String request = ScApiHost.concat("?".concat(queryString));
//        https://sellercenter-api.jumia.com.ng/?Action=GetProducts&Format=JSON&Timestamp=2023-10-01T15%3A04%2B0000&UserID=olalekanamoo128%40gmail.com&Version=1.0&Signature=c1bf1fde047c82f0b21681730de96279fd4ce54da5ee2ba6430d142932eaa6f3

        return request;
    }

    private void startThreadToGetProduct(String XML, String request) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("running");
                    String out = getJsonFromUrl(request, XML);
                    Log.d("jsonst: ", out);
                    System.out.println("####: " + out);

                    if (isError(out)){
                        ErrorHead error = getError(out);
                        String errorMessage = error.getErrorMessage();
                        String requestAction = error.getRequestAction();
                        listener.error(requestAction, errorMessage);
                    } else {
//                        getProductInfoListFromJson(out);
                        List<ProductInfo> productInfoList = getProductInfoListFromJson(out);
                        listener.productsGotten(productInfoList);
                    }

                } catch (IOException e) {
                    listener.error("GettingProduct", e.getMessage());
                }
            }
        }).start();
    }


    private static String getJsonFromUrl(String request, String XML) throws IOException {
        String Output = "";
        HttpURLConnection connection = null;
        URL url = null;
        url = new URL(request);
        connection = (HttpURLConnection) url.openConnection();
        connection.setDoOutput(true);
        connection.setDoInput(true);
        connection.setInstanceFollowRedirects(false);
        connection.setRequestMethod("GET");
        connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        connection.setRequestProperty("charset", CHAR_UTF_8);
        connection.setUseCaches(false);
        if (!XML.equals("")) {
            connection.setRequestProperty("Content-Length", "" + Integer.toString(XML.getBytes().length));
            DataOutputStream wr = new DataOutputStream(connection.getOutputStream());
            wr.writeBytes(XML);
            wr.flush();
            wr.close();
        }
        String line;
        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        while ((line = reader.readLine()) != null) {
            Output += line + "\n";
        }
        return Output;
    }

    /**
     * generates hash key
     *
     * @param msg
     * @param keyString
     * @param algo
     * @return string
     */
    private static String hmacDigest(String msg, String keyString, String algo) {
        String digest = null;
        try {
            SecretKeySpec key = new SecretKeySpec((keyString).getBytes(CHAR_UTF_8), algo);
            Mac mac = Mac.getInstance(algo);
            mac.init(key);
            final byte[] bytes = mac.doFinal(msg.getBytes(CHAR_ASCII));
            StringBuffer hash = new StringBuffer();
            for (int i = 0; i < bytes.length; i++) {
                String hex = Integer.toHexString(0xFF & bytes[i]);
                if (hex.length() == 1) {
                    hash.append('0');
                }
                hash.append(hex);
            }
            digest = hash.toString();
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException | InvalidKeyException e) {
            e.printStackTrace();
        }
        return digest;
    }

    /**
     * build querystring out of params map
     *
     * @param data map of params
     * @return string
     * @throws UnsupportedEncodingException
     */
    private static String toQueryString(Map<String, String> data) {
        String queryString = "";
        try{
            StringBuffer params = new StringBuffer();
            for (Map.Entry<String, String> pair : data.entrySet()) {
                params.append(URLEncoder.encode((String) pair.getKey(), CHAR_UTF_8) + "=");
                params.append(URLEncoder.encode((String) pair.getValue(), CHAR_UTF_8) + "&");
            }
            if (params.length() > 0) {
                params.deleteCharAt(params.length() - 1);
            }
            queryString = params.toString();
        } catch(UnsupportedEncodingException e){
            e.printStackTrace();
        }
        return queryString;
    }

    /**
     * returns the current timestamp
     * @return current timestamp in ISO 8601 format
     */
    private static String getCurrentTimestamp(){
        final TimeZone tz = TimeZone.getTimeZone("UTC");
        final DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mmZ");
        df.setTimeZone(tz);
        final String nowAsISO = df.format(new Date());
        return nowAsISO;
    }
    private static ErrorHead getError(String jsonString) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode rootNode = objectMapper.readTree(jsonString);

        JsonNode errorNode = rootNode.path("ErrorResponse").path("Head");

        return objectMapper.treeToValue(errorNode, ErrorHead.class);
    }

    public interface SellerCenterListener{
        void productsGotten(List<ProductInfo> productInfos);
        void error(String requestAction, String errorMessage);
    }

    private boolean isError(String result){
        return result.startsWith("{\"ErrorResponse\"");
    }

    public boolean isAllowRefresh() {
        return allowRefresh;
    }
    public void allowRefresh() {
        allowRefresh = true;
    }
}
