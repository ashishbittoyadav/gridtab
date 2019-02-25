package com.headspire.harwarecamera;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * FragmentPagerAdapter is used when we have limited number of tabs.
 */
class PageAdapter extends FragmentPagerAdapter {
    private int numberOfTabs;

    public PageAdapter(FragmentManager fm,int numberOfTabs) {
        super(fm);
        this.numberOfTabs=numberOfTabs;
    }

    @Override
    public Fragment getItem(int i) {
        switch (i)
        {
            case 0:
                return new CameraFragment();
            case 1:
                return new ImageFragment();
            default:
                    return null;
        }
    }

    @Override
    public int getCount() {
        return numberOfTabs;
    }
}
