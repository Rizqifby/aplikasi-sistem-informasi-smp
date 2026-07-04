package com.example.project.Pendidik;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import com.example.project.MainActivity;
import com.example.project.MediaInformasi.ItemInformasiMenu;
import com.example.project.R;
import com.example.project.profil.Profil;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class TenagaPendidik extends AppCompatActivity {

    private TabLayout tabLayout;

    private ViewPager2 viewPager2;

    private AdapterFragmentPendidik adapterFragmentPendidik;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tenaga_pendidik);

        tabLayout = findViewById(R.id.tab_layout);
        viewPager2 = findViewById(R.id.view_pager);
        adapterFragmentPendidik = new AdapterFragmentPendidik(this);
        viewPager2.setAdapter(adapterFragmentPendidik);

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