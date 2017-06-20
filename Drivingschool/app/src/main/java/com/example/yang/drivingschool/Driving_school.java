package com.example.yang.drivingschool;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import Activity.KeErFrament;
import Activity.KeSanFrament;
import Activity.KeSiFrament;
import Activity.KeYiFrament;

public class Driving_school extends AppCompatActivity implements View.OnClickListener {
    private TextView keyi, keer, kesan, kesi;
    private ImageButton rentou;
    private FragmentManager fram;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driving_school);
        fram = getSupportFragmentManager();
        inisten();
        change(String.valueOf(R.id.main_keyi));


    }

    private void inisten() {
        keyi = (TextView) findViewById(R.id.main_keyi);
        keer = (TextView) findViewById(R.id.main_keer);
        kesan = (TextView) findViewById(R.id.main_kesan);
        kesi = (TextView) findViewById(R.id.main_kesi);
        keyi.setOnClickListener(this);
        keer.setOnClickListener(this);
        kesan.setOnClickListener(this);
        kesi.setOnClickListener(this);
    }

    private void change(String s) {
        FragmentTransaction ft = fram.beginTransaction();
        Fragment fm = null;
        switch (Integer.parseInt(s)) {
            case R.id.main_keyi:
                fm = new KeYiFrament();
                break;
            case R.id.main_keer:
                fm = new KeErFrament();
                break;
            case R.id.main_kesan:
                fm = new KeSanFrament();
                break;
            case R.id.main_kesi:
                fm = new KeSiFrament();
                break;
        }
        ft.replace(R.id.main_fragment, fm);
        ft.commit();
    }

    @Override
    public void onClick(View v) {
     change(String.valueOf(v.getId()));
    }
}
