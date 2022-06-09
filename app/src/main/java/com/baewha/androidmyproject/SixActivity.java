package com.baewha.androidmyproject;

import android.content.Intent;
import android.os.Bundle;
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
        int selectYear = Four.selectYear;
        int selectMonth = Four.selectMonth;
        int selectDay = Four.selectDay;

        RadioGroup rg = Four.rg;
        RadioGroup rgh = Four.rgh;

        Intent intent = getIntent();


        tv1.setText(Integer.toString(selectYear));
        tv2.setText(Integer.toString(selectMonth));
        tv3.setText(Integer.toString(selectDay));


        int id = rg.getCheckedRadioButtonId();
        RadioButton rb = (RadioButton) findViewById(id);
        tv5.setText(rb.getText().toString());

        int id2 = rgh.getCheckedRadioButtonId();
        RadioButton rb2 = (RadioButton) findViewById(id2);
        tv4.setText(rb2.getText().toString());



    }
}
