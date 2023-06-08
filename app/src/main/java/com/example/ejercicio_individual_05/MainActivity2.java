package com.example.ejercicio_individual_05;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.ejercicio_individual_05.databinding.ActivityMain2Binding;
import com.example.ejercicio_individual_05.databinding.ActivityMainBinding;

public class MainActivity2 extends AppCompatActivity {

    // Se declara variable binding
    private ActivityMain2Binding aBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Se realiza inflacion a la vista de binding
        aBinding = ActivityMain2Binding.inflate(getLayoutInflater());
        setContentView(aBinding.getRoot());

        Intent intento = getIntent();

        Log.d ("prueba activity 2", intento.getStringExtra("Nombres"));


        if (intento!=null){
            aBinding.nombres.setText(intento.getStringExtra("Nombres"));
            aBinding.apellidos.setText(intento.getStringExtra("Apellidos"));
            aBinding.email.setText(intento.getStringExtra("Email"));
            aBinding.contrasena.setText(intento.getStringExtra("Clave"));
        }

        aBinding.botonsalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finishAffinity();
            }
        });
    }
}