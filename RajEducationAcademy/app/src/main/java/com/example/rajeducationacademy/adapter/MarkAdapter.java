package com.example.rajeducationacademy.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rajeducationacademy.R;
import com.example.rajeducationacademy.databinding.AchivementListBinding;
import com.example.rajeducationacademy.databinding.SubjectListBinding;

public class SubjectAdapterAdapter extends RecyclerView.Adapter<SubjectAdapterAdapter.AdapterViewHolder> {
    Context context;
    String[] data;

    public SubjectAdapterAdapter(Context context, String[] data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public SubjectAdapterAdapter.AdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(context);
        View view=inflater.inflate(R.layout.subject_list,parent,false);
        return new AdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SubjectAdapterAdapter.AdapterViewHolder holder, int position) {
        if (position==0){
            holder.binding.btnRequestLeave.setText("Hindi");
        }
        if (position==1){
            holder.binding.btnRequestLeave.setText("English");
        }
        if (position==2){
            holder.binding.btnRequestLeave.setText("Physics");
        } if (position==3){
            holder.binding.btnRequestLeave.setText("Chemistry");
        }
        if (position==4){
            holder.binding.btnRequestLeave.setText("Maths");
        }

        holder.binding.btnRequestLeave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, holder.binding.btnRequestLeave.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return data.length;
    }
    public class AdapterViewHolder extends RecyclerView.ViewHolder {
        SubjectListBinding binding;
        public AdapterViewHolder(@NonNull View itemView) {
            super(itemView);
            binding=SubjectListBinding.bind(itemView);
        }
    }
}
