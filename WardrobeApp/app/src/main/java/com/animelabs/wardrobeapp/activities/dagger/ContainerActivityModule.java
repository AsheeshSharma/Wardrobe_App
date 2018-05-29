package com.animelabs.wardrobeapp.activities.dagger;

import android.content.Context;

import com.animelabs.wardrobeapp.activities.ContainerActivity;

import dagger.Module;
import dagger.Provides;

@Module
public class ContainerActivityModule {
    @Provides
    Context getActivityContext(ContainerActivity containerActivity) {
        return containerActivity;
    }
}
