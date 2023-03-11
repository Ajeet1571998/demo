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
import com.example.demo11.model.PlayerB;
import com.example.demo11.model.Players;

import java.util.List;

public class Squad2Adapter extends RecyclerView.Adapter<Squad2Adapter.AdapterViewHolder> {
    Context context;
    List<PlayerB> matches;
    showDetail showDetail;

    public Squad2Adapter(Context context, List<PlayerB> matches,  showDetail showDetail) {
        this.context = context;
        this.matches = matches;
        this.showDetail = showDetail;
    }
    public interface showDetail{
        void show(Batting batting, Bowling bowling, String name);
    }

    @NonNull
    @Override
    public Squad2Adapter.AdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(context);
        View view=inflater.inflate(R.layout.player_item,parent,false);
        return new AdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Squad2Adapter.AdapterViewHolder holder, int position) {

        holder.binding.tvName1.setText(matches.get(position).getJsonMember3752().getNameFull());
        holder.binding.tvName2.setText(matches.get(position).getJsonMember4330().getNameFull()+" ( c )");
        holder.binding.tvName3.setText(matches.get(position).getJsonMember4338().getNameFull());
        holder.binding.tvName4.setText(matches.get(position).getJsonMember4964().getNameFull());
        holder.binding.tvName5.setText(matches.get(position).getJsonMember10167().getNameFull()+" ( wk )");
        holder.binding.tvName6.setText(matches.get(position).getJsonMember10172().getNameFull());
        holder.binding.tvName7.setText(matches.get(position).getJsonMember11703().getNameFull());
        holder.binding.tvName8.setText(matches.get(position).getJsonMember11706().getNameFull());
        holder.binding.tvName9.setText(matches.get(position).getJsonMember57594().getNameFull());
        holder.binding.tvName10.setText(matches.get(position).getJsonMember57903().getNameFull());
        holder.binding.tvName11.setText(matches.get(position).getJsonMember60544().getNameFull());

        holder.binding.show1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDetail.show(matches.get(position).getJsonMember3752().getBatting(),matches.get(position).getJsonMember3752().getBowling(),matches.get(position).getJsonMember3752().getNameFull());
            }
        });
        holder.binding.show2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDetail.show(matches.get(position).getJsonMember4330().getBatting(),matches.get(position).getJsonMember4330().getBowling(),matches.get(position).getJsonMember4330().getNameFull()+" ( c )");
            }
        });
        holder.binding.show3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDetail.show(matches.get(position).getJsonMember4338().getBatting(),matches.get(position).getJsonMember4338().getBowling(),matches.get(position).getJsonMember4338().getNameFull());
            }
        });
        holder.binding.show4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDetail.show(matches.get(position).getJsonMember4964().getBatting(),matches.get(position).getJsonMember4964().getBowling(),matches.get(position).getJsonMember4964().getNameFull());
            }
        });
        holder.binding.show5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDetail.show(matches.get(position).getJsonMember10167().getBatting(),matches.get(position).getJsonMember10167().getBowling(),matches.get(position).getJsonMember10167().getNameFull()+" ( wk )");
            }
        });
        holder.binding.show6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDetail.show(matches.get(position).getJsonMember10172().getBatting(),matches.get(position).getJsonMember10172().getBowling(),matches.get(position).getJsonMember10172().getNameFull());
            }
        });
        holder.binding.show7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDetail.show(matches.get(position).getJsonMember11703().getBatting(),matches.get(position).getJsonMember11703().getBowling(),matches.get(position).getJsonMember11703().getNameFull());
            }
        });
        holder.binding.show8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDetail.show(matches.get(position).getJsonMember11706().getBatting(),matches.get(position).getJsonMember11706().getBowling(),matches.get(position).getJsonMember11706().getNameFull());
            }
        });
        holder.binding.show9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDetail.show(matches.get(position).getJsonMember57594().getBatting(),matches.get(position).getJsonMember57594().getBowling(),matches.get(position).getJsonMember57594().getNameFull());
            }
        });
        holder.binding.show10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDetail.show(matches.get(position).getJsonMember57903().getBatting(),matches.get(position).getJsonMember57903().getBowling(),matches.get(position).getJsonMember57903().getNameFull());
            }
        });
        holder.binding.show11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDetail.show(matches.get(position).getJsonMember60544().getBatting(),matches.get(position).getJsonMember60544().getBowling(),matches.get(position).getJsonMember60544().getNameFull());
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
