package com.example.alquran.dua;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.alquran.R;
import com.example.alquran.allahname.Adapter;
import com.example.alquran.allahname.ModelClass;
import com.google.android.material.card.MaterialCardView;

import java.util.List;

public class AdapterDua extends RecyclerView.Adapter<AdapterDua.ViewHolder>{

    private List<ModelDua> dualist;

    public AdapterDua(List<ModelDua> dualist) {
        this.dualist = dualist;
    }

    @NonNull
    @Override
    public AdapterDua.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.dua_item_design,parent,false);
        return new AdapterDua.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        String dua_name = dualist.get(position).getDua_name();
        String des = dualist.get(position).getDes();
        String source = dualist.get(position).getSource();

        holder.dua_name.setText(dua_name);
        holder.des.setText(des);
        holder.source.setText(source);

        holder.cardView.startAnimation(AnimationUtils.loadAnimation(holder.itemView.getContext(),R.anim.anim_one));

    }


    @Override
    public int getItemCount() {
        return dualist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView dua_name, des, source;
        private MaterialCardView cardView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            dua_name = itemView.findViewById(R.id.dua_name);
            des = itemView.findViewById(R.id.des);
            source = itemView.findViewById(R.id.source);
            cardView = itemView.findViewById(R.id.cardView);
        }
    }
}
