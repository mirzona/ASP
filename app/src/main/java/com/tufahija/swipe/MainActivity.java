package com.tufahija.swipe;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.View;

import com.tufahija.swipe.fragments.SwipeFragment1;
import com.tufahija.swipe.fragments.SwipeFragment2;
import com.tufahija.swipe.fragments.SwipeFragment3;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends FragmentActivity {
    static final int NUM_OF_FRAGS = 3;
    MyPagerAdapter myPagerAdapter;
    @BindView(R.id.viewPager) ViewPager viewPager;

    public static class MyPagerAdapter extends FragmentPagerAdapter {
        MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }
        @Override
        public Fragment getItem(int position) {
            switch (position){
                case 0: return new SwipeFragment1();
                case 1: return new SwipeFragment2();
                case 2: return new SwipeFragment3();
                default: break;
            }
            return null;
        }
        @Override
        public int getCount() {
            return NUM_OF_FRAGS;
        }    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_main);
        ButterKnife.bind(this);
        myPagerAdapter = new MyPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(myPagerAdapter);
//        such a beauty and simple solution! :)
        viewPager.setOffscreenPageLimit(NUM_OF_FRAGS);
    }
    @Override
    public View onCreateView(View parent, String name, Context context, AttributeSet attrs) {
        return super.onCreateView(parent, name, context, attrs);
    }
}
