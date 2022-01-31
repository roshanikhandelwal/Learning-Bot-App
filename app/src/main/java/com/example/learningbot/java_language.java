package com.example.learningbot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class java_language extends AppCompatActivity {

    Button j1,j2,j3,j4,j5,j6,j7,j8,j9,j10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_language);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        j1 = findViewById(R.id.j1);
        j1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                notfoundpage();
            }
        });

        j2 = findViewById(R.id.j2);
        j2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                notfoundpage();
            }
        });

        j3 = findViewById(R.id.j3);
        j3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                notfoundpage();
            }
        });

        j4 = findViewById(R.id.j4);
        j4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                notfoundpage();
            }
        });

        j5 = findViewById(R.id.j5);
        j5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                notfoundpage();
            }
        });

        j6 = findViewById(R.id.j6);
        j6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                notfoundpage();
            }
        });

        j7 = findViewById(R.id.j7);
        j7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                notfoundpage();
            }
        });

        j8 = findViewById(R.id.j8);
        j8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                notfoundpage();
            }
        });

        j9 = findViewById(R.id.j9);
        j9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                notfoundpage();
            }
        });

        j10 = findViewById(R.id.j10);
        j10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                notfoundpage();
            }
        });

    }

    public void notfoundpage() {
        Intent intent = new Intent(this, WorkInProgress.class);
        startActivity(intent);
    }
}