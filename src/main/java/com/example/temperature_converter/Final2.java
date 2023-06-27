package com.example.temperature_converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Final2 extends AppCompatActivity {

    TextView tv_choose, tv_3;
    Button bt_kel1, bt_cel1, bt_rem1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final2);

        tv_choose = findViewById(R.id.tv_choose);
        bt_kel1 = findViewById(R.id.bt_kel1);
        bt_cel1 = findViewById(R.id.bt_cel1);
        bt_rem1 = findViewById(R.id.bt_rem1);
        tv_3 = findViewById(R.id.tv_3);


        bt_cel1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final Float ans = getIntent().getExtras().getFloat("value2");
                // this is used to get the value entered from the other activity

                double nans =  (ans-32)*0.55;

                tv_3.setText("THE TEMPERATURE IN CELSIUS IS "+ nans);

//                Toast.makeText(Final2.this, "Thank 'YOU' for using this app", Toast.LENGTH_SHORT).show();


            }
        });

        bt_kel1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final Float ans = getIntent().getExtras().getFloat("value2");
                // this is used to get the value entered from the other activity

                double nans =  ((ans-32)*0.55)+273;

                tv_3.setText("THE TEMPERATURE IN KELVIN IS "+ nans);

//                Toast.makeText(Final2.this, "Thank 'YOU' for using this app", Toast.LENGTH_SHORT).show();



            }
        });

        bt_rem1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final Float ans = getIntent().getExtras().getFloat("value2");
                // this is used to get the value entered from the other activity

                double nans =  (ans-32)*0.44;

                tv_3.setText("THE TEMPERATURE IN REAUMUR IS "+ nans);

//                Toast.makeText(Final2.this, "Thank 'YOU' for using this app", Toast.LENGTH_SHORT).show();


            }
        });
    }
}