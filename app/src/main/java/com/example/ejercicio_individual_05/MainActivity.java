package com.example.ejercicio_individual_05;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

import com.example.ejercicio_individual_05.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    // Se declara una variable de tipo binding
    private ActivityMainBinding vbinding;
    String nombres, apellidos, email, contrasena;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Se realiza inflacion a la vista de binding
        vbinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(vbinding.getRoot());

        // Se declara Intent
        Intent intento = getIntent();

        // proceso: Se pasan los datos
        vbinding.botonenviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String nombres = vbinding.nombres.getText().toString();
                String apellidos = vbinding.apellidos.getText().toString();
                String email = vbinding.email.getText().toString();
                String contrasena = vbinding.contrasena.getText().toString();

                ArrayList<String> errores = new ArrayList<>();

                    if (vbinding.nombres.getText().toString().isEmpty()) {
                        errores.add("nombre");
                    }
                    if (vbinding.apellidos.getText().toString().isEmpty()) {
                        errores.add("apellido");
                    }
                    if (vbinding.email.getText().toString().isEmpty()) {
                        errores.add("correo");
                    }
                    if (vbinding.contrasena.getText().toString().isEmpty()) {
                        errores.add("contrasena");
                }
                    if (errores.size()>0) {
                        Toast mytoast = Toast.makeText(getApplicationContext(), "DEBES INGRESAR LOS CAMPOS: "+ String.join("," ,errores), Toast.LENGTH_LONG);
                        mytoast.setGravity(Gravity.CENTER_HORIZONTAL, 0, 80);
                        mytoast.show();

                    }
                    else {
                        Log.d("prueba", "" + nombres + "" + apellidos + "" + email + "" + contrasena);
                        intento(nombres, apellidos, email, contrasena);
                    }
        }
        });
    }
    private void intento (String nombres, String apellidos, String email, String contrasena) {
        Intent intento = new Intent(MainActivity.this, MainActivity2.class);
        intento.putExtra("Nombres", nombres);
        intento.putExtra("Apellidos", apellidos);
        intento.putExtra("Email", email);
        intento.putExtra("Clave", contrasena);
        startActivity(intento);
    }
}