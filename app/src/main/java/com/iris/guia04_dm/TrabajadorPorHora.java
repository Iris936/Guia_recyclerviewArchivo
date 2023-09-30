package com.iris.guia04_dm;

import java.time.temporal.ValueRange;

public class TrabajadorPorHora extends Trabajador{
    private int NHoras;
    private float VHora;

    public TrabajadorPorHora() {
    }

    public TrabajadorPorHora(String CPersona, String NPersona, String APersona, int NHoras, float VHora) {
        super(CPersona, NPersona, APersona);
        this.NHoras = NHoras;
        this.VHora = VHora;
        super.setSMensual(NHoras * VHora);
    }

    public int getNHoras() {
        return NHoras;
    }

    public void setNHoras(int numeroHoras) {
        this.NHoras = NHoras;
    }

    public float getVHora() {
        return VHora;
    }

    public void setVHora(float VHora) {
        this.VHora = VHora;
    }

    @Override
    public int getTipoTrabajador() {
        return 2;
    }
}