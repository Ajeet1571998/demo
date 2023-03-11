package com.example.rajeducationacademy.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.rajeducationacademy.R;
import com.example.rajeducationacademy.databinding.AchivementListBinding;
import com.example.rajeducationacademy.newTech.retrofit.API_Config;
import com.example.rajeducationacademy.newTech.retrofit.model.responseGetToppers.DataItem;

import java.util.List;

public class AchieversAdapter extends RecyclerView.Adapter<AchieversAdapter.AdapterViewHolder> {
    Context context;
    List<DataItem> data;

    public AchieversAdapter(Context context, List<DataItem> data) {
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
        Glide.with(context).load(API_Config.IMAGE_URL +data.get(position).getImage()).placeholder(R.drawable.profile_student).into(holder.binding.prIcon);
        holder.binding.tvName.setText("Name: "+data.get(position).getName());
        holder.binding.tvScore.setText("Score: "+data.get(position).getPercentage());


    }

    @Override
    public int getItemCount() {
        return data.size();
    }
    public class AdapterViewHolder extends RecyclerView.ViewHolder {
        AchivementListBinding binding;
        public AdapterViewHolder(@NonNull View itemView) {
            super(itemView);
            binding=AchivementListBinding.bind(itemView);
        }
    }
}
