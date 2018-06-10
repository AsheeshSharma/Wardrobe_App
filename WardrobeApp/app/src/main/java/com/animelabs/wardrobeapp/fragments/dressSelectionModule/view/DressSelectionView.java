package com.animelabs.wardrobeapp.fragments.dressSelectionModule.view;

import com.animelabs.wardrobeapp.data.realmModels.BottomAttireModel;
import com.animelabs.wardrobeapp.data.realmModels.TopAttireModel;
import com.animelabs.wardrobeapp.models.AttireModel;
import com.animelabs.wardrobeapp.models.IAttireModel;

import java.util.ArrayList;

public interface DressSelectionView {
    void moveToCollection();
    void uploadToCollection();
    void shuffleCollection();
    void addNewAttire();
    void viewTopCollection(ArrayList<TopAttireModel> topAttireModels);
    void viewBottomCollection(ArrayList<BottomAttireModel> topAttireModels);
    void initViewPagers();
    void populateViewPager(ArrayList<IAttireModel> attireModelArrayList, int type);
    void hideNoDataLayout();
    void showNoDataLayout();
}
