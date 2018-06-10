package com.animelabs.wardrobeapp.fragments.dressSelectionModule.interactor;

import com.animelabs.wardrobeapp.data.realmModels.BottomAttireModel;
import com.animelabs.wardrobeapp.data.realmModels.TopAttireModel;
import com.animelabs.wardrobeapp.models.IAttireModel;

import java.util.ArrayList;

import io.reactivex.Observable;

public interface DressSelectionInteractor {
    void setCollectionToView();
    Observable<ArrayList<IAttireModel>> getTopAttireCollection();
    ArrayList<BottomAttireModel> getBottomAttireCollection();
}
