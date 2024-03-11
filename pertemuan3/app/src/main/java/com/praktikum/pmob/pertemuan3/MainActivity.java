package com.praktikum.pmob.pertemuan3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button praktikum, postest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        praktikum=(Button)findViewById(R.id.praktikum);
        postest=(Button)findViewById(R.id.postest);

        praktikum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent prak=new Intent(MainActivity.this, PraktikumActivity.class);
                startActivity(prak);
            }
        });

        postest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent post=new Intent(MainActivity.this, PostestActivity.class);
                startActivity(post);
            }
        });
    }
}