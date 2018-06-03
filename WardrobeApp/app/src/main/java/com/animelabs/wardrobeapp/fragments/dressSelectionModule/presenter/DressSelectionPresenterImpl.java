package com.animelabs.wardrobeapp.fragments.dressSelectionModule.presenter;

import com.animelabs.wardrobeapp.fragments.base.BaseFragmentPresenterImpl;
import com.animelabs.wardrobeapp.fragments.dressSelectionModule.interactor.DressSelectionInteractorImpl;
import com.animelabs.wardrobeapp.fragments.dressSelectionModule.view.DressSelectionView;
import com.animelabs.wardrobeapp.fragments.dressSelectionModule.view.DressSelectionViewImpl;

public class DressSelectionPresenterImpl extends BaseFragmentPresenterImpl implements DressSelectionPresenter {
    @Override
    public void init() {
//        fragmentInteractor.setCollectionToView()
    }

    public DressSelectionPresenterImpl(DressSelectionInteractorImpl dressSelectionInteractor){
        super(dressSelectionInteractor);
        dressSelectionInteractor.setCollectionToView();
    }
}
