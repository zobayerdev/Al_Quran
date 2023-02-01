package com.example.alquran.allahname;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.alquran.R;
import com.google.android.material.card.MaterialCardView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private List<ModelClass> userlist;

    public Adapter(List<ModelClass> userlist) {
        this.userlist = userlist;
    }

    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_design,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {

        String bangla = userlist.get(position).getBangla();
        String arbi = userlist.get(position).getArbi();

        holder.bangla.setText(bangla);
        holder.arbi.setText(arbi);
        holder.cardView.startAnimation(AnimationUtils.loadAnimation(holder.itemView.getContext(),R.anim.anim_one));

    }

    @Override
    public int getItemCount() {
        return userlist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView bangla, arbi;
        private MaterialCardView cardView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            bangla = itemView.findViewById(R.id.bangla);
            arbi = itemView.findViewById(R.id.arbi);
            cardView = itemView.findViewById(R.id.cardView);
        }
    }
}
