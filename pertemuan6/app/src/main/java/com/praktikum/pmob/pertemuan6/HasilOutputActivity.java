package com.praktikum.pmob.pertemuan6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HasilOutputActivity extends AppCompatActivity {
    Button lokasi;
    TextView nama, nim, prodi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil_output);

        nama=findViewById(R.id.isinama);
        nim=findViewById(R.id.isinim);
        prodi=findViewById(R.id.isiprodi);
        lokasi=(Button)findViewById(R.id.lokasi);

        Intent terima=getIntent();
        String terimanama=terima.getStringExtra("isinama");
        String terimanim=terima.getStringExtra("isinim");
        String terimaprodi=terima.getStringExtra("isiprodi");

        nama.setText(terimanama);
        nim.setText(terimanim);
        prodi.setText(terimaprodi);

        lokasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loc = new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/na8PjqbKJkp1hbQ9A"));
                startActivity(loc);
            }
        });
    }
}