package com.example.atolapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.atolapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setListeners();
    }

    private void setListeners() {
        binding.btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tryLogin();
            }
        });
    }

    private void tryLogin() {
        if(binding.txtUser.getText().toString().equals("testUser") && binding.txtPassword.getText().toString().equals("testPass")){
            Intent activity = new Intent(this, RecipesActivity.class);
            startActivity(activity);
        }else{
            Toast.makeText(this, "thisssss "+binding.txtUser.getText()+" "+binding.txtPassword.getText(), Toast.LENGTH_SHORT).show();
        }
    }
}