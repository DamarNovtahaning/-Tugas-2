package com.example.kalkulatorsederhana;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.security.cert.Extension;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText angka1, angka2;
    Button tambah, kurang, kali, bagi, bersih;
    TextView hasil;
    String bil1, bil2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        angka1 = findViewById(R.id.angka1);
        angka2 = findViewById(R.id.angka2);
        tambah = findViewById(R.id.btntambah);
        kurang = findViewById(R.id.btnkurang);
        kali = findViewById(R.id.btnkali);
        bagi = findViewById(R.id.btnbagi);
        bersih = findViewById(R.id.btnbersih);
        hasil = findViewById(R.id.hasil);

        tambah.setOnClickListener(this);
        kali.setOnClickListener(this);
        kurang.setOnClickListener(this);
        bagi.setOnClickListener(this);
        bersih.setOnClickListener(this);

    }

    private boolean validation() {
        bil1 = angka1.getText().toString().trim();
        bil2 = angka2.getText().toString().trim();
        boolean isEmptyField = false;
        if (TextUtils.isEmpty(bil1)) {
            isEmptyField = true;
            angka1.setError("Silahkan isi angka");
        }
        if (TextUtils.isEmpty(bil2)) {
            isEmptyField = true;
            angka2.setError("Silahkan isi angka");
        }
        return isEmptyField;
    }

    private void clearField() {
        angka2.setText("");
        angka1.setText("");
        angka1.requestFocus();
        hasil.setText(R.string.result);
    }

    private void division() {
        double bilangan1 = Double.parseDouble(bil1);
        double bilangan2 = Double.parseDouble(bil2);
        double hitung = bilangan1 / bilangan2;
        hasil.setText(String.valueOf(hitung));
    }

    private void multipication() {
        double bilangan1 = Double.parseDouble(bil1);
        double bilangan2 = Double.parseDouble(bil2);
        double hitung = bilangan1 * bilangan2;
        hasil.setText(String.valueOf(hitung));
    }

    private void addition() {
        double bilangan1 = Double.parseDouble(bil1);
        double bilangan2 = Double.parseDouble(bil2);
        double hitung = bilangan1 + bilangan2;
        hasil.setText(String.valueOf(hitung));
    }

    private void substraction() {
        double bilangan1 = Double.parseDouble(bil1);
        double bilangan2 = Double.parseDouble(bil2);
        double hitung = bilangan1 - bilangan2;
        hasil.setText(String.valueOf(hitung));
    }

    @Override
    public void onClick(View view) {
        boolean isEmptyField = validation();
        switch (view.getId()) {
            case R.id.btntambah:
                if (!isEmptyField) {
                    addition();
                }
                break;
            case R.id.btnkurang:
                if (!isEmptyField) {
                    substraction();
                }
                break;
            case R.id.btnkali:
                if (!isEmptyField) {
                    multipication();
                }
                break;
            case R.id.btnbagi:
                if (!isEmptyField) {
                    division();
                }
                break;
            case R.id.btnbersih:
                clearField();
                break;

        }
    }
}
