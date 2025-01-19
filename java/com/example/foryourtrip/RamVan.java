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

public class RamVan extends AppCompatActivity {

    View layoutData,layoutSearch;
    ViewPager2 viewPager;
    SliderAdapter sliderAdapter;
    Button b1;
    List<String> imageResources  = new ArrayList<>();

    @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ram_van);

        layoutData = findViewById(R.id.loutData);
        layoutSearch = findViewById(R.id.loutSearch);
        viewPager = findViewById(R.id.viewPager2);


        imageResources.add("https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEgZbw5KYKI0nRPI2pTjl_4mHNWlzhg8iA9m3GYSBpEtGUWt1nmd2GNThuLMG600s61ndW7S8mu8FQf5IhCTSI8KAr8Wgl2ZGtLGGP71ATogjN0irENlDZHscMlomJmPjTroGBrKL9aagAdca1STpooH9OgyiJsIzAXZnq3ACb7FUfmPLChLBqoS7ui1/w1200-h630-p-k-no-nu/ram%20van.jpg");
        imageResources.add("https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEi3ZZ0_HcQeUggUUD6Ms7uzWCoenz98i-PxE-8zwegvvWjRpXazPLuXd6huzkCb8ikSv7O8_D16x1TmpJNiM864fK_DLRMY3995_6xfVdUiBRrrNnxogvyEVCPzFcIRcQs7pG5F517gjtxdQHvFXEFkJoGcUe6Oc4wJK6JMoQVgcUdfAUBVwiCmIENk/s1200/ram%20van%20image.jpg");
        imageResources.add("https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEi9g8zFkFEs9-cq3rBuLuZWmYnhVxGwsGExDOCKMFLoiMHjHxWhEuQ7wa5m7RsJ-Wkl2irJlSaMv_YwnZhNlIoefb7hLee61ZcLFDiWIjMe1mOHOTHMP9w8YhENWCk2dKXnzoCX7mZH56Gn1gtn1ZypornOBeHXgHYyx2kqNtbsJ2RXQ5uUgQ-ZcMXUJA/s640/ram-van-sculpture.jpg");

        List<String> pageTexts1 = new ArrayList<>();
        pageTexts1.add("Page 1");
        pageTexts1.add("Page 2");
        pageTexts1.add("Page 3");
        sliderAdapter = new SliderAdapter(imageResources ,pageTexts1, getApplicationContext());
        viewPager.setAdapter(sliderAdapter);

//        String url="https://maps.google.com/?cid=1366920749055559445&entry=gps";
        String url="https://maps.app.goo.gl/Cjzj7mEiCLxh3qSBA";

        b1=findViewById(R.id.rv);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(i);
            }
        });
    }
}
