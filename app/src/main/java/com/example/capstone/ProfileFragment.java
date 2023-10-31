package com.example.capstone;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.PopupMenu;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class ProfileFragment extends Fragment {

    Button btnViewAll;
    ImageButton btnImage1, btnImage2, btnImage3, btnSettings;
    FloatingActionButton fabEditProfile;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_profile, container, false);

        //buttons
        btnSettings = view.findViewById(R.id.buttonSettings);
        btnViewAll = view.findViewById(R.id.buttonViewAll);
        btnImage1 = view.findViewById(R.id.image1);
        btnImage2 = view.findViewById(R.id.image2);
        btnImage3 = view.findViewById(R.id.image3);
        fabEditProfile = view.findViewById(R.id.fabEditProfilePicture);

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

        //for edit profile pic button
        fabEditProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog(view);
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

    //dialog box for edit profile pic
    private void showDialog(View view) {
        final Dialog dialog = new Dialog(requireContext());
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.dialog_box_layout);

        LinearLayout takePhoto = dialog.findViewById(R.id.linearTakePhoto);
        LinearLayout choosePhoto = dialog.findViewById(R.id.linearChoosePhoto);

        takePhoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(requireContext(), "Take a photo is clicked", Toast.LENGTH_SHORT).show();
            }
        });

        choosePhoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(requireContext(), "Choose from gallery is clicked", Toast.LENGTH_SHORT).show();
            }
        });

        dialog.show();
        dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.getWindow().getAttributes().windowAnimations = R.style.DialogAnimation;
        dialog.getWindow().setGravity(Gravity.BOTTOM);
    }
}