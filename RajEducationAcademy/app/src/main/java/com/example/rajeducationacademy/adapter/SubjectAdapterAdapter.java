package com.example.rajeducationacademy.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rajeducationacademy.R;
import com.example.rajeducationacademy.databinding.AchivementListBinding;

public class AchieversAdapter extends RecyclerView.Adapter<AchieversAdapter.AdapterViewHolder> {
    Context context;
    String[] data;

    public AchieversAdapter(Context context, String[] data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public AchieversAdapter.AdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(context);
        View view=inflater.inflate(R.layout.achivement_list,parent,false);
        return new AdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AchieversAdapter.AdapterViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return data.length;
    }
    public class AdapterViewHolder extends RecyclerView.ViewHolder {
        AchivementListBinding binding;
        public AdapterViewHolder(@NonNull View itemView) {
            super(itemView);
            binding=AchivementListBinding.bind(itemView);
        }
    }
}
