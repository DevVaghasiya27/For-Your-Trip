package com.example.foryourtrip;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Rajkot extends AppCompatActivity {
    ImageButton b1,b2,b3,b4,b5;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rajkot);

        b1 = findViewById(R.id.RCNext);
        b2 = findViewById(R.id.PPNext);
        b3 = findViewById(R.id.RVNext);
        b4 = findViewById(R.id.NDNext);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(getApplicationContext(), RaceCourse.class);
                startActivity(i);
            }
        });


        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(getApplicationContext(), Pradhyuman.class);
                startActivity(i);
            }
        });


        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(getApplicationContext(), Nyari.class);
                startActivity(i);
            }
        });


        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(getApplicationContext(), RamVan.class);
                startActivity(i);
            }
        });

        b5 = findViewById(R.id.GMNext);

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(getApplicationContext(), Gandhi.class);
                startActivity(i);
            }
        });

    }
}