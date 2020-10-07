package com.example.aplikasiinputnama;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txtnama, txtalamat;
    Button savebtn, resetbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtnama = findViewById(R.id.input_nama);
        txtalamat = findViewById(R.id.input_alamat);
        savebtn = findViewById(R.id.savebtn);
        resetbtn = findViewById(R.id.resetbtn);
        savebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Nama, Alamat;
                if (txtnama.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this, "Silahkan Isikan Nama Anda", Toast.LENGTH_LONG).show();
                    txtnama.requestFocus();
                }else if (txtalamat.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this, "Silahkan Isikan Alamat Anda", Toast.LENGTH_LONG).show();
                    txtalamat.requestFocus();
                } else {
                    Nama = txtnama.getText().toString();
                    Alamat = txtalamat.getText().toString();
                    Toast.makeText(MainActivity.this, "Selamat Datang "+Nama+" yang beralamat di "+Alamat, Toast.LENGTH_LONG).show();;
                }
            }
        });
    }

    public void fungsiReset(View view) {
        txtalamat.setText("");
        txtnama.setText("");
    }
}
