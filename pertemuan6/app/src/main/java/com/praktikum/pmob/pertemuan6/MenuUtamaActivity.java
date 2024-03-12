package com.praktikum.pmob.pertemuan6;

import static com.praktikum.pmob.pertemuan6.R.id.nama;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MenuUtamaActivity extends AppCompatActivity {
    Button submit;
    EditText nama, nim, prodi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_utama);

        submit=(Button)findViewById(R.id.submit);
        nama=(EditText) findViewById(R.id.nama);
        nim=(EditText) findViewById(R.id.nim);
        prodi=(EditText) findViewById(R.id.prodi);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String isiannama=nama.getText().toString();
                String isiannim=nim.getText().toString();
                String isianprodi=prodi.getText().toString();

                Intent kumpul=new Intent(MenuUtamaActivity.this, HasilOutputActivity.class);
                kumpul.putExtra("isinama", isiannama);
                kumpul.putExtra("isinim", isiannim);
                kumpul.putExtra("isiprodi", isianprodi);

                startActivity(kumpul);
            }
        });
    }
}