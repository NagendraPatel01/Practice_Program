package com.notes.recyclerviewpractice;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class TwoAdapter extends FragmentPagerAdapter {


    public TwoAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }



    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){

            case 0:
                return  new OneFragment();

            case 1:
                return  new OneFragment();


            case 2:
                return  new OneFragment();


            default:
                return null;


        }

    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "Info";


            case 1:
                return "Reviews";


            case 2:
                return "ankit";



            default:
                return null;
        }
    }
}
