package com.baewha.androidmyproject;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.TabActivity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TabHost;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;

public class FourActivity extends TabActivity {


    public Button btn, btn2, btnend, btna;
    public RadioGroup rg1, rg2, rg3, rg, rgh;
    RadioButton rb1, rb2, rb3, rb4, rb5, rb6, rd1, rd2, rbh1, rbh2, rbh3, rbh4;
    public TextView tvyear, tvmonth, tvday, tv12, tvh;
    CalendarView cv1;
    public int selectYear, selectMonth, selectDay;
    public String a, b, c;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.four);
        setTitle("건강검진 예약");

        TabHost tabHost = getTabHost();

        TabHost.TabSpec tab1 =
                tabHost.newTabSpec("a").setIndicator("동의서");
        tab1.setContent(R.id.tab1);
        tabHost.addTab(tab1);

        btn = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btna = findViewById(R.id.btna);
        rb1 = findViewById(R.id.rb1);
        rb2 = findViewById(R.id.rb2);
        rb3 = findViewById(R.id.rb3);
        rb4 = findViewById(R.id.rb4);
        rb5 = findViewById(R.id.rb5);
        rb6 = findViewById(R.id.rb6);

        rg1 = findViewById(R.id.rg1);
        rg2 = findViewById(R.id.rg2);
        rg3 = findViewById(R.id.rg3);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(rb1.isChecked() && rb3.isChecked() && rb5.isChecked()) {
                    AlertDialog.Builder dlg = new AlertDialog.Builder(FourActivity.this);
                    dlg.setTitle("건강검진 동의서").setMessage("동의가 완료되었습니다. 예약으로 넘어가 주십시오.");
                    dlg.setPositiveButton("확인", null);
                    dlg.show();
                }
                else{
                    AlertDialog.Builder dlg = new AlertDialog.Builder(FourActivity.this);
                    dlg.setTitle("건강검진 동의서").setMessage("동의하지 않은게 있습니다. 다시 한번 확인해주십시오.");
                    dlg.setPositiveButton("확인", null);
                    dlg.show();
                }

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });



        TabHost.TabSpec tab2 =
                tabHost.newTabSpec("b").setIndicator("예약");
        tab2.setContent(R.id.tab2);
        tabHost.addTab(tab2);

        btnend = findViewById(R.id.btnEnd);
        tvyear = findViewById(R.id.tvYear);
        tvmonth = findViewById(R.id.tvMonth);
        tvday = findViewById(R.id.tvDay);
        tv12 = findViewById(R.id.tv12);
        tvh = findViewById(R.id.tvh);

        cv1 = findViewById(R.id.calendarView1);

        rd1 = findViewById(R.id.rd1);
        rd2 = findViewById(R.id.rd2);
        rbh1 = findViewById(R.id.rbh1);
        rbh2 = findViewById(R.id.rbh2);
        rbh3 = findViewById(R.id.rbh3);
        rbh4 = findViewById(R.id.rbh4);

        rg = findViewById(R.id.Rg);
        rgh = findViewById(R.id.rgh);




        btnend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvyear.setText(Integer.toString(selectYear));
                tvmonth.setText(Integer.toString(selectMonth));
                tvday.setText(Integer.toString(selectDay));

                int id = rg.getCheckedRadioButtonId();
                RadioButton rb = (RadioButton) findViewById(id);
                tvh.setText(rb.getText().toString());

                int id2 = rgh.getCheckedRadioButtonId();
                RadioButton rb2 = (RadioButton) findViewById(id2);
                tv12.setText(rb2.getText().toString());

                Toast.makeText(getApplicationContext(), "예약되었습니다.", Toast.LENGTH_SHORT).show();


                Intent intent2 = new Intent();

                intent2.putExtra("년", tvyear.getText().toString());
                intent2.putExtra("월", tvmonth.getText().toString());
                intent2.putExtra("일", tvday.getText().toString());
                setResult(Activity.RESULT_OK, intent2);

                intent2.putExtra("병원", tvh.getText().toString());
                intent2.putExtra("몇차", tv12.getText().toString());
            }


        });

        btna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(getApplicationContext(), SixActivity.class);
                startActivity(intent1);
            }
        });

        cv1.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int i, int i1, int i2) {
                selectYear = i;
                selectMonth = i1 + 1;
                selectDay = i2;

//                Intent intent = new Intent(FourActivity.this, SixActivity.class);
//                intent.putExtra("년", selectYear);
//                intent.putExtra("월", selectMonth);
//                intent.putExtra("일", selectDay);
            }
        });

    }

}
