package com.iris.guia04_dm;

public class TrabajadorPorTiempoCompleto extends Trabajador {
    private float DescuentoAFP;
    private float DescuentoISSS;

    public TrabajadorPorTiempoCompleto() {

    }

    public TrabajadorPorTiempoCompleto(String CPersona, String NPersona, String APersona, float SMensual) {
        super(CPersona, NPersona, APersona);

        setDescuentoISSS(SMensual > 1000 ? (float) 30 : (float) (SMensual * 0.03) );
        setDescuentoAFP((float) (SMensual * 0.0725) );

        super.setTDescuentos(getDescuentoAFP() + getDescuentoISSS());
        super.setSMensual(SMensual);


    }

    public float getDescuentoAFP() {
        return DescuentoAFP;
    }

    public void setDescuentoAFP(float DescuentoAFP) {
        this.DescuentoAFP = DescuentoAFP;
    }

    public float getDescuentoISSS() {
        return DescuentoISSS;
    }

    public void setDescuentoISSS(float DescuentoISSS) {
        this.DescuentoISSS = DescuentoISSS;
    }

    @Override
    public int getTipoTrabajador() {
        return 1;
    }
}
