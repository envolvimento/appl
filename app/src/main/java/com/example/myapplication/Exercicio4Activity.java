package com.example.myapplication;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;

public class Exercicio4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio4);

        EditText edtNome = findViewById(R.id.edtNome);
        LinearLayout layoutCheckboxes = findViewById(R.id.layoutCheckboxes);

        edtNome.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                layoutCheckboxes.removeAllViews();

                for (char letra : s.toString().toCharArray()) {
                    CheckBox checkBox = new CheckBox(Exercicio4Activity.this);
                    checkBox.setText(String.valueOf(letra));
                    layoutCheckboxes.addView(checkBox);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {}
        });
    }
}
