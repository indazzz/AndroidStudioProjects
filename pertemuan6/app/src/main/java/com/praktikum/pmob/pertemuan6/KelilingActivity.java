package com.praktikum.pmob.pertemuan6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class KelilingActivity extends AppCompatActivity {
    TextView keliling;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keliling);

        keliling=(TextView)findViewById(R.id.hasilkeliling);
        Bundle terimadata=getIntent().getExtras();
        Double panjang=terimadata.getDouble("panjang");
        Double lebar=terimadata.getDouble("lebar");

        Double hasil=(panjang*2)+(lebar*2);

        keliling.setText("Keliling = "+Double.toString(hasil));
    }
}