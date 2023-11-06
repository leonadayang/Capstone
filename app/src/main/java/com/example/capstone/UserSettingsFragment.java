package com.example.capstone;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class UserSettingsFragment extends Fragment {

    ImageButton btnBackUS;
    TextView txtEditUsername, txtEditPassword, txtEditBio, txtEditPhoneNumber, txtEditEmail;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_user_settings, container, false);

        //buttons and clickable
        btnBackUS = view.findViewById(R.id.buttonBackUS);
        txtEditUsername = view.findViewById(R.id.editTheUsername);
        txtEditPassword = view.findViewById(R.id.editThePassword);
        txtEditBio = view.findViewById(R.id.editTheBio);
        txtEditPhoneNumber = view.findViewById(R.id.editThePhoneNumber);
        txtEditEmail = view.findViewById(R.id.editTheEmail);

        btnBackUS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backButton(view);
            }
        });

        txtEditUsername.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialogEditUsername(view);
            }
        });
        txtEditPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        txtEditBio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        txtEditPhoneNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        txtEditEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        return view;
    }

    private void backButton (View view) {
        Fragment fProfile = new ProfileFragment();
        FragmentTransaction ftProfile = getActivity().getSupportFragmentManager().beginTransaction();
        ftProfile.replace(R.id.frameLayoutNavigation,fProfile).commit();
    }

    private void showDialogEditUsername (View view) {
        Toast.makeText(requireContext(), "Edit is clicked", Toast.LENGTH_SHORT).show();
    }
}