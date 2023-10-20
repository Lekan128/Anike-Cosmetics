package ng.com.anikecosmetics.controller;

import android.content.Context;

import com.nostra13.universalimageloader.cache.memory.impl.WeakMemoryCache;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.nostra13.universalimageloader.core.display.FadeInBitmapDisplayer;
import com.nostra13.universalimageloader.core.assist.ImageScaleType;

import ng.com.anikecosmetics.R;


public class UniversalImageLoader {
    private final String TAG = "UNIVERSAL_IMAGE_LOADER";
    private static final int loadingImage = R.drawable.baseline_downloading_24;
    private static final int failLoadingImage = R.drawable.baseline_broken_image_24;
    private static final int defaultImage = R.drawable.baseline_image_24;
    private final Context mContext;

    public UniversalImageLoader(Context context){
        this.mContext = context;
    }

    public ImageLoaderConfiguration getConfig(){
        DisplayImageOptions defaultOptions = new DisplayImageOptions.Builder()
                .showImageOnLoading(loadingImage)
                .showImageForEmptyUri(defaultImage)
                .showImageOnFail(failLoadingImage)
                .cacheOnDisk(true).cacheInMemory(true)
                .cacheOnDisc(true).resetViewBeforeLoading(true)
                .imageScaleType(ImageScaleType.EXACTLY)
                .displayer((new FadeInBitmapDisplayer(300))).build();


        ImageLoaderConfiguration configuration = new ImageLoaderConfiguration.Builder(mContext)
                .defaultDisplayImageOptions(defaultOptions)
                .memoryCache(new WeakMemoryCache())
                .diskCacheSize(100 * 1024 * 1024)
                .build();

        return configuration;
    }
}
