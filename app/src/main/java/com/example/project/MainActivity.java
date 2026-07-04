package com.example.project;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.example.project.Ekskul.activity_ekskul;
import com.example.project.Fasilitas.Fasilitas;
import com.example.project.Lainnya.Lainnya;
import com.example.project.MediaInformasi.AdapterMediaInformasi;
import com.example.project.MediaInformasi.ItemInformasiMenu;
import com.example.project.Pendidik.TenagaPendidik;
import com.example.project.Prestasi.Prestasi;
import com.example.project.galeri.Galery;
import com.example.project.profil.Profil;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private RecyclerView rcvUser;
    private AdapterMediaInformasi adapterMediaInformasi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcvUser = findViewById(R.id.media);
        adapterMediaInformasi = new AdapterMediaInformasi(this);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        rcvUser.setLayoutManager(linearLayoutManager);

        adapterMediaInformasi.setData(getListUser());
        rcvUser.setAdapter(adapterMediaInformasi);

        getWindow().setStatusBarColor(Color.parseColor("#D90889CB"));
    }


    private List<ItemInformasiMenu> getListUser() {
        List<ItemInformasiMenu> list = new ArrayList<>();
        list.add(new ItemInformasiMenu(R.drawable.hutri_14,"Upacara HUT RI ke 77"));
        list.add(new ItemInformasiMenu(R.drawable.haripramuka_3,"Upacara Hari Pramuka Ke 61"));
        return list;
    }
    
    public void instagram(View view) {
        String url = "https://www.instagram.com/smpn1brangsong/";
        Intent bukainstagram = new Intent(Intent.ACTION_VIEW);
        bukainstagram.setData(Uri.parse(url));
        startActivity(bukainstagram);
    }

    public void facebook(View view) {
        String url = "https://www.facebook.com/pages/Smp-N-1-Brangsong/507693525917338";
        Intent bukafacebook = new Intent(Intent.ACTION_VIEW);
        bukafacebook.setData(Uri.parse(url));
        startActivity(bukafacebook);
    }

    public void email(View view) {
        String url = "mailto:smpn_satu_brangsong@gmail.com";
        Intent bukaemail = new Intent(Intent.ACTION_VIEW);
        bukaemail.setData(Uri.parse(url));
        startActivity(bukaemail);
    }

    public void profil(View view) {
        Intent intent = new Intent(MainActivity.this, Profil.class);
        startActivity(intent);
    }

    public void pendidik(View view) {
        Intent intent = new Intent(MainActivity.this, TenagaPendidik.class);
        startActivity(intent);
    }

    public void fasilitas(View view) {
        Intent intent = new Intent(MainActivity.this, Fasilitas.class);
        startActivity(intent);
    }

    public void ekskul(View view) {
        Intent intent = new Intent(MainActivity.this, activity_ekskul.class);
        startActivity((intent));
    }

    public void prestasi(View view) {
        Intent intent = new Intent(MainActivity.this, Prestasi.class);
        startActivity((intent));
    }

    public void lainnya(View view) {
        Intent intent = new Intent(MainActivity.this, Lainnya.class);
        startActivity(intent);
    }

    public void seeall(View view) {
        Intent intent = new Intent(MainActivity.this, Galery.class);
        startActivity(intent);
    }



}