package com.example.foryourtrip;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import java.util.ArrayList;
import java.util.List;

public class Sabarmati extends AppCompatActivity {

    View layoutData,layoutSearch;
    ViewPager2 viewPager;
    Button b1;
    SliderAdapter sliderAdapter;
    List<String> imageResources  = new ArrayList<>();

    @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sabarmati);

        layoutData = findViewById(R.id.loutData);
        layoutSearch = findViewById(R.id.loutSearch);
        viewPager = findViewById(R.id.viewPager2);


        imageResources.add("https://i.pinimg.com/originals/67/86/1e/67861ec918d9562e3fcc6b3c4999c83b.jpg");
        imageResources.add("https://images.hindustantimes.com/img/2021/07/31/1600x900/_7bb567d6-4f3b-11eb-983b-26bf3b8bba69_1627697096179.png");
        imageResources.add("https://www.mkgandhi.org/images/sabarmati.jpg");

        List<String> pageTexts1 = new ArrayList<>();
        pageTexts1.add("Page 1");
        pageTexts1.add("Page 2");
        pageTexts1.add("Page 3");
        sliderAdapter = new SliderAdapter(imageResources ,pageTexts1, getApplicationContext());
        viewPager.setAdapter(sliderAdapter);

//        String url="https://maps.app.goo.gl/R4tQiCrWHJ8tptj78";
        String url="https://goo.gl/maps/3BnWGWuuewTRC8c17";

        b1=findViewById(R.id.sa);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(i);
            }
        });
    }
}
