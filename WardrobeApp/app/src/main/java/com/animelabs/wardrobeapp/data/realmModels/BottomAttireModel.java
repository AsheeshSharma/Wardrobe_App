package com.animelabs.wardrobeapp.data.realmModels;

import android.os.Parcel;
import android.os.Parcelable;

import com.animelabs.wardrobeapp.models.IAttireModel;

import io.realm.RealmObject;

public class BottomAttireModel extends RealmObject implements IAttireModel, Parcelable {
    private String productId;
    private String brandName;
    private String createdAt;
    private String likes;
    private String path;
    private String type;

    public BottomAttireModel(){}

    public BottomAttireModel(String productId, String brandName, String createdAt, String likes, String path, String type) {
        this.productId = productId;
        this.brandName = brandName;
        this.createdAt = createdAt;
        this.likes = likes;
        this.path = path;
        this.type = type;
    }

    protected BottomAttireModel(Parcel in) {
        productId = in.readString();
        brandName = in.readString();
        createdAt = in.readString();
        likes = in.readString();
        path = in.readString();
        type = in.readString();
    }

    public static final Creator<BottomAttireModel> CREATOR = new Creator<BottomAttireModel>() {
        @Override
        public BottomAttireModel createFromParcel(Parcel in) {
            return new BottomAttireModel(in);
        }

        @Override
        public BottomAttireModel[] newArray(int size) {
            return new BottomAttireModel[size];
        }
    };

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
}
