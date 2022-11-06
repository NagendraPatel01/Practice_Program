package com.notes.recyclerviewpractice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class ViewpagerActivity extends AppCompatActivity {

    TabLayout tab;
    ViewPager pager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewpager);

        tab=findViewById(R.id.tab);
        pager=findViewById(R.id.pager);

        ViewPageroneAdapter adapter=new ViewPageroneAdapter(getSupportFragmentManager());
        tab.setupWithViewPager(pager);
        pager.setAdapter(adapter);
    }
}