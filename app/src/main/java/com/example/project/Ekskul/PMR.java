package com.example.project.Ekskul;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import com.example.project.R;

import java.util.ArrayList;
import java.util.List;

import me.relex.circleindicator.CircleIndicator;

public class PMR extends AppCompatActivity {

    private ViewPager viewPager;

    private CircleIndicator circleIndicator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pmr);

        viewPager = findViewById(R.id.vp_pmr);
        circleIndicator = findViewById(R.id.circularIndikator);

        List<Integer> imagePmr = new ArrayList<>();
        imagePmr.add(R.drawable.pmr_1);
        imagePmr.add(R.drawable.pmr_2);

        AdapterViewPagerEkstra adapterViewPagerEkstra = new  AdapterViewPagerEkstra(imagePmr);
        viewPager.setAdapter(adapterViewPagerEkstra);

        circleIndicator.setViewPager(viewPager);

        getWindow().setStatusBarColor(Color.parseColor("#D90889CB"));
    }
    public void back(View view) {
        finish();
    }
}