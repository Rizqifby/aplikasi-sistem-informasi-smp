package com.example.project.Pendidik;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.project.Pendidik.Bk.BkFragment;
import com.example.project.Pendidik.Mapel.MapelFragment;
import com.example.project.Pendidik.Tu.TuFragment;

public class AdapterFragmentPendidik extends FragmentStateAdapter {

    public AdapterFragmentPendidik(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    public Fragment createFragment (int position) {
        switch (position) {
            case 0 :
                return new MapelFragment();
            case 1 :
                return new BkFragment();
            case 2 :
                return new TuFragment();
            default :
                return new MapelFragment();
        }
    }
    public int getItemCount() {
        return 3;
    }
}
