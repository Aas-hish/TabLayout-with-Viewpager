/* This is main java file for integrating
tablayout with viewpager in android*/




package com.example.tab;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    TabLayout tab;
    ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tab=findViewById(R.id.tab);
        viewPager=findViewById(R.id.viewpager);

        viewPagerAdapter ad =new viewPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(ad);

        tab.setupWithViewPager(viewPager);



    }
}
