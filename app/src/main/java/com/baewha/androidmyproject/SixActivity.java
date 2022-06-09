package com.baewha.androidmyproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SixActivity extends AppCompatActivity {

   private  FourActivity Four;
   TextView tv1, tv2, tv3, tv4, tv5;
   Button btn;
   int a, b, c;
   RadioGroup rg, rgh;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.six);
        setTitle("건강검진 예약 확인");

        tv1 = findViewById(R.id.tvYear);
        tv2 = findViewById(R.id.tvMonth);
        tv3 = findViewById(R.id.tvDay);
        tv4 = findViewById(R.id.tvh);
        tv5 = findViewById(R.id.tv12);

        Four = (FourActivity)getApplicationContext();
        a = Four.selectYear;
        b = Four.selectMonth;
        c = Four.selectDay;

        rg = Four.rg;
        rgh = Four.rgh;


        Intent intent = getIntent();
        a = intent.getIntExtra("년", 0);
        b = intent.getIntExtra("월", 0);
        c = intent.getIntExtra("일", 0);

        tv1.setText(Integer.toString(a));
        tv2.setText(Integer.toString(b));
        tv3.setText(Integer.toString(c));


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(getApplicationContext(), FourActivity.class);
                startActivity(a);
            }
        });



    }
}
