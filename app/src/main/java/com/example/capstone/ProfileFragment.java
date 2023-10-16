package com.example.capstone;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class ProfileFragment extends Fragment {

    Button btnViewAll;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_profile, container, false);

        //onclick of View all button
        btnViewAll = view.findViewById(R.id.buttonViewAll);

        btnViewAll.setOnClickListener(new View.OnClickListener() {
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