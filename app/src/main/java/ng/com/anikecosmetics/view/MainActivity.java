package ng.com.anikecosmetics.view;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.app.ActivityCompat;
import androidx.core.os.HandlerCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;

import android.os.Handler;
import android.os.Looper;
import android.provider.MediaStore;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.scottyab.aescrypt.AESCrypt;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.List;
import java.util.Objects;

import io.reactivex.Flowable;
import ng.com.anikecosmetics.R;
import ng.com.anikecosmetics.controller.JumiaSellerCenterHelper;
import ng.com.anikecosmetics.controller.ProductRecyclerAdapter;
import ng.com.anikecosmetics.controller.Util;
import ng.com.anikecosmetics.model.Product;
import ng.com.anikecosmetics.model.jumia.ProductInfo;

public class MainActivity extends AppCompatActivity implements JumiaSellerCenterHelper.SellerCenterListener{

    private ImageView addImageDialog;
//    private final FirebaseHelper firebaseHelper = new FirebaseHelper(this);

    private byte[] imageBytes = null;
    private BottomSheetDialog bottomSheetDialog;
    private ProgressBar mProgressBar;

    private CardView adminCard;
    private FloatingActionButton fab;
    private ImageView searchImage;
    private EditText searchEditTest;
    private JumiaSellerCenterHelper helper;
    private ProductRecyclerAdapter adapter;
    private TextView pageNoTextView;
    private View pageSelectionLayout;
    private boolean searching = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hidePriceToggle();

        SharedPreferences sharedPref = getPreferences(Context.MODE_PRIVATE);
        boolean isAdmin = sharedPref.getBoolean(getString(R.string.admin), false);

        Util.disableActivityTouch(this);

        helper = new JumiaSellerCenterHelper(this);
        helper.getProductInfoList();

        mProgressBar = findViewById(R.id.mainProgressBar);
        fab = findViewById(R.id.addProductFloatingActionButton);
        searchEditTest = findViewById(R.id.searchEditText);
        searchImage = findViewById(R.id.searchImageView);
        adminCard= findViewById(R.id.adminCard);
        pageNoTextView = findViewById(R.id.pageNumberTextView);
        pageSelectionLayout = findViewById(R.id.pageSelectionLayout);


        if (isAdmin){
            showPriceToggle();
        }

        jumiaPriceSellerPriceToggle();

        onClickListeners();
        pageSelectionClickListeners();
    }

    private void pageSelectionClickListeners() {
        View prevPage = findViewById(R.id.prevPageArrow);
        View nxtPage = findViewById(R.id.nxtPageArrow);

        nxtPage.setOnClickListener(v -> {
            String pageNoSt = pageNoTextView.getText().toString();
            int pageNo = Integer.parseInt(pageNoSt);

            int skip = (pageNo) * Util.NO_OF_PRODUCTS_PER_PAGE;

            Util.disableActivityTouch(this);
            mProgressBar.setVisibility(View.VISIBLE);

            helper.getProductInfoList(skip);

            pageNoTextView.setText(String.valueOf(pageNo+1));
            //here
        });
        prevPage.setOnClickListener(v -> {
            String pageNoSt = pageNoTextView.getText().toString();
            int pageNo = Integer.parseInt(pageNoSt);

            if (pageNo <= 1) return;

            int skip = (pageNo - 2) * Util.NO_OF_PRODUCTS_PER_PAGE;

            Util.disableActivityTouch(this);
            mProgressBar.setVisibility(View.VISIBLE);

            helper.getProductInfoList(skip);

            pageNoTextView.setText(String.valueOf(pageNo-1));
        });
    }

    private void jumiaPriceSellerPriceToggle(){
        CardView jumiaPrice = findViewById(R.id.jumiaPriceCard);
        CardView sellerPrice = findViewById(R.id.sellerPriceCard);

        jumiaPrice.setOnClickListener(v -> {
            if(Util.showingJumiaPrice) return;
            jumiaPrice.setCardBackgroundColor(getColor(R.color.green));
            sellerPrice.setCardBackgroundColor(getColor(R.color.off_pink));
            Util.showingJumiaPrice = true;
            adapter.reload();
        });

        sellerPrice.setOnClickListener(v -> {
            if(!Util.showingJumiaPrice) return;
            jumiaPrice.setCardBackgroundColor(getColor(R.color.off_pink));
            sellerPrice.setCardBackgroundColor(getColor(R.color.green));
            Util.showingJumiaPrice = false;
            adapter.reload();
        });
    }

    private void onClickListeners(){
        adminCard.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                LayoutInflater inflater = LayoutInflater.from(MainActivity.this);
                View view = inflater.inflate(R.layout.login_layout, null);
                AlertDialog loginDialog = new AlertDialog.Builder(MainActivity.this).create();
                loginDialog.setView(view);
                EditText password1 = view.findViewById(R.id.editTextPassword1);
                EditText password2 = view.findViewById(R.id.editTextPassword2);
                view.findViewById(R.id.buttonLogin)
                        .setOnClickListener(v1 -> {
                            String password1st = password1.getText().toString();
                            String password2st = password2.getText().toString();

                            password1st = encryptPassword(password1st);
                            password2st = encryptPassword(password2st);

                            if (Objects.equals(password1st, Util.PASSWORD1)
                                    && Objects.equals(password2st, Util.PASSWORD2)){
                                makeAdmin();
                                showPriceToggle();
                                Log.d("showPrice", "onLongClick: true");

                            }
                            loginDialog.dismiss();
                            Log.d("showPrice", "onLongClick: false");
                        });
                loginDialog.show();
                return true;
            }
        });

        searchImage.setOnClickListener(view ->{
            String search = searchEditTest.getText().toString();
            mProgressBar.setVisibility(View.VISIBLE);

            if (Util.isValidString(search)){
                searching = true;
                pageSelectionLayout.setVisibility(View.GONE);
                hideKeyboard();
                helper.searchProductInfoList(search);
//                pageNoTextView.setText("1");
                searchEditTest.setText("");
                searchEditTest.setHint("Refresh");
            }else if (helper.isAllowRefresh()){
                //only allow reloading the product list after it has been filtered
                refresh();
            }
        });

        fab.setOnClickListener(view -> {
            showBottomSheetDialog();
        });
    }

    private void makeAdmin() {
        SharedPreferences sharedPref = getPreferences(Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putBoolean(getString(R.string.admin), true);
        editor.apply();
    }

    private String encryptPassword(String password) {
        try {
            password = AESCrypt.encrypt(password, Util.PASSWORD_ENCODER_KEY);
        } catch (GeneralSecurityException e) {
            new AlertDialog.Builder(this)
                    .setTitle("An Error Occurred")
                    .setMessage(e.getMessage())
                    .setPositiveButton("OK", (dialog, which) -> dialog.dismiss())
                    .show();
            return null;
        }
        return password;
    }

    private void showPriceToggle() {
        findViewById(R.id.include_product_price_selection)
                .setVisibility(View.VISIBLE);
    }
    private void hidePriceToggle() {
        findViewById(R.id.include_product_price_selection)
                .setVisibility(View.GONE);
    }

    private void setUpRecyclerView(List<ProductInfo> productInfoList){
        RecyclerView recyclerView = findViewById(R.id.productsRecyclerView);
        adapter = new ProductRecyclerAdapter(this, productInfoList);
        recyclerView.setAdapter(adapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
    }


    private void showBottomSheetDialog() {
        bottomSheetDialog = new BottomSheetDialog(this);
        bottomSheetDialog.setContentView(R.layout.bottom_sheet_dialog_layout);
//        dialog.findViewById()

        Button addProduct = bottomSheetDialog.findViewById(R.id.addButton);
        addImageDialog = bottomSheetDialog.findViewById(R.id.addImageView);
        EditText nameEditText = bottomSheetDialog.findViewById(R.id.nameEditTextText);
        EditText priceEditText = bottomSheetDialog.findViewById(R.id.priceEditText);
        EditText unitsEditText = bottomSheetDialog.findViewById(R.id.unitsEditText);
        EditText desEditText = bottomSheetDialog.findViewById(R.id.descriptionEditText);
        EditText idEditText = bottomSheetDialog.findViewById(R.id.idEditText);
        findViewById(R.id.addButton);

        addProduct.setOnClickListener(view -> {
            String productName = nameEditText.getText().toString();
            String price = priceEditText.getText().toString();
            String units = unitsEditText.getText().toString();
            String description = desEditText.getText().toString();
            String id = idEditText.getText().toString();

            Product product = new Product(null, productName, price,
                    id, Integer.parseInt(units), description);

//            firebaseHelper.addToDatabase(product);
//            .addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
//                @Override
//                public void onSuccess(DocumentReference documentReference) {
//                    if (imageBytes== null)return;
//                    firebaseHelper.uploadImageToStorage(UUID.randomUUID().toString(), "ProductName", imageBytes);
//
//                }
//            }).addOnFailureListener(new OnFailureListener() {
//                @Override
//                public void onFailure(@NonNull Exception e) {
//
//                }
//            });
        });

//        ActivityResultLauncher<String> stringActivityResultLauncher = registerForActivityResult(, new ActivityResultCallback<Uri>() {
//            @Override
//            public void onActivityResult(Uri result) {
//
//            }
//        });

        addImageDialog.setOnClickListener(view ->{
            String[] permissionsStorage = {android.Manifest.permission.READ_EXTERNAL_STORAGE};
            int requestExternalStorage = 1;
            int permission = ActivityCompat.checkSelfPermission(this, android.Manifest.permission.READ_EXTERNAL_STORAGE);
            if (permission != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(this, permissionsStorage, requestExternalStorage);
            }
//            stringActivityResultLauncher.launch("image/*");

            Intent getImageIntent = new Intent(Intent.ACTION_GET_CONTENT);
            getImageIntent.setType("image/*");
            if (getImageIntent.resolveActivity(getPackageManager())!=null){
                startActivityForResult(getImageIntent, 1);
            }
        });

        bottomSheetDialog.show();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if ((requestCode == 1 && resultCode == RESULT_OK )&& data!=null){
            Uri imageUri = data.getData();
            addImageDialog.setImageURI(imageUri);
            try {
                Bitmap bitmap = MediaStore.Images.Media.getBitmap(this.getContentResolver(), imageUri);
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.PNG,100, stream);
                imageBytes = stream.toByteArray();

//                uploadTask.addOnCompleteListener(new OnCompleteListener<UploadTask.TaskSnapshot>() {
//                    @Override
//                    public void onComplete(@NonNull Task<UploadTask.TaskSnapshot> task) {
//                        Toast.makeText(MainActivity.this, "Done upload ", Toast.LENGTH_LONG).show();
//                    }
//                });
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public void productsGotten(List<ProductInfo> productInfos) {
        Handler handler = HandlerCompat.createAsync(Looper.getMainLooper());
        if (productInfos.isEmpty()){
            handler.post(() -> {
                if (searching){
                    AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
                    alertDialog
                            .setTitle("Product Not Here Yet?")
                            .setMessage("Need something? \nPlease, contact us")
                            .setPositiveButton("Contact us", (dialog, which) -> {
                                Util.contactUs(this, Util.getInStockMessage());
                                dialog.dismiss();
                            })
                            .show();
                }
                else Toast.makeText(this, "Last page.\nRefreshing...", Toast.LENGTH_LONG).show();

                refresh();
            });

            return;
        }

        handler.post(() -> {
            setUpRecyclerView(productInfos);
            mProgressBar.setVisibility(View.GONE);
            Util.enableActivityTouch(this);
        });
    }

    @Override
    public void error(String requestAction, String errorMessage) {
        Handler handler = HandlerCompat.createAsync(Looper.getMainLooper());
        handler.post(() -> {
            AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
            alertDialog
                    .setTitle("An Error Occurred")
                    .setMessage(errorMessage)
                    .setPositiveButton("Refresh", (dialog, which) -> refresh())
                    .setNeutralButton("Contact DEV (WhatsApp)", (dialog, which) ->
                            Util.contactDevWhatsApp(MainActivity.this, errorMessage))
                    .setNegativeButton("Contact DEV (Email)", (dialog, which) ->
                            Util.contactDevEmail(MainActivity.this, errorMessage))
                    .show();

            searchEditTest.setText("");
            searchEditTest.setHint("Refresh");
            helper.allowRefresh();
            mProgressBar.setVisibility(View.GONE);
            Util.enableActivityTouch(this);

        });

//        Handler handler = HandlerCompat.createAsync(Looper.getMainLooper());
        //Show error
    }

    private void refresh() {
        searching = false;
        if(mProgressBar.getVisibility() != View.VISIBLE) mProgressBar.setVisibility(View.VISIBLE);
        if(pageSelectionLayout.getVisibility() != View.VISIBLE) pageSelectionLayout.setVisibility(View.VISIBLE);
        helper.getProductInfoList();
        pageNoTextView.setText("1");
        searchEditTest.setHint("Search");
    }
    public void hideKeyboard() {
        InputMethodManager imm = (InputMethodManager) getSystemService(Activity.INPUT_METHOD_SERVICE);
        //Find the currently focused view, so we can grab the correct window token from it.
        View view = getCurrentFocus();
        //If no view currently has focus, create a new one, just so we can grab a window token from it
        if (view == null) {
            view = new View(this);
        }
        imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }
}

/**
 * Attributions:
 * <a href="https://www.flaticon.com/free-icons/woman" title="woman icons">Woman icons created by ibrandify - Flaticon</a>
 * */