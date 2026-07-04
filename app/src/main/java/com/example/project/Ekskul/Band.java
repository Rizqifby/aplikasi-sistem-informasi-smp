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

public class Band extends AppCompatActivity {

    private ViewPager viewPager;

    private CircleIndicator circleIndicator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_band);

        viewPager = findViewById(R.id.vp_band);
        circleIndicator = findViewById(R.id.circularIndikator);

        List<Integer> imageBand = new ArrayList<>();
        imageBand.add(R.drawable.image_not);
        imageBand.add(R.drawable.image_not);

        AdapterViewPagerEkstra adapterViewPagerEkstra = new  AdapterViewPagerEkstra(imageBand);
        viewPager.setAdapter(adapterViewPagerEkstra);

        circleIndicator.setViewPager(viewPager);

        getWindow().setStatusBarColor(Color.parseColor("#D90889CB"));
    }
    public void back(View view) {
        finish();
    }
}