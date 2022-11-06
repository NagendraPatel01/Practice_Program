package com.notes.recyclerviewpractice;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewPageroneAdapter extends FragmentPagerAdapter {
    public ViewPageroneAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }



    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){

            case 0:
                return new OneFragment();

            case 1:
                return new OneFragment();

            case 2:
                return new OneFragment();

            case 3:
                return new OneFragment();

            case 4:
                return new OneFragment();

            case 5:
                return new OneFragment();

            case 6:
                return new OneFragment();



            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 7;
    }


    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        switch (position) {

            case 0:
                return "Info";


            case 1:
                return "Reviews";

            case 2:
                return "Reviews";

            case 3:
                return "Reviews";

            case 4:
                return "Reviews";

            case 5:
                return "Reviews";

            case 6:
                return "Reviews";


            default:
                return null;

        }
    }
}
