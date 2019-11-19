package com.example.inentexplict;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DestinationB extends AppCompatActivity {
    TextView tvA,tvB,tvC;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_destination_b);
        tvA=(TextView) findViewById(R.id.textView1);
        tvB=(TextView) findViewById(R.id.textView2);
        tvC=(TextView) findViewById(R.id.textView3);


        String pinnumber =getIntent().getStringExtra("pin");
        String pin1number =getIntent().getStringExtra("pin1");
        Integer abc = getIntent().getIntExtra("pin2", 0);
        tvA.setText(pinnumber);
        tvB.setText(pin1number);
        tvC.setText(""+abc);



    }
}
