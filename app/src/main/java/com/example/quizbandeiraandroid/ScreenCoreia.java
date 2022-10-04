package com.example.quizbandeiraandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ScreenCoreia extends AppCompatActivity {
    private RadioGroup rbgContent;
    private Button btnResponse;
    private TextView textTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_coreia);

        rbgContent = findViewById(R.id.rbgContent);
        btnResponse = findViewById(R.id.btnResponse);
        textTitle = findViewById(R.id.textTitle);
    }

    public void OnRadioButtonClicked(View view) {
        btnResponse.setEnabled(true);
    }

    public void Confirm(View view) {
        int idChecked = rbgContent.getCheckedRadioButtonId();

        int pontos = getIntent().getIntExtra("pontos", 0);
        String user = getIntent().getStringExtra("user");

        if (idChecked == R.id.rbCoreia) {
            pontos++;
        }

        textTitle.setText(String.valueOf(pontos));

        Intent it = new Intent(this, ScreenCuba.class);

        it.putExtra("user", user);
        it.putExtra("pontos", pontos);

        startActivity(it);
        finish();
    }
}