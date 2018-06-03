package com.animelabs.wardrobeapp.fragments.dressSelectionModule.interactor;

import com.animelabs.wardrobeapp.data.realmModels.BottomAttireModel;
import com.animelabs.wardrobeapp.data.realmModels.TopAttireModel;

import java.util.ArrayList;

import io.reactivex.Observable;

public interface DressSelectionInteractor {
    void setCollectionToView();
    Observable<ArrayList<TopAttireModel>> getTopAttireCollection();
    ArrayList<BottomAttireModel> getBottomAttireCollection();
}
