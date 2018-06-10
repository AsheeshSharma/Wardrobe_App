package com.animelabs.wardrobeapp.fragments.dressSelectionModule;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.animelabs.wardrobeapp.fragments.base.baseFragments.BaseFragment;
import com.animelabs.wardrobeapp.fragments.dressSelectionModule.presenter.DressSelectionPresenterImpl;
import com.animelabs.wardrobeapp.fragments.dressSelectionModule.view.DressSelectionViewImpl;

import javax.inject.Inject;

import dagger.android.support.AndroidSupportInjection;

public class DressSelectionFragment extends BaseFragment {

    @Inject
    DressSelectionViewImpl dressSelectionView;
    @Inject
    DressSelectionPresenterImpl dressSelectionPresenter;

    @Override
    public void onAttach(Context context) {
        AndroidSupportInjection.inject(this);
        super.onAttach(context);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return dressSelectionView.getView();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        boolean isNull = dressSelectionView == null;
        Log.d("xxxxxxxxx", isNull + "");
    }
}
