package com.animelabs.wardrobeapp.activities.dagger;


import com.animelabs.wardrobeapp.R;
import com.animelabs.wardrobeapp.fragments.dressSelectionModule.DressSelectionFragment;
import com.animelabs.wardrobeapp.fragments.dressSelectionModule.dagger.DressSelectionFragmentModule;
import com.animelabs.wardrobeapp.fragments.dressSelectionModule.dagger.PerFragment;

import dagger.Module;
import dagger.Provides;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class FragmentBuilderModule {

    /*
    * Dress Selection Fragment
    * instance and layout providers.
    */
    @PerFragment
    @ContributesAndroidInjector(modules = DressSelectionFragmentModule.class)
    abstract DressSelectionFragment mainFragmentInjector();

    @Provides
    static int getLayoutId() {
        return R.layout.dress_selection_layout;
    }
}
