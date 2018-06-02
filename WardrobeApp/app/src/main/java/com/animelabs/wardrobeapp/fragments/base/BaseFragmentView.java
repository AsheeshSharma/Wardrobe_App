package com.animelabs.wardrobeapp.fragments.base;

import android.content.Context;
import android.view.View;

public interface BaseFragmentView {
    void init(Context context, int layoutId);

    View getView();

    void initActions();
}
