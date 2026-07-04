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

public class Pramuka extends AppCompatActivity {

    private ViewPager viewPager;

    private CircleIndicator circleIndicator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pramuka);

        viewPager = findViewById(R.id.vp_pramuka);
        circleIndicator = findViewById(R.id.circularIndikator);

        List<Integer> imagePramuka = new ArrayList<>();
        imagePramuka.add(R.drawable.pramuka_1);
        imagePramuka.add(R.drawable.pramuka_2);

        AdapterViewPagerEkstra adapterViewPagerEkstra = new  AdapterViewPagerEkstra(imagePramuka);
        viewPager.setAdapter(adapterViewPagerEkstra);

        circleIndicator.setViewPager(viewPager);

        getWindow().setStatusBarColor(Color.parseColor("#D90889CB"));
    }
    public void back(View view) {
        finish();
    }
}