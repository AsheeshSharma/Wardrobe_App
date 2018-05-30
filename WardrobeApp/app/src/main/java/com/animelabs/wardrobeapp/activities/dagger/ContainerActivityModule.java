package com.animelabs.wardrobeapp.activities.dagger;

import android.content.Context;

import com.animelabs.wardrobeapp.activities.ContainerActivity;
import com.animelabs.wardrobeapp.fragments.dressSelectionModule.DressSelectionFragment;
import com.animelabs.wardrobeapp.fragments.dressSelectionModule.dagger.DressSelectionFragmentModule;
import com.animelabs.wardrobeapp.fragments.dressSelectionModule.dagger.PerFragment;

import dagger.Module;
import dagger.Provides;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ContainerActivityModule {
    @PerFragment
    @ContributesAndroidInjector(modules = DressSelectionFragmentModule.class)
    abstract DressSelectionFragment mainFragmentInjector();
}
