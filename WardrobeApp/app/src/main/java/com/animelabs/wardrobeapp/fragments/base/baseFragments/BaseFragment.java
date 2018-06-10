package com.animelabs.wardrobeapp.fragments.base.baseFragments;

import android.support.v4.app.Fragment;

public class BaseFragment<T> extends Fragment {
    public BaseFragment newInstance(T t) {
        return new BaseFragment();
    }
}
