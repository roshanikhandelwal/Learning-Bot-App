package com.example.learningbot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class chash_language extends AppCompatActivity {

    Button ch1,ch2,ch3,ch4,ch5,ch6,ch7,ch8,ch9,ch10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chash_language);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        ch1 = findViewById(R.id.ch1);
        ch1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                notfoundpage();
            }
        });

        ch2 = findViewById(R.id.ch2);
        ch2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                notfoundpage();
            }
        });

        ch3 = findViewById(R.id.ch3);
        ch3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                notfoundpage();
            }
        });

        ch4 = findViewById(R.id.ch4);
        ch4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                notfoundpage();
            }
        });

        ch5 = findViewById(R.id.ch5);
        ch5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                notfoundpage();
            }
        });

        ch6 = findViewById(R.id.ch6);
        ch6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                notfoundpage();
            }
        });

        ch7 = findViewById(R.id.ch7);
        ch7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                notfoundpage();
            }
        });

        ch8 = findViewById(R.id.ch8);
        ch8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                notfoundpage();
            }
        });

        ch9 = findViewById(R.id.ch9);
        ch9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                notfoundpage();
            }
        });

        ch10 = findViewById(R.id.ch10);
        ch10.setOnClickListener(new View.OnClickListener() {
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
    
