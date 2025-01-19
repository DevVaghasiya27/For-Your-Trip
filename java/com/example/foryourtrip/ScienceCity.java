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

public class ScienceCity extends AppCompatActivity {

    View layoutData,layoutSearch;
    ViewPager2 viewPager;
    SliderAdapter sliderAdapter;
    Button b1;
    List<String> imageResources  = new ArrayList<>();

    @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_science_city);

        layoutData = findViewById(R.id.loutData);
        layoutSearch = findViewById(R.id.loutSearch);
        viewPager = findViewById(R.id.viewPager2);


        imageResources.add("https://reviewsduniya.com/wp-content/uploads/2021/07/wp-1626585092843.jpg");
        imageResources.add("https://reviewsduniya.com/wp-content/uploads/2021/07/wp-1626585092787.jpg");
        imageResources.add("https://static2.tripoto.com/media/filter/tst/img/OgData/1626782020_okm7_fotor.jpg");

        List<String> pageTexts1 = new ArrayList<>();
        pageTexts1.add("Page 1");
        pageTexts1.add("Page 2");
        pageTexts1.add("Page 3");
        sliderAdapter = new SliderAdapter(imageResources ,pageTexts1, getApplicationContext());
        viewPager.setAdapter(sliderAdapter);

//        String url="https://maps.app.goo.gl/bG5RPgJvSxQpTSDFA";
        String url="https://maps.app.goo.gl/Pg6pDHekX16jS9qM6";

        b1=findViewById(R.id.sc);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(i);
            }
        });
    }
}
