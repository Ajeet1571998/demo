package com.example.demo11.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.demo11.PlayersActivity;
import com.example.demo11.R;
import com.example.demo11.databinding.ItemBowlingBinding;
import com.example.demo11.model.Bowling;
import com.example.demo11.model.MyModel;

import java.util.List;

public class BowlingAdapter extends RecyclerView.Adapter<BowlingAdapter.AdapterViewHolder> {
    Context context;
    List<Bowling> matches;

    public BowlingAdapter(Context context, List<Bowling> matches) {
        this.context = context;
        this.matches = matches;
    }

    @NonNull
    @Override
    public BowlingAdapter.AdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(context);
        View view=inflater.inflate(R.layout.item_bowling,parent,false);
        return new AdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BowlingAdapter.AdapterViewHolder holder, int position) {
        holder.binding.avg.setText(matches.get(position).getAverage());
        holder.binding.economy.setText(matches.get(position).getEconomyrate());
        holder.binding.wickets.setText(matches.get(position).getWickets());

    }

    @Override
    public int getItemCount() {
        return matches.size();
    }
    public class AdapterViewHolder extends RecyclerView.ViewHolder {
        ItemBowlingBinding binding;
        public AdapterViewHolder(@NonNull View itemView) {
            super(itemView);
            binding=ItemBowlingBinding.bind(itemView);
        }
    }
}
