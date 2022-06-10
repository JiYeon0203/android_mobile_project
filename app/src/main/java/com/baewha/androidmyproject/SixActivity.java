package com.baewha.androidmyproject;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
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

        tv1 = findViewById(R.id.Year);
        tv2 = findViewById(R.id.Month);
        tv3 = findViewById(R.id.Day);
        tv4 = findViewById(R.id.h);
        tv5 = findViewById(R.id.h12);



//        LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//        View view = inflater.inflate(R.layout.four, null);
//
//        TextView tvyear = (TextView)view.findViewById(R.id.tvYear);
//        TextView tvmonth = (TextView)view.findViewById(R.id.tvMonth);
//        TextView tvday = (TextView)view.findViewById(R.id.tvDay);
//        TextView tvh = (TextView)view.findViewById(R.id.tvh);
//        TextView tv12 = (TextView)view.findViewById(R.id.tv12);
//
//        tv1.setText(tvyear.getText().toString());
//        tv2.setText(tvmonth.getText().toString());
//        tv3.setText(tvday.getText().toString());
//        tv4.setText(tvh.getText().toString());
//        tv5.setText(tv12.getText().toString());





        Four = (FourActivity)getApplicationContext();
        a = Four.selectYear;
        b = Four.selectMonth;
        c = Four.selectDay;

        rg = Four.rg;
        rgh = Four.rgh;

        Intent intent = new Intent(SixActivity.this, FourActivity.class);
        startActivityForResult(intent, 1);






        Intent intent1 = getIntent();
        a = intent1.getIntExtra("년", 0);
        b = intent1.getIntExtra("월", 0);
        c = intent1.getIntExtra("일", 0);

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
//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
//        super.onActivityResult(requestCode, resultCode, data);
//        if (requestCode == 1) {
//            if (resultCode == RESULT_OK) {
//                String a = data.getStringExtra("년");
//                tv1.setText(a);
//                String b = data.getStringExtra("월");
//                tv2.setText(b);
//                String c = data.getStringExtra("일");
//                tv3.setText(c);
//                String d = data.getStringExtra("병원");
//                tv4.setText(d);
//                String e = data.getStringExtra("몇차");
//                tv4.setText(e);
//
//            } else if (resultCode == RESULT_CANCELED) {
//            }
//        }
//    }
}
