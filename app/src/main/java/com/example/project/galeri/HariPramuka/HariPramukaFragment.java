package com.example.project.galeri.HariPramuka;

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


public class HariPramukaFragment extends Fragment {

    private RecyclerView rvKegiatan;

    private AdapterStanggered adapterStanggered;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_idul_fitri, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.rcv_IdulFitri);
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));
//        recyclerView.setLayoutManager(new StaggeredGridLayoutManager.LayoutParams());
        List<ItemStanggered> itemStanggereds = new ArrayList<>();
        itemStanggereds.add(new ItemStanggered(R.drawable.haripramuka_1));
        itemStanggereds.add(new ItemStanggered(R.drawable.haripramuka_2));
        itemStanggereds.add(new ItemStanggered(R.drawable.haripramuka_3));
        itemStanggereds.add(new ItemStanggered(R.drawable.haripramuka_4));
        recyclerView.setAdapter(new AdapterStanggered(itemStanggereds));

        return view;
    }
}