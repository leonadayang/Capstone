package com.study.sanpablook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.capstone.databinding.ActivityMainBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        replaceFragment(new HomeFragment());

        //for the unclickable middle navigation button
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);
        Menu bottom_nav_menu = bottomNavigationView.getMenu();
        MenuItem menuItem = bottom_nav_menu.findItem(R.id.unclickableBooking);
        menuItem.setEnabled(false);


        //Navigation if-else
        binding.bottomNavigationView.setOnItemSelectedListener(item -> {
            int itemId = item.getItemId();

            if (itemId == R.id.home) {
                replaceFragment(new HomeFragment());
            } else if (itemId == R.id.dine) {
                replaceFragment(new DineFragment());
            } else if (itemId == R.id.products) {
                replaceFragment(new ProductsFragment());
            } else if (itemId == R.id.profile) {
                replaceFragment(new ProfileFragment());
            }

            return true;
        });


    }


    //Fragments for Navigation
    private void replaceFragment(Fragment fragment) {

        FragmentManager fmProfileFragment = getSupportFragmentManager();
        FragmentTransaction ftProfileFragment = fmProfileFragment.beginTransaction();
        ftProfileFragment.replace(R.id.frameLayoutNavigation,fragment);
        ftProfileFragment.commit();
    }

}