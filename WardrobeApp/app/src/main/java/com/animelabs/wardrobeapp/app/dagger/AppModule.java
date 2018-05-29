package com.animelabs.wardrobeapp.app.dagger;

import android.app.Application;
import android.content.Context;

import com.animelabs.wardrobeapp.activities.dagger.ContainerActivityComponent;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import io.realm.Realm;

@Module(subcomponents = {ContainerActivityComponent.class})
abstract class AppModule {
    @Binds
    abstract Context bindContext(Application application);

    @Provides
    static Realm getRealmInstance() {
        return Realm.getDefaultInstance();
    }
}
