package com.study.sanpablook;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

public class ProfileFragment extends Fragment {

    Button btnViewAll;
    ImageButton btnImage1, btnImage2, btnImage3, btnSettings;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
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


        //for settings button
        btnSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToSettings(view);
            }
        });

        //for view all button
        btnViewAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToActivityHistory(view);
            }
        });

        //for card view in profile fragment
        btnImage1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToActivityHistory(view);
            }
        });
        btnImage2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToActivityHistory(view);
            }
        });
        btnImage3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToActivityHistory(view);
            }
        });

        return view;
    }


    //onclick of activity history cards
    private void goToActivityHistory(View view) {
        Intent intent = new Intent(getActivity(), ActivityHistory.class);
        startActivity(intent);
    }

    private void goToSettings(View view) {
        Intent intent = new Intent(getActivity(), UserSettings.class);
        startActivity(intent);
    }

    //dialog box for edit profile pic
//    private void showDialogEditProfile(View view) {
//        final Dialog dialog = new Dialog(requireContext());
//        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
//        dialog.setContentView(R.layout.dialog_box_profilepic);
//
//        LinearLayout takePhoto = dialog.findViewById(R.id.linearTakePhoto);
//        LinearLayout choosePhoto = dialog.findViewById(R.id.linearChoosePhoto);
//
//        takePhoto.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(requireContext(), "Take a photo is clicked", Toast.LENGTH_SHORT).show();
//            }
//        });
//
//        choosePhoto.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//            }
//        });
//
//        dialog.show();
//        dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT);
//        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
//        dialog.getWindow().getAttributes().windowAnimations = R.style.DialogAnimation;
//        dialog.getWindow().setGravity(Gravity.BOTTOM);
//    }

}