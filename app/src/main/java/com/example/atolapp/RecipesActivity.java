package com.example.atolapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;

import com.example.atolapp.databinding.ActivityMainBinding;
import com.example.atolapp.databinding.ActivityRecipesBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class RecipesActivity extends AppCompatActivity {
    ActivityRecipesBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRecipesBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        NavHostFragment navHostFragment =  (NavHostFragment)getSupportFragmentManager().findFragmentById(R.id.nav_host_fragment);
        NavController navController = navHostFragment.getNavController();
        NavigationUI.setupWithNavController(binding.bottomNav, navController);
    }
}