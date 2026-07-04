package com.example.project.galeri;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.project.galeri.HUtRi.HutRiFragment;
import com.example.project.galeri.HariPramuka.HariPramukaFragment;

public class AdapterFragmentGaleri extends FragmentStateAdapter {

    public AdapterFragmentGaleri(FragmentActivity fragmentActivity){
        super(fragmentActivity);
    }
    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0 :
                return new HutRiFragment();
            case 1 :
                return new HariPramukaFragment();
            default :
                return new HutRiFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
