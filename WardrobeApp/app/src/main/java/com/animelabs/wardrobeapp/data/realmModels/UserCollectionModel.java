package com.animelabs.wardrobeapp.data.realmModels;

import io.realm.RealmObject;

public class UserCollectionModel extends RealmObject{
    private String topWearPath;
    private String bottomWearPath;
    private String topWearId;
    private String bottomWearId;

    public UserCollectionModel(String topWearPath, String bottomWearPath, String topWearId, String bottomWearId) {
        this.topWearPath = topWearPath;
        this.bottomWearPath = bottomWearPath;
        this.topWearId = topWearId;
        this.bottomWearId = bottomWearId;
    }

    public String getTopWearPath() {
        return topWearPath;
    }

    public void setTopWearPath(String topWearPath) {
        this.topWearPath = topWearPath;
    }

    public String getBottomWearPath() {
        return bottomWearPath;
    }

    public void setBottomWearPath(String bottomWearPath) {
        this.bottomWearPath = bottomWearPath;
    }

    public String getTopWearId() {
        return topWearId;
    }

    public void setTopWearId(String topWearId) {
        this.topWearId = topWearId;
    }

    public String getBottomWearId() {
        return bottomWearId;
    }

    public void setBottomWearId(String bottomWearId) {
        this.bottomWearId = bottomWearId;
    }
}
