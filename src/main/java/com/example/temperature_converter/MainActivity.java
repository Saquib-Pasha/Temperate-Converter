package com.example.temperature_converter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView tv_sel;
    Button bt_cel, bt_kel, bt_fah, bt_rem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // KELVIN
        // CELSIUS
        // FAHRENHEIT
        // REAUMUR

        tv_sel = findViewById(R.id.tv_sel);
        bt_cel = findViewById(R.id.bt_cel);
        bt_kel = findViewById(R.id.bt_kel);
        bt_fah = findViewById(R.id.bt_fah);
        bt_rem = findViewById(R.id.bt_rem);

        bt_cel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, cel.class);
                startActivity(intent);

            }
        });

        bt_kel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, kel.class);
                startActivity(intent);

            }
        });

        bt_fah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, fah.class);
                startActivity(intent);

            }
        });

        bt_rem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, rem.class);
                startActivity(intent);

            }
        });



    }
}