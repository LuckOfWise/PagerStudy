package com.luckofwise.pagerstudy;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.View;

public class PagerStudyActivity extends FragmentActivity {

    ViewPager mViewPagerMain;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        mViewPagerMain = (ViewPager) findViewById(R.id.viewPagerMain);
        mViewPagerMain.setAdapter(new MyAdapter(this.getSupportFragmentManager()));
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
}