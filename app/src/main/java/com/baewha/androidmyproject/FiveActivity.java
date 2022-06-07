package com.baewha.androidmyproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class FiveActivity extends AppCompatActivity {

    TextView text1, text2, text3, text4;
    Switch sw1, sw2, sw3, sw4;
    ScrollView sc1, sc2, sc3, sc4;
    Button btn, btntext1, btntext2, btntext3;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.five);

        setTitle("건강검진 대상자");

        text1 = findViewById(R.id.text1);
        text2 = findViewById(R.id.text2);
        text3 = findViewById(R.id.text3);
        text4 = findViewById(R.id.text4);

        sw1 = findViewById(R.id.Sw1);
        sw2 = findViewById(R.id.Sw2);
        sw3 = findViewById(R.id.Sw3);
        sw4 = findViewById(R.id.Sw4);

        sc1 = findViewById(R.id.sc1);
        sc2 = findViewById(R.id.sc2);
        sc3 = findViewById(R.id.sc3);
        sc4 = findViewById(R.id.sc4);

        btn = findViewById(R.id.btn);
        btntext1 = findViewById(R.id.btntext1);
        btntext2 = findViewById(R.id.btntext2);
        btntext3 = findViewById(R.id.btntext3);



        btntext1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text1.setTextSize(20);
                text2.setTextSize(20);
                text3.setTextSize(20);
                text4.setTextSize(20);
            }
        });

        btntext2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text1.setTextSize(14);
                text2.setTextSize(14);
                text3.setTextSize(14);
                text4.setTextSize(14);
            }
        });

        btntext3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text1.setTextSize(10);
                text2.setTextSize(10);
                text3.setTextSize(10);
                text4.setTextSize(10);
            }
        });

        sw1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(sw1.isChecked() == true) {
                    text1.setVisibility(View.VISIBLE);
                    sc1.setVisibility(View.VISIBLE);
                }
                else{
                    text1.setVisibility(View.INVISIBLE);
                    sc1.setVisibility(View.INVISIBLE);
                    text1.setVisibility(View.GONE);
                    sc1.setVisibility(View.GONE);
                }
            }
        });

        sw2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(sw2.isChecked() == true) {
                    text2.setVisibility(View.VISIBLE);
                    sc2.setVisibility(View.VISIBLE);
                }
                else{
                    text2.setVisibility(View.INVISIBLE);
                    sc2.setVisibility(View.INVISIBLE);
                    text2.setVisibility(View.GONE);
                    sc2.setVisibility(View.GONE);
                }
            }
        });

        sw3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(sw3.isChecked() == true) {
                    text3.setVisibility(View.VISIBLE);
                    sc3.setVisibility(View.VISIBLE);
                }
                else{
                    text3.setVisibility(View.INVISIBLE);
                    sc3.setVisibility(View.INVISIBLE);
                    text3.setVisibility(View.GONE);
                    sc3.setVisibility(View.GONE);
                }
            }
        });

        sw4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(sw4.isChecked() == true) {
                    text4.setVisibility(View.VISIBLE);
                    sc4.setVisibility(View.VISIBLE);
                }
                else{
                    text4.setVisibility(View.INVISIBLE);
                    sc4.setVisibility(View.INVISIBLE);
                    text4.setVisibility(View.GONE);
                    sc4.setVisibility(View.GONE);
                }
            }
        });

        btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });


    }

}

