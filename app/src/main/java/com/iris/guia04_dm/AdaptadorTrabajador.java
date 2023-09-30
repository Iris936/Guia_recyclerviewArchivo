package com.iris.guia04_dm;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdaptadorTrabajador extends RecyclerView.Adapter<VistaHolderTrabajador>{
    private ArrayList<Trabajador> datos;
    public AdaptadorTrabajador(ArrayList<Trabajador> datos) {
        this.datos = datos;
    }

    @NonNull
    @Override
    public VistaHolderTrabajador onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_trabajadores,parent,false);
        return new VistaHolderTrabajador(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VistaHolderTrabajador holder, int position) {

        holder.getCPersona().setText(String.valueOf(datos.get(position).getCPersona()));
        holder.getNPersona().setText(datos.get(position).getNPersona() + " " + datos.get(position).getAPersona());
        holder.getTTrabajador().setText(datos.get(position).getTipoTrabajador() == 1? "TP" : "TB" );
        holder.getTPagar().setText(Float.toString(datos.get(position).getTPagar()));
    }
    @Override
    public int getItemCount() {
        return datos.size();
    }
}

