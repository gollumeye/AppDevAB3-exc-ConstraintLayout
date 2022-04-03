package com.example.ab3_exc3_laurarandl;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int display_height = displayMetrics.heightPixels;
        int display_width = displayMetrics.widthPixels;

        ImageView image1 = findViewById(R.id.imageView1);
        image1.getLayoutParams().height=display_height/3-3*50;
        image1.getLayoutParams().width=display_width/3;
        image1.requestLayout();

        ImageView image2 = findViewById(R.id.imageView2);
        image2.getLayoutParams().height=display_height/3-3*50;
        image2.getLayoutParams().width=display_width/3;
        image2.requestLayout();

        ImageView image3 = findViewById(R.id.imageView3);
        image3.getLayoutParams().height=display_height/3-3*50;
        image3.getLayoutParams().width=display_width/3;
        image3.requestLayout();

        ImageView image4 = findViewById(R.id.imageView4);
        image4.getLayoutParams().height=display_height/3-3*50;
        image4.getLayoutParams().width=display_width/3;
        image4.requestLayout();

        ImageView image5 = findViewById(R.id.imageView5);
        image5.getLayoutParams().height=display_height/3-3*50;
        image5.getLayoutParams().width=display_width/3;
        image5.requestLayout();

        ImageView image6 = findViewById(R.id.imageView6);
        image6.getLayoutParams().height=display_height/3-3*50;
        image6.getLayoutParams().width=display_width/3;
        image6.requestLayout();

        ImageView image7 = findViewById(R.id.imageView7);
        image7.getLayoutParams().height=display_height/3-3*50;
        image7.getLayoutParams().width=display_width/3;
        image7.requestLayout();

        ImageView image8 = findViewById(R.id.imageView8);
        image8.getLayoutParams().height=display_height/3-3*50;
        image8.getLayoutParams().width=display_width/3;
        image8.requestLayout();

        ImageView image9 = findViewById(R.id.imageView9);
        image9.getLayoutParams().height=display_height/3-3*50;
        image9.getLayoutParams().width=display_width/3;
        image9.requestLayout();

    }
}