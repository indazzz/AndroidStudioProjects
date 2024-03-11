package com.praktikum.pmob.pertemuan2;

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

    Button LL, RL, GV;
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

        LL=(Button)findViewById(R.id.linearlayout_page);
        RL=(Button)findViewById(R.id.relative_layout_page);
        GV=(Button)findViewById(R.id.viewgrid_page);

        LL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ll=new Intent(MainActivity.this, LinearLayoutActivity.class);
                startActivity(ll);
            }
        });

        RL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent rl=new Intent(MainActivity.this, RelativeLayoutActivity.class);
                startActivity(rl);
            }
        });

        GV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gv=new Intent(MainActivity.this, GridViewActivity.class);
                startActivity(gv);
            }
        });
    }
}