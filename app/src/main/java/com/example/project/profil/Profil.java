package com.example.project.profil;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import com.example.project.Pendidik.AdapterFragmentPendidik;
import com.example.project.R;
import com.google.android.material.tabs.TabLayout;

public class Profil extends AppCompatActivity {

    private TabLayout tabLayout;

    private ViewPager2 viewPager2;

    private AdapterFragmentProfil adapterFragmentProfil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);

        tabLayout = findViewById(R.id.tab_layoutProfil);
        viewPager2 = findViewById(R.id.view_pagerProfil);
        adapterFragmentProfil = new AdapterFragmentProfil(this);
        viewPager2.setAdapter(adapterFragmentProfil);

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