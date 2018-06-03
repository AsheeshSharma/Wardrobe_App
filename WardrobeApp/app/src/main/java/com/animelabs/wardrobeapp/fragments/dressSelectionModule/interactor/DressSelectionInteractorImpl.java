package com.animelabs.wardrobeapp.fragments.dressSelectionModule.interactor;

import android.util.Log;

import com.animelabs.wardrobeapp.data.RealmService;
import com.animelabs.wardrobeapp.data.realmModels.BottomAttireModel;
import com.animelabs.wardrobeapp.data.realmModels.TopAttireModel;
import com.animelabs.wardrobeapp.fragments.base.BaseFragmentInteractorImpl;

import java.util.ArrayList;

import io.reactivex.Observable;
import io.realm.RealmResults;

public class DressSelectionInteractorImpl extends BaseFragmentInteractorImpl implements DressSelectionInteractor {

    private RealmService mRealmService;

    public DressSelectionInteractorImpl(RealmService realmService) {
        this.mRealmService = realmService;
    }

    @Override
    public void setCollectionToView() {
        mRealmService.addTopAttireItem();
        mRealmService.addBottomAttireItem();
    }

    @Override
    public Observable<ArrayList<TopAttireModel>> getTopAttireCollection() {
        ArrayList<TopAttireModel> mTopAttireList = mRealmService.getTopAttiresList();
        if(mTopAttireList != null && mTopAttireList.size() > 0) {
            return Observable.just(mTopAttireList);
        }
        return Observable.just(new ArrayList<TopAttireModel>());
    }

    @Override
    public ArrayList<BottomAttireModel> getBottomAttireCollection() {
        return null;
    }
}
