package com.itesco.mayzapp;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.pdf.PdfDocument;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class resultado extends AppCompatActivity {
    TextView resultado;
    private static final int PERMISSION_REQUEST_CODE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
        resultado = findViewById(R.id.Resultado);
        resultado.setText("este es un texto de prueba. \n este 'set text' tendra que ser cambiado por el resultado de la buesueda");


    }

    public void regreso(View view){
     onBackPressed();
    }
    public void  descargar (View view){
        //agregar metodo para descargar el "textview en pdf este link puede servir https://stackoverflow.com/questions/53444986/creating-pdf-with-data-from-edittext-android
        Intent intent = new Intent(getApplicationContext(),descargaCorrecta.class);
        startActivity(intent);
        finish();
    }


}

