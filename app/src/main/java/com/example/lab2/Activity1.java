package com.example.lab2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Activity1 extends AppCompatActivity {
    Button button1, button2, button3, button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);
        button1 = findViewById(R.id.act1_btn1);
        button1.setOnClickListener(v -> {
            Intent intent = new Intent(Activity1.this, Activity2.class);
            startActivity(intent);
        });
        button2 = findViewById(R.id.act1_btn2);
        button2.setOnClickListener(v -> {
            Intent intent = new Intent(Activity1.this, Activity3.class);
            startActivity(intent);
        });
        button3 = findViewById(R.id.act1_btn3);
        button3.setOnClickListener(v -> {
            Intent intent = new Intent(Activity1.this, Activity4.class);
            startActivity(intent);
        });
        button4 = findViewById(R.id.act1_btn4);
        button4.setOnClickListener(v -> finishAndRemoveTask());
    }
}