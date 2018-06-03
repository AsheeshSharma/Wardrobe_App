package com.animelabs.wardrobeapp.data.dagger;

import android.content.Context;

import com.animelabs.wardrobeapp.data.RealmService;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * Created by a35764 on 6/3/2018.
 * RealmModule
 */
@Module
public class RealmModule {
    @Provides
    static RealmService getRealmServiceInstance(@Named("ActivityContext") Context context) {
        return new RealmService(context);
    }
}
