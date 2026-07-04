package com.example.project.Fasilitas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import com.example.project.Ekskul.AdapterViewPagerEkstra;
import com.example.project.R;

import java.util.ArrayList;
import java.util.List;

import me.relex.circleindicator.CircleIndicator;

public class Fasilitas extends AppCompatActivity {

    private ViewPager viewPager;

    private CircleIndicator circleIndicator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fasilitas);

//        Mushola
        viewPager = findViewById(R.id.vp_mushola);
        circleIndicator = findViewById(R.id.circularIndikatorMushola);

        List<Integer> imageMushola = new ArrayList<>();
        imageMushola.add(R.drawable.mushola_1);
        imageMushola.add(R.drawable.mushola_2);
        imageMushola.add(R.drawable.mushola_3);

        AdapterViewPagerFasilitas adapterViewPagerFasilitas = new AdapterViewPagerFasilitas(imageMushola);
        viewPager.setAdapter(adapterViewPagerFasilitas);

        circleIndicator.setViewPager(viewPager);

////        Perpustakaan
        viewPager = findViewById(R.id.vp_perpustakaan);
        circleIndicator = findViewById(R.id.circularIndikatorPerpustakaan);

        List<Integer> imagePerpustakaan = new ArrayList<>();
        imagePerpustakaan.add(R.drawable.perpustakaan_1);
        imagePerpustakaan.add(R.drawable.perpustakaan_2);
        imagePerpustakaan.add(R.drawable.perpustakaan_3);

        AdapterViewPagerFasilitas adapterViewPagerFasilitasPerpustakaan = new AdapterViewPagerFasilitas(imagePerpustakaan);
        viewPager.setAdapter(adapterViewPagerFasilitasPerpustakaan);

        circleIndicator.setViewPager(viewPager);

////        LabKomputer
        viewPager = findViewById(R.id.vp_labKom);
        circleIndicator = findViewById(R.id.circularIndikatorLabKom);

        List<Integer> imageLabKom= new ArrayList<>();
        imageLabKom.add(R.drawable.labkom_1);
        imageLabKom.add(R.drawable.labkom_2);
        imageLabKom.add(R.drawable.labkom_3);

        AdapterViewPagerFasilitas adapterViewPagerFasilitasLabKom = new AdapterViewPagerFasilitas(imageLabKom);
        viewPager.setAdapter(adapterViewPagerFasilitasLabKom);

        circleIndicator.setViewPager(viewPager);
//
////        Studio Mini
        viewPager = findViewById(R.id.vp_studioMini);
        circleIndicator = findViewById(R.id.circularIndikatorStudioMini);

        List<Integer> imageStudioMini = new ArrayList<>();
        imageStudioMini.add(R.drawable.studiomini_1);
        imageStudioMini.add(R.drawable.studiomini_2);
        imageStudioMini.add(R.drawable.studiomini_3);

        AdapterViewPagerFasilitas adapterViewPagerFasilitasStudioMini = new AdapterViewPagerFasilitas(imageStudioMini);
        viewPager.setAdapter(adapterViewPagerFasilitasStudioMini);

        circleIndicator.setViewPager(viewPager);
//
////        Lab Ipa
        viewPager = findViewById(R.id.vp_labIpa);
        circleIndicator = findViewById(R.id.circularIndikatorlabIpa);

        List<Integer> imagelabIpa = new ArrayList<>();
        imagelabIpa.add(R.drawable.labipa_1);
        imagelabIpa.add(R.drawable.labipa_2);
        imagelabIpa.add(R.drawable.labipa_3);

        AdapterViewPagerFasilitas adapterViewPagerFasilitasLabIpa = new AdapterViewPagerFasilitas(imagelabIpa);
        viewPager.setAdapter(adapterViewPagerFasilitasLabIpa);

        circleIndicator.setViewPager(viewPager);

//        Multimedia
        viewPager = findViewById(R.id.vp_multimedia);
        circleIndicator = findViewById(R.id.circularIndikatormultimedia);

        List<Integer> imagemultimedia = new ArrayList<>();
        imagemultimedia.add(R.drawable.multimedia_1);
        imagemultimedia.add(R.drawable.multimedia_2);

        AdapterViewPagerFasilitas adapterViewPagerFasilitasmultimedia = new AdapterViewPagerFasilitas(imagemultimedia);
        viewPager.setAdapter(adapterViewPagerFasilitasmultimedia);

        circleIndicator.setViewPager(viewPager);

//        UKS
        viewPager = findViewById(R.id.vp_uks);
        circleIndicator = findViewById(R.id.circularIndikatorluks);

        List<Integer> imageuks = new ArrayList<>();
        imageuks.add(R.drawable.uks_1);
        imageuks.add(R.drawable.uks_2);
        imageuks.add(R.drawable.uks_3);

        AdapterViewPagerFasilitas adapterViewPagerFasilitasuks = new AdapterViewPagerFasilitas(imageuks);
        viewPager.setAdapter(adapterViewPagerFasilitasuks);

        circleIndicator.setViewPager(viewPager);

//        Taman Baca
        viewPager = findViewById(R.id.vp_tamanBaca);
        circleIndicator = findViewById(R.id.circularIndikatortamanBaca);

        List<Integer> imagetamanBaca = new ArrayList<>();
        imagetamanBaca.add(R.drawable.tamanbaca_1);
        imagetamanBaca.add(R.drawable.tamanbaca_2);

        AdapterViewPagerFasilitas adapterViewPagerFasilitastamanBaca = new AdapterViewPagerFasilitas(imagetamanBaca);
        viewPager.setAdapter(adapterViewPagerFasilitastamanBaca);

        circleIndicator.setViewPager(viewPager);

//        Lapangan
        viewPager = findViewById(R.id.vp_lapangan);
        circleIndicator = findViewById(R.id.circularIndikatorlapangan);

        List<Integer> imagelapangan = new ArrayList<>();
        imagelapangan.add(R.drawable.lapangan_1);
        imagelapangan.add(R.drawable.lapangan_2);
        imagelapangan.add(R.drawable.lapangan_3);


        AdapterViewPagerFasilitas adapterViewPagerFasilitaslapangan = new AdapterViewPagerFasilitas(imagelapangan);
        viewPager.setAdapter(adapterViewPagerFasilitaslapangan);

        circleIndicator.setViewPager(viewPager);

//        Kantin
        viewPager = findViewById(R.id.vp_kantin);
        circleIndicator = findViewById(R.id.circularIndikatorkantin);

        List<Integer> imagekantin = new ArrayList<>();
        imagekantin.add(R.drawable.kantin_1);
        imagekantin.add(R.drawable.kantin_1);

        AdapterViewPagerFasilitas adapterViewPagerFasilitaskantin = new AdapterViewPagerFasilitas(imagekantin);
        viewPager.setAdapter(adapterViewPagerFasilitaskantin);

        circleIndicator.setViewPager(viewPager);

        getWindow().setStatusBarColor(Color.parseColor("#D90889CB"));
    }
    public void back(View view) {
        finish();
    }
}