package com.praktikum.pmob.pertemuan7;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class PagerAdapter2 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public PagerAdapter2(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                TabFragment3 tab3 = new TabFragment3();
                return tab3;
            case 1:
                TabFragment4 tab4 = new TabFragment4();
                return tab4;
            case 2:
                TabFragment5 tab5 = new TabFragment5();
                return tab5;
            case 3:
                TabFragment6 tab6 = new TabFragment6();
                return tab6;
            case 4:
                TabFragment7 tab7 = new TabFragment7();
                return tab7;
            default:
                return null;
        }
    }
    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
