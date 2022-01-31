package com.example.learningbot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class C_language extends AppCompatActivity {
    Button c1,c2,c3,c4,c5,c6,c7,c8,c9,c10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clanguage);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);


        c1 = findViewById(R.id.c1);
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { c_intropage() ; }
        });

        c2 = findViewById(R.id.c2);
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c_standardpage();
            }
        });

        c3 = findViewById(R.id.c3);
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c_benefitspage();
            }
        });

        c4 = findViewById(R.id.c4);
        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                notfoundpage();
            }
        });

        c5 = findViewById(R.id.c5);
        c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                notfoundpage();
            }
        });

        c6 = findViewById(R.id.c6);
        c6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                notfoundpage();
            }
        });

        c7 = findViewById(R.id.c7);
        c7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                notfoundpage();
            }
        });

        c8 = findViewById(R.id.c8);
        c8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                notfoundpage();
            }
        });

        c9 = findViewById(R.id.c9);
        c9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                notfoundpage();
            }
        });

        c10 = findViewById(R.id.c10);
        c10.setOnClickListener(new View.OnClickListener() {
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

    public void c_intropage() {
        Intent intent = new Intent(this, C_Intro.class);
        startActivity(intent);
    }

    public void c_standardpage() {
        Intent intent = new Intent(this, C_standard.class);
        startActivity(intent);
    }

    public void c_benefitspage() {
        Intent intent = new Intent(this, C_benefits.class);
        startActivity(intent);
    }
}