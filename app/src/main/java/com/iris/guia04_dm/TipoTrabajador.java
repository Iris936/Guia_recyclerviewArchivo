package com.iris.guia04_dm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
public class TipoTrabajador extends AppCompatActivity {

    private Button BSiguiente;
    private RadioGroup rgTrabajadores;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tipo_trabajador);
        BSiguiente = findViewById(R.id.btnSiguiente);
        rgTrabajadores = findViewById(R.id.rgTrabajadores);
        ((RadioButton)rgTrabajadores.getChildAt(0)).setChecked(true);

        BSiguiente.setOnClickListener(v -> {
            RadioButton selectedRadioButton = findViewById(rgTrabajadores.getCheckedRadioButtonId());
            boolean idSelected = selectedRadioButton.getText().toString().contains("hora");
            finish();
            startActivity(new Intent(TipoTrabajador.this, idSelected ? AggTrabajadorH.class : AggTrabajadorC.class ));
        });
    }
}