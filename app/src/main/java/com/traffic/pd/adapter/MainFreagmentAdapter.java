package com.traffic.pd.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.ViewGroup;

import com.traffic.pd.constant.Constant;
import com.traffic.pd.fragments.HomeFragment;
import com.traffic.pd.fragments.OrderHallFragment;
import com.traffic.pd.fragments.PublishFragment;
import com.traffic.pd.fragments.UserFragment;

public class MainFreagmentAdapter extends FragmentPagerAdapter {

    private FragmentManager mFm;

    String tag;
    public MainFreagmentAdapter(FragmentManager fm, String tag) {
        super(fm);
        this.tag = tag;
        mFm = fm;
    }

    @Override
    public Fragment getItem(int pos) {
        Fragment fragment = null;
        switch (pos){
            case 0:
                if(tag.equals(Constant.Val_Consigner)){
                    fragment = new PublishFragment();
                }
                if(tag.equals(Constant.Val_Drivers)){
                    fragment = OrderHallFragment.newInstance(tag,"");
                }
                if(tag.equals(Constant.Val_Company)){
                    fragment = OrderHallFragment.newInstance(tag,"");
                }
                break;
            case 1:
                fragment = UserFragment.newInstance(tag,"");
                break;
        }
        return fragment;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return "";
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        Fragment f = (Fragment) super.instantiateItem(container, position);
        return f;
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public int getItemPosition(Object object) {
        return POSITION_NONE;
    }
}
