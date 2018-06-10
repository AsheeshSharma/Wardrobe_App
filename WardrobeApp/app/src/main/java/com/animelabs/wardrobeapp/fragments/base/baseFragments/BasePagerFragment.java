package com.animelabs.wardrobeapp.fragments.base.baseFragments;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.animelabs.wardrobeapp.R;
import com.animelabs.wardrobeapp.data.realmModels.TopAttireModel;
import com.animelabs.wardrobeapp.models.AttireModel;
import com.animelabs.wardrobeapp.models.IAttireModel;

public class BasePagerFragment extends BaseFragment {


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        readBundleArgs(getArguments());
        return inflater.inflate(R.layout.viewpager_item_layout, container, false);
    }

    private void readBundleArgs(Bundle bundle){
        if(bundle!=null){
            TopAttireModel attireModel = bundle.getParcelable("PRODUCT_KEY");
        }
    }

    public static BasePagerFragment newInstance(IAttireModel attireModel) {
        BasePagerFragment productFragment = new BasePagerFragment();
        if (attireModel != null) {
            Bundle args = new Bundle();
            args.putParcelable("PRODUCT_KEY", (Parcelable) attireModel);
            productFragment.setArguments(args);
        }
        return productFragment;
    }
}
