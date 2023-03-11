package com.example.demo11;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.widget.Toast;

import com.example.demo11.adapter.MatchAdapter;
import com.example.demo11.constants.API_Config;
import com.example.demo11.constants.ApiServices;
import com.example.demo11.databinding.ActivityMainBinding;
import com.example.demo11.model.MyModel;
import com.example.demo11.model.ResponseMatch;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    List<MyModel> models=new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        api();
    }
    public void api(){
        ProgressDialog dialog=ProgressDialog.show(MainActivity.this,"","loading..");
        ApiServices apiServices= API_Config.getApiClient_ByPost();
        Call<ResponseMatch> call= apiServices.Getmatch();
        call.enqueue(new Callback<ResponseMatch>() {
            @Override
            public void onResponse(Call<ResponseMatch> call, Response<ResponseMatch> response) {
                dialog.dismiss();
                if (response.isSuccessful()){
                    MyModel model=new MyModel();
                    model.setMatch(response.body().getMatchdetail().getMatch());
                    model.setTeams(response.body().getTeams());
                    model.setVenues(response.body().getMatchdetail().getVenue());

                    models.add(model);
                    binding.recyclerMatches.setHasFixedSize(true);
                    binding.recyclerMatches.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                    binding.recyclerMatches.setAdapter(new MatchAdapter(getApplicationContext(),models));

                }else {
                    Toast.makeText(MainActivity.this, response.message(), Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<ResponseMatch> call, Throwable t) {
                dialog.dismiss();

            }
        });
    }
}