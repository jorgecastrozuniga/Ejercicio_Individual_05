package com.example.ejercicio_individual_05;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.ejercicio_individual_05.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    // Se declara una variable de tipo binding
    private ActivityMainBinding activitymain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Se realiza inflacion a la vista de binding
        activitymain = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(activitymain.getRoot());

        // Se declara Intent
        Intent intento = getIntent();

            activitymain.nombres.setText("nombres");
            activitymain.apellidos.setText(intento.getStringExtra("apellidos"));
            activitymain.email.setText(intento.getStringExtra("email"));
            activitymain.contrasena.setText(intento.getStringExtra("contrasena"));


        // Se realiza
        activitymain.botonenviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombres = activitymain.nombres.getText().toString();
                String apellidos = activitymain.apellidos.getText().toString();
                String email = activitymain.email.getText().toString();
                String contrasena = activitymain.contrasena.getText().toString();
            }
        });

        private void intento (String nombres,String apellidos, String email, String contrasena) {
            // donde estoy y donde voy
            Intent intento = new Intent(MainActivity.this, MainActivity2.class);

            activitymain.nombres.setText(intento.getStringExtra("nombres"));
            activitymain.apellidos.setText(intento.getStringExtra("apellidos"));
            activitymain.email.setText(intento.getStringExtra("email"));
            activitymain.contrasena.setText(intento.getStringExtra("contrasena"));
        }



    }
}