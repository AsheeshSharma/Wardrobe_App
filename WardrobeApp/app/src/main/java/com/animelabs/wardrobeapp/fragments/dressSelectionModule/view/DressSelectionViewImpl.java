package com.animelabs.wardrobeapp.fragments.dressSelectionModule.view;

import android.support.design.widget.FloatingActionButton;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.animelabs.wardrobeapp.R;
import com.animelabs.wardrobeapp.data.realmModels.BottomAttireModel;
import com.animelabs.wardrobeapp.data.realmModels.TopAttireModel;
import com.animelabs.wardrobeapp.fragments.base.BaseFragmentViewImpl;
import com.animelabs.wardrobeapp.fragments.dressSelectionModule.DressSelectionFragment;
import com.getbase.floatingactionbutton.FloatingActionsMenu;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DressSelectionViewImpl extends BaseFragmentViewImpl implements DressSelectionView{
    @BindView(R.id.action_a)
    View addNewAttire;

    @BindView(R.id.action_b)
    View moveToCollection;

    @BindView(R.id.fab)
    FloatingActionButton saveToCollection;

    @BindView(R.id.no_dresses_layout)
    View noDressesLayout;

    @BindView(R.id.multiple_actions)
    FloatingActionsMenu floatingActionsMenu;

    public DressSelectionViewImpl(DressSelectionFragment fragment, int layoutId) {
        super(fragment.getContext(), layoutId);
        this.fragmentInstance = fragment;
        ButterKnife.bind(this, view);
        ButterKnife.setDebug(true);
        initActions();
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
    public void viewTopCollection(ArrayList<TopAttireModel> topAttireModels) {
        for (TopAttireModel topAttireModel : topAttireModels) {
            Log.d("ATTIRE", topAttireModel.getBrandName() + "");
        }
    }

    @Override
    public void viewBottomCollection(ArrayList<BottomAttireModel> topAttireModels) {

    }

    @Override
    public void hideNoDataLayout() {
        noDressesLayout.setVisibility(View.GONE);
    }

    @Override
    public void showNoDataLayout() {
        this.noDressesLayout.setVisibility(View.VISIBLE);
        this.floatingActionsMenu.setVisibility(View.GONE);
        this.saveToCollection.setVisibility(View.GONE);
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
