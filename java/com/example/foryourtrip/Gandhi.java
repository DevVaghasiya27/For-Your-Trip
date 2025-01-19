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

public class Gandhi extends AppCompatActivity {

    View layoutData,layoutSearch;
    ViewPager2 viewPager;
    SliderAdapter sliderAdapter;
    Button b1;
    List<String> imageResources  = new ArrayList<>();

    @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gandhi);

        layoutData = findViewById(R.id.loutData);
        layoutSearch = findViewById(R.id.loutSearch);
        viewPager = findViewById(R.id.viewPager2);


        imageResources.add("https://pbs.twimg.com/media/DoWh-woXsAMpYJj.jpg");
        imageResources.add("https://th.bing.com/th/id/R.9d0ca1760a9882500012f46360ff2e78?rik=6L%2bJ36WzKqYiAA&riu=http%3a%2f%2fvamacomm.com%2fwp-content%2fuploads%2f2018%2f11%2fimg26.jpg&ehk=7mQVp9l4JZrqZMn6wXo0tWBwziJFyd4k4dU8UA4QGOM%3d&risl=&pid=ImgRaw&r=0");
        imageResources.add("https://1.bp.blogspot.com/-tH_ePzvu0Sw/YLphVMi02TI/AAAAAAAAAdM/jWLAvf-maIYq5McOPJX3OBmH6_84-d8yQCLcBGAsYHQ/s1500/Gandhi%2BMuseum%2B2.jpg");

        List<String> pageTexts1 = new ArrayList<>();
        pageTexts1.add("Page 1");
        pageTexts1.add("Page 2");
        pageTexts1.add("Page 3");
        sliderAdapter = new SliderAdapter(imageResources ,pageTexts1, getApplicationContext());
        viewPager.setAdapter(sliderAdapter);

//        String url="https://maps.google.com/?cid=5030355725250764733&entry=gps";
        String url="https://maps.app.goo.gl/DykTKWP6WD3GqTww9";

        b1=findViewById(R.id.gm);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(i);
            }
        });
    }
}
