package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Exe2Act extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio2);

        EditText edtNum1 = findViewById(R.id.edtNum1);
        EditText edtNum2 = findViewById(R.id.edtNum2);
        TextView txtResultado = findViewById(R.id.txtResultado);

        Button btnSomar = findViewById(R.id.btnSomar);
        Button btnSubtrair = findViewById(R.id.btnSubtrair);
        Button btnMultiplicar = findViewById(R.id.btnMultiplicar);
        Button btnDividir = findViewById(R.id.btnDividir);

        View.OnClickListener listener = v -> {
            if (edtNum1.getText().toString().isEmpty() || edtNum2.getText().toString().isEmpty()) {
                txtResultado.setText("Erro: Preencha os dois números!");
                return;
            }

            double num1 = Double.parseDouble(edtNum1.getText().toString());
            double num2 = Double.parseDouble(edtNum2.getText().toString());
            double resultado = 0;

            if (v == btnSomar) {
                resultado = num1 + num2;
            } else if (v == btnSubtrair) {
                resultado = num1 - num2;
            } else if (v == btnMultiplicar) {
                resultado = num1 * num2;
            } else if (v == btnDividir) {
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    txtResultado.setText("Erro: Divisão por zero!");
                    return;
                }
            }

            txtResultado.setText("Resultado: " + resultado);
        };

        btnSomar.setOnClickListener(listener);
        btnSubtrair.setOnClickListener(listener);
        btnMultiplicar.setOnClickListener(listener);
        btnDividir.setOnClickListener(listener);
    }
}


