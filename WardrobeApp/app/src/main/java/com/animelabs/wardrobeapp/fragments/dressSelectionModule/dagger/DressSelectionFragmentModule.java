package com.animelabs.wardrobeapp.fragments.dressSelectionModule.dagger;

import com.animelabs.wardrobeapp.data.dagger.RealmModule;
import com.animelabs.wardrobeapp.fragments.dressSelectionModule.DressSelectionFragment;
import com.animelabs.wardrobeapp.fragments.dressSelectionModule.interactor.DressSelectionInteractorImpl;
import com.animelabs.wardrobeapp.fragments.dressSelectionModule.presenter.DressSelectionPresenterImpl;
import com.animelabs.wardrobeapp.fragments.dressSelectionModule.view.DressSelectionViewImpl;

import dagger.Module;
import dagger.Provides;

@Module(includes = {RealmModule.class})
public abstract class DressSelectionFragmentModule {
    @Provides
    static DressSelectionViewImpl getDressSelectionView(DressSelectionFragment dressSelectionFragment, int layoutId) {
        return new DressSelectionViewImpl(dressSelectionFragment, layoutId);
    }

    @Provides
    static DressSelectionPresenterImpl getPresenterInstance(DressSelectionInteractorImpl dressSelectionInteractor) {
        return new DressSelectionPresenterImpl(dressSelectionInteractor);
    }

    @Provides
    static DressSelectionInteractorImpl getDressSelectionInteractor() {
        return new DressSelectionInteractorImpl();
    }
}
