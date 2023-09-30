package com.iris.guia04_dm;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class VistaHolderTrabajador extends RecyclerView.ViewHolder  {

    private TextView CPersona;
    private TextView NPersona;
    private TextView TTrabajador;
    private TextView TPagar;


    public VistaHolderTrabajador(@NonNull View itemView) {
        super(itemView);
        this.CPersona = itemView.findViewById(R.id.txvCPersona);
        this.NPersona = itemView.findViewById(R.id.txvNPersona);
        this.TTrabajador = itemView.findViewById(R.id.txvTTrabajador);
        this.TPagar = itemView.findViewById(R.id.txvTTrabajador);
    }

    public TextView getCPersona() {
        return CPersona;
    }

    public TextView getNPersona() {
        return NPersona;
    }

    public TextView getTTrabajador() {
        return TTrabajador;
    }

    public TextView getTPagar() {
        return TPagar;
    }
}
