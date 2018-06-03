package com.animelabs.wardrobeapp.fragments.base;

import io.reactivex.disposables.CompositeDisposable;

/**
 * Created by a35764 on 6/3/2018.
 * BaseFragmentPresenterImpl
 */

public class BaseFragmentPresenterImpl implements BaseFragmentPresenter {
    protected CompositeDisposable compositeDisposable;
    public BaseFragmentPresenterImpl() {
    }
    @Override
    public void init() {

    }
}
