package com.example.pro5;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager2.widget.ViewPager2;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ImageView imageView;
    private int count=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.imageView2);}

        public void arrowR (View view){
            if (count == 1) {
                count++;
                imageView.setImageResource(R.drawable.image2);
            } else {
                if (count == 2) {
                    count++;
                    imageView.setImageResource(R.drawable.image3);
                } else {
                    if (count == 3) {
                        count++;
                        imageView.setImageResource(R.drawable.image4);
                    } else {
                        if (count == 4) {
                            count++;
                            imageView.setImageResource(R.drawable.image5);
                        }
                    }
                }
            }
        }


        public void arrowL (View view){
            if (count == 5) {
                count--;
                imageView.setImageResource(R.drawable.image4);
            } else {
                if (count == 4) {
                    count--;
                    imageView.setImageResource(R.drawable.image3);
                } else {
                    if (count == 3) {
                        count--;
                        imageView.setImageResource(R.drawable.image2);
                    } else {
                        if (count == 2) {
                            count--;
                            imageView.setImageResource(R.drawable.image1);
                        }
                    }
                }

            }
        }
    }
