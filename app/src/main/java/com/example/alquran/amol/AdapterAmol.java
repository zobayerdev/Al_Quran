package com.example.alquran.amol;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.alquran.R;
import com.example.alquran.dua.AdapterDua;
import com.google.android.material.card.MaterialCardView;

import java.util.List;

public class AdapterAmol extends RecyclerView.Adapter<AdapterAmol.ViewHolder> {

    private List<ModelAmol> amollist;

    public AdapterAmol(List<ModelAmol> amollist) {
        this.amollist = amollist;
    }

    @NonNull
    @Override
    public AdapterAmol.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.amol_item_design,parent,false);
        return new AdapterAmol.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterAmol.ViewHolder holder, int position) {

        String number = amollist.get(position).getNumber();
        String des = amollist.get(position).getDes();
        String source = amollist.get(position).getSource();

        holder.number.setText(number);
        holder.des.setText(des);
        holder.source.setText(source);

        holder.cardView.startAnimation(AnimationUtils.loadAnimation(holder.itemView.getContext(),R.anim.anim_one));


    }

    @Override
    public int getItemCount() {
        return amollist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView number, des, source;
        private MaterialCardView cardView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            number = itemView.findViewById(R.id.number);
            des = itemView.findViewById(R.id.des);
            source = itemView.findViewById(R.id.source);
            cardView = itemView.findViewById(R.id.cardView);
        }
    }
}
