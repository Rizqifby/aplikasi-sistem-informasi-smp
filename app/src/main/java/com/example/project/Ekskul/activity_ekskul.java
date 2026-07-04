package com.example.project.Ekskul;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import com.example.project.R;

public class activity_ekskul extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ekskul);


        getWindow().setStatusBarColor(Color.parseColor("#D90889CB"));
    }



    public void pramuka(View view) {
        Intent intent = new Intent(activity_ekskul.this, Pramuka.class);
        startActivity(intent);
    }

    public void taekwondo(View view) {
        Intent intent = new Intent(activity_ekskul.this, Taekwondo.class);
        startActivity(intent);
    }

    public void voli(View view) {
        Intent intent = new Intent(activity_ekskul.this, Voli.class);
        startActivity(intent);
    }

    public void kir(View view) {
        Intent intent = new Intent(activity_ekskul.this, KIR.class);
        startActivity(intent);
    }

    public void paskibra(View view) {
        Intent intent = new Intent(activity_ekskul.this, Paskibra.class);
        startActivity(intent);
    }

    public void tari(View view) {
        Intent intent = new Intent(activity_ekskul.this, Tari.class);
        startActivity(intent);
    }

    public void pmr(View view) {
        Intent intent = new Intent(activity_ekskul.this, PMR.class);
        startActivity(intent);
    }

    public void rebana(View view) {
        Intent intent = new Intent(activity_ekskul.this, Rebana.class);
        startActivity(intent);
    }

    public void futsal(View view) {
        Intent intent = new Intent(activity_ekskul.this, Futsal.class);
        startActivity(intent);
    }

    public void basket(View view) {
        Intent intent = new Intent(activity_ekskul.this, Basket.class);
        startActivity(intent);
    }

    public void paduanSuara(View view) {
        Intent intent = new Intent(activity_ekskul.this, PaduanSuara.class);
        startActivity(intent);
    }

    public void karawitan(View view) {
        Intent intent = new Intent(activity_ekskul.this, Karawitan.class);
        startActivity(intent);
    }

    public void band(View view) {
        Intent intent = new Intent(activity_ekskul.this, Band.class);
        startActivity(intent);
    }

    public void pencakSilat(View view) {
        Intent intent = new Intent(activity_ekskul.this, PencakSilat.class);
        startActivity(intent);
    }

    public void back(View view) {
        finish();
    }
}