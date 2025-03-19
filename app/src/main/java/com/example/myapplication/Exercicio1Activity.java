package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Exercicio1Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio1);

        EditText edtNome = findViewById(R.id.edtNome);
        EditText edtIdade = findViewById(R.id.edtIdade);
        Button btnVerificar = findViewById(R.id.btnVerificar);
        TextView txtResultado = findViewById(R.id.txtResultado);

        btnVerificar.setOnClickListener(v -> {
            String nome = edtNome.getText().toString();
            int idade = Integer.parseInt(edtIdade.getText().toString());

            if (idade >= 18) {
                txtResultado.setText(nome + " é maior de idade!");
            } else {
                txtResultado.setText(nome + " é menor de idade!");
            }
        });
    }
}
