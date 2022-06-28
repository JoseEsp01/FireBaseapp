package com.jose.espinoza.miprimeraappli;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button miBotonIngresar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//Enlace con la vista
        miBotonIngresar=findViewById(R.id.BtnIngreso);//Enlazamos el elemento
        iniciaControl();
    }

    private void iniciaControl(){
        miBotonIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Enlazar el text usuario
                EditText mitxtUsuario=findViewById(R.id.txtusuario);
                //Obtengo el valor
                String usuario= mitxtUsuario.getText().toString();
                //Comunicado los dos activities a traves intent
                Intent intent= new Intent(getApplicationContext(),MenuPrincipal.class);
                //Enviar todo informacion al activity 2
                intent.putExtra("usuarioNombre",usuario);
                //Inicio la activity enlazado
                startActivity(intent);
            }
        });
    }
}
