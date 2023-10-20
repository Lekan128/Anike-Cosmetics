package ng.com.anikecosmetics.controller;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.nostra13.universalimageloader.core.ImageLoader;

import java.util.List;

import ng.com.anikecosmetics.R;

public class ImageRecyclerViewAdapter extends RecyclerView.Adapter<ImageRecyclerViewAdapter.ImageViewHolder> {
    private final List<String> imageUrlList;
    private LayoutInflater mLayoutInflater;
    private Context mContext;

    public ImageRecyclerViewAdapter( Context context, List<String> imageUrlList) {
        mLayoutInflater = LayoutInflater.from(context);
        this.imageUrlList = imageUrlList;
        this.mContext = context;
    }

    @NonNull
    @Override
    public ImageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ImageViewHolder(mLayoutInflater.inflate(R.layout.single_image, parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ImageViewHolder holder, int position) {
        ImageLoader.getInstance().displayImage(imageUrlList.get(position), holder.productImage);
    }

    @Override
    public int getItemCount() {
        return imageUrlList.size();
    }

    public class ImageViewHolder extends RecyclerView.ViewHolder{

        private final ImageView productImage;
        public ImageViewHolder(@NonNull View itemView) {
            super(itemView);

            productImage = itemView.findViewById(R.id.productImageView);
        }
    }
}
