package com.example.learningbot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class sql_language extends AppCompatActivity {

    Button s1,s2,s3,s4,s5,s6,s7,s8,s9,s10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sql_language);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        s1 = findViewById(R.id.s1);
        s1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                notfoundpage();
            }
        });

        s2 = findViewById(R.id.s2);
        s2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                notfoundpage();
            }
        });

        s3 = findViewById(R.id.s3);
        s3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                notfoundpage();
            }
        });

        s4 = findViewById(R.id.s4);
        s4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                notfoundpage();
            }
        });

        s5 = findViewById(R.id.s5);
        s5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                notfoundpage();
            }
        });

        s6 = findViewById(R.id.s6);
        s6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                notfoundpage();
            }
        });

        s7 = findViewById(R.id.s7);
        s7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                notfoundpage();
            }
        });

        s8 = findViewById(R.id.s8);
        s8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                notfoundpage();
            }
        });

        s9 = findViewById(R.id.s9);
        s9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                notfoundpage();
            }
        });

        s10 = findViewById(R.id.s10);
        s10.setOnClickListener(new View.OnClickListener() {
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