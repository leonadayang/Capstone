package com.example.sanpablook;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sanpablook.Adapter.SectionPagerAdapter;
import com.google.android.material.tabs.TabLayout;

public class DineFragment extends Fragment {
    View myFragment;
    ViewPager viewPager;
    TabLayout tabLayout;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        myFragment = inflater.inflate(R.layout.fragment_dine, container, false);
        viewPager = myFragment.findViewById(R.id.viewPager);
        tabLayout = myFragment.findViewById(R.id.tabLayout);
        return myFragment;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        
        setUpViewPager(viewPager);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    private void setUpViewPager(ViewPager viewPager) {
        SectionPagerAdapter adapter = new SectionPagerAdapter(getChildFragmentManager());
        adapter.addFragment(new DineAllFragment(), "All");
        adapter.addFragment(new DineCafeFragment(), "Café");
        adapter.addFragment(new DineAlfrescoFragment(), "Al Fresco");

        viewPager.setAdapter(adapter);
    }
}