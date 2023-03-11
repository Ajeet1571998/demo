package com.example.demo11.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.demo11.view.PlayersActivity;
import com.example.demo11.R;
import com.example.demo11.model.MyModel;

import java.util.List;

public class MatchAdapter extends RecyclerView.Adapter<MatchAdapter.AdapterViewHolder> {
    Context context;
    List<MyModel> matches;

    public MatchAdapter(Context context, List<MyModel> matches) {
        this.context = context;
        this.matches = matches;
    }

    @NonNull
    @Override
    public MatchAdapter.AdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(context);
        View view=inflater.inflate(R.layout.match_item,parent,false);
        return new AdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MatchAdapter.AdapterViewHolder holder, int position) {
        holder.binding.tvGamename.setText(matches.get(position).getMatch().getNumber()+" between "+matches.get(position).getTeams().getJsonMember4().getNameFull()+" and "+matches.get(position).getTeams().getJsonMember5().getNameFull());
        holder.binding.tvTeam1.setText(matches.get(position).getTeams().getJsonMember4().getNameShort());
        holder.binding.tvShortName1.setText(""+matches.get(position).getTeams().getJsonMember4().getNameShort().charAt(0));
        holder.binding.tvTeam2.setText(matches.get(position).getTeams().getJsonMember5().getNameShort());
        holder.binding.tvShortname2.setText(""+matches.get(position).getTeams().getJsonMember5().getNameShort().charAt(0));
        holder.binding.tvVanue.setText("Venue: "+matches.get(position).getVenues().getName());
        holder.binding.tvDate.setText("Date: "+matches.get(position).getMatch().getDate()+"  Time:"+matches.get(position).getMatch().getTime());

        holder.binding.parentView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PlayersActivity.teams=matches.get(position).getTeams();
                Intent intent=new Intent(context, PlayersActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_MULTIPLE_TASK);
                intent.putExtra("team1",matches.get(position).getTeams().getJsonMember4().getNameShort());
                intent.putExtra("team2",matches.get(position).getTeams().getJsonMember5().getNameShort());
                context.startActivity(intent);

            }
        });

    }

    @Override
    public int getItemCount() {
        return matches.size();
    }
    public class AdapterViewHolder extends RecyclerView.ViewHolder {
        MatchItemBinding binding;
        public AdapterViewHolder(@NonNull View itemView) {
            super(itemView);
            binding=MatchItemBinding.bind(itemView);
        }
    }
}
