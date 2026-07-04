package com.example.project.Pendidik.Tu;

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

public class TuFragment extends Fragment {
    private RecyclerView rvTu;
    private AdapterTu adapterTu;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tu, container, false);
    }
    public void onViewCreated(View view, Bundle saveInstanceState){
        super.onViewCreated(view, saveInstanceState);

        rvTu = view.findViewById(R.id.rv_tu);
        adapterTu = new AdapterTu(this);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        rvTu.setLayoutManager(linearLayoutManager);

        adapterTu.setData(getListUser());
        rvTu.setAdapter(adapterTu);
    }
    private List<ItemTu> getListUser() {
        List<ItemTu> list = new ArrayList<>();
        list.add(new ItemTu(R.drawable.usertiga,"Nur Buditomo, S.pd.","Kepala Sekolah"));
        list.add(new ItemTu(R.drawable.usertiga,"Dwi Nurhayati","Bendahara Gaji"));
        list.add(new ItemTu(R.drawable.usertiga,"Nur Aini Oktivia","Kepegawaian"));
        list.add(new ItemTu(R.drawable.usertiga,"Nur Azizah","Kesiswaan"));
        list.add(new ItemTu(R.drawable.usertiga,"Ali Rohmat","Surat Masuk dan Keluar, Membantu Kesiswaan"));
        list.add(new ItemTu(R.drawable.usertiga,"Siti Saidah, A.Md.","Inventaris Barang"));
        list.add(new ItemTu(R.drawable.usertiga,"Ery Waluyo ","Satpam/Keamanan"));
        list.add(new ItemTu(R.drawable.usertiga,"Mustahirin","Satpam/Keamanan"));
        list.add(new ItemTu(R.drawable.usertiga,"Linda Astriyani, S.E","Petugas Perpus"));
        list.add(new ItemTu(R.drawable.usertiga,"Solimin, Sholikin","Kebersihan"));
        list.add(new ItemTu(R.drawable.usertiga,"Toha Abdul Rozak","Kebersihan"));
        list.add(new ItemTu(R.drawable.usertiga,"Aliyatun","Urusan Tangga dan Kebersihan"));
        list.add(new ItemTu(R.drawable.usertiga,"Sapuan","Penjaga Malam"));
        list.add(new ItemTu(R.drawable.usertiga,"Aspan","Penjaga Malam"));
        return list;
    }
}