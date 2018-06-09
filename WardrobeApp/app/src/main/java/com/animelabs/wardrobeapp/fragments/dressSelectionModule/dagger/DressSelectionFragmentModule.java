package com.animelabs.wardrobeapp.fragments.dressSelectionModule.dagger;

import com.animelabs.wardrobeapp.data.RealmService;
import com.animelabs.wardrobeapp.fragments.dressSelectionModule.DressSelectionFragment;
import com.animelabs.wardrobeapp.fragments.dressSelectionModule.interactor.DressSelectionInteractorImpl;
import com.animelabs.wardrobeapp.fragments.dressSelectionModule.presenter.DressSelectionPresenterImpl;
import com.animelabs.wardrobeapp.fragments.dressSelectionModule.view.DressSelectionViewImpl;

import dagger.Module;
import dagger.Provides;
import io.realm.Realm;

@Module
public abstract class DressSelectionFragmentModule {
    @PerFragment
    @Provides
    static DressSelectionViewImpl getDressSelectionView(DressSelectionFragment dressSelectionFragment, int layoutId) {
        return new DressSelectionViewImpl(dressSelectionFragment, layoutId);
    }

    @PerFragment
    @Provides
    static DressSelectionPresenterImpl getPresenterInstance(DressSelectionInteractorImpl dressSelectionInteractor, DressSelectionViewImpl dressSelectionView) {
        return new DressSelectionPresenterImpl(dressSelectionInteractor, dressSelectionView);
    }

    @PerFragment
    @Provides
    static DressSelectionInteractorImpl getDressSelectionInteractor(RealmService realmService) {
        return new DressSelectionInteractorImpl(realmService);
    }

    @PerFragment
    @Provides
    static RealmService getRealmService(Realm realm){
        return new RealmService(realm);
    }
}
