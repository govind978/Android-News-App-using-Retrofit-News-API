package com.example.newstrial;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.newstrial.Fragment.EntertainmentFragment;
import com.example.newstrial.Fragment.HealthFragment;
import com.example.newstrial.Fragment.Homefragment;
import com.example.newstrial.Fragment.ScienceFragment;
import com.example.newstrial.Fragment.SportsFragment;
import com.example.newstrial.Fragment.TechnologyFragment;

public class PagerAdapter extends FragmentPagerAdapter {

    int tabCount;

    public PagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm);
        tabCount = behavior;
    }


    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new Homefragment();
            case 1:
                return new SportsFragment();
            case 2:
                return new HealthFragment();
            case 3:
                return new ScienceFragment();
            case 4:
                return new EntertainmentFragment();
            case 5:
                return new TechnologyFragment();
            default:
                return null;

        }
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
