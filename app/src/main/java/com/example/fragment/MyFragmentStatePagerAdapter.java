package com.example.fragment;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;


public class MyFragmentStatePagerAdapter extends FragmentPagerAdapter {
    public MyFragmentStatePagerAdapter(FragmentManager fm){
        super(fm);
    }
    @Override
    public Fragment getItem(int i){
        switch (i){
            case 0:
                return new Fragment0();
            case 1:
                return new Fragment1();
            default:
                return new Fragment2();

        }
    }
    @Override
    public int getCount(){
        return 3;

        }
        @Override
        public CharSequence getPageTitle(int position){
            switch (position){
                case 0:
                    return "ホーム";
                case 1:
                    return "画面２";
                default:
                    return "画面３";
            }
        }

}
