package com.animelabs.wardrobeapp.fragments.dressSelectionModule;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.animelabs.wardrobeapp.R;
import com.animelabs.wardrobeapp.fragments.dressSelectionModule.presenter.DressSelectionPresenter;
import com.animelabs.wardrobeapp.fragments.dressSelectionModule.presenter.DressSelectionPresenterImpl;
import com.animelabs.wardrobeapp.fragments.dressSelectionModule.view.DressSelectionView;
import com.animelabs.wardrobeapp.fragments.dressSelectionModule.view.DressSelectionViewImpl;

import javax.inject.Inject;

import dagger.android.AndroidInjection;
import dagger.android.support.AndroidSupportInjection;

public class DressSelectionFragment extends Fragment {

    @Inject
    DressSelectionViewImpl dressSelectionView;
    @Inject
    DressSelectionPresenterImpl dressSelectionPresenter;

    @Override
    public void onAttach(Context context) {
        AndroidSupportInjection.inject(this);
        super.onAttach(context);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.dress_selection_layout, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        boolean isNull = dressSelectionView == null;
        Log.d("xxxxxxxxx", isNull + "");
    }
}
