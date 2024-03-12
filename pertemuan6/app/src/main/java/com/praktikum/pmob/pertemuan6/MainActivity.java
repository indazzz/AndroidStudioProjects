package com.praktikum.pmob.pertemuan6;

import static java.lang.Double.parseDouble;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button praktikum, postest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        praktikum=(Button)findViewById(R.id.praktikum);
        postest=(Button)findViewById(R.id.postest);

        praktikum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent prak=new Intent(MainActivity.this, PersegiPanjangActivity.class);
                startActivity(prak);
            }
        });

        postest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent post=new Intent(MainActivity.this, MenuUtamaActivity.class);
                startActivity(post);
            }
        });
    }
}