package com.example.faceemotiontest;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class NegativeEmotions extends AppCompatActivity{
        Button btnlink6,btnlink7,btnlink8,btnlink9,btnlink10;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_negative_emotionstate);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle("Negative Emotions Result");
            //this page is linked to NegativeEmotions.java

            // Back Button on the Support Action Bar is not working
            // it is not showing up even though i enabled it below and set the parent to main activity
            //The title of the activity is still not changing Professor even though you looked it over

            // This is the dynamic method i had before professor i left it here just in case you need to look it over and we happened
            // to miss something as to why both methods are not working

            btnlink6 = findViewById(R.id.cheeruplinkbtn2);
            btnlink6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://open.spotify.com/album/02o5DgSATG1Q1INFANjWVW"));
                    startActivity(browserIntent);
                }
            });
            btnlink7 = findViewById(R.id.sadsongslinkbtn);
            btnlink7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://open.spotify.com/playlist/37i9dQZF1DX7qK8ma5wgG1"));
                    startActivity(browserIntent);
                }
            });

            btnlink8 = findViewById(R.id.spidermanlinkbtn);
            btnlink8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://open.spotify.com/playlist/1EVKF75MqgfIGBXhOlQGea"));
                    startActivity(browserIntent);
                }
            });

            btnlink9 = findViewById(R.id.upliftinglinkbtn);
            btnlink9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://open.spotify.com/playlist/6KhkQiJ0fwAJRaTE5PKIz5"));
                    startActivity(browserIntent);
                }
            });
            btnlink10 = findViewById(R.id.wakeuplinkbtn);
            btnlink10.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://open.spotify.com/album/3m7aGya9dXvRAdVHnHTNwC"));
                    startActivity(browserIntent);
                }
            });
        }

    }

