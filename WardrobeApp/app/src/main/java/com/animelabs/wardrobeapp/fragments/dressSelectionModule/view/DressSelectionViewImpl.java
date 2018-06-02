package com.animelabs.wardrobeapp.fragments.dressSelectionModule.view;

import android.support.design.widget.FloatingActionButton;
import android.view.View;
import android.widget.Toast;

import com.animelabs.wardrobeapp.R;
import com.animelabs.wardrobeapp.fragments.base.BaseFragmentViewImpl;
import com.animelabs.wardrobeapp.fragments.dressSelectionModule.DressSelectionFragment;

import butterknife.BindView;

public class DressSelectionViewImpl extends BaseFragmentViewImpl implements DressSelectionView{
    @BindView(R.id.action_a)
    View addNewAttire;
    @BindView(R.id.action_b)
    View moveToCollection;
    @BindView(R.id.fab)
    FloatingActionButton saveToCollection;
    @BindView(R.id.no_dresses_layout)
    View noDressesLayout;

    public DressSelectionViewImpl(DressSelectionFragment fragment, int layoutId) {
        super(fragment.getContext(), layoutId);
        this.fragmentInstance = fragment;
    }

    @Override
    public void addToCollection() {

    }

    @Override
    public void uploadToCollection() {

    }

    @Override
    public void shuffleCollection() {

    }

    @Override
    public void viewCollection() {

    }

    @Override
    public void hideNoDataLayout() {
        noDressesLayout.setVisibility(View.VISIBLE);
    }

    @Override
    public void showNoDataLayout() {
        noDressesLayout.setVisibility(View.GONE);
    }

    @Override
    public void initActions() {
        super.initActions();
        addNewAttire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(fragmentInstance.getContext(),"Hello Action A", Toast.LENGTH_SHORT).show();
            }
        });
        moveToCollection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(fragmentInstance.getContext(),"Hello Action B", Toast.LENGTH_SHORT).show();
            }
        });
        saveToCollection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(fragmentInstance.getContext(),"Hello FAB", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
