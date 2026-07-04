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

public class PaduanSuara extends AppCompatActivity {

    private ViewPager viewPager;

    private CircleIndicator circleIndicator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paduan_suara);

        viewPager = findViewById(R.id.vp_paduanSuara);
        circleIndicator = findViewById(R.id.circularIndikator);

        List<Integer> imagePaduanSuara = new ArrayList<>();
        imagePaduanSuara.add(R.drawable.image_not);
        imagePaduanSuara.add(R.drawable.image_not);

        AdapterViewPagerEkstra adapterViewPagerEkstra = new  AdapterViewPagerEkstra(imagePaduanSuara);
        viewPager.setAdapter(adapterViewPagerEkstra);

        circleIndicator.setViewPager(viewPager);

        getWindow().setStatusBarColor(Color.parseColor("#D90889CB"));
    }
    public void back(View view) {
        finish();
    }
}