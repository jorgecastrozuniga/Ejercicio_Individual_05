package com.example.ejercicio_individual_05;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.ejercicio_individual_05.databinding.ActivityMainBinding;

public class MainActivity2 extends AppCompatActivity {

    // Se declara variable binding
    private ActivityMainBinding aBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Se realiza inflacion a la vista de binding
        aBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(aBinding.getRoot());


    }
}