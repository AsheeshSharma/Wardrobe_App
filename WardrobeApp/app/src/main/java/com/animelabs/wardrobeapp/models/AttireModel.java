package com.animelabs.wardrobeapp.models;

import android.os.Parcel;
import android.os.Parcelable;

public class AttireModel implements Parcelable, IAttireModel {
    private String productId;
    private String brandName;
    private String createdAt;
    private String likes;
    private String path;
    private String type;

    public AttireModel() {
    }

    public AttireModel(String productId, String brandName, String createdAt, String likes, String path, String type) {
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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(productId);
        parcel.writeString(brandName);
        parcel.writeString(createdAt);
        parcel.writeString(likes);
        parcel.writeString(path);
        parcel.writeString(type);
    }

    public static final Parcelable.Creator<AttireModel> CREATOR = new Parcelable.Creator<AttireModel>() {
        @Override
        public AttireModel createFromParcel(Parcel in) {
            String productId = in.readString();
            String brandName = in.readString();
            String createdAt = in.readString();
            String likes = in.readString();
            String path = in.readString();
            String type = in.readString();
            return new AttireModel(productId,  brandName, createdAt, likes, path, type);
        }

        @Override
        public AttireModel[] newArray(int size) {
            return new AttireModel[size];
        }
    };
}
