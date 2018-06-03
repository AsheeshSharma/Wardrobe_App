package com.animelabs.wardrobeapp.data;

import android.app.Activity;
import android.app.Application;

import io.realm.Realm;
import io.realm.RealmResults;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.util.Log;

import com.animelabs.wardrobeapp.data.realmModels.TopAttireModel;

import javax.inject.Inject;

/**
 * Created by a35764 on 6/3/2018.
 * RealmService
 */

public class RealmService {
    @Inject
    Realm mRealm;

    public RealmService(Context context){

    }


    //Refresh the realm instance
    public void refresh() {
        mRealm.refresh();
    }

   //clear all objects from NotificationItem.class
    public void clearAll() {
        mRealm.executeTransaction(new Realm.Transaction() {
            @Override
            public void execute(Realm realm) {
                realm.delete(TopAttireModel.class);
            }
        });
    }

    public void addAttireItem() {
            boolean isNUll = mRealm == null;
            Log.d("xxxxxxxxxxxxREALM", isNUll + "");

//        mRealm.executeTransaction(new Realm.Transaction() {
//            @Override
//            public void execute(@NonNull Realm realm) {
//                realm.copyToRealm(new TopAttireModel("1","ABC","01-01-2009","20","file://","top"));
//            }
//        });
    }

    //find all objects in the NotificationItem.class
    public RealmResults<TopAttireModel> getTopAttires() {
        return mRealm.where(TopAttireModel.class).findAll();
    }

    //query a single item with the given id
    public TopAttireModel getAttire(String productId) {
        return mRealm.where(TopAttireModel.class).equalTo("productId", productId).findFirst();
    }

    //check if NotificationItem.class is empty
    public boolean hasNotifications() {
        return mRealm.where(TopAttireModel.class).findFirst() != null;
    }

}