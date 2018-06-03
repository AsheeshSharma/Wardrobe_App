package com.animelabs.wardrobeapp.fragments.base;

/**
 * Created by a35764 on 6/3/2018.
 * BaseFragmentPresenterImpl
 */

public class BaseFragmentPresenterImpl implements BaseFragmentPresenter {
    protected BaseFragmentInteractorImpl fragmentInteractor;
    public BaseFragmentPresenterImpl(BaseFragmentInteractorImpl fragmentInteractor) {
        this.fragmentInteractor = fragmentInteractor;
        init();
    }
    @Override
    public void init() {

    }
}
