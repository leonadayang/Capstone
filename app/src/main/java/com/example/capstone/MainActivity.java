package com.example.capstone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.capstone.databinding.ActivityMainBinding;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        replaceFragment(new HomeFragment());

        //Navigation if-else
        binding.bottomNavigationView.setOnItemReselectedListener(item -> {

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
        });

        //Unclickable menu item
        NavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);
        Menu bottom_nav_menu = bottomNavigationView.getMenu();
        MenuItem itemToMakeUnclickable = bottom_nav_menu.findItem(R.id.unclickableBooking);
        itemToMakeUnclickable.setEnabled(false);

    }

    //Fragments for Navigation
    private void replaceFragment(Fragment fragment) {

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frameLayoutNavigation,fragment);
        fragmentTransaction.commit();
    }
}