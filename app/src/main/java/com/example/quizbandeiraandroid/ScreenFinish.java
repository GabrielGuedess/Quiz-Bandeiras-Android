package com.example.quizbandeiraandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ScreenFinish extends AppCompatActivity {
    private TextView txtName;
    private TextView txtResul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_finish);

        int pontos = getIntent().getIntExtra("pontos", 0);
        String user = getIntent().getStringExtra("user");

        txtName = findViewById(R.id.txtName);
        txtResul = findViewById(R.id.txtResul);

        txtName.setText(user);
        txtResul.setText(pontos + "/10");
    }

    public void Confirm(View view) {
        Intent it = new Intent(this, MainActivity.class);

        startActivity(it);
    }

    public void Restart(View view) {
        Intent it = new Intent(this, ScreenBrazil.class);

        String user = getIntent().getStringExtra("user");

        it.putExtra("user", user);
        it.putExtra("pontos", 0);

        startActivity(it);
    }
}