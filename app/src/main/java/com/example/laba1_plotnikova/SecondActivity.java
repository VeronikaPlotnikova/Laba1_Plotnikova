package com.example.laba1_plotnikova;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // Получение переданного параметра
        Intent intent = getIntent();
        String parameter = intent.getStringExtra("parameter");

        // Обновляем текстовое поле с переданным параметром
        TextView textView = findViewById(R.id.textView);
        textView.setText("Переданный параметр: " + parameter);
    }
}