package com.animelabs.wardrobeapp.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;

import com.animelabs.wardrobeapp.R;
import com.animelabs.wardrobeapp.fragments.dressSelectionModule.DressSelectionFragment;

import javax.inject.Inject;

import dagger.android.AndroidInjection;
import dagger.android.support.DaggerAppCompatActivity;
import dagger.android.support.HasSupportFragmentInjector;

public class ContainerActivity extends DaggerAppCompatActivity implements HasSupportFragmentInjector {

    @Inject
    ContainerActivity containerActivityContext;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boolean isNull = containerActivityContext == null;
        Log.d("Success, Nullablity", isNull + " ");

        DressSelectionFragment dressSelectionFragment = new DressSelectionFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction =
                fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.container, dressSelectionFragment);
        fragmentTransaction.commit();

    }

}
