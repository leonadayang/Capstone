package com.example.capstone;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

public class ActivityHistoryFragment extends Fragment {

    ImageButton btnBackAH;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_activity_history, container, false);

        //onclick buttons
        btnBackAH = view.findViewById(R.id.buttonBackAH);

        btnBackAH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fProfile = new ProfileFragment();
                FragmentTransaction ftProfile = getActivity().getSupportFragmentManager().beginTransaction();
                ftProfile.replace(R.id.frameLayoutNavigation,fProfile).commit();
            }
        });

        return view;
    }
}