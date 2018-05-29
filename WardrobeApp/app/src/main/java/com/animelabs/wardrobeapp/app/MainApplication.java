package com.animelabs.wardrobeapp.app;

import com.animelabs.wardrobeapp.app.dagger.DaggerAppComponent;

import dagger.android.AndroidInjector;
import dagger.android.support.DaggerApplication;
import io.realm.Realm;
import io.realm.RealmConfiguration;

public class MainApplication extends DaggerApplication {

    @Override
    public void onCreate() {
        super.onCreate();
        initRealmConfiguration();
    }

    private void initRealmConfiguration() {
        Realm.init(this);
        RealmConfiguration realmConfiguration = new RealmConfiguration.Builder()
                .deleteRealmIfMigrationNeeded()
                .build();
        Realm.setDefaultConfiguration(realmConfiguration);
    }

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        return DaggerAppComponent.builder().application(this).build();
    }
}
