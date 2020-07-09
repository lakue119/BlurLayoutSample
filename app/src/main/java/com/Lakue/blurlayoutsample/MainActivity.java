package com.Lakue.blurlayoutsample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    ViewPager2Adapter adapter;
    ViewPager2 viewpager2;
    ImageView iv_back_img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setWidget();
        setImage();

        viewPager2Init();

        setItem();
    }

    private void setImage(){
        Glide.with(this).load(R.drawable.background5).into(iv_back_img);
    }

    private void setWidget(){
        iv_back_img = findViewById(R.id.iv_back_img);
        viewpager2 = findViewById(R.id.viewpager2);
    }

    private void viewPager2Init(){
        adapter = new ViewPager2Adapter();

        viewpager2.setAdapter(adapter);
    }

    private void setItem(){
        adapter.addItem(R.drawable.background1);
        adapter.addItem(R.drawable.background2);
        adapter.addItem(R.drawable.background3);
        adapter.addItem(R.drawable.background5);
        adapter.addItem(R.drawable.background6);
    }
}