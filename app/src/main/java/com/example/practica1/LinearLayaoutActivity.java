package com.example.practica1;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class LinearLayaoutActivity extends AppCompatActivity {

    EditText txtnombre, txtapellido, txtCelular;
    Button btnSend, BtnReset;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_layaout);
        asignarReferencias();


    }

    public void asignarReferencias() {

        txtnombre = findViewById(R.id.etNombre);
        txtapellido = findViewById(R.id.etApellido);
        txtCelular = findViewById(R.id.etTelefono);
        btnSend = findViewById(R.id.btSend);
        BtnReset = findViewById(R.id.btReset);
    }

    public void sendDatos(View view) {

        if (txtnombre.getText().length() == 0 || txtapellido.getText().length() == 0 || txtCelular.getText().length() != 9) {
            Toast.makeText(this, "Falta completar Datos", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, txtnombre.getText() + " " + txtapellido.getText() + "tiene celular  " + txtCelular, Toast.LENGTH_LONG).show();
        }

    }

    public void resetDatos(View view) {

        txtCelular.setText(" ");
        txtapellido.setText(" ");
        txtnombre.setText(" ");
        txtnombre.requestFocus();

    }

}
