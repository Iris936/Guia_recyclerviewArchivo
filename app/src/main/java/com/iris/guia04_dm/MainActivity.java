package com.iris.guia04_dm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {

    private Button BAcerca;
    private Button BMostrar;
    private Button BAgregarTrabajador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BAcerca= findViewById(R.id.BAcerca);
        BAgregarTrabajador = findViewById(R.id.BAgregarTrabajador);
        BMostrar = findViewById(R.id.BMostrar);

        BAgregarTrabajador.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, TipoTrabajador.class));
        });

        BMostrar.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, ListarTrabajadores.class));
            //ok

        });
        BAcerca.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AcercaDe.class);
                startActivity(intent);
            }
        });
    }
}