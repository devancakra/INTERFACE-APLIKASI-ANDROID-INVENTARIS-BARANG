package com.example.inbaru;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class stockac extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stockac);

        ImageView btn = findViewById(R.id.back);
        btn.setOnClickListener(this);
        ImageView btnberanda = findViewById(R.id.klikberanda);
        btnberanda.setOnClickListener(this);
        ImageView btntambah = findViewById(R.id.kliktambah);
        btntambah.setOnClickListener(this);
        ImageView btnkurang = findViewById(R.id.klikkurang);
        btnkurang.setOnClickListener(this);
        Button btnsubmit = findViewById(R.id.btnsubmit);
        btnsubmit.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.back:
                Intent klik1 = new Intent(stockac.this, menu.class);
                startActivity(klik1);
                break;
            case R.id.klikberanda:
                Intent klik2 = new Intent(stockac.this, menu.class);
                startActivity(klik2);
                break;
            case R.id.kliktambah:
                Toast.makeText(stockac.this, "dalam pengembangan", Toast.LENGTH_LONG).show();
                break;
            case R.id.klikkurang:
                Toast.makeText(stockac.this, "dalam Pengembangan", Toast.LENGTH_LONG).show();
                break;
            case R.id.btnsubmit:
                Intent klik3 = new Intent(stockac.this,laporan.class);
                startActivity(klik3);
                break;
        }
    }
}