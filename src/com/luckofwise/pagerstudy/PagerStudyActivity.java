package com.luckofwise.pagerstudy;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.view.View;
import android.widget.RadioGroup;

public class PagerStudyActivity extends FragmentActivity implements OnPageChangeListener {

    ViewPager mViewPagerMain;
    RadioGroup mRadioGroupTabs;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        mViewPagerMain = (ViewPager) findViewById(R.id.viewPagerMain);
        mViewPagerMain.setAdapter(new MyAdapter(this.getSupportFragmentManager()));
        mViewPagerMain.setOnPageChangeListener(this);
        mRadioGroupTabs = (RadioGroup) findViewById(R.id.radioGroupTabs);
        mRadioGroupTabs.check(R.id.buttonFirst);
    }

    public void onClick(View v) {
        switch (v.getId()) {
        case R.id.buttonFirst:
            mViewPagerMain.setCurrentItem(MyAdapter.ITEM_FIRST);
            break;
        case R.id.buttonSecond:
            mViewPagerMain.setCurrentItem(MyAdapter.ITEM_SCOND);
            break;
        case R.id.buttonThird:
            mViewPagerMain.setCurrentItem(MyAdapter.ITEM_THIRD);
            break;
        }
    }

    @Override
    public void onPageScrollStateChanged(int state) {
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
    }

    @Override
    public void onPageSelected(int position) {
        switch (position) {
        case MyAdapter.ITEM_FIRST:
            mRadioGroupTabs.check(R.id.buttonFirst);
            break;
        case MyAdapter.ITEM_SCOND:
            mRadioGroupTabs.check(R.id.buttonSecond);
            break;
        case MyAdapter.ITEM_THIRD:
            mRadioGroupTabs.check(R.id.buttonThird);
            break;
            
        }
        
    }
}