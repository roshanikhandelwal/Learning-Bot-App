package com.example.learningbot;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;

public class dashboard extends AppCompatActivity {

    Button c_lang,cpp_lang,java_lang,python_lang,chash_lang,sql_lang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_dashboard);

        c_lang = findViewById(R.id.c_lang);
        cpp_lang = findViewById(R.id.cpp_lang);
        java_lang = findViewById(R.id.java_lang);
        python_lang = findViewById(R.id.python_lang);
        chash_lang = findViewById(R.id.chash_lang);
        sql_lang = findViewById(R.id.sql_lang);

        c_lang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c_content();
            }
        });

        cpp_lang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cpp_content();
            }
        });

        java_lang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                java_content();
            }
        });

        python_lang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                python_content();
            }
        });

        chash_lang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c_content();
            }
        });

        sql_lang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sql_content();
            }
        });


    }

    public void c_content() {
        Intent intent = new Intent(this, C_language.class);
        startActivity(intent);
    }

    public void cpp_content() {
        Intent intent = new Intent(this, cpp_language.class);
        startActivity(intent);
    }

    public void java_content() {
        Intent intent = new Intent(this, java_language.class);
        startActivity(intent);
    }

    public void python_content() {
        Intent intent = new Intent(this, python_language.class);
        startActivity(intent);
    }

    public void chash_content() {
        Intent intent = new Intent(this, chash_language.class);
        startActivity(intent);
    }

    public void sql_content() {
        Intent intent = new Intent(this,sql_language.class);
        startActivity(intent);
    }



}