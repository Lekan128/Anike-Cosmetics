package ng.com.anikecosmetics.controller;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.view.WindowManager;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import ng.com.anikecosmetics.model.Product;

public class Util {

    public static final String PRODUCT_INTENT_EXTRA
            = "ng.com.anikecosmetics.controller.PRODUCT_INTENT_EXTRA";

    public static final String PRODUCT_IMAGES_LINK_LIST_INTENT_EXTRA
            = "ng.com.anikecosmetics.controller.PRODUCT_IMAGES_LINK_LIST_INTENT_EXTRA";

    public static final String NAIRA = "₦";

    public static final String PASSWORD_ENCODER_KEY = "1Hbfh667adfDEJ78";

    public static final String PASSWORD1 = "PmknoyPi8/JCzNHRyH7mmjkWw+GdJNxGxcH/O9wPH1I=";

    public static final String PASSWORD2 = "FYZMeqzwtY+l3umAohDqNli4KEZAKKn7FU6C0u6gtWY=";
    public static final String CONTACT_NUMBER = "+2348050826782";

    public static final int NO_OF_PRODUCTS_PER_PAGE = 10;

    public static boolean showingJumiaPrice = false;


    public static boolean isValidString(String s){
        return s!=null && !s.isEmpty();
    }

    public static  void disableActivityTouch(Activity activity) {
        activity.getWindow().setFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE,
                WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE);
    }
    public static  void enableActivityTouch(Activity activity) {
        activity.getWindow().clearFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE);

    }

    /**
     * S=sellerPrice
     * jumiaPrice = (0.2S + S) +1150 = (1.2S)+1150
     * S = (jumiaPrice - 1150)/1.2
     *  */
    public static double convertToSellerPrice(String priceString){
        double jumiaPrice = Double.parseDouble(priceString);
        return (jumiaPrice - 1150)/1.2;
        //
    }

    public static void contactUs(Activity activity, String message){
        String url = "https://api.whatsapp.com/send?phone="+CONTACT_NUMBER;
        if (message != null) {
            try {
                url = url + "&text=" + URLEncoder.encode(message, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        activity.startActivity(i);
    }

    public static String getInStockMessage(){
        return "Hello, \ndo you have [product name] in stock?";
    }

    public static String getBuyMessage(String productName, String productSKU){
        return "Hello, \nI will like to purchase " + productName + " \nSKU: " + productSKU;
    }

    public static void contactDevWhatsApp(Activity activity, String message){
        String url = "https://api.whatsapp.com/send?phone=+2348062740991";
        if (message != null) {
            try {
                url = url + "&text=" + URLEncoder.encode("\n\nError: "+message, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        activity.startActivity(i);
    }

    public static void contactDevEmail(Activity activity, String message) {
        String[] addresses = new String[]{"olalekanamoo128@gmail.com"};
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setType("*/*");
        intent.putExtra(Intent.EXTRA_EMAIL, addresses);
        intent.putExtra(Intent.EXTRA_SUBJECT, "Error in Anike Cosmetics App");
        intent.putExtra(Intent.EXTRA_TEXT, "\n\nError: "+message);
        if (intent.resolveActivity(activity.getPackageManager()) != null) {
            activity.startActivity(intent);
        }
    }

}
