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

public class Taekwondo extends AppCompatActivity {

    private ViewPager viewPager;

    private CircleIndicator circleIndicator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taekwondo);


        viewPager = findViewById(R.id.vp_taekwondo);
        circleIndicator = findViewById(R.id.circularIndikator);

        List<Integer> imageTaekwondo = new ArrayList<>();
        imageTaekwondo.add(R.drawable.taekwondo_1);
        imageTaekwondo.add(R.drawable.taekwondo_2);

        AdapterViewPagerEkstra adapterViewPagerEkstra = new  AdapterViewPagerEkstra(imageTaekwondo);
        viewPager.setAdapter(adapterViewPagerEkstra);

        circleIndicator.setViewPager(viewPager);

        getWindow().setStatusBarColor(Color.parseColor("#D90889CB"));
    }
    public void back(View view) {
        finish();
    }
}