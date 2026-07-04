package com.example.project.Lainnya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import com.example.project.MainActivity;
import com.example.project.R;
import com.example.project.galeri.Galery;

public class Lainnya extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lainnya);

        getWindow().setStatusBarColor(Color.parseColor("#D90889CB"));
    }

    public void galeri(View view) {
        Intent intent = new Intent(Lainnya.this, Galery.class);
        startActivity(intent);
    }

    public void back(View view) {
        finish();
    }
}