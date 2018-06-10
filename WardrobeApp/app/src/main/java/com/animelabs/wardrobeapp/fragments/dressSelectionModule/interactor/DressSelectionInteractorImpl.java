package com.animelabs.wardrobeapp.fragments.dressSelectionModule.interactor;

import com.animelabs.wardrobeapp.data.RealmService;
import com.animelabs.wardrobeapp.data.realmModels.BottomAttireModel;
import com.animelabs.wardrobeapp.data.realmModels.TopAttireModel;
import com.animelabs.wardrobeapp.fragments.base.baseInteractor.BaseFragmentInteractorImpl;
import com.animelabs.wardrobeapp.models.IAttireModel;

import java.util.ArrayList;

import io.reactivex.Observable;

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
    public Observable<ArrayList<IAttireModel>> getTopAttireCollection() {
        ArrayList<IAttireModel> mTopAttireList = mRealmService.getTopAttiresList();
        if(mTopAttireList != null && mTopAttireList.size() > 0) {
            return Observable.just(mTopAttireList);
        }
        return Observable.just(new ArrayList<IAttireModel>());
    }

    @Override
    public ArrayList<BottomAttireModel> getBottomAttireCollection() {
        return null;
    }
}
