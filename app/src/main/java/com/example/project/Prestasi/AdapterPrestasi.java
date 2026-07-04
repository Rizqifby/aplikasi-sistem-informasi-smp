package com.example.project.Prestasi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project.MediaInformasi.AdapterMediaInformasi;
import com.example.project.MediaInformasi.ItemInformasiMenu;
import com.example.project.R;

import java.util.List;

public class AdapterPrestasi extends RecyclerView.Adapter<AdapterPrestasi.PrestasiViewHolder> {

    private Context context;

    private List<ItemPrestasi> mListUser;

    public AdapterPrestasi(Context context) {
        this.context = context;
    }

    public void setData(List<ItemPrestasi> list){
        this.mListUser = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public PrestasiViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_prestasi,parent,false);
        return new PrestasiViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PrestasiViewHolder holder, int position) {
        ItemPrestasi itemPrestasi = mListUser.get(position);
        if (itemPrestasi == null){
            return;
        }
        holder.imgUser.setImageResource(itemPrestasi.getResourceId());
        holder.tvKategori.setText(itemPrestasi.getKategori());
        holder.tvName.setText(itemPrestasi.getName());
    }

    @Override
    public int getItemCount() {
        if (mListUser != null) {
            return mListUser.size();
        }
        return 0;
    }

    public class PrestasiViewHolder extends RecyclerView.ViewHolder{
        private ImageView imgUser;
        private TextView tvKategori;
        private TextView tvName;

        public PrestasiViewHolder(View itemView) {
            super(itemView);

            imgUser = itemView.findViewById(R.id.iv_img_juara);
            tvKategori = itemView.findViewById(R.id.tv_kategori_juara);
            tvName = itemView.findViewById(R.id.tv_nama_juara);
        }
    }
}
