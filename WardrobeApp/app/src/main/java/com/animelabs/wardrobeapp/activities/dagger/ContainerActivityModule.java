package com.animelabs.wardrobeapp.activities.dagger;

import android.content.Context;

import com.animelabs.wardrobeapp.activities.ContainerActivity;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module
public class ContainerActivityModule {
    //    @PerFragment
//    @ContributesAndroidInjector(modules = DressSelectionFragmentModule.class)
//    abstract DressSelectionFragment mainFragmentInjector();
    @Provides  @Named("ActivityContext")
    Context getActivityContext(ContainerActivity containerActivity) {
        return containerActivity;
    }
}
