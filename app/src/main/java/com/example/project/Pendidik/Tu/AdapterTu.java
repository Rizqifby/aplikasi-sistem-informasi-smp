package com.example.project.Pendidik.Tu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project.Pendidik.Bk.ItemBk;
import com.example.project.Pendidik.Mapel.AdapterMapel;
import com.example.project.Pendidik.Mapel.ItemMapel;
import com.example.project.R;

import java.util.List;

public class AdapterTu extends RecyclerView.Adapter<AdapterTu.TuViewHolder> {
    private TuFragment tuFragment;
    private List<ItemTu> mListUser;
    public AdapterTu(TuFragment tuFragment) {
        this.tuFragment = tuFragment;
    }

    public void setData(List<ItemTu> list) {
        this.mListUser = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public TuViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_tenaga_pendidik,parent,false);
        return new AdapterTu.TuViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TuViewHolder holder, int position) {
        ItemTu itemTu = mListUser.get(position);
        if (itemTu == null) {
            return;
        }

        holder.imgGuru.setImageResource(itemTu.getFoto());
        holder.tvNamaGuru.setText(itemTu.getNama());
        holder.tvMapel.setText(itemTu.getPelajaran());
    }

    @Override
    public int getItemCount() {
        if (mListUser != null) {
            return mListUser.size();
        }
        return 0;
    }

    public class TuViewHolder extends RecyclerView.ViewHolder {
        private ImageView imgGuru;
        private TextView tvNamaGuru;
        private TextView tvMapel;

        public TuViewHolder (View itemView) {
            super(itemView);

            imgGuru = itemView.findViewById(R.id.iv_img_item);
            tvNamaGuru = itemView.findViewById(R.id.tv_nama_pendidik);
            tvMapel = itemView.findViewById(R.id.tv_tugasGuru);
        }
    }
}
