package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnExercicio1 = findViewById(R.id.btnExercicio1);
        Button btnExercicio2 = findViewById(R.id.btnExercicio2);
        Button btnExercicio3 = findViewById(R.id.btnExercicio3);
        Button btnExercicio4 = findViewById(R.id.btnExercicio4);
        Button btnExercicio5 = findViewById(R.id.btnExercicio5);

        btnExercicio1.setOnClickListener(v -> startActivity(new Intent(this, Exercicio1Activity.class)));
        btnExercicio2.setOnClickListener(v -> startActivity(new Intent(this, Exercicio2Activity.class)));
        btnExercicio3.setOnClickListener(v -> startActivity(new Intent(this, Exercicio3Activity.class)));
        btnExercicio4.setOnClickListener(v -> startActivity(new Intent(this, Exercicio4Activity.class)));
        btnExercicio5.setOnClickListener(v -> startActivity(new Intent(this, Exercicio5Activity.class)));
    }
}
