package com.example.learningbot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class python_language extends AppCompatActivity {

    Button p1,p2,p3,p4,p5,p6,p7,p8,p9,p10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python_language);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        p1 = findViewById(R.id.p1);
        p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                notfoundpage();
            }
        });

        p2 = findViewById(R.id.p2);
        p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                notfoundpage();
            }
        });

        p3 = findViewById(R.id.p3);
        p3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                notfoundpage();
            }
        });

        p4 = findViewById(R.id.p4);
        p4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                notfoundpage();
            }
        });

        p5 = findViewById(R.id.p5);
        p5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                notfoundpage();
            }
        });

        p6 = findViewById(R.id.p6);
        p6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                notfoundpage();
            }
        });

        p7 = findViewById(R.id.p7);
        p7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                notfoundpage();
            }
        });

        p8 = findViewById(R.id.p8);
        p8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                notfoundpage();
            }
        });

        p9 = findViewById(R.id.p9);
        p9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                notfoundpage();
            }
        });

        p10 = findViewById(R.id.p10);
        p10.setOnClickListener(new View.OnClickListener() {
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