package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView lvldata;
    private String[] namafilm = new String[]{
            "Harry Potter, Mulan, Comic 8, Bloodshot, The Raid, Suicide Squad, Fast & Furious, Resident Evil, Underworld, Pirates of the Caribbean"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvldata = findViewById(R.id.lvdata);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, android.R.id.text1, namafilm);

        lvldata.setAdapter(adapter);
        lvldata.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                Toast.makeText(MainActivity.this, "Anda Memilih Film : "+namafilm[i], Toast.LENGTH_LONG).show();
            }
        });
    }
}
