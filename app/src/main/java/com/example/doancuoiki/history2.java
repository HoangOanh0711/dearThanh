package com.example.doancuoiki;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class history2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history2);

        TextView textView1=findViewById(R.id.text11);
        TextView textView2=findViewById(R.id.text12);
        TextView textView3=findViewById(R.id.text13);
        TextView textView4=findViewById(R.id.text21);
        TextView textView5=findViewById(R.id.text22);
        TextView textView6=findViewById(R.id.text31);
        TextView textView7=findViewById(R.id.text32);
        TextView textView8=findViewById(R.id.text41);
        TextView textView9=findViewById(R.id.text42);
        TextView textView10=findViewById(R.id.text51);
        TextView textView11=findViewById(R.id.text52);

        ImageView img1=findViewById(R.id.image1);
        ImageView img2=findViewById(R.id.image2);
        ImageView img3=findViewById(R.id.image3);
        ImageView img4=findViewById(R.id.imageView7);

        //toolbar
        setSupportActionBar(findViewById(R.id.pro_toolbar));
        getSupportActionBar().setTitle("Order Information");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}