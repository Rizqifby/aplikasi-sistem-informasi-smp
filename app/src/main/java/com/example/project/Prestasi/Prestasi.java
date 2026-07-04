package com.example.project.Prestasi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import com.example.project.R;

import java.util.ArrayList;
import java.util.List;

public class Prestasi extends AppCompatActivity {

    private RecyclerView rcvPrestasi;

    private AdapterPrestasi adapterPrestasi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prestasi);

        rcvPrestasi = findViewById(R.id.rcv_prestasi);
        adapterPrestasi = new AdapterPrestasi(this);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        rcvPrestasi.setLayoutManager(linearLayoutManager);

        adapterPrestasi.setData(getListUser());
        rcvPrestasi.setAdapter(adapterPrestasi);

        getWindow().setStatusBarColor(Color.parseColor("#D90889CB"));
    }

    private List<ItemPrestasi> getListUser() {
        List<ItemPrestasi> list = new ArrayList<>();
        list.add(new ItemPrestasi(R.drawable.prestasi3, "Juara 3 POPDA SMP/MTs/Sederajat Taekwondo Under 62 kg Putra Tingkat Kabupaten Kendal Tahun 2023", "Rafa Mafazan"));
        list.add(new ItemPrestasi(R.drawable.prestasi3, "Juara 2 POPDA SMP/MTs/Sederajat Taekwondo Under 58 kg Putra Tingkat Kabupaten Kendal Tahun 2023", "Alvaro Revandika"));
        list.add(new ItemPrestasi(R.drawable.prestasi3, "Juara 2 POPDA SMP/MTs/Sederajat Taekwondo Under 53 kg Putri Tingkat Kabupaten Kendal Tahun 2023", "Rata Maulidya Agista Qurrotul Ain"));
        list.add(new ItemPrestasi(R.drawable.prestasi3, "Juara 1 POPDA SMP/MTs/Sederajat Taekwondo Under 48 kg Putra Tingkat Kabupaten Kendal Tahun 2023", "Daffa Wahyu Septiansyah"));
        list.add(new ItemPrestasi(R.drawable.prestasi3, "Juara 1 POPDA SMP/MTs/Sederajat Taekwondo Under 43 kg Putri Tingkat Kabupaten Kendal Tahun 2023", "Azadirachta Indica Ariandto"));
        list.add(new ItemPrestasi(R.drawable.prestasi3, "Juara 1 POPDA SMP/MTs/Sederajat Taekwondo Over 57 - 62 kg Putri Tingkat Kabupaten Kendal Tahun 2023", "Najwa Maritza Zain"));
        list.add(new ItemPrestasi(R.drawable.prestasi3, "Juara 2 POPDA SMP/MTs/Sederajat Renang Gaya Dada 100 m Putri Tingkat Kabupaten Kendal Tahun 2023", "Hadziqoh Mufidah Arifin"));
        list.add(new ItemPrestasi(R.drawable.prestasi3, "Juara 3 POPDA SMP/MTs/Sederajat Renang Gaya Punggung 50 m Putri Tingkat Kabupaten Kendal Tahun 2023", "Hadziqoh Mufidah Arifin"));
        list.add(new ItemPrestasi(R.drawable.prestasi3, "Juara 1 POPDA SMP/MTs/Sederajat Panahan Standar Nasional 20 m Putri Tingkat Kabupaten Kendal Tahun 2023", "Dhia Talita Arifana"));
        list.add(new ItemPrestasi(R.drawable.prestasi3, "Juara 2 POPDA SMP/MTs/Sederajat Panahan Standar Nasional 30 m Putri Tingkat Kabupaten Kendal Tahun 2023", "Dhia Talita Arifana"));
        list.add(new ItemPrestasi(R.drawable.prestasi3, "Juara 2 POPDA SMP/MTs/Sederajat Panahan Standar Nasional Total Jarak Putri Tingkat Kabupaten Kendal Tahun 2023", "Dhia Talita Arifana"));
        list.add(new ItemPrestasi(R.drawable.prestasi3, "Juara 2 POPDA SMP/MTs/Sederajat Panahan Standar Nasional 40 m Putri Tingkat Kabupaten Kendal Tahun 2023", "Dhia Talita Arifana"));
        list.add(new ItemPrestasi(R.drawable.prestasi3, "Juara 3 POPDA SMP/MTs/Sederajat Panahan Standar Nasional 30 m Putri Tingkat Kabupaten Kendal Tahun 2023", "Ithmainni Dauma Najlati"));
        list.add(new ItemPrestasi(R.drawable.prestasi3, "Juara 3 POPDA SMP/MTs/Sederajat Panahan Standar Nasional 40 m Putri Tingkat Kabupaten Kendal Tahun 2023", "Ithmainni Dauma Najlati"));
        list.add(new ItemPrestasi(R.drawable.prestasi3, "Juara 1 POPDA SMP/MTs/Sederajat Atletik Lari 400 m Putri Tingkat Kabupaten Kendal Tahun 2023", "Keyla Tiyan Rifero"));
        list.add(new ItemPrestasi(R.drawable.prestasi3, "Juara 3 POPDA SMP/MTs/Sederajat Atletik Lompat Jauh Putri Tingkat Kabupaten Kendal Tahun 2023", "Leni Rustriyan Yuliana"));
        list.add(new ItemPrestasi(R.drawable.prestasi3, "Juara 2 POPDA SMP/MTs/Sederajat Atletik Lompat Tinggi Putri Tingkat Kabupaten Kendal Tahun 2023", "Andhara Stefany Syavira"));
        list.add(new ItemPrestasi(R.drawable.prestasi3, "Juara 3 POPDA SMP/MTs/Sederajat Bola Basket Putra Tingkat Kabupaten Kendal Tahun 2023", "Muhammad Fanny Ardiyanto"));
        list.add(new ItemPrestasi(R.drawable.prestasi3, "Juara 3 POPDA SMP/MTs/Sederajat Bola Basket Putra Tingkat Kabupaten Kendal Tahun 2023", "Hebnu Aswat"));
        list.add(new ItemPrestasi(R.drawable.prestasi3, "Juara 3 POPDA SMP/MTs/Sederajat Bola Basket Putra Tingkat Kabupaten Kendal Tahun 2023", "Raza Shadin Akbar"));
        list.add(new ItemPrestasi(R.drawable.prestasi3, "Juara 3 POPDA SMP/MTs/Sederajat Bola Basket Putra Tingkat Kabupaten Kendal Tahun 2023", "Galang Eka Febrian"));
        list.add(new ItemPrestasi(R.drawable.prestasi3, "Juara 3 POPDA SMP/MTs/Sederajat Bola Basket Putra Tingkat Kabupaten Kendal Tahun 2023", "Moh Nurul Agus Ryanto"));
        list.add(new ItemPrestasi(R.drawable.prestasi3, "Juara 3 POPDA SMP/MTs/Sederajat Bola Basket Putra Tingkat Kabupaten Kendal Tahun 2023", "Ahmad Hafidz Widiyanto"));
        list.add(new ItemPrestasi(R.drawable.prestasi3, "Juara 3 POPDA SMP/MTs/Sederajat Bola Basket Putra Tingkat Kabupaten Kendal Tahun 2023", "Erlangga Adi Pratama"));
        list.add(new ItemPrestasi(R.drawable.prestasi3, "Juara 3 POPDA SMP/MTs/Sederajat Bola Basket Putra Tingkat Kabupaten Kendal Tahun 2023", "Ahmad Akbar Rizky Kusuma"));
        list.add(new ItemPrestasi(R.drawable.prestasi3, "Juara 3 POPDA SMP/MTs/Sederajat Bola Basket Putra Tingkat Kabupaten Kendal Tahun 2023", "Muhammad Akbar Nuriyadi"));
        list.add(new ItemPrestasi(R.drawable.prestasi3, "Juara 3 POPDA SMP/MTs/Sederajat Bola Basket Putra Tingkat Kabupaten Kendal Tahun 2023", "Muhammad Abyan Ramzi Hermansyah"));
        list.add(new ItemPrestasi(R.drawable.prestasi3, "Juara 3 POPDA SMP/MTs/Sederajat Bola Basket Putra Tingkat Kabupaten Kendal Tahun 2023", "Athaya Maulana Ar Rafi"));
        list.add(new ItemPrestasi(R.drawable.prestasi3, "Juara 3 POPDA SMP/MTs/Sederajat Bola Basket Putra Tingkat Kabupaten Kendal Tahun 2023", "Leonidas Treas Jaya"));
        list.add(new ItemPrestasi(R.drawable.prestasi3, "Juara 2 Futsal Pelajar Sederajat Tingkat Kabupaten Kendal Tahun 2023", "Radefa Najwa Pratama"));
        list.add(new ItemPrestasi(R.drawable.prestasi3, "Juara 2 Futsal Pelajar Sederajat Tingkat Kabupaten Kendal Tahun 2023", "Rama Aditya"));
        list.add(new ItemPrestasi(R.drawable.prestasi3, "Juara 2 Futsal Pelajar Sederajat Tingkat Kabupaten Kendal Tahun 2023", "Muhammad Akbar Ardan Maulana"));
        list.add(new ItemPrestasi(R.drawable.prestasi3, "Juara 2 Futsal Pelajar Sederajat Tingkat Kabupaten Kendal Tahun 2023", "Fatir Rohman"));
        list.add(new ItemPrestasi(R.drawable.prestasi3, "Juara 2 Futsal Pelajar Sederajat Tingkat Kabupaten Kendal Tahun 2023", "Muhammad Luazin Ludfi"));
        list.add(new ItemPrestasi(R.drawable.prestasi3, "Juara 2 Futsal Pelajar Sederajat Tingkat Kabupaten Kendal Tahun 2023", "Febriansyah Fachri Armada"));
        list.add(new ItemPrestasi(R.drawable.prestasi3, "Juara 2 Futsal Pelajar Sederajat Tingkat Kabupaten Kendal Tahun 2023", "Chandra Kusuma Siswanto"));
        list.add(new ItemPrestasi(R.drawable.prestasi3, "Juara 2 Futsal Pelajar Sederajat Tingkat Kabupaten Kendal Tahun 2023", "Yogiek Alvien Saputra"));
        list.add(new ItemPrestasi(R.drawable.prestasi3, "Juara 2 Futsal Pelajar Sederajat Tingkat Kabupaten Kendal Tahun 2023", "Zubat Achmad Zidan"));
        list.add(new ItemPrestasi(R.drawable.prestasi3, "Juara 2 Futsal Pelajar Sederajat Tingkat Kabupaten Kendal Tahun 2023", "Aep Fazril Hidayatulloh"));
        list.add(new ItemPrestasi(R.drawable.prestasi3, "Juara 2 Futsal Pelajar Sederajat Tingkat Kabupaten Kendal Tahun 2023", "Muhammad Naufal Bahtiar"));
        list.add(new ItemPrestasi(R.drawable.prestasi3, "Juara 2 Futsal Pelajar Sederajat Tingkat Kabupaten Kendal Tahun 2023", "Hendika Setya Wardana"));
        return list;
    }

    public void back(View view) {
        finish();
    }
}