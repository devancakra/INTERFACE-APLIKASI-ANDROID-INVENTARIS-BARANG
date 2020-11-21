package com.example.inbaru;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class loginpegawai extends AppCompatActivity implements View.OnClickListener{

    EditText edtuser, edtpass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loginpegawai);

        edtuser = findViewById(R.id.edtuser);
        edtpass = findViewById(R.id.edtpass);

        Button btn = findViewById(R.id.btnuser);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String user = edtuser.getText().toString();
        String pass = edtpass.getText().toString();
        //
        if (!user.equals("user") &&  pass.equals("user")){
            Toast.makeText(loginpegawai.this,"Username dan Password Salah",Toast.LENGTH_LONG).show();
            //untuk munculkan tulisan //context tempat muncul. //toast lenght long.uk menampikan seberapa lama
        }else{
            Intent pegawai = new Intent(loginpegawai.this, pilihanawal.class);
            startActivity(pegawai);
            Toast.makeText(loginpegawai.this,"Username dan Password Benar",Toast.LENGTH_LONG).show();
            //untuk munculkan tulisan //context tempat muncul. //toast lenght long.uk menampikan seberapa lama
        }
        if (!user.equals("admin") && pass.equals("admin")){
            Toast.makeText(loginpegawai.this, "Username dan Password Salah", Toast.LENGTH_LONG).show();
        }else{
            Intent admin = new Intent(loginpegawai.this, pilihanawal.class);
            startActivity(admin);
            Toast.makeText(loginpegawai.this,"Username dan Password Benar",Toast.LENGTH_LONG).show();
            //untuk munculkan tulisan //context tempat muncul. //toast lenght long.uk menampikan seberapa lama
        }
    }
}