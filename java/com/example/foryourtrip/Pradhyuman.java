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

public class Pradhyuman extends AppCompatActivity {

    View layoutData,layoutSearch;
    ViewPager2 viewPager;
    SliderAdapter sliderAdapter;
    Button b1;
    List<String> imageResources  = new ArrayList<>();

    @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pradhyuman);

        layoutData = findViewById(R.id.loutData);
        layoutSearch = findViewById(R.id.loutSearch);
        viewPager = findViewById(R.id.viewPager2);


        imageResources.add("https://www.trawell.in/admin/images/upload/670517454Rajkot_Pradhyuman_Zoological_Park_Main.jpg");
        imageResources.add("https://www.joonsquare.com/usermanage/image/business/pradhyuman-zoological-park-rajkot-34505/pradhyuman-zoological-park-rajkot-pradhyuman-zoological-park4.jpg");
        imageResources.add("https://www.touristplaces.net.in/images/pp/4/p96359.jpg");

        List<String> pageTexts1 = new ArrayList<>();
        pageTexts1.add("Page 1");
        pageTexts1.add("Page 2");
        pageTexts1.add("Page 3");
        sliderAdapter = new SliderAdapter(imageResources ,pageTexts1, getApplicationContext());
        viewPager.setAdapter(sliderAdapter);

//        String url="https://maps.google.com/?q=Pradhyuman+Park%2C+Rajkot%2C+Gujarat+360003&ftid=0x3959b5c69e159d89:0xbff041fb220181fd&entry=gps";
        String url="https://maps.app.goo.gl/UUWZ9K7vLNdW8jS47";

        b1=findViewById(R.id.pp);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(i);
            }
        });
    }
}
