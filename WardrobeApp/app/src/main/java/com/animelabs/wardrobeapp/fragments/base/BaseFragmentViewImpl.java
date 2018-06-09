package com.animelabs.wardrobeapp.fragments.base;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.animelabs.wardrobeapp.R;
import com.animelabs.wardrobeapp.fragments.dressSelectionModule.view.DressSelectionView;

import butterknife.ButterKnife;

public class BaseFragmentViewImpl implements BaseFragmentView {
    protected View view;
    protected Fragment fragmentInstance;
    public BaseFragmentViewImpl(Context context, int layoutId) {
        init(context, layoutId);
//        initActions();
    }

    @Override
    public void init(Context context, int layoutId) {
        if(context != null) {
            Log.d("INSIDE", "BINDING");
            FrameLayout parent = new FrameLayout(context);
            parent.setLayoutParams(new FrameLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
            view = LayoutInflater.from(context).inflate(layoutId, parent, true);
        }
    }

    @Override
    public View getView() {
        return view;
    }

    @Override
    public void initActions() {

    }

}
