package com.example.project.galeri.HUtRi;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.project.R;
import com.example.project.galeri.AdapterStanggered;
import com.example.project.galeri.ItemStanggered;

import java.util.ArrayList;
import java.util.List;


public class HutRiFragment extends Fragment {

    private RecyclerView rvKegiatan;

    private AdapterStanggered adapterStanggered;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_hut_ri, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.rcv_HutRi);
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));
//        recyclerView.setLayoutManager(new StaggeredGridLayoutManager.LayoutParams());
        List<ItemStanggered> itemStanggereds = new ArrayList<>();
        itemStanggereds.add(new ItemStanggered(R.drawable.hutri_1));
        itemStanggereds.add(new ItemStanggered(R.drawable.hutri_2));
        itemStanggereds.add(new ItemStanggered(R.drawable.hutri_3));
        itemStanggereds.add(new ItemStanggered(R.drawable.hutri_4));
        itemStanggereds.add(new ItemStanggered(R.drawable.hutri_5));
        itemStanggereds.add(new ItemStanggered(R.drawable.hutri_6));
        itemStanggereds.add(new ItemStanggered(R.drawable.hutri_7));
        itemStanggereds.add(new ItemStanggered(R.drawable.hutri_9));
        itemStanggereds.add(new ItemStanggered(R.drawable.hutri_10));
        itemStanggereds.add(new ItemStanggered(R.drawable.hutri_11));
        itemStanggereds.add(new ItemStanggered(R.drawable.hutri_12));
        itemStanggereds.add(new ItemStanggered(R.drawable.hutri_13));
        itemStanggereds.add(new ItemStanggered(R.drawable.hutri_14));
        itemStanggereds.add(new ItemStanggered(R.drawable.hutri_15));
        itemStanggereds.add(new ItemStanggered(R.drawable.hutri_16));
        itemStanggereds.add(new ItemStanggered(R.drawable.hutri_17));
        itemStanggereds.add(new ItemStanggered(R.drawable.hutri_18));
        itemStanggereds.add(new ItemStanggered(R.drawable.hutri_19));
        itemStanggereds.add(new ItemStanggered(R.drawable.hutri_20));
        itemStanggereds.add(new ItemStanggered(R.drawable.hutri_21));
        itemStanggereds.add(new ItemStanggered(R.drawable.hutri_22));
        itemStanggereds.add(new ItemStanggered(R.drawable.hutri_23));
        itemStanggereds.add(new ItemStanggered(R.drawable.hutri_24));
        recyclerView.setAdapter(new AdapterStanggered(itemStanggereds));

        return view;
    }
}