package com.animelabs.wardrobeapp.activities.dagger;

import com.animelabs.wardrobeapp.activities.ContainerActivity;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@Subcomponent(modules = {ContainerActivityModule.class, FragmentBuilderModule.class})
public interface ContainerActivityComponent extends AndroidInjector<ContainerActivity>{
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<ContainerActivity>{}
}
