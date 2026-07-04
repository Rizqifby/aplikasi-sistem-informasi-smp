package com.example.project.Pendidik.Bk;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.project.Pendidik.Mapel.AdapterMapel;
import com.example.project.Pendidik.Mapel.ItemMapel;
import com.example.project.R;

import java.util.ArrayList;
import java.util.List;


public class BkFragment extends Fragment {
    private RecyclerView rvBk;

    private AdapterBk adapterBk;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_bk, container, false);
    }
    public void onViewCreated(View view, Bundle saveInstanceState){
        super.onViewCreated(view, saveInstanceState);

        rvBk = view.findViewById(R.id.rv_bk);
        adapterBk = new AdapterBk(this);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        rvBk.setLayoutManager(linearLayoutManager);

        adapterBk.setData(getListUser());
        rvBk.setAdapter(adapterBk);
    }
    private List<ItemBk> getListUser() {
        List<ItemBk> list = new ArrayList<>();
        list.add(new ItemBk(R.drawable.usertiga,"Dra. Sri Sundari", "Bimbingan Konseling"));
        list.add(new ItemBk(R.drawable.usertiga,"Dra. Sri Wahyu H", "Bimbingan Konseling"));
        list.add(new ItemBk(R.drawable.usertiga,"Endang Listyowati", "Bimbingan Konseling"));
        list.add(new ItemBk(R.drawable.usertiga,"Fika  Oktania, S.Pd", "Bimbingan Konseling"));
        list.add(new ItemBk(R.drawable.usertiga,"Nisa Nurul Khusaina, S.Pd", "Bimbingan Konseling"));
        return list;
    }
}