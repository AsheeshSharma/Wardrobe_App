package com.animelabs.wardrobeapp.fragments.dressSelectionModule.view;

import com.animelabs.wardrobeapp.fragments.base.BaseFragmentViewImpl;
import com.animelabs.wardrobeapp.fragments.dressSelectionModule.DressSelectionFragment;

public class DressSelectionViewImpl extends BaseFragmentViewImpl implements DressSelectionView{

    public DressSelectionViewImpl(DressSelectionFragment fragment, int layoutId) {
        super(fragment.getContext(), layoutId);
        this.fragmentInstance = fragment;
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
}
