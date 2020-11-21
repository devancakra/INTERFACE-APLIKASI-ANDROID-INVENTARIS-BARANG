package com.example.inbaru;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class pilihanawal extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pilihanwawal);

        Button a = findViewById(R.id.btnkelasa);
        Button b = findViewById(R.id.btnkelasb);
        Button c = findViewById(R.id.btnkelasc);

        a.setOnClickListener(this);
        b.setOnClickListener(this);
        c.setOnClickListener(this);
    }

        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btnkelasa:
                    Intent moveIntent = new Intent(pilihanawal.this, menu.class);
                    startActivity(moveIntent);
                    Toast.makeText(pilihanawal.this, "Anda telah masuk ke kelas A", Toast.LENGTH_LONG).show();
                    break;
                case R.id.btnkelasb:
                    Intent b = new Intent(pilihanawal.this, menu.class);
                    startActivity(b);
                    Toast.makeText(pilihanawal.this, "Anda telah masuk ke kelas B", Toast.LENGTH_LONG).show();
                    break;
                case R.id.btnkelasc:
                    Intent c = new Intent(pilihanawal.this, menu.class);
                    startActivity(c);
                    Toast.makeText(pilihanawal.this, "Anda telah masuk ke kelas C", Toast.LENGTH_LONG).show();
                    break;
            }
        }
    }

