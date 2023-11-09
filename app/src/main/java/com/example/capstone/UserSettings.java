package com.example.capstone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class UserSettings extends AppCompatActivity {

    //buttons and clickable
    ImageButton btnBackUS;
    TextView txtEditUsername, txtEditPassword, txtEditBio, txtEditPhoneNumber, txtEditEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_settings);

        //find view by id
        btnBackUS = findViewById(R.id.buttonBackUS);
        txtEditUsername = findViewById(R.id.editTheUsername);
        txtEditPassword = findViewById(R.id.editThePassword);
        txtEditBio = findViewById(R.id.editTheBio);
        txtEditPhoneNumber = findViewById(R.id.editThePhoneNumber);
        txtEditEmail = findViewById(R.id.editTheEmail);

        //onclick
        btnBackUS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
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
    }

    private void showDialogEditUsername (View view) {
        Toast.makeText(this, "Edit is clicked", Toast.LENGTH_SHORT).show();
    }
}