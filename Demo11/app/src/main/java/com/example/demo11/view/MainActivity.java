package com.example.demo11.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.widget.Toast;

import com.example.demo11.adapter.MatchAdapter;
import com.example.demo11.constants.AppConfig;
import com.example.demo11.databinding.ActivityMainBinding;
import com.example.demo11.model.MyModel;
import com.example.demo11.model.ResponseMatch;
import com.example.demo11.viewModel.MatchViewModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    List<MyModel> models=new ArrayList<>();
    MatchViewModel viewModel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        viewModel=new ViewModelProvider(this).get(MatchViewModel.class);
        viewModel.MatchResu().observe(this, new Observer<ResponseMatch>() {
            @Override
            public void onChanged(ResponseMatch response) {
                MyModel model=new MyModel();
                model.setMatch(response.getMatchdetail().getMatch());
                model.setTeams(response.getTeams());
                model.setVenues(response.getMatchdetail().getVenue());
                models.add(model);
                binding.recyclerMatches.setHasFixedSize(true);
                binding.recyclerMatches.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                binding.recyclerMatches.setAdapter(new MatchAdapter(getApplicationContext(),models));
            }
        });

      if (AppConfig.isNetworkConnectedMainThred(MainActivity.this)){
          viewModel.callMatchApi(MainActivity.this);
      }else {
          Toast.makeText(this, "Check your internet connection !", Toast.LENGTH_SHORT).show();
      }
    }
}