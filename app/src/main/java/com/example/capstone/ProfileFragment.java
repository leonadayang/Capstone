package com.example.capstone;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class ProfileFragment extends Fragment {

    Button btnViewAll;
    ImageButton btnImage1, btnImage2, btnImage3;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_profile, container, false);

        //onclick of buttons
        btnViewAll = view.findViewById(R.id.buttonViewAll);
        btnImage1 = view.findViewById(R.id.image1);
        btnImage2 = view.findViewById(R.id.image2);
        btnImage3 = view.findViewById(R.id.image3);

        btnViewAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fActivityHistory = new ActivityHistoryFragment();
                FragmentTransaction ftActivityHistory = getActivity().getSupportFragmentManager().beginTransaction();
                ftActivityHistory.replace(R.id.frameLayoutNavigation,fActivityHistory).commit();
            }
        });

        btnImage1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fActivityHistory = new ActivityHistoryFragment();
                FragmentTransaction ftActivityHistory = getActivity().getSupportFragmentManager().beginTransaction();
                ftActivityHistory.replace(R.id.frameLayoutNavigation,fActivityHistory).commit();
            }
        });
        btnImage2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fActivityHistory = new ActivityHistoryFragment();
                FragmentTransaction ftActivityHistory = getActivity().getSupportFragmentManager().beginTransaction();
                ftActivityHistory.replace(R.id.frameLayoutNavigation,fActivityHistory).commit();
            }
        });
        btnImage3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fActivityHistory = new ActivityHistoryFragment();
                FragmentTransaction ftActivityHistory = getActivity().getSupportFragmentManager().beginTransaction();
                ftActivityHistory.replace(R.id.frameLayoutNavigation,fActivityHistory).commit();
            }
        });

        return view;
    }
}