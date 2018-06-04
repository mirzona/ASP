package com.tufahija.swipe.fragments;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.tufahija.swipe.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SwipeFragment1 extends Fragment {
    @BindView(R.id.textViewSF) TextView textViewCaption;
    private View layoutView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        layoutView = inflater.inflate(R.layout.layout_swipe_fragmet,container,false);
        return layoutView;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        ButterKnife.bind(this,view);
        super.onViewCreated(view, savedInstanceState);
    }
    @OnClick(R.id.buttonSFInsert)
    public void paintCaption(){
        layoutView.findViewById(R.id.textViewSF).setBackgroundColor(Color.RED);
    }
}
