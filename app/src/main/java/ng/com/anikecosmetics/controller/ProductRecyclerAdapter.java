package ng.com.anikecosmetics.controller;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.nostra13.universalimageloader.core.ImageLoader;

import java.util.ArrayList;
import java.util.List;

import ng.com.anikecosmetics.R;
import ng.com.anikecosmetics.model.jumia.ProductInfo;
import ng.com.anikecosmetics.view.DetailsActivity;

public class ProductRecyclerAdapter extends RecyclerView.Adapter<ProductRecyclerAdapter.productViewHolder> {
    private final List<ProductInfo> productInfoList;
    private LayoutInflater mLayoutInflater;
    private Activity mActivity;

    public ProductRecyclerAdapter(Activity activity, List<ProductInfo> productInfoList) {
        mActivity = activity;
        mLayoutInflater = LayoutInflater.from(activity);
        this.productInfoList = productInfoList;
//        productInfoList = JumiaSellerCenterHelper.getProductInfoList();
        initialiseImageLoader();
    }

    private void initialiseImageLoader() {
        UniversalImageLoader imageLoader = new UniversalImageLoader(mActivity);
        ImageLoader.getInstance().init(imageLoader.getConfig());
    }

    @NonNull
    @Override
    public productViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new productViewHolder(mLayoutInflater.inflate(R.layout.single_product, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull productViewHolder holder, int position) {
        ProductInfo productInfo = productInfoList.get(position);


//        String imageUrlString = productInfo.getImageUrl();
        ImageLoader.getInstance().displayImage(productInfo.getMainImageUrl(), holder.productImage);

//        if(imageUrlString != null && !imageUrlString.isEmpty()){
//            try {
//                Log.d("imageUrl", "onBindViewHolder: " + imageUrlString);
//                URL url = new URL(imageUrlString);
//                Bitmap bmp = BitmapFactory.decodeStream(url.openConnection().getInputStream());
//                holder.productImage.setImageBitmap(bmp);
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        }

        String salePrice;

        if (Util.showingJumiaPrice){
            salePrice = Util.NAIRA+productInfo.getSalePrice();
        } else {
            double sellerPrice = Util.convertToSellerPrice(productInfo.getSalePrice());
            salePrice = Util.NAIRA + sellerPrice;
        }


        holder.productName.setText(productInfo.getName());
        holder.productPrice.setText(salePrice);
        holder.productId.setText(productInfo.getId());
        holder.productUnit.setText(productInfo.getAvailableToSell());
    }

    @Override
    public int getItemCount() {
        return productInfoList.size();
    }

    public class productViewHolder extends RecyclerView.ViewHolder {

        private final ImageView productImage;
        private final TextView productName;
        private final TextView productPrice;
        private final TextView productId;
        private final TextView productUnit;
        private final View buyProduct;
        public productViewHolder(@NonNull View itemView) {
            super(itemView);
            productImage = itemView.findViewById(R.id.productImageView);
            productName = itemView.findViewById(R.id.productNameTextView);
            productPrice = itemView.findViewById(R.id.productPriceTextView);
            productId = itemView.findViewById(R.id.productIdTextView);
            productUnit = itemView.findViewById(R.id.productUnitTextView);
            buyProduct = itemView.findViewById(R.id.buyButton);

            itemView.setOnClickListener(view->{
                int adapterPosition = getAdapterPosition();
                ProductInfo productInfo = productInfoList.get(adapterPosition);
                Intent intent = new Intent(mActivity, DetailsActivity.class);
                intent.putExtra(Util.PRODUCT_INTENT_EXTRA, productInfo);
                intent.putStringArrayListExtra(Util.PRODUCT_IMAGES_LINK_LIST_INTENT_EXTRA,
                        (ArrayList<String>) productInfo.getImages().getImage());
                mActivity.startActivity(intent);
            });

            buyProduct.setOnClickListener(v -> {
                Util.contactUs(mActivity,
                        Util.getBuyMessage(
                                productName.getText().toString(),
                                productId.getText().toString()
                        ));
            });
        }
    }

    public void reload(){
        notifyDataSetChanged();
    }
}
