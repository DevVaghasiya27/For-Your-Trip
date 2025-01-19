package com.example.foryourtrip;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Search extends AppCompatActivity {
    AutoCompleteTextView actv2;
    ArrayList arrNames2 = new ArrayList<>();

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        actv2 = findViewById(R.id.searchPlace);
        arrNames2.add("River Front");
        arrNames2.add("Kankaria Lake");
        arrNames2.add("Sabarmati Ashram");
        arrNames2.add("Science City");
        arrNames2.add("Thol");

        ArrayAdapter<String> adapter2 = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1,arrNames2);
        actv2.setAdapter(adapter2);
        actv2.setThreshold(1);

    }
}