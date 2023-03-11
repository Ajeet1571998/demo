package com.example.swatchfatehpur;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import android.widget.Toast;

import com.example.swatchfatehpur.databinding.ActivityOtpScreenBinding;


import org.json.JSONException;
import org.json.JSONObject;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;

public class OtpScreen extends AppCompatActivity {
    ActivityOtpScreenBinding binding;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityOtpScreenBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }

    public void submit(View view) {

    }

}