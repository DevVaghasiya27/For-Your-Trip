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

public class Thol extends AppCompatActivity {

    View layoutData,layoutSearch;
    ViewPager2 viewPager;
    SliderAdapter sliderAdapter;
    List<String> imageResources  = new ArrayList<>();
    Button b1;

    @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thol);

        layoutData = findViewById(R.id.loutData);
        layoutSearch = findViewById(R.id.loutSearch);
        viewPager = findViewById(R.id.viewPager2);


        imageResources.add("https://www.gujarattourism.com/content/dam/gujrattourism/images/bird-watching-sites/thol-lake-sanctuary/Thol-lake-Sanctuary-Banner.jpg");
        imageResources.add("https://th.bing.com/th/id/R.2ee1cefa8fb597e86c97ebb5e3a7a762?rik=ondoKqPoHn%2fRdg&riu=http%3a%2f%2fwww.trodly.com%2fpictures%2fattraction%2f4541.jpg&ehk=hUD7cvGzyMF4o8p9VHk25UeWNmqfBKzQNkc5VhAExTQ%3d&risl=&pid=ImgRaw&r=0");
        imageResources.add("https://ahmedabadtourism.in/images/tourist-places/thol-lake-ahmedabad/thol-lake-ahmedabad-tourism-tourism-opening-time-closing.jpg");

        List<String> pageTexts1 = new ArrayList<>();
        pageTexts1.add("Page 1");
        pageTexts1.add("Page 2");
        pageTexts1.add("Page 3");
        sliderAdapter = new SliderAdapter(imageResources ,pageTexts1, getApplicationContext());
        viewPager.setAdapter(sliderAdapter);

//        String url="https://maps.app.goo.gl/wY6P7av9G3CnBgt9A";
        String url="https://maps.app.goo.gl/2r7htUtXNPLWFLjU7";

        b1=findViewById(R.id.thol);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(i);
            }
        });

    }
}
