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

public class Kankariya extends AppCompatActivity {

    View layoutData,layoutSearch;
    ViewPager2 viewPager;
    SliderAdapter sliderAdapter;
    Button b1;
    List<String> imageResources  = new ArrayList<>();

    @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kankariya);

        layoutData = findViewById(R.id.loutData);
        layoutSearch = findViewById(R.id.loutSearch);
        viewPager = findViewById(R.id.viewPager2);


        imageResources.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSVS_UZRcvWGSm4TrMhDTvexsYVsfQm75Dx-tqvqEdn0EZWu4VzeuV_fafyUhR8npfcQHM&usqp=CAU");
        imageResources.add("https://www.adotrip.com/public/images/areas/master_images/5c76712fee58a-Kankaria_Lake_Attractions.jpg");
        imageResources.add("https://i.ytimg.com/vi/fb8gao77B7c/maxresdefault.jpg");

        List<String> pageTexts1 = new ArrayList<>();
        pageTexts1.add("Page 1");
        pageTexts1.add("Page 2");
        pageTexts1.add("Page 3");
        sliderAdapter = new SliderAdapter(imageResources ,pageTexts1, getApplicationContext());
        viewPager.setAdapter(sliderAdapter);

//        String url="https://maps.app.goo.gl/C6ggECxwoSSZUrNs8";
        String url="https://maps.app.goo.gl/NL1EhJxmqoBDqpo2A";

        b1=findViewById(R.id.kl);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(i);
            }
        });
    }
}
