package com.animelabs.wardrobeapp.data.realmModels;

import io.realm.RealmObject;

public class TopAttireModel extends RealmObject {
    private String productId;
    private String brandName;
    private String createdAt;
    private String likes;
    private String path;
    private String type;

    public TopAttireModel(){}

    public TopAttireModel(String productId, String brandName, String createdAt, String likes, String path, String type) {
        this.productId = productId;
        this.brandName = brandName;
        this.createdAt = createdAt;
        this.likes = likes;
        this.path = path;
        this.type = type;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getLikes() {
        return likes;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
