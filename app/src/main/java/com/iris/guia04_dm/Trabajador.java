package com.iris.guia04_dm;

import java.text.DecimalFormat;

public abstract class Trabajador extends Persona{
    protected float SMensual;
    protected float DescuentoISR;
    protected float TDescuentos;
    protected float TPagar;

    public Trabajador(){}
    public Trabajador(String CPersona, String NPersona, String APersona){
        super(CPersona, NPersona, APersona);
    }

    public float getSMensual() {
        return SMensual;
    }

    public void setSMensual(float SMensual)
    {

        this.SMensual = SMensual;

        float tmpSMensual = this.SMensual - this.getTDescuentos();

        float sobreExcedente = 0;
        float cuotaFija = 0;
        float porcentajeTramo = 0;

        if (tmpSMensual > 2088.10){
            porcentajeTramo = (float) 0.3;
            sobreExcedente = (float) 2038.57;
            cuotaFija = (float) 288.67;
        }

        if (tmpSMensual >= 895.25){
            porcentajeTramo = (float) 0.2;
            sobreExcedente = (float) 895.24;
            cuotaFija = (float) 60.00;
        }

        if (tmpSMensual >= 472.01){
            porcentajeTramo = (float) 0.1;
            sobreExcedente = (float) 472.00;
            cuotaFija = (float) 17.67;
        }



        this.setDescuentoISR(porcentajeTramo > 0 ? ((tmpSMensual - sobreExcedente) * porcentajeTramo) + cuotaFija : 0  );
        this.setTDescuentos(this.getDescuentoISR() + this.getTDescuentos());
        this.setTPagar(this.getSMensual() - this.getTDescuentos());

    }

    public float getDescuentoISR() {
        return DescuentoISR;
    }

    public void setDescuentoISR(float DescuentoISR) {
        this.DescuentoISR = DescuentoISR;
    }

    public float getTDescuentos() {
        return TDescuentos;
    }

    public void setTDescuentos(float TDescuentos) {
        this.TDescuentos = TDescuentos;
    }

    public float getTPagar() {
        return TPagar;
    }

    public void setTPagar(float TPagar) {
        DecimalFormat df = new DecimalFormat("#0.00");
        String totalPagarFormateado = df.format(TPagar);

        this.TPagar = Float.parseFloat(totalPagarFormateado);
    }


    public abstract int getTipoTrabajador();

}
