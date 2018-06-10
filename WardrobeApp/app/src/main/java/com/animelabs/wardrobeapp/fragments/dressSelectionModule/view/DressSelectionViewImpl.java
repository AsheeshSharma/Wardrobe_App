package com.animelabs.wardrobeapp.fragments.dressSelectionModule.view;

import android.support.design.widget.FloatingActionButton;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.animelabs.wardrobeapp.R;
import com.animelabs.wardrobeapp.adapters.ViewPagerAttireAdapter;
import com.animelabs.wardrobeapp.data.realmModels.BottomAttireModel;
import com.animelabs.wardrobeapp.data.realmModels.TopAttireModel;
import com.animelabs.wardrobeapp.fragments.base.baseView.BaseFragmentViewImpl;
import com.animelabs.wardrobeapp.fragments.dressSelectionModule.DressSelectionFragment;
import com.animelabs.wardrobeapp.models.AttireModel;
import com.animelabs.wardrobeapp.models.IAttireModel;
import com.getbase.floatingactionbutton.FloatingActionsMenu;

import java.util.ArrayList;
import java.util.Objects;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DressSelectionViewImpl extends BaseFragmentViewImpl implements DressSelectionView{
    @BindView(R.id.action_a)
    View addNewAttire;

    @BindView(R.id.action_b)
    View moveToCollection;

    @BindView(R.id.action_c)
    View shuffleCollection;

    @BindView(R.id.fab)
    FloatingActionButton saveToCollection;

    @BindView(R.id.no_dresses_layout)
    View noDressesLayout;

    @BindView(R.id.multiple_actions)
    FloatingActionsMenu floatingActionsMenu;

    @BindView(R.id.topViewpager)
    ViewPager topAttireViewPager;

    @BindView(R.id.bottomViewpager)
    ViewPager bottomAttireViewPager;

    @BindView(R.id.getStartedButton)
    Button getStartedButton;

    private ViewPagerAttireAdapter topViewPagerAdapter;
    private ViewPagerAttireAdapter bottomViewPagerAdapter;
    public DressSelectionViewImpl(DressSelectionFragment fragment, int layoutId) {
        super(fragment.getContext(), layoutId);
        this.fragmentInstance = fragment;
        ButterKnife.bind(this, view);
        ButterKnife.setDebug(true);
        initActions();
        initViewPagers();
    }

    @Override
    public void moveToCollection() {

    }

    @Override
    public void uploadToCollection() {

    }

    @Override
    public void shuffleCollection() {

    }

    @Override
    public void addNewAttire() {

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
    public void initViewPagers() {
        topViewPagerAdapter = new ViewPagerAttireAdapter(Objects.requireNonNull(fragmentInstance.getActivity()).getSupportFragmentManager(), null);
        bottomViewPagerAdapter =new ViewPagerAttireAdapter(Objects.requireNonNull(fragmentInstance.getActivity()).getSupportFragmentManager(), null);
        topAttireViewPager.setAdapter(topViewPagerAdapter);
        bottomAttireViewPager.setAdapter(bottomViewPagerAdapter);
    }

    @Override
    public void populateViewPager(ArrayList<IAttireModel> attireModelArrayList, int type) {
        if(type == 1) {
            Toast.makeText(fragmentInstance.getContext(),attireModelArrayList.size() + "", Toast.LENGTH_SHORT).show();
            topViewPagerAdapter.setAttireModels(attireModelArrayList);
            topViewPagerAdapter.notifyDataSetChanged();
        }else {
            bottomViewPagerAdapter.setAttireModels(attireModelArrayList);
            bottomViewPagerAdapter.notifyDataSetChanged();
        }
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
                addNewAttire();
            }
        });
        moveToCollection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(fragmentInstance.getContext(),"Hello Action B", Toast.LENGTH_SHORT).show();
                moveToCollection();
            }
        });
        saveToCollection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(fragmentInstance.getContext(),"Hello FAB", Toast.LENGTH_SHORT).show();
                uploadToCollection();
            }
        });
        shuffleCollection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(fragmentInstance.getContext(),"Hello FAB", Toast.LENGTH_SHORT).show();
                shuffleCollection();
            }
        });
        getStartedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(fragmentInstance.getContext(),"Hello FAB", Toast.LENGTH_SHORT).show();
                addNewAttire();
            }
        });
    }
}
