package com.example.alquran.hadis;

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

public class Adapterhadis extends RecyclerView.Adapter<Adapterhadis.ViewHolder> {
    private List<ModelHadis> hadislist;

    public Adapterhadis(List<ModelHadis> hadislist) {
        this.hadislist = hadislist;
    }

    @NonNull
    @Override
    public Adapterhadis.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.hadis_item_design,parent,false);
        return new Adapterhadis.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapterhadis.ViewHolder holder, int position) {

        String num = hadislist.get(position).getNum();
        String des = hadislist.get(position).getDes();
        String source = hadislist.get(position).getSource();

        holder.number.setText(num);
        holder.des.setText(des);
        holder.source.setText(source);

        holder.cardView.startAnimation(AnimationUtils.loadAnimation(holder.itemView.getContext(),R.anim.anim_one));

    }

    @Override
    public int getItemCount() {
        return hadislist.size();
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
