package com.example.foryourtrip;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Ahmedabad extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ahmedabad);
        ImageButton b1,b2,b3,b4,b5;

        b1 = findViewById(R.id.RFNext);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    Intent i=new Intent(getApplicationContext(), RiverFront.class);
                    startActivity(i);
            }
        });

        b2 = findViewById(R.id.KLNext);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i2=new Intent(getApplicationContext(), Kankariya.class);
                startActivity(i2);
            }
        });

        b3 = findViewById(R.id.SANext);

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i3=new Intent(getApplicationContext(), Sabarmati.class);
                startActivity(i3);
            }
        });

        b4 = findViewById(R.id.SCNext);

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i4=new Intent(getApplicationContext(), ScienceCity.class);
                startActivity(i4);
            }
        });

        b5 = findViewById(R.id.TNext);

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i5=new Intent(getApplicationContext(), Thol.class);
                startActivity(i5);
            }
        });

    }
}