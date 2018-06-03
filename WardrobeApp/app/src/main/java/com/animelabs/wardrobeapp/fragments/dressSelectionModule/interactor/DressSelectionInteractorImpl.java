package com.animelabs.wardrobeapp.fragments.dressSelectionModule.interactor;

import android.util.Log;

import com.animelabs.wardrobeapp.data.RealmService;
import com.animelabs.wardrobeapp.data.realmModels.TopAttireModel;
import com.animelabs.wardrobeapp.fragments.base.BaseFragmentInteractorImpl;

import io.realm.RealmResults;

public class DressSelectionInteractorImpl extends BaseFragmentInteractorImpl implements DressSelectionInteractor {

    private RealmService mRealmService;

    public DressSelectionInteractorImpl(RealmService realmService) {
        this.mRealmService = realmService;
    }

    @Override
    public void setCollectionToView() {
        mRealmService.addAttireItem();
        RealmResults<TopAttireModel> realmResults = mRealmService.getTopAttires();
        TopAttireModel topAttireModel = realmResults.get(0);
        Log.d("xxxxxxxxxxxxprd", topAttireModel.getBrandName() + "");
    }
}
