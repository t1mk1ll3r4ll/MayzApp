package com.itesco.mayzapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void regreso (View view){
        onBackPressed();
    }
    public void capturarfoto (View view){
        Intent intent = new Intent(getApplicationContext(), capturarFoto.class);
        startActivity(intent);
    }
    public void resultado (View view){
        Intent intent = new Intent(getApplicationContext(), resultado.class);
        startActivity(intent);
    }
    public void contactanos (View view){
        Intent intent = new Intent(getApplicationContext(), contacto.class);
        startActivity(intent);
    }
    public  void  cerrarsesion (View view){
        //NOTA: Ingrese un metodo para cerrar la sesión del usuario
        Intent intent = new Intent (getApplicationContext(), inicioRegistro.class);
        startActivity(intent);
        finish();
    }
}
