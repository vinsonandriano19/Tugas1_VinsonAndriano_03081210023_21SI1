package com.example.projecthello;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class ProDuktivActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pro_duktiv);

        LinearLayout btnProfil = (LinearLayout) findViewById(R.id.btnProfil);
        btnProfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ProDuktivActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });

        LinearLayout btnToDoList = (LinearLayout) findViewById(R.id.btnToDoList);
        btnToDoList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ProDuktivActivity.this,ToDoListActivity.class);
                startActivity(intent);
            }
        });
    }
}