package com.example.project.galeri;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project.R;
import com.makeramen.roundedimageview.RoundedImageView;

import java.util.List;

public class AdapterStanggered extends RecyclerView.Adapter<AdapterStanggered.GaleriViewHolder>{

    private List<ItemStanggered> mListUser;

    public AdapterStanggered(List<ItemStanggered> mListUser) {
        this.mListUser = mListUser;
    }

    @NonNull
    @Override
    public GaleriViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new GaleriViewHolder  (
                LayoutInflater.from(parent.getContext()).inflate(R.layout.item_stanggered,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull GaleriViewHolder holder, int position) {
        holder.setPostImage(mListUser.get(position));
    }

    @Override
    public int getItemCount() {
        return mListUser.size();
    }

    class GaleriViewHolder extends RecyclerView.ViewHolder {
        RoundedImageView roundedImageView;

        public GaleriViewHolder(View itemView){
            super(itemView);
            roundedImageView = itemView.findViewById(R.id.imagePost);
        }

        public void setPostImage(ItemStanggered itemStanggered) {
            roundedImageView.setImageResource(itemStanggered.getImage());
        }
    }
}
