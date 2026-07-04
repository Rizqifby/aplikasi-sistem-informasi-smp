package com.example.project.MediaInformasi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project.R;

import java.util.List;

public class AdapterMediaInformasi extends RecyclerView.Adapter<AdapterMediaInformasi.InformasiViewHolder> {
    private Context context;

    private List<ItemInformasiMenu> mListUser;

    public AdapterMediaInformasi(Context context) {

        this.context = context;
    }

    public void setData(List<ItemInformasiMenu> list){
        this.mListUser = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public InformasiViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_medsos,parent,false);
        return new InformasiViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterMediaInformasi.InformasiViewHolder holder, int position) {
        ItemInformasiMenu itemInformasiMenu = mListUser.get(position);
        if (itemInformasiMenu == null){
            return;
        }
        holder.imgUser.setImageResource(itemInformasiMenu.getResourceId());
        holder.keterangan.setText(itemInformasiMenu.getKeterangan());
    }

    @Override
    public int getItemCount() {
        if (mListUser != null) {
            return mListUser.size();
        }
        return 0;
    }

    public class InformasiViewHolder extends RecyclerView.ViewHolder{
        private ImageView imgUser;
        private TextView keterangan;

        public InformasiViewHolder(View itemView) {
            super(itemView);

            imgUser = itemView.findViewById(R.id.img_user);
            keterangan = itemView.findViewById(R.id.text_keterangan);
        }
    }
}
