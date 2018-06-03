package com.animelabs.wardrobeapp.fragments.dressSelectionModule.presenter;

import android.annotation.SuppressLint;

import com.animelabs.wardrobeapp.fragments.base.BaseFragmentPresenterImpl;
import com.animelabs.wardrobeapp.fragments.dressSelectionModule.interactor.DressSelectionInteractorImpl;
import com.animelabs.wardrobeapp.fragments.dressSelectionModule.view.DressSelectionViewImpl;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.schedulers.Schedulers;

public class DressSelectionPresenterImpl extends BaseFragmentPresenterImpl implements DressSelectionPresenter {
    private DressSelectionInteractorImpl dressSelectionInteractor;
    private DressSelectionViewImpl dressSelectionView;
    private CompositeDisposable compositeDisposable;

    public DressSelectionPresenterImpl(DressSelectionInteractorImpl dressSelectionInteractor, DressSelectionViewImpl dressSelectionView) {
        this.dressSelectionInteractor = dressSelectionInteractor;
        this.dressSelectionView = dressSelectionView;
        compositeDisposable = new CompositeDisposable();
        processData();
    }


    private void processData() {
//        dressSelectionInteractor.setCollectionToView();
        compositeDisposable.add(dressSelectionInteractor.getTopAttireCollection()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .doOnNext(topAttireModels -> {
                    if(topAttireModels.size() < 1) {
                        dressSelectionView.showNoDataLayout();
                    }
                })
                .filter(topAttireModels -> topAttireModels.size() > 0)
                .subscribe(topAttireList -> {
                    dressSelectionView.hideNoDataLayout();
                    dressSelectionView.viewTopCollection(topAttireList);
                }));
    }
}
