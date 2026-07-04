package com.example.project.Pendidik.Mapel;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.project.R;

import java.util.ArrayList;
import java.util.List;

public class MapelFragment extends Fragment {
    private RecyclerView rvMapel;

    private AdapterMapel adapterMapel;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_mapel, container, false);
    }

    public void onViewCreated(View view, Bundle saveInstanceState){
        super.onViewCreated(view, saveInstanceState);

        rvMapel = view.findViewById(R.id.rv_mapel);
        adapterMapel = new AdapterMapel(this);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        rvMapel.setLayoutManager(linearLayoutManager);

        adapterMapel.setData(getListUser());
        rvMapel.setAdapter(adapterMapel);

    }
    private List<ItemMapel> getListUser() {
        List<ItemMapel> list = new ArrayList<>();
        list.add(new ItemMapel(R.drawable.usertiga,"Purwadi, S.Pd.I","Pendidikan Agama Islam"));
        list.add(new ItemMapel(R.drawable.usertiga,"Dina Muthoharoh, S.Kom","Pendidikan Agama Islam"));
        list.add(new ItemMapel(R.drawable.usertiga,"Siti Romlah, S.Pd.","PPKn"));
        list.add(new ItemMapel(R.drawable.usertiga,"Rokhatun, S.Pd.","PPKn"));
        list.add(new ItemMapel(R.drawable.usertiga,"Dwi Lestari, S.Pd.","PPKn"));
        list.add(new ItemMapel(R.drawable.usertiga,"Dra. Ratna Widuri","Bahasa Indonesia"));
        list.add(new ItemMapel(R.drawable.usertiga,"Rita Oktiningsih, S.Pd.","Bahasa Indonesia"));
        list.add(new ItemMapel(R.drawable.usertiga,"Imas Diken Alifia Bella, S.Pd.","Bahasa Indonesia"));
        list.add(new ItemMapel(R.drawable.usertiga,"Triana Sulistyowati, S.Pd.","Bahasa Indonesia"));
        list.add(new ItemMapel(R.drawable.usertiga,"Naniek Sri Hastuti, S.Pd.","Bahasa Indonesia"));
        list.add(new ItemMapel(R.drawable.usertiga,"Ika Ismayawati, S.Pd.","Bahasa Indonesia"));
        list.add(new ItemMapel(R.drawable.usertiga,"Sudarsih, S.Pd.","Matematika"));
        list.add(new ItemMapel(R.drawable.usertiga,"Nur Wachid S, S.Pd.","Matematika"));
        list.add(new ItemMapel(R.drawable.usertiga,"Budi Santoso, S.Pd.","Matematika"));
        list.add(new ItemMapel(R.drawable.usertiga,"Lusia Kristiana, S.Pd.","Matematika"));
        list.add(new ItemMapel(R.drawable.usertiga,"Septiana vita Riastuti  , S.Pd.","Matematika"));
        list.add(new ItemMapel(R.drawable.usertiga,"R. Jujur S, S.Pd","Ilmu Pengetahuan Alam"));
        list.add(new ItemMapel(R.drawable.usertiga,"Moh Abas, S.Pd, M.Pd.","Ilmu Pengetahuan Alam"));
        list.add(new ItemMapel(R.drawable.usertiga,"Berka Efriana, S.Pd.","Ilmu Pengetahuan Alam"));
        list.add(new ItemMapel(R.drawable.usertiga,"Dillah Widatti Mahendra, S.Pd.","Ilmu Pengetahuan Alam"));
        list.add(new ItemMapel(R.drawable.usertiga,"Muhammad Ridwan Nur Cholis, S.Pd.","Ilmu Pengetahuan Alam"));
        list.add(new ItemMapel(R.drawable.usertiga,"Umi Endrastiati S., S.Pd.","Ilmu Pengetahuan Sosial"));
        list.add(new ItemMapel(R.drawable.usertiga,"Dra. Sri Nurdiayu","Ilmu Pengetahuan Sosial"));
        list.add(new ItemMapel(R.drawable.usertiga,"Ani Syafa'ah, S.Pd.","Ilmu Pengetahuan Sosial"));
        list.add(new ItemMapel(R.drawable.usertiga,"Diana Indriastuti, S.Pd.,M.Pd.","Ilmu Pengetahuan Sosial"));
        list.add(new ItemMapel(R.drawable.usertiga,"Kusdaryanti, S.Pd.","Bahasa Inggris"));
        list.add(new ItemMapel(R.drawable.usertiga,"Amalia Hayati, S.Pd.","Bahasa Inggris"));
        list.add(new ItemMapel(R.drawable.usertiga,"Sri Hardiningsih, S.Pd.","Bahasa Inggris"));
        list.add(new ItemMapel(R.drawable.usertiga,"Rini Setyowati, S.Pd.","Bahasa Inggris"));
        list.add(new ItemMapel(R.drawable.usertiga,"Diah Nur Wahyuni, S.Pd.","Bahasa Inggris"));
        list.add(new ItemMapel(R.drawable.usertiga,"Naniek Rustiyani, S.Pd","Seni Budaya"));
        list.add(new ItemMapel(R.drawable.usertiga,"Elok Setyo Pertiwi,S.Pd.","Seni Budaya"));
        list.add(new ItemMapel(R.drawable.usertiga,"Ermin Siti Nurcholis, S.Pd.,M.Pd.","Pendidikan Jasmani, Olahraga, dan Kesehatan"));
        list.add(new ItemMapel(R.drawable.usertiga,"Teguh Supriyantoro, S.Pd","Pendidikan Jasmani, Olahraga, dan Kesehatan"));
        list.add(new ItemMapel(R.drawable.usertiga,"Eko Kuniawan, S.Pd.","Pendidikan Jasmani, Olahraga, dan Kesehatan"));
        list.add(new ItemMapel(R.drawable.usertiga,"Budi Tri Kartika, S.Pd","Prakarya"));
        list.add(new ItemMapel(R.drawable.usertiga,"Wiji Astuti","Prakarya"));
        list.add(new ItemMapel(R.drawable.usertiga,"Supriyono, S.Pd","Bahasa Jawa"));
        list.add(new ItemMapel(R.drawable.usertiga,"Harsini","Bahasa Jawa"));
        list.add(new ItemMapel(R.drawable.usertiga,"Ayu Paska Silaesti, S.Pd","Teknologi Informasi dan Komunikasi"));
        list.add(new ItemMapel(R.drawable.usertiga,"Muhammad Ridwan Nur Cholis, S.Pd.","Teknologi Informasi dan Komunikasi"));

        return list;
    }
}