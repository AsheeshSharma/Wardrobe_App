package com.animelabs.wardrobeapp.app.dagger;

import android.app.Application;

import com.animelabs.wardrobeapp.app.MainApplication;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;
import dagger.android.support.AndroidSupportInjectionModule;

@Singleton
@Component(modules = {AndroidSupportInjectionModule.class, AppModule.class, ActivityBuilder.class})
public interface AppComponent extends AndroidInjector<MainApplication> {
    @Override
    void inject(MainApplication instance);

    @Component.Builder
    interface Builder {

        @BindsInstance
        AppComponent.Builder application(Application application);

        AppComponent build();

    }
}
