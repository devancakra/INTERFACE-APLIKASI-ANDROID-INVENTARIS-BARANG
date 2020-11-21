package com.example.inbaru;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity  extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout klik = findViewById(R.id.klik);
        klik.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent moveIntent = new Intent(MainActivity.this, loginpegawai.class);
        startActivity(moveIntent);
    }

}
