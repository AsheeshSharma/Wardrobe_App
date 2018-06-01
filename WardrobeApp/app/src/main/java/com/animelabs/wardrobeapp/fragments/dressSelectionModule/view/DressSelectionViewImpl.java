package com.animelabs.wardrobeapp.fragments.dressSelectionModule.view;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.animelabs.wardrobeapp.R;
import com.animelabs.wardrobeapp.fragments.base.BaseFragmentView;
import com.animelabs.wardrobeapp.fragments.dressSelectionModule.DressSelectionFragment;

import butterknife.ButterKnife;

public class DressSelectionViewImpl extends BaseFragmentView{

    public DressSelectionViewImpl(DressSelectionFragment fragment, int layoutId) {
        super(fragment.getContext(), layoutId);
        this.fragmentInstance = (DressSelectionFragment)fragment;
    }

}
