package com.baewha.androidmyproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button btnOkay, btnSignUp, btnIDPW;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("건강검진 예약 어플");

        btnOkay = findViewById(R.id.btnOkay);
        btnSignUp = findViewById(R.id.btnSignUp);
        btnIDPW = findViewById(R.id.btnID_PW);

        btnOkay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), FirstActivity.class);
                startActivity(intent);
            }
        });



    }

}