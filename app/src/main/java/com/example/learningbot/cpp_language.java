package com.example.learningbot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class cpp_language extends AppCompatActivity {

    Button cpp1,cpp2,cpp3,cpp4,cpp5,cpp6,cpp7,cpp8,cpp9,cpp10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cpp_language);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);


    cpp1 = findViewById(R.id.cpp1);
        cpp1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            notfoundpage();
        }
    });

    cpp2 = findViewById(R.id.cpp2);
        cpp2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            notfoundpage();
        }
    });

    cpp3 = findViewById(R.id.cpp3);
        cpp3.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            notfoundpage();
        }
    });

    cpp4 = findViewById(R.id.cpp4);
        cpp4.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            notfoundpage();
        }
    });

    cpp5 = findViewById(R.id.cpp5);
        cpp5.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            notfoundpage();
        }
    });

    cpp6 = findViewById(R.id.cpp6);
        cpp6.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            notfoundpage();
        }
    });

    cpp7 = findViewById(R.id.cpp7);
        cpp7.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            notfoundpage();
        }
    });

    cpp8 = findViewById(R.id.cpp8);
        cpp8.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            notfoundpage();
        }
    });

    cpp9 = findViewById(R.id.cpp9);
        cpp9.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            notfoundpage();
        }
    });

    cpp10 = findViewById(R.id.cpp10);
        cpp10.setOnClickListener(new View.OnClickListener() {
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
