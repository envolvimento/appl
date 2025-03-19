package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Exe5Act extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio5);

        CheckBox chkNotificacoes = findViewById(R.id.chkNotificacoes);
        CheckBox chkModoEscuro = findViewById(R.id.chkModoEscuro);
        CheckBox chkLembrarLogin = findViewById(R.id.chkLembrarLogin);
        Button btnSalvar = findViewById(R.id.btnSalvar);

        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder preferencias = new StringBuilder();

                if (chkNotificacoes.isChecked()) {
                    preferencias.append("Receber notificações\n");
                }
                if (chkModoEscuro.isChecked()) {
                    preferencias.append("Modo escuro\n");
                }
                if (chkLembrarLogin.isChecked()) {
                    preferencias.append("Lembrar login\n");
                }

                if (preferencias.length() == 0) {
                    Toast.makeText(Exercicio5Activity.this, "Nenhuma preferência foi escolhida", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Exercicio5Activity.this, preferencias.toString(), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
