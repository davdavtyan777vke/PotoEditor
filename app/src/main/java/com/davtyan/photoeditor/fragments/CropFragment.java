package com.davtyan.photoeditor.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.davtyan.photoeditor.R;
import com.davtyan.photoeditor.activitys.EditorActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class CropFragment extends BaseEditFragment {


    public CropFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_crop, container, false);
    }

    public static CropFragment newInstance() {
        return new CropFragment();
    }

    @Override
    public void onShow() {
        activity.mode = MainMenuFragment.INDEX_CROP;
    }

    @Override
    public void backToMain() {
        activity.mode = 0;
        activity.bottomGallery.setCurrentItem(0);

    }
}