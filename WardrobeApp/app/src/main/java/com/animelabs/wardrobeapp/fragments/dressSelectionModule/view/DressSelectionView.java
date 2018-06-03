package com.animelabs.wardrobeapp.fragments.dressSelectionModule.view;

import com.animelabs.wardrobeapp.data.realmModels.BottomAttireModel;
import com.animelabs.wardrobeapp.data.realmModels.TopAttireModel;

import java.util.ArrayList;

public interface DressSelectionView {
    void addToCollection();
    void uploadToCollection();
    void shuffleCollection();
    void viewTopCollection(ArrayList<TopAttireModel> topAttireModels);
    void viewBottomCollection(ArrayList<BottomAttireModel> topAttireModels);
    void hideNoDataLayout();
    void showNoDataLayout();
}
