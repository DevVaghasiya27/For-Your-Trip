package com.example.foryourtrip;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class HomePage extends AppCompatActivity {
    AutoCompleteTextView actv,actv2;
    Button b1;
    ArrayList arrNames = new ArrayList<>();
    ArrayList arrNames2 = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        actv = findViewById(R.id.selectState);
        arrNames.add("Gujarat");
        arrNames.add("Maharashtra");
        arrNames.add("Punjab");
        arrNames.add("Goa");
        arrNames.add("Rajasthan");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1,arrNames);
        actv.setAdapter(adapter);
        actv.setThreshold(1);

        actv2 = findViewById(R.id.selectCity);
        arrNames2.add("Rajkot");
        arrNames2.add("Ahmedabad");
        arrNames2.add("GandhiNagar");
        arrNames2.add("Jamnagar");
        arrNames2.add("Junagadh");

        ArrayAdapter<String> adapter2 = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1,arrNames2);
        actv2.setAdapter(adapter2);
        actv2.setThreshold(1);

        b1 = findViewById(R.id.vP);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String s1 = actv.getText().toString();
                String s2 = actv2.getText().toString();

                if (s1.equals("Gujarat") && s2.equals("Ahmedabad")){
                    Intent i=new Intent(getApplicationContext(), Ahmedabad.class);
                    startActivity(i);
                }
                if (s1.equals("Gujarat") && s2.equals("Rajkot")){
                    Intent i=new Intent(getApplicationContext(), Rajkot.class);
                    startActivity(i);
                }
            }
        });

    }
}