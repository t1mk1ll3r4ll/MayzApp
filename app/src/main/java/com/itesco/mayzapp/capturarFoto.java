package com.itesco.mayzapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.hardware.Camera;
import android.os.Bundle;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;

import java.io.IOException;

import static androidx.constraintlayout.widget.Constraints.TAG;

public class capturarFoto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_capturar_foto);
    }

        public void tomarfoto(View view){
            Intent intent = new Intent(getApplicationContext(), procesadoFoto.class);
            startActivity(intent);
            finish();
        }
}