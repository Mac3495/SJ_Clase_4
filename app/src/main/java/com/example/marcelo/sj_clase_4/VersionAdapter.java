package com.example.marcelo.sj_clase_4;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Marcelo on 18/11/2017.
 */

public class VersionAdapter extends RecyclerView.Adapter<VersionAdapter.ViewHolder> {

    Context context;
    List<Version> dataset;

    public VersionAdapter(Context context) {
        this.context = context;
        this.dataset = new ArrayList<>();
    }

    @Override
    public VersionAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_android, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(VersionAdapter.ViewHolder holder, int position) {
        Version v = dataset.get(position);
        holder.nombreItem.setText(v.getNombre());
        holder.imagenItem.setImageResource(v.getImagen());
    }

    @Override
    public int getItemCount() {
        return dataset.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        View cardView;
        TextView nombreItem;
        ImageView imagenItem;

        public ViewHolder(View itemView) {
            super(itemView);
            cardView = itemView.findViewById(R.id.card_item);
            nombreItem = itemView.findViewById(R.id.nombre_item);
            imagenItem = itemView.findViewById(R.id.imagen_item);
        }
    }

    public void setDataset(List<Version> lista){
        if(lista == null){
            dataset = new ArrayList<>();
        }
        else {
            dataset = lista;
        }
        notifyDataSetChanged();
    }
}
