package com.animelabs.wardrobeapp.data;

import android.support.annotation.NonNull;

import com.animelabs.wardrobeapp.data.realmModels.BottomAttireModel;
import com.animelabs.wardrobeapp.data.realmModels.TopAttireModel;
import com.animelabs.wardrobeapp.models.IAttireModel;

import java.util.ArrayList;

import io.realm.Realm;
import io.realm.RealmResults;

/**
 * Created by a35764 on 6/3/2018.
 * RealmService
 */

public class RealmService {
    private Realm mRealm;

    public RealmService(Realm mRealm) {
        this.mRealm = mRealm;
    }


    public void refresh() {
        mRealm.refresh();
    }

    public void clearAllTopAttires() {
        mRealm.executeTransaction(new Realm.Transaction() {
            @Override
            public void execute(Realm realm) {
                realm.delete(TopAttireModel.class);
            }
        });
    }

    public void clearAllBottomAttires() {
        mRealm.executeTransaction(new Realm.Transaction() {
            @Override
            public void execute(Realm realm) {
                realm.delete(BottomAttireModel.class);
            }
        });
    }

    public void addTopAttireItem() {
        mRealm.executeTransaction(new Realm.Transaction() {
            @Override
            public void execute(@NonNull Realm realm) {
                realm.copyToRealm(new TopAttireModel("1", "ABC", "01-01-2009", "20", "file://", "top"));
            }
        });
    }

    public void addBottomAttireItem() {
        mRealm.executeTransaction(new Realm.Transaction() {
            @Override
            public void execute(@NonNull Realm realm) {
                realm.copyToRealm(new BottomAttireModel("1", "ABC", "01-01-2009", "20", "file://", "bottom"));
            }
        });
    }

    public RealmResults<TopAttireModel> getTopAttires() {
        return mRealm.where(TopAttireModel.class).findAll();
    }

    public ArrayList<IAttireModel> getTopAttiresList() {
        return (ArrayList)mRealm.copyFromRealm(mRealm.where(TopAttireModel.class).findAll());
    }

    public RealmResults<BottomAttireModel> getBottomAttires() {
        return mRealm.where(BottomAttireModel.class).findAll();
    }

    public TopAttireModel getTopAttire(String productId) {
        return mRealm.where(TopAttireModel.class).equalTo("productId", productId).findFirst();
    }

    public BottomAttireModel getBottomAttire(String productId) {
        return mRealm.where(BottomAttireModel.class).equalTo("productId", productId).findFirst();
    }

    public boolean hasTopAttires() {
        return mRealm.where(TopAttireModel.class).findFirst() != null;
    }

    public boolean hasBottomAttires() {
        return mRealm.where(BottomAttireModel.class).findFirst() != null;
    }

}