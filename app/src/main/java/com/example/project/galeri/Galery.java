package com.example.project.galeri;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import com.example.project.R;
import com.google.android.material.tabs.TabLayout;

public class Galery extends AppCompatActivity {

    TabLayout tabLayout;

    ViewPager2 viewPager2;

    AdapterFragmentGaleri adapterFragmentGaleri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galery);

        tabLayout = findViewById(R.id.tabLayout_galeri);
        viewPager2 = findViewById(R.id.vp2_galeri);
        adapterFragmentGaleri = new AdapterFragmentGaleri(this);
        viewPager2.setAdapter(adapterFragmentGaleri);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager2.setCurrentItem(tab.getPosition());
            }
            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }
            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                tabLayout.getTabAt(position).select();
            }
        });

        getWindow().setStatusBarColor(Color.parseColor("#D90889CB"));
    }
    public void back(View view) {
        finish();
    }
}