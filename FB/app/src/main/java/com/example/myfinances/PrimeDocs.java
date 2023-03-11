package com.example.myfinances;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.myfinances.databinding.ActivityPrimeDocsBinding;

public class PrimeDocs extends AppCompatActivity {
    ActivityPrimeDocsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityPrimeDocsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }

    public void file(View view) {
        Toast.makeText(this, "Menu will opened !", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(getApplicationContext(),PrimeDocs.class));
    }
    public void Edit(View view) {
        Toast.makeText(this, "Edit Menu will opened !", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(getApplicationContext(),PrimeDocs.class));
    }
    public void viewdoc(View view) {
        Toast.makeText(this, "Edit Menu will opened !", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(getApplicationContext(),PrimeDocs.class));
    }
    public void insert(View view) {
        Toast.makeText(this, "Insert Menu will opened !", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(getApplicationContext(),PrimeDocs.class));
    }
    public void format(View view) {
        Toast.makeText(this, "Format Menu will opened !", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(getApplicationContext(),PrimeDocs.class));
    }
    public void toolo(View view) {
        Toast.makeText(this, "Tools Menu will opened !", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(getApplicationContext(),PrimeDocs.class));
    }
    public void extensuion(View view) {
        Toast.makeText(this, "Extension Menu will opened !", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(getApplicationContext(),PrimeDocs.class));
    }
    public void help(View view) {
        Toast.makeText(this, "Help Menu will opened !", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(getApplicationContext(),PrimeDocs.class));
    }
}