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

public class PraktikumActivity extends AppCompatActivity {
    private EditText Nama;
    private RadioGroup jnskelamin;
    private RadioButton LakiLaki;
    private RadioButton perempuan;
    private CheckBox setuju;
    private TextView TampilNama;
    private TextView TampilJenisKelamin;
    private TextView TampilSetuju;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_praktikum);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Nama=(EditText)findViewById(R.id.isinama);
        jnskelamin=(RadioGroup)findViewById(R.id.radiogrup);
        LakiLaki=(RadioButton)findViewById(R.id.rdb1);
        perempuan=(RadioButton)findViewById(R.id.rdb2);
        setuju=(CheckBox)findViewById(R.id.checkAgree);
    }

    public void hasil(View view){
        setContentView(R.layout.hasil_praktikum);
        TampilNama=(TextView)findViewById(R.id.tampilNama);
        TampilNama.setTextColor(Color.WHITE);
        TampilNama.setBackgroundColor(Color.BLUE);
        TampilNama.setText(Nama.getText());
        TampilJenisKelamin=(TextView)findViewById(R.id.tampilJenisKelamin);
        TampilJenisKelamin.setTextColor(Color.WHITE);
        if (LakiLaki.isChecked()){
            TampilJenisKelamin.setBackgroundColor(Color.GRAY);
            TampilJenisKelamin.setText("Laki-laki");
        }
        if (perempuan.isChecked()){
            TampilJenisKelamin.setBackgroundColor(Color.MAGENTA);
            TampilJenisKelamin.setText("Perempuan");
        }
        TampilSetuju=(TextView)findViewById(R.id.tampilSetuju);
        TampilSetuju.setTextColor(Color.WHITE);
        if (setuju.isChecked()){
            TampilSetuju.setBackgroundColor(Color.GREEN);
            TampilSetuju.setText("Semua Yang Di Isikan Benar");
        }
        else {
            TampilSetuju.setBackgroundColor(Color.RED);
            TampilSetuju.setText("Ada yang salah");
        }
    }
}