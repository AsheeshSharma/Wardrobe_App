package com.animelabs.wardrobeapp.fragments.dressSelectionModule.dagger;

import com.animelabs.wardrobeapp.fragments.dressSelectionModule.DressSelectionFragment;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@Subcomponent(modules = {DressSelectionFragmentModule.class})
public interface DressSelectionFragmentComponent extends AndroidInjector<DressSelectionFragment>{
//    @Subcomponent.Builder
//    abstract class Builder extends AndroidInjector.Builder<DressSelectionFragment>{}
}
