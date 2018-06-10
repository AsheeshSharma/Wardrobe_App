package com.animelabs.wardrobeapp.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.animelabs.wardrobeapp.fragments.base.baseFragments.BasePagerFragment;
import com.animelabs.wardrobeapp.models.AttireModel;
import com.animelabs.wardrobeapp.models.IAttireModel;

import java.util.ArrayList;

public class ViewPagerAttireAdapter extends FragmentStatePagerAdapter {
    private ArrayList<IAttireModel> attireModels;

    public ViewPagerAttireAdapter(FragmentManager manager, ArrayList<IAttireModel> products) {
        super(manager);
        attireModels = products;
    }

    public void setAttireModels(ArrayList<IAttireModel> attireModels) {
        this.attireModels = attireModels;
    }

    @Override
    public Fragment getItem(int position) {
        if (attireModels != null && attireModels.size() > 0) {
            position = position % attireModels.size(); // use modulo for infinite cycling
            return BasePagerFragment.newInstance(attireModels.get(position));
        } else {
            return BasePagerFragment.newInstance(null);
        }
    }


    @Override
    public int getCount() {
        if (attireModels != null && attireModels.size() > 0) {
            return attireModels.size(); // simulate infinite by big number of products
        } else {
            return 1;
        }
    }
}
