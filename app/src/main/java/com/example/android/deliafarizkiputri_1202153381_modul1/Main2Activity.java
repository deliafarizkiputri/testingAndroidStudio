package com.example.android.deliafarizkiputri_1202153381_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    private TextView a, b, c, d;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        a=(TextView) findViewById(R.id.textMenu);
        b=(TextView) findViewById(R.id.textPorsi);
        c=(TextView) findViewById(R.id.textHarga);
        d=(TextView) findViewById(R.id.restoran);

        Intent pilihan = getIntent();

        String seeMenu = pilihan.getStringExtra("menu");
        String seePorsi = pilihan.getStringExtra("jumlah");
        String seeHarga = pilihan.getStringExtra("total");
        String seeRestoran = pilihan.getStringExtra("restoran");

        a.setText(seeMenu);
        b.setText(seePorsi);
        c.setText(seeHarga);
        d.setText(seeRestoran);
    }
}
