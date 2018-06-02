package com.animelabs.wardrobeapp.fragments.dressSelectionModule.view;

import android.content.Context;
import android.view.View;

public interface DressSelectionView {
    void addToCollection();
    void uploadToCollection();
    void shuffleCollection();
    void viewCollection();
    void hideNoDataLayout();
    void showNoDataLayout();
}
