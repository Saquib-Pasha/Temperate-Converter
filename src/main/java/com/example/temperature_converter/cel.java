package com.example.temperature_converter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class cel extends AppCompatActivity {

    TextView tv_temp;
    EditText et_temp;
    Button bt_sub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cel);

        tv_temp = findViewById(R.id.tv_temp);
        et_temp = findViewById(R.id.et_temp);
        bt_sub = findViewById(R.id.bt_sub);

        bt_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String temp = et_temp.getText().toString();
                float value = 0;

                if (temp.isEmpty()) {
                    Toast.makeText(cel.this, "ENTER TEMPERATURE", Toast.LENGTH_SHORT).show();
                }
                else {

                    try {
                        value = Float.parseFloat(temp);

                        Intent intent = new Intent(cel.this,
                                com.example.temperature_converter.Final.class);

                        intent.putExtra("value",value);

                        startActivity(intent);
                    }
                    catch (NumberFormatException e) {

                        Toast.makeText(cel.this,e.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }

            }

        });



    };

}