package com.example.inbaru;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class laporan extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laporan);
        ImageView btn = findViewById(R.id.back);
        btn.setOnClickListener(this);
        ImageView btnberanda = findViewById(R.id.klikberanda);
        btnberanda.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.back:
                Intent klik1 = new Intent(laporan.this, menu.class);
                startActivity(klik1);
                break;
            case R.id.klikberanda:
                Intent klik2 = new Intent(laporan.this, menu.class);
                startActivity(klik2);
                break;
        }
    }
}