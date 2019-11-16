package com.itesco.mayzapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class registro extends AppCompatActivity {
    ImageView on,off;
    EditText contrasena,correo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        on = findViewById(R.id.ontext);
        off = findViewById(R.id.offtext);
        contrasena= findViewById(R.id.contra);
        correo = findViewById(R.id.correo);


        //Metodo para mostrar contraseña al clicar en el boton del hojito para ver la contraseña
        on.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contrasena.setInputType(InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
                on.setVisibility(View.INVISIBLE);
                off.setVisibility(View.VISIBLE);
                contrasena.setSelection(contrasena.length());
            }
        });

        //Metodo para ocultar la contraseña de nuevo
        off.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contrasena.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
                on.setVisibility(View.VISIBLE);
                off.setVisibility(View.INVISIBLE);
                contrasena.setSelection(contrasena.length());
            }
        });


    }

    //Metodo para el boton de regresar
    public void regreso(View view){
        onBackPressed();
    }

    //metodo para el boton de registrar
    public void registrar(View view){
        if (correo.getText().toString().contains("@") && !correo.getText().toString().isEmpty() && !correo.getText().toString().contains(" ") ){

            Intent intent = new Intent(getApplicationContext(), inicioSesion.class);
            startActivity(intent);
        }else {

            correo.setError("Correo Invalido");


        }
    }

}
