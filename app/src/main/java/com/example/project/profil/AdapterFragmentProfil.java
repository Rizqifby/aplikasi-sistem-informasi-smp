package com.example.project.profil;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.project.Pendidik.Bk.BkFragment;
import com.example.project.Pendidik.Mapel.MapelFragment;
import com.example.project.Pendidik.Tu.TuFragment;

public class AdapterFragmentProfil extends FragmentStateAdapter {

    public AdapterFragmentProfil(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    public Fragment createFragment (int position) {
        switch (position) {
            case 0 :
                return new IdentitasFragment();
            case 1 :
                return new VisiMisiFragment();
            case 2 :
                return new TujuanFragment();
            default :
                return new IdentitasFragment();
        }
    }
    public int getItemCount() {
        return 3;
    }
}
