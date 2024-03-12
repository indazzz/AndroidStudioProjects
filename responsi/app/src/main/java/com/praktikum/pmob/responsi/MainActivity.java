package com.praktikum.pmob.responsi;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText username, password;
    Button login;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username=findViewById(R.id.fill_username);
        password=findViewById(R.id.fill_password);
        login=findViewById(R.id.bttn_login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (username.getText().toString().equals("admin") && password.getText().toString().equals("admin")){
                    Intent masuk = new Intent(MainActivity.this, AdminActivity.class);
                    startActivity(masuk);
                }else if (username.getText().toString().equals("customer") && password.getText().toString().equals("customer")){
                    Intent masuk = new Intent(MainActivity.this, CustomerActivity.class);
                    startActivity(masuk);
                }else{
                    Toast.makeText(getApplicationContext(), "Username atapun Password yang anda inputkan tidak sesuai!!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}