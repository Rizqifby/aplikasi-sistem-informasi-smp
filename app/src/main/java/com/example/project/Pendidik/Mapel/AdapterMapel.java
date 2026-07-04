package com.example.project.Pendidik.Mapel;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project.R;

import java.util.List;

public class AdapterMapel extends RecyclerView.Adapter<AdapterMapel.MapelViewHolder>{

    private MapelFragment mapelFragment;

    private List<ItemMapel> mListUser;

    public AdapterMapel(MapelFragment mapelFragment) {
        this.mapelFragment = mapelFragment;
    }

    public void setData(List<ItemMapel> list) {
        this.mListUser = list;
        notifyDataSetChanged();
    }


    @NonNull
    @Override
    public MapelViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_tenaga_pendidik,parent,false);
        return new MapelViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MapelViewHolder holder, int position) {

        ItemMapel itemMapel = mListUser.get(position);
        if (itemMapel == null) {
            return;
        }

        holder.imgGuru.setImageResource(itemMapel.getFoto());
        holder.tvNamaGuru.setText(itemMapel.getNama());
        holder.tvMapel.setText(itemMapel.getPelajaran());

    }

    @Override
    public int getItemCount() {
        if (mListUser != null) {
            return mListUser.size();
        }
        return 0;
    }

    public class MapelViewHolder extends RecyclerView.ViewHolder {
        private ImageView imgGuru;

        private TextView tvNamaGuru;

        private TextView tvMapel;

        public MapelViewHolder (View itemView) {
            super(itemView);

            imgGuru = itemView.findViewById(R.id.iv_img_item);
            tvNamaGuru = itemView.findViewById(R.id.tv_nama_pendidik);
            tvMapel = itemView.findViewById(R.id.tv_tugasGuru);
        }
    }
}
