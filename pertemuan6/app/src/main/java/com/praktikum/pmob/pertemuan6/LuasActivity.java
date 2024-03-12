package com.praktikum.pmob.pertemuan6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class LuasActivity extends AppCompatActivity {
    TextView luas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas);

        luas=(TextView)findViewById(R.id.hasilluas);
        Bundle terimadata=getIntent().getExtras();
        Double panjang=terimadata.getDouble("panjang");
        Double lebar=terimadata.getDouble("lebar");

        Double hasil=panjang*lebar;

        luas.setText("Luas = "+Double.toString(hasil));
    }
}