package com.example.temperature_converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Final1 extends AppCompatActivity {

    TextView tv_choose, tv_3;
    Button bt_cel1, bt_fah1, bt_rem1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final1);

        tv_choose = findViewById(R.id.tv_choose);
        bt_cel1 = findViewById(R.id.bt_cel1);
        bt_fah1 = findViewById(R.id.bt_fah1);
        bt_rem1 = findViewById(R.id.bt_rem1);
        tv_3 = findViewById(R.id.tv_3);


        bt_fah1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final Float ans = getIntent().getExtras().getFloat("value1");
                // this is used to get the value entered from the other activity

                double nans =  ((ans-273)*1.8)+32;

                tv_3.setText("THE TEMPERATURE IN FAHRENHEIT IS "+ nans);

//                Toast.makeText(Final1.this, "Thank 'YOU' for using this app", Toast.LENGTH_SHORT).show();


            }
        });

        bt_cel1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final Float ans = getIntent().getExtras().getFloat("value1");
                // this is used to get the value entered from the other activity

                double nans =  ans-273;

                tv_3.setText("THE TEMPERATURE IN CELSIUS IS "+ nans);

//                Toast.makeText(Final1.this, "Thank 'YOU' for using this app", Toast.LENGTH_SHORT).show();



            }
        });

        bt_rem1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final Float ans = getIntent().getExtras().getFloat("value1");
                // this is used to get the value entered from the other activity

                double nans =  (ans-273)*0.8;

                tv_3.setText("THE TEMPERATURE IN REAUMUR IS "+ nans);

//                Toast.makeText(Final1.this, "Thank 'YOU' for using this app", Toast.LENGTH_SHORT).show();


            }
        });
    }
}
