package com.example.swatchfatehpur;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.bumptech.glide.Glide;
import com.example.swatchfatehpur.databinding.ActivityConfirmationBinding;
import com.example.swatchfatehpur.databinding.ActivityLoginBinding;

public class Confirmation extends AppCompatActivity {
    ActivityConfirmationBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityConfirmationBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Glide.with(Confirmation.this).load(R.drawable.success).into(binding.image);
        binding.tvOkay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),LoginActivity.class));
                finishAffinity();
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(getApplicationContext(),LoginActivity.class));
        finishAffinity();
    }
}