package com.example.capstone;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.PopupMenu;
import android.widget.Toast;

public class ProfileFragment extends Fragment {

    Button btnViewAll;
    ImageButton btnImage1, btnImage2, btnImage3, btnSettings;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_profile, container, false);

        //onclick of buttons
        btnSettings = view.findViewById(R.id.buttonSettings);
        btnViewAll = view.findViewById(R.id.buttonViewAll);
        btnImage1 = view.findViewById(R.id.image1);
        btnImage2 = view.findViewById(R.id.image2);
        btnImage3 = view.findViewById(R.id.image3);

        //for settings button
        btnSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showPopupMenu(view);
            }
        });

        //for view all button
        btnViewAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fActivityHistory = new ActivityHistoryFragment();
                FragmentTransaction ftActivityHistory = getActivity().getSupportFragmentManager().beginTransaction();
                ftActivityHistory.replace(R.id.frameLayoutNavigation,fActivityHistory).commit();
            }
        });

        //for card view in profile fragment
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

    //Popup menu for settings button
    private void showPopupMenu(View v) {
        PopupMenu popup = new PopupMenu(requireContext(), v);
        popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                int itemId = item.getItemId();

                if (itemId == R.id.edit_username) {
                    Toast.makeText(requireContext(), "Username clicked", Toast.LENGTH_SHORT).show();
                    return true;
                } else if (itemId == R.id.edit_password) {
                    Toast.makeText(requireContext(), "Password clicked", Toast.LENGTH_SHORT).show();
                    return true;
                } else if (itemId == R.id.edit_bio) {
                    Toast.makeText(requireContext(), "Bio clicked", Toast.LENGTH_SHORT).show();
                    return true;
                } else if (itemId == R.id.edit_phone) {
                    Toast.makeText(requireContext(), "Phone number clicked", Toast.LENGTH_SHORT).show();
                    return true;
                } else if (itemId == R.id.edit_email) {
                    Toast.makeText(requireContext(), "Email clicked", Toast.LENGTH_SHORT).show();
                    return true;
                } else if (itemId == R.id.edit_birthday) {
                    Toast.makeText(requireContext(), "Birthday clicked", Toast.LENGTH_SHORT).show();
                    return true;
                }
                 return true;
            }
        });

        popup.inflate(R.menu.settings_popup_menu);
        popup.show();
    }
}