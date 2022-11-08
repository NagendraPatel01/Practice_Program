package com.notes.recyclerviewpractice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class JobDetailActivity extends AppCompatActivity {

    ViewPager2 pager;
    TabLayout tab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_job_detail);
        pager=findViewById(R.id.pager);
        tab=findViewById(R.id.tab);

        tab.addTab(tab.newTab().setText("Ankit"));
        tab.addTab(tab.newTab().setText("bhupendra"));

        FragmentManager fragmentManager = getSupportFragmentManager();

        JobDetailAdapter jobDetailAdapter = new JobDetailAdapter(fragmentManager,getLifecycle());
        pager.setAdapter(jobDetailAdapter);

        tab.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                pager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        pager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {

                tab.selectTab(tab.getTabAt(position));
            }
        });
    }
}