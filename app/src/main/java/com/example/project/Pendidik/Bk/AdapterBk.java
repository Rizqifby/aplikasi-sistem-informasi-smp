package com.example.project.Pendidik.Bk;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project.Pendidik.Mapel.ItemMapel;
import com.example.project.R;

import java.util.List;

public class AdapterBk extends RecyclerView.Adapter<AdapterBk.BkViewHolder>{
    private BkFragment bkFragment;

    private List<ItemBk> mListUser;

    public AdapterBk(BkFragment bkFragment) {
        this.bkFragment = bkFragment;
    }

    public void setData(List<ItemBk> list) {
        this.mListUser = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public BkViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_tenaga_pendidik,parent,false);
        return new BkViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BkViewHolder holder, int position) {
        ItemBk itemBk = mListUser.get(position);
        if (itemBk == null) {
            return;
        }
        holder.imgGuru.setImageResource(itemBk.getFoto());
        holder.tvNameGuru.setText(itemBk.getNama());
        holder.tvBk.setText(itemBk.getPelajaran());
    }

    @Override
    public int getItemCount() {
        if (mListUser != null) {
            return mListUser.size();
        }
        return 0;
    }

    public class BkViewHolder extends RecyclerView.ViewHolder {
        private ImageView imgGuru;

        private TextView tvNameGuru;

        private TextView tvBk;

        public BkViewHolder (View itemView) {
            super(itemView);
            imgGuru = itemView.findViewById(R.id.iv_img_item);
            tvNameGuru = itemView.findViewById(R.id.tv_nama_pendidik);
            tvBk = itemView.findViewById(R.id.tv_tugasGuru);
        }
    }
}
