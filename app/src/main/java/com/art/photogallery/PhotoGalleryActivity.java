package com.art.photogallery;

import android.support.v4.app.Fragment;

public class PhotoGalleryActivity extends SimpleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return PhotoGalleryFragment.newInstance();
    }
}
