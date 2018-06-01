package com.animelabs.wardrobeapp.fragments.base;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.animelabs.wardrobeapp.R;
import com.animelabs.wardrobeapp.fragments.dressSelectionModule.view.DressSelectionView;

import butterknife.ButterKnife;

public class BaseFragmentView implements DressSelectionView {
    protected View view;
    protected Fragment fragmentInstance;
    public BaseFragmentView(Context context, int layoutId) {
        init(context, layoutId);
    }

    @Override
    public void addToCollection() {

    }

    @Override
    public void uploadToCollection() {

    }

    @Override
    public void shuffleCollection() {

    }

    @Override
    public void viewCollection() {

    }

    @Override
    public void init(Context context, int layoutId) {
        if(context != null) {
            FrameLayout parent = new FrameLayout(context);
            parent.setLayoutParams(new FrameLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
            view = LayoutInflater.from(context).inflate(R.layout.dress_selection_layout, parent, true);
            ButterKnife.bind(this, view);
        }
    }

    @Override
    public View getView() {
        return view;
    }
}
