package com.animelabs.wardrobeapp.data.dagger;

import com.animelabs.wardrobeapp.activities.ContainerActivity;
import com.animelabs.wardrobeapp.activities.dagger.ContainerActivityModule;
import com.animelabs.wardrobeapp.activities.dagger.FragmentBuilderModule;
import com.animelabs.wardrobeapp.data.RealmService;

import javax.inject.Singleton;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/**
 * Created by a35764 on 6/3/2018.
 * RealmComponent
 */
@Subcomponent(modules = {RealmModule.class})
public interface RealmComponent extends AndroidInjector<RealmService> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<RealmService>{}
}