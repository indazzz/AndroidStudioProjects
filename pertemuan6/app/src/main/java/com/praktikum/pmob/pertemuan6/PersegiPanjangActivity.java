package com.praktikum.pmob.pertemuan6;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PersegiPanjangActivity extends AppCompatActivity {
    Button luas, keliling;
    EditText panjang, lebar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi_panjang);

        luas=(Button)findViewById(R.id.luas);
        keliling=(Button)findViewById(R.id.keliling);
        panjang=(EditText) findViewById(R.id.panjang);
        lebar=(EditText) findViewById(R.id.lebar);

        luas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double sisipanjang=Double.parseDouble(panjang.getText().toString());
                Double sisilebar=Double.parseDouble(lebar.getText().toString());

                Intent hitungluas=new Intent(PersegiPanjangActivity.this, LuasActivity.class);
                hitungluas.putExtra("panjang", sisipanjang);
                hitungluas.putExtra("lebar", sisilebar);

                startActivity(hitungluas);
            }
        });

        keliling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double sisipanjang=Double.parseDouble(panjang.getText().toString());
                Double sisilebar=Double.parseDouble(lebar.getText().toString());

                Intent hitungkeliling=new Intent(PersegiPanjangActivity.this, KelilingActivity.class);
                hitungkeliling.putExtra("panjang", sisipanjang);
                hitungkeliling.putExtra("lebar", sisilebar);

                startActivity(hitungkeliling);
            }
        });
    }
}