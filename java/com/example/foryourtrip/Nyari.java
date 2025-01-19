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

public class Nyari extends AppCompatActivity {

    View layoutData,layoutSearch;
    ViewPager2 viewPager;
    SliderAdapter sliderAdapter;
    Button b1;
    List<String> imageResources  = new ArrayList<>();

    @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nyari);

        layoutData = findViewById(R.id.loutData);
        layoutSearch = findViewById(R.id.loutSearch);
        viewPager = findViewById(R.id.viewPager2);


        imageResources.add("https://www.holidify.com/images/cmsuploads/compressed/shutterstock_1381055468_20191031160701_20191031160735.jpg");
        imageResources.add("https://www.connectingtraveller.com/images/localtip/1659338624images%20(5).jpeg");
        imageResources.add("https://dynamic-media-cdn.tripadvisor.com/media/photo-o/11/c9/ae/e6/img-20180114-172722894.jpg?w=1200&h=1200&s=1");

        List<String> pageTexts1 = new ArrayList<>();
        pageTexts1.add("Page 1");
        pageTexts1.add("Page 2");
        pageTexts1.add("Page 3");
        sliderAdapter = new SliderAdapter(imageResources ,pageTexts1, getApplicationContext());
        viewPager.setAdapter(sliderAdapter);

//        String url="https://maps.google.com/?cid=17312495959908373305&entry=gps";
        String url="https://maps.app.goo.gl/McA6rtwQGGDM2nC39";

        b1=findViewById(R.id.nd);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(i);
            }
        });
    }
}
