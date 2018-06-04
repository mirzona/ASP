package com.tufahija.swipe.fragments;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.tufahija.swipe.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SwipeFragment1 extends Fragment {
    @BindView(R.id.textViewSF) TextView textViewCaption;
    @BindView(R.id.buttonSF1small) Button buttonSmall;
    private View layoutView;
    boolean captionIsBig = true;

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
    @OnClick(R.id.buttonSF1small)
    public void smallCaption(){

        if (captionIsBig){
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                textViewCaption.setTextAppearance(R.style.TextAppearance_AppCompat_Body1);
            }
            captionIsBig = false;
            buttonSmall.setText(R.string.big_caption);
        }else{
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                textViewCaption.setTextAppearance(R.style.TextAppearance_AppCompat_Display1);
            }
            captionIsBig = true;
            buttonSmall.setText(R.string.small_caption);
        }


    }
}
