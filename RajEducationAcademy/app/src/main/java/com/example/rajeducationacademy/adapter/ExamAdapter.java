package com.example.rajeducationacademy.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rajeducationacademy.R;
import com.example.rajeducationacademy.databinding.FeesItemBinding;
import com.example.rajeducationacademy.databinding.ItemNotesBinding;
import com.example.rajeducationacademy.newTech.retrofit.model.responseGetNotes.DataItem;

import java.util.List;

public class NotesAdapter extends RecyclerView.Adapter<NotesAdapter.AdapterViewHolder> {
    Context context;
    List<DataItem> data;
    NotedData notedData;

    public NotesAdapter(Context context, List<DataItem> data,NotedData notedData) {
        this.context = context;
        this.data = data;
        this.notedData = notedData;
    }
    public interface NotedData{
        void GetNote(DataItem dataItem);
    }

    @NonNull
    @Override
    public NotesAdapter.AdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(context);
        View view=inflater.inflate(R.layout.item_notes,parent,false);
        return new AdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NotesAdapter.AdapterViewHolder holder, int position) {

        holder.binding.counnt.setText((position+1)+"");
        holder.binding.tvName.setText(data.get(position).getName());

        holder.binding.tvName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                notedData.GetNote(data.get(position));
            }
        });


    }

    @Override
    public int getItemCount() {
        return data.size();
    }
    public class AdapterViewHolder extends RecyclerView.ViewHolder {
        ItemNotesBinding binding;
        public AdapterViewHolder(@NonNull View itemView) {
            super(itemView);
            binding=ItemNotesBinding.bind(itemView);
        }
    }
}
