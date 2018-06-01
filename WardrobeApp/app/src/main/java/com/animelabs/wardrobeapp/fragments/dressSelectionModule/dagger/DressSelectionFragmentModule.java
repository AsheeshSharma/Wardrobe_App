package com.animelabs.wardrobeapp.fragments.dressSelectionModule.dagger;

import android.support.v4.app.Fragment;
import android.util.Log;

import com.animelabs.wardrobeapp.fragments.dressSelectionModule.DressSelectionFragment;
import com.animelabs.wardrobeapp.fragments.dressSelectionModule.interactor.DressSelectionInteractorImpl;
import com.animelabs.wardrobeapp.fragments.dressSelectionModule.presenter.DressSelectionPresenter;
import com.animelabs.wardrobeapp.fragments.dressSelectionModule.presenter.DressSelectionPresenterImpl;
import com.animelabs.wardrobeapp.fragments.dressSelectionModule.view.DressSelectionView;
import com.animelabs.wardrobeapp.fragments.dressSelectionModule.view.DressSelectionViewImpl;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;

@Module
public abstract class DressSelectionFragmentModule {
    @Provides
    static DressSelectionViewImpl getDressSelectionView(DressSelectionFragment dressSelectionFragment, int layoutId){
        return new DressSelectionViewImpl(dressSelectionFragment, layoutId);
    }

    @Provides
    static DressSelectionPresenterImpl getPresenterInstance() {
        return new DressSelectionPresenterImpl();
    }
}
