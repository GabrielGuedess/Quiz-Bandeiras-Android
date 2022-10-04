package com.example.quizbandeiraandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

public class ScreenBrazil extends AppCompatActivity {
    private RadioGroup rbgBrazil;
    private Button btnResponse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_brazil);

        rbgBrazil = findViewById(R.id.rbgBrazil);
        btnResponse = findViewById(R.id.btnResponse);
    }

    public void OnRadioButtonClicked(View view) {
        btnResponse.setEnabled(true);
    }

    public void Confirm(View view) {
        int idChecked = rbgBrazil.getCheckedRadioButtonId();

        int pontos = getIntent().getIntExtra("pontos", 0);
        String user = getIntent().getStringExtra("user");

        if (idChecked == R.id.rbBrazil) {
            pontos++;
        }

        Intent it = new Intent(this, ScreenBulgaria.class);

        it.putExtra("user", user);
        it.putExtra("pontos", pontos);

        startActivity(it);
        finish();
    }
}