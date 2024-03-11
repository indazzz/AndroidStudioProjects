package com.praktikum.pmob.pertemuan3;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class PostestActivity extends AppCompatActivity {

    private EditText nama;
    private EditText nim;
    private EditText kelas;
    private RadioGroup jk;
    private RadioButton lk;
    private RadioButton pr;
    private RadioButton nb;
    private CheckBox cek;
    private TextView tampilNama;
    private TextView tampilNim;
    private TextView tampilKelas;
    private TextView tampilJK;
    private TextView tampilCEK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_postest);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        nama=(EditText) findViewById(R.id.isinama);
        nim=(EditText) findViewById(R.id.isinim);
        kelas=(EditText) findViewById(R.id.isikelas);
        jk=(RadioGroup) findViewById(R.id.radiogrup);
        lk=(RadioButton) findViewById(R.id.rdb1);
        pr=(RadioButton) findViewById(R.id.rdb2);
        nb=(RadioButton) findViewById(R.id.rdb3);
        cek=(CheckBox) findViewById(R.id.checkAgree);
    }

    public void hasil(View view) {
        setContentView(R.layout.hasil_postest);

        tampilNama=(TextView) findViewById(R.id.tampilnama);
        tampilNama.setTextColor(Color.GRAY);
        tampilNama.setBackgroundColor(Color.WHITE);
        tampilNama.setText(nama.getText());

        tampilNim=(TextView) findViewById(R.id.tampilnim);
        tampilNim.setTextColor(Color.GRAY);
        tampilNim.setBackgroundColor(Color.WHITE);
        tampilNim.setText(nim.getText());

        tampilKelas=(TextView) findViewById(R.id.tampilkelas);
        tampilKelas.setTextColor(Color.GRAY);
        tampilKelas.setBackgroundColor(Color.WHITE);
        tampilKelas.setText(kelas.getText());

        tampilJK=(TextView)findViewById(R.id.tampiljk);
        tampilJK.setTextColor(Color.BLACK);
        if (lk.isChecked()){
            tampilJK.setBackgroundColor(Color.BLUE);
            tampilJK.setText("Laki-Laki");
        }
        if (pr.isChecked()){
            tampilJK.setBackgroundColor(Color.MAGENTA);
            tampilJK.setText("Perempuan");
        }
        if (nb.isChecked()){
            tampilJK.setBackgroundColor(Color.DKGRAY);
            tampilJK.setText("Non Biner");
        }

        tampilCEK=(TextView) findViewById(R.id.tampilverify);
        tampilCEK.setTextColor(Color.BLACK);
        if(cek.isChecked()){
            tampilCEK.setBackgroundColor(Color.GREEN);
            tampilCEK.setText("Semua Yang di Isikan Benar");
        }
        else{
            tampilCEK.setBackgroundColor(Color.RED);
            tampilCEK.setText("Ada yang salah");
        }
    }
}