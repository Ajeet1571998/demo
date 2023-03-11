package com.example.demo11.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.demo11.R;
import com.example.demo11.databinding.PlayerItemBinding;
import com.example.demo11.model.Batting;
import com.example.demo11.model.Bowling;
import com.example.demo11.model.PlayerA;
import com.example.demo11.model.Players;

import java.util.List;

public class SquadAdapter extends RecyclerView.Adapter<SquadAdapter.AdapterViewHolder> {
    Context context;
    List<PlayerA> matches;
    showDetail showDetail;

    public SquadAdapter(Context context, List<PlayerA> matches, showDetail showDetail) {
        this.context = context;
        this.matches = matches;
        this.showDetail = showDetail;
    }

    public interface showDetail{
        void show(Batting batting, Bowling bowling,String name);
    }


    @NonNull
    @Override
    public SquadAdapter.AdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(context);
        View view=inflater.inflate(R.layout.player_item,parent,false);
        return new AdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SquadAdapter.AdapterViewHolder holder, int position) {
        holder.binding.tvName1.setText(matches.get(position).getJsonMember3632().getNameFull()+" ( wk )");
        holder.binding.tvName2.setText(matches.get(position).getJsonMember3722().getNameFull());
        holder.binding.tvName3.setText(matches.get(position).getJsonMember3852().getNameFull()+" ( c )");
        holder.binding.tvName4.setText(matches.get(position).getJsonMember4176().getNameFull());
        holder.binding.tvName5.setText(matches.get(position).getJsonMember4532().getNameFull());
        holder.binding.tvName6.setText(matches.get(position).getJsonMember5132().getNameFull());
        holder.binding.tvName7.setText(matches.get(position).getJsonMember63187().getNameFull());
        holder.binding.tvName8.setText(matches.get(position).getJsonMember63751().getNameFull());
        holder.binding.tvName9.setText(matches.get(position).getJsonMember65867().getNameFull());
        holder.binding.tvName10.setText(matches.get(position).getJsonMember66818().getNameFull());
        holder.binding.tvName11.setText(matches.get(position).getJsonMember9844().getNameFull());

        holder.binding.show1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDetail.show(matches.get(position).getJsonMember3632().getBatting(),matches.get(position).getJsonMember3632().getBowling(),matches.get(position).getJsonMember3632().getNameFull()+" ( wk )");
            }
        });
        holder.binding.show2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDetail.show(matches.get(position).getJsonMember3722().getBatting(),matches.get(position).getJsonMember3722().getBowling(),matches.get(position).getJsonMember3722().getNameFull());
            }
        });
        holder.binding.show3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDetail.show(matches.get(position).getJsonMember3852().getBatting(),matches.get(position).getJsonMember3852().getBowling(),matches.get(position).getJsonMember3852().getNameFull()+" ( c )");
            }
        });
        holder.binding.show4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDetail.show(matches.get(position).getJsonMember4176().getBatting(),matches.get(position).getJsonMember4176().getBowling(),matches.get(position).getJsonMember4176().getNameFull());
            }
        });
        holder.binding.show5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDetail.show(matches.get(position).getJsonMember4532().getBatting(),matches.get(position).getJsonMember4532().getBowling(),matches.get(position).getJsonMember4532().getNameFull());
            }
        });
        holder.binding.show6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDetail.show(matches.get(position).getJsonMember5132().getBatting(),matches.get(position).getJsonMember5132().getBowling(),matches.get(position).getJsonMember5132().getNameFull());
            }
        });
        holder.binding.show7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDetail.show(matches.get(position).getJsonMember63187().getBatting(),matches.get(position).getJsonMember63187().getBowling(),matches.get(position).getJsonMember63187().getNameFull());
            }
        });
        holder.binding.show8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDetail.show(matches.get(position).getJsonMember63751().getBatting(),matches.get(position).getJsonMember63751().getBowling(),matches.get(position).getJsonMember63751().getNameFull());
            }
        });
        holder.binding.show9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDetail.show(matches.get(position).getJsonMember65867().getBatting(),matches.get(position).getJsonMember65867().getBowling(),matches.get(position).getJsonMember65867().getNameFull());
            }
        });
        holder.binding.show10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDetail.show(matches.get(position).getJsonMember66818().getBatting(),matches.get(position).getJsonMember66818().getBowling(),matches.get(position).getJsonMember66818().getNameFull());
            }
        });
        holder.binding.show11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDetail.show(matches.get(position).getJsonMember9844().getBatting(),matches.get(position).getJsonMember9844().getBowling(),matches.get(position).getJsonMember9844().getNameFull());
            }
        });




    }

    @Override
    public int getItemCount() {
        return matches.size();
    }
    public class AdapterViewHolder extends RecyclerView.ViewHolder {
        PlayerItemBinding binding;
        public AdapterViewHolder(@NonNull View itemView) {
            super(itemView);
            binding=PlayerItemBinding.bind(itemView);
        }
    }
}
