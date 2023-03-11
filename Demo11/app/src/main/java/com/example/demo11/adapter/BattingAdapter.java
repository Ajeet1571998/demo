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
import com.example.demo11.databinding.ItemBattingBinding;
import com.example.demo11.databinding.MatchItemBinding;
import com.example.demo11.model.Batting;
import com.example.demo11.model.MyModel;

import java.util.List;

public class BattingAdapter extends RecyclerView.Adapter<BattingAdapter.AdapterViewHolder> {
    Context context;
    List<Batting> matches;

    public BattingAdapter(Context context, List<Batting> matches) {
        this.context = context;
        this.matches = matches;
    }

    @NonNull
    @Override
    public BattingAdapter.AdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(context);
        View view=inflater.inflate(R.layout.item_batting,parent,false);
        return new AdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BattingAdapter.AdapterViewHolder holder, int position) {
        holder.binding.avg.setText(matches.get(position).getAverage());
        holder.binding.strikerate.setText(matches.get(position).getStrikerate());
        holder.binding.runs.setText(matches.get(position).getRuns());

    }

    @Override
    public int getItemCount() {
        return matches.size();
    }
    public class AdapterViewHolder extends RecyclerView.ViewHolder {
        ItemBattingBinding binding;
        public AdapterViewHolder(@NonNull View itemView) {
            super(itemView);
            binding=ItemBattingBinding.bind(itemView);
        }
    }
}
