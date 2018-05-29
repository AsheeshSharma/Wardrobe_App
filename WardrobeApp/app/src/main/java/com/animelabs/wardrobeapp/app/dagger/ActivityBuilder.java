package com.animelabs.wardrobeapp.app.dagger;

import android.app.Activity;

import com.animelabs.wardrobeapp.activities.ContainerActivity;
import com.animelabs.wardrobeapp.activities.dagger.ContainerActivityComponent;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.android.ContributesAndroidInjector;
import dagger.multibindings.IntoMap;

@Module
public abstract class ActivityBuilder {
    @Binds
    @IntoMap
    @ActivityKey(ContainerActivity.class)
    abstract AndroidInjector.Factory<? extends Activity> bindSplashActivity(ContainerActivityComponent.Builder builder);
}
