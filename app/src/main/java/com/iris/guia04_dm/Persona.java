package com.iris.guia04_dm;

import androidx.annotation.NonNull;

public abstract class Persona {
    protected  String CPersona;
    protected  String NPersona;
    protected  String APersona;

    public Persona(){}

    public Persona(String CPersona, String NPersona, String APersona){
        this.CPersona = CPersona;
        this.NPersona = NPersona;
        this.APersona = APersona;
    }

    public String getCPersona() {
        return CPersona;
    }

    public void setCPersona(String CPersona) {
        this.CPersona = CPersona;
    }

    public String getNPersona() {
        return NPersona;
    }

    public void setNPersona(String NPersona) {
        this.NPersona = NPersona;
    }

    public String getAPersona() {
        return APersona;
    }

    public void setAPersona(String APersona) {
        this.APersona = APersona;
    }

    @NonNull
    @Override
    public String toString() {
        return CPersona + NPersona + APersona;
    }
}
