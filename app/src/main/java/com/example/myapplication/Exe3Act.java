package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Exe3Act extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio3);

        EditText edtNome = findViewById(R.id.edtNome);
        EditText edtIdade = findViewById(R.id.edtIdade);
        EditText edtUF = findViewById(R.id.edtUF);
        EditText edtCidade = findViewById(R.id.edtCidade);
        EditText edtTelefone = findViewById(R.id.edtTelefone);
        EditText edtEmail = findViewById(R.id.edtEmail);
        RadioGroup radioGroupTamanho = findViewById(R.id.radioGroupTamanho);
        CheckBox chkVermelho = findViewById(R.id.chkVermelho);
        CheckBox chkAzul = findViewById(R.id.chkAzul);
        CheckBox chkVerde = findViewById(R.id.chkVerde);
        CheckBox chkPreto = findViewById(R.id.chkPreto);
        Button btnCadastrar = findViewById(R.id.btnCadastrar);

        btnCadastrar.setOnClickListener(v -> {
            String nome = edtNome.getText().toString();
            String idade = edtIdade.getText().toString();
            String uf = edtUF.getText().toString();
            String cidade = edtCidade.getText().toString();
            String telefone = edtTelefone.getText().toString();
            String email = edtEmail.getText().toString();

            // Verifica o tamanho selecionado
            int idSelecionado = radioGroupTamanho.getCheckedRadioButtonId();
            RadioButton radioSelecionado = findViewById(idSelecionado);
            String tamanhoRoupa = (radioSelecionado != null) ? radioSelecionado.getText().toString() : "Não informado";

            // Verifica cores selecionadas
            StringBuilder cores = new StringBuilder();
            if (chkVermelho.isChecked()) cores.append("Vermelho ");
            if (chkAzul.isChecked()) cores.append("Azul ");
            if (chkVerde.isChecked()) cores.append("Verde ");
            if (chkPreto.isChecked()) cores.append("Preto ");

            // Exibe Toast com os dados cadastrados
            String mensagem = "Nome: " + nome + "\nIdade: " + idade + "\nUF: " + uf + "\nCidade: " + cidade +
                    "\nTelefone: " + telefone + "\nEmail: " + email + "\nTamanho: " + tamanhoRoupa +
                    "\nCores: " + (cores.length() > 0 ? cores.toString() : "Nenhuma escolhida");

            Toast.makeText(Exercicio3Activity.this, mensagem, Toast.LENGTH_LONG).show();
        });
    }
}
