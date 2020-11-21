package com.example.inbaru;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class menu extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

        ImageView btn = findViewById(R.id.logout);
        ImageView btn0 = findViewById(R.id.profile);
        ImageView btn1 = findViewById(R.id.klikbuku);
        ImageView btn2= findViewById(R.id.klikkipas);
        ImageView btn3 = findViewById(R.id.klikac);
        ImageView btn4 = findViewById(R.id.klikkursi);
        ImageView btn5 = findViewById(R.id.klikkom);
        ImageView btn6 = findViewById(R.id.klikpapan);
        Button btn7 = findViewById(R.id.btnlaporan);
        Button btn8 = findViewById(R.id.btnapkcreator);

        btn.setOnClickListener(this);
        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.profile:
                Toast.makeText(menu.this, "dalam pengembangan", Toast.LENGTH_LONG).show();
                break;
            case R.id.klikbuku:
                Intent klik1 = new Intent(menu.this, stockbuku.class);
                startActivity(klik1);
                Toast.makeText(menu.this, "Stock Buku", Toast.LENGTH_LONG).show();
                break;
            case R.id.klikkipas:
                Intent klik2 = new Intent(menu.this, stockkipas.class);
                startActivity(klik2);
                Toast.makeText(menu.this, "Stock Kipas", Toast.LENGTH_LONG).show();
                break;
            case R.id.klikac:
                Intent klik3 = new Intent(menu.this, stockac.class);
                startActivity(klik3);
                Toast.makeText(menu.this, "Stock AC", Toast.LENGTH_LONG).show();
                break;
            case R.id.klikkursi:
                Intent klik4 = new Intent(menu.this, stockkursi.class);
                startActivity(klik4);
                Toast.makeText(menu.this, "Stock Kursi", Toast.LENGTH_LONG).show();
                break;
            case R.id.klikkom:
                Intent klik5 = new Intent(menu.this, stockkomputer.class);
                startActivity(klik5);
                Toast.makeText(menu.this, "Stock Komputer", Toast.LENGTH_LONG).show();
                break;
            case R.id.klikpapan:
                Intent klik6 = new Intent(menu.this, stockpapan.class);
                startActivity(klik6);
                Toast.makeText(menu.this, "Stock Papan", Toast.LENGTH_LONG).show();
                break;
            case R.id.btnlaporan:
                Intent klik7 = new Intent(menu.this, laporan.class);
                startActivity(klik7);
                Toast.makeText(menu.this, "Laporan", Toast.LENGTH_LONG).show();
                break;
            case R.id.btnapkcreator:
                Intent klik8 = new Intent(menu.this, creator.class);
                startActivity(klik8);
                Toast.makeText(menu.this, "Tentang Kami", Toast.LENGTH_LONG).show();
                break;
            case R.id.logout:
                moveTaskToBack(true);
                finish();
                System.exit(0);
                break;
        }
    }
}