package com.example.quizbandeiraandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText edtNome;
    private Button btnIniciar;
    private int pontos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNome = findViewById(R.id.edtNome);
        btnIniciar = findViewById(R.id.btnIniciar);

        edtNome.setOnKeyListener((view, i, keyEvent) -> {
            if (edtNome.getText().length() > 1) {
                btnIniciar.setEnabled(true);

                return true;
            } else if (edtNome.getText().length() == 0) {
                btnIniciar.setEnabled(false);
            }

            return false;
        });
    }

    public void startQuiz(View view) {
        Intent it = new Intent(this, ScreenBrazil.class);
        
        it.putExtra("user", edtNome.getText().toString());
        it.putExtra("pontos", pontos);

        startActivity(it);
    }
}