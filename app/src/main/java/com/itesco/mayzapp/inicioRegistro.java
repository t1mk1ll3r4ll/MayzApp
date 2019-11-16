package com.itesco.mayzapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class inicioRegistro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_registro);
    }
    public void salir(View view){
        finish();
    }
    public void inicioSesion(View view){
        Intent intent = new Intent (getApplicationContext(), inicioSesion.class);
        startActivity(intent);
    }
    public void registro(View view){
        Intent intent = new Intent (getApplicationContext(), registro.class);
        startActivity(intent);
    }
}
