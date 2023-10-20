package ng.com.anikecosmetics.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.nostra13.universalimageloader.core.ImageLoader;

import java.util.ArrayList;
import java.util.List;

import ng.com.anikecosmetics.R;
import ng.com.anikecosmetics.controller.ImageRecyclerViewAdapter;
import ng.com.anikecosmetics.controller.UniversalImageLoader;
import ng.com.anikecosmetics.controller.Util;
import ng.com.anikecosmetics.model.jumia.ProductInfo;

public class DetailsActivity extends AppCompatActivity {

    ProductInfo productInfo;
    TextView productId, productName, quantity, inflatedPrice, salePrice, saleStartDate, saleEndDate,
            availableToSell, status, url, description, brand, category;
    RecyclerView productImagesRecyclerView;

    ImageView productImage;
    private boolean isAdmin;
    //mainImageUrl,

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Intent intent = getIntent();


        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            productInfo = intent.getParcelableExtra(Util.PRODUCT_INTENT_EXTRA, ProductInfo.class);
        }else {
            productInfo = (ProductInfo) intent.getParcelableExtra(Util.PRODUCT_INTENT_EXTRA);
        }

        SharedPreferences sharedPref = getPreferences(Context.MODE_PRIVATE);
        isAdmin = sharedPref.getBoolean(getString(R.string.admin), false);


        initializeViews();
        ArrayList<String> imagesList = intent.getStringArrayListExtra(Util.PRODUCT_IMAGES_LINK_LIST_INTENT_EXTRA);

        setViewContent();
        if (imagesList != null){
            setUpImageRecyclerView(imagesList);
        }

        url.setOnClickListener((v) -> openUrl());
    }

    private void openUrl() {
        String urlSt = url.getText().toString();
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(urlSt));
        startActivity(i);
    }

    private void setViewContent() {
        String salePriceString;

        if (Util.showingJumiaPrice && isAdmin){
            salePriceString = Util.NAIRA+productInfo.getSalePrice();
        } else {
            //by default seller price will be shown
            double sellerPrice = Util.convertToSellerPrice(productInfo.getSalePrice());
            salePriceString = Util.NAIRA + sellerPrice;
        }

        ImageLoader.getInstance().displayImage(productInfo.getMainImageUrl(), productImage);
        productName.setText(productInfo.getName());
        salePrice.setText(salePriceString);
        productId.setText(productInfo.getId());
        quantity.setText(productInfo.getQuantity());
        inflatedPrice.setText(productInfo.getPrice());
        saleStartDate.setText(productInfo.getSaleStartDate());
        saleEndDate.setText(productInfo.getSaleEndDate());
        availableToSell.setText(productInfo.getAvailableToSell());
        status.setText(productInfo.getStatus());
        url.setText(productInfo.getUrl());
        description.setText(Html.fromHtml(productInfo.getDescription(), Html.FROM_HTML_MODE_LEGACY));
        brand.setText(productInfo.getBrand());
        category.setText(productInfo.getPrimaryCategory());
    }

    private void setUpImageRecyclerView(List<String> imagesUrl) {
        LinearLayoutManager layoutManager =
                new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        productImagesRecyclerView.setLayoutManager(layoutManager);
        ImageRecyclerViewAdapter adapter = new ImageRecyclerViewAdapter(this, imagesUrl);
        productImagesRecyclerView.setAdapter(adapter);
    }

    private void initializeViews() {
        productImage = findViewById(R.id.productImageView);
        productImagesRecyclerView = findViewById(R.id.productImageRecyclerView);
        productName = findViewById(R.id.productNameTextView);
        salePrice = findViewById(R.id.salePriceTextView);
        productId = findViewById(R.id.idTextView);
        quantity = findViewById(R.id.quantityTextView);
        inflatedPrice = findViewById(R.id.inflatedPriceTextView);
        saleStartDate = findViewById(R.id.saleStartDateTextView);
        saleEndDate = findViewById(R.id.saleEndDateTextView);
        availableToSell = findViewById(R.id.availableTextView);
        status = findViewById(R.id.statusTextView);
        url = findViewById(R.id.urlTextView);
        description = findViewById(R.id.descriptionTextView);
        brand = findViewById(R.id.brandTextView);
        category = findViewById(R.id.primaryCategoryTextView);

    }

}