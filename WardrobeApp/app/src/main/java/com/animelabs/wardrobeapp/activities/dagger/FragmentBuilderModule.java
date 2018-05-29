package com.animelabs.wardrobeapp.activities.dagger;


import android.support.v4.app.Fragment;

import com.animelabs.wardrobeapp.fragments.dressSelectionModule.DressSelectionFragment;
import com.animelabs.wardrobeapp.fragments.dressSelectionModule.dagger.DressSelectionFragmentComponent;

import dagger.Binds;
import dagger.Module;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;

@Module
public abstract class FragmentBuilderModule {
    @Binds
    @IntoMap
    @FragmentKey(DressSelectionFragment.class)
    abstract AndroidInjector.Factory<? extends Fragment> bindDressSelectionFragment(DressSelectionFragmentComponent.Builder builder);
}
