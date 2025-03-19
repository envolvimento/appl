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

        Button btnExe1 = findViewById(R.id.btnExe1);
        Button btnExe2 = findViewById(R.id.btnExe2);
        Button btnExe3 = findViewById(R.id.btnExe3);
        Button btnExe4 = findViewById(R.id.btnExeo4);
        Button btnExe5 = findViewById(R.id.btnExe5);

        btnExe1.setOnClickListener(v -> startActivity(new Intent(this, Exe1Act.class)));
        btnExe2.setOnClickListener(v -> startActivity(new Intent(this, Exe2Act.class)));
        btnExe3.setOnClickListener(v -> startActivity(new Intent(this, Exe3Act.class)));
        btnExe4.setOnClickListener(v -> startActivity(new Intent(this, Exe4Act.class)));
        btnExe5.setOnClickListener(v -> startActivity(new Intent(this, Exe5Act.class)));
    }
}
