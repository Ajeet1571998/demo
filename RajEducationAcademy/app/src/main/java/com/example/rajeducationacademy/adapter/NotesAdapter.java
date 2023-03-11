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
import com.example.rajeducationacademy.databinding.FeesItemBinding;
import com.example.rajeducationacademy.newTech.retrofit.API_Config;
import com.example.rajeducationacademy.newTech.retrofit.model.ResponseFeesHistory.DataItem;

import java.util.List;

public class FeesHistoryAdapter extends RecyclerView.Adapter<FeesHistoryAdapter.AdapterViewHolder> {
    Context context;
    List<DataItem> data;

    public FeesHistoryAdapter(Context context, List<DataItem> data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public FeesHistoryAdapter.AdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(context);
        View view=inflater.inflate(R.layout.fees_item,parent,false);
        return new AdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FeesHistoryAdapter.AdapterViewHolder holder, int position) {

        holder.binding.tvDate.setText(data.get(position).getDate());
        holder.binding.tvAmount.setText("\u20B9 "+data.get(position).getLastPay());


    }

    @Override
    public int getItemCount() {
        return data.size();
    }
    public class AdapterViewHolder extends RecyclerView.ViewHolder {
        FeesItemBinding binding;
        public AdapterViewHolder(@NonNull View itemView) {
            super(itemView);
            binding=FeesItemBinding.bind(itemView);
        }
    }
}
