package com.example.temperature_converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Final3 extends AppCompatActivity {

    TextView tv_choose, tv_3;
    Button bt_kel1, bt_fah1, bt_cel1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final3);

        tv_choose = findViewById(R.id.tv_choose);
        bt_kel1 = findViewById(R.id.bt_kel1);
        bt_fah1 = findViewById(R.id.bt_fah1);
        bt_cel1 = findViewById(R.id.bt_cel1);
        tv_3 = findViewById(R.id.tv_3);


        bt_fah1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final Float ans = getIntent().getExtras().getFloat("value3");
                // this is used to get the value entered from the other activity

                double nans =  (ans*2.25)+32;

                tv_3.setText("THE TEMPERATURE IN FAHRENHEIT IS "+ nans);

//                Toast.makeText(Final3.this, "Thank 'YOU' for using this app", Toast.LENGTH_SHORT).show();


            }
        });

        bt_kel1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final Float ans = getIntent().getExtras().getFloat("value3");
                // this is used to get the value entered from the other activity

                double nans =  (ans*1.25)+273;

                tv_3.setText("THE TEMPERATURE IN KELVIN IS "+ nans);

//                Toast.makeText(Final3.this, "Thank 'YOU' for using this app", Toast.LENGTH_SHORT).show();



            }
        });

        bt_cel1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final Float ans = getIntent().getExtras().getFloat("value3");
                // this is used to get the value entered from the other activity

                double nans =  ans*1.25;

                tv_3.setText("THE TEMPERATURE IN CELSIUS IS "+ nans);

//                Toast.makeText(Final3.this, "Thank 'YOU' for using this app", Toast.LENGTH_SHORT).show();


            }
        });
    }
}