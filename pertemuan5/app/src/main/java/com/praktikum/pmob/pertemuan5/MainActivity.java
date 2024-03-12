package com.praktikum.pmob.pertemuan5;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

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
    }

    public void add(){
        Toast.makeText(this,"Menu ADD selected", Toast.LENGTH_LONG).show();
    }

    public void createnew(){
        Toast.makeText(this, "Menu NEW File Selected", Toast.LENGTH_SHORT).show();
    }

    public void open(){
        Toast.makeText(this, "Menu OPEN File Selected", Toast.LENGTH_SHORT).show();
    }

    public void setting(){
        setContentView(R.layout.activity_setting);
        Toast.makeText(this, "Menu SETTING Selected", Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void logout(){
        Toast.makeText(this,"Menu LOGOUT selected", Toast.LENGTH_LONG).show();
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int itemId = item.getItemId();
        if (itemId == R.id.add) {
            add();
            return true;
        } else if (itemId == R.id.createnew) {
            createnew();
            return true;
        } else if (itemId == R.id.open) {
            open();
            return true;
        } else if (itemId == R.id.setting) {
            setting();
            return true;
        } else if (itemId == R.id.logout) {
            logout();
            return true;
        } else {
            return super.onOptionsItemSelected(item);
        }
    }
}