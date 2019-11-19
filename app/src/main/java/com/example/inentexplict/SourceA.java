package com.example.inentexplict;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SourceA extends AppCompatActivity {

    Button btnnext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnnext = (Button)findViewById(R.id.btnnext);
        btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(SourceA.this,DestinationB.class);
                intent.putExtra("pin","10F91A1242");//1125a0503
                intent.putExtra("pin1","11A25A0503");//1125a0503
                intent.putExtra("pin2",1234567);//1125a0503
                startActivity(intent);
            }
        });



    }
}
