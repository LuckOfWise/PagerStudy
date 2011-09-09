package com.luckofwise.pagerstudy;

import java.util.ArrayList;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class MyAdapter extends FragmentStatePagerAdapter {
    public static final int ITEM_FIRST = 0;
    public static final int ITEM_SCOND = 1;
    public static final int ITEM_THIRD = 2;
    ArrayList<Fragment> mFragmentList;

    public MyAdapter(FragmentManager fm) {
        super(fm);
        mFragmentList = new ArrayList<Fragment>();
        mFragmentList.add(new Fragment1());
        mFragmentList.add(new Fragment2());
        mFragmentList.add(new Fragment3());
    }

    @Override
    public int getCount() {
        return mFragmentList.size();
    }

    @Override
    public Fragment getItem(int position) {
        return mFragmentList.get(position);
    }

}
