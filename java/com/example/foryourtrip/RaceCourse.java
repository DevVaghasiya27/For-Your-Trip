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

public class RaceCourse extends AppCompatActivity {
    View layoutData,layoutSearch;
    ViewPager2 viewPager;
    SliderAdapter sliderAdapter;
    Button b1;
    List<String> imageResources  = new ArrayList<>();

    @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_race_course);

        layoutData = findViewById(R.id.loutData);
        layoutSearch = findViewById(R.id.loutSearch);
        viewPager = findViewById(R.id.viewPager2);


        imageResources.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRgFWYS3fe8L82vNoSPpEJOI1IHcdzcDUsynNbeNFfG1A&s");
        imageResources.add("https://lh5.googleusercontent.com/p/AF1QipMeAfWwFoU323Gs2jNOd5uVX5tWCZJKHmc_m-Q=w500-h500-k-no");
        imageResources.add("https://mapio.net/images-p/45296535.jpg");

        List<String> pageTexts1 = new ArrayList<>();
        pageTexts1.add("Page 1");
        pageTexts1.add("Page 2");
        pageTexts1.add("Page 3");
        sliderAdapter = new SliderAdapter(imageResources ,pageTexts1, getApplicationContext());
        viewPager.setAdapter(sliderAdapter);

//        String url="https://maps.google.com/?q=Race+Course%2C+Sadar%2C+Rajkot%2C+Gujarat&ftid=0x3959c9f5497f6851:0x639f04431e34d07f&entry=gps";
        String url="https://goo.gl/maps/YFqH35wVmWqMLEtC9";

        b1=findViewById(R.id.rc);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(i);
            }
        });
    }
}
