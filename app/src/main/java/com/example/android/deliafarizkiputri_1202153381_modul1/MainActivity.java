package com.example.android.deliafarizkiputri_1202153381_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText t1, t2;
    private Button b1, b2;
    private int hasil, total;
    private int uang = 65500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1=(EditText) findViewById(R.id.menuPilihan);
        t2=(EditText) findViewById(R.id.textJumlah);
        
        b1=(Button) findViewById(R.id.eatBut);
        b2=(Button) findViewById(R.id.abnBut);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String menu = t1.getText().toString();
                String jumlah = t2.getText().toString();
                hasil= Integer.parseInt(jumlah);
                total=hasil*50000;

                Intent pageHasil= new Intent(MainActivity.this,Main2Activity.class);
                pageHasil.putExtra("menu",menu);
                pageHasil.putExtra("jumlah",jumlah);
                pageHasil.putExtra("total",String.valueOf(total));
                pageHasil.putExtra("restoran","Eatbus");

                startActivity(pageHasil);

                if (total > uang){
                    Toast.makeText(MainActivity.this,"Jangan makan disini uang kamu tidak cukup",Toast.LENGTH_LONG).show();
                }

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String menu = t1.getText().toString();
                String jumlah = t2.getText().toString();
                hasil= Integer.parseInt(jumlah);
                total=hasil*50000;

                Intent pageHasil= new Intent(MainActivity.this,Main2Activity.class);
                pageHasil.putExtra("menu",menu);
                pageHasil.putExtra("jumlah",jumlah);
                pageHasil.putExtra("total",String.valueOf(total));
                pageHasil.putExtra("restoran","Abnormal");

                startActivity(pageHasil);

                if (total < uang){
                    Toast.makeText(MainActivity.this,"Jangan makan disini uang kamu tidak cukup",Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}
