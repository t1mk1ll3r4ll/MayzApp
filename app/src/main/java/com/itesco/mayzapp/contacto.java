package com.itesco.mayzapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class contacto extends AppCompatActivity {
    EditText correocontacto;
    TextInputEditText mensaje;
    Button enviar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacto);
        correocontacto = findViewById(R.id.correoContacto);
        mensaje = findViewById(R.id.mensaje);
        enviar = findViewById(R.id.botoncontactoenviar);

        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (correocontacto.getText().toString().isEmpty() || correocontacto.getText().toString().contains(" ") || !correocontacto.getText().toString().contains("@")){
                    correocontacto.setError("Ingrese un correo valido");
                }
                else{
                //NOTA: mensaje.getText().toString() Para obtener el mensaje en el Edit text
                Toast.makeText(getApplicationContext(),"el mensaje dice:"+mensaje.getText().toString(),Toast.LENGTH_LONG).show();

                //añadir un OnCompleteListener para verificar que la tarea haya sido completada satisfactoriamente redigir si fue completada con exito si no, redirigir a "error.class"
                Intent intent = new Intent(getApplicationContext(), correctoEnvio.class);
                startActivity(intent);
                }
            }
        });
    }




    public void regreso (View view){
        onBackPressed();
    }
}
