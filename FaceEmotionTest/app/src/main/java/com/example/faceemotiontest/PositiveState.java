package com.example.faceemotiontest;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.media.Image;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.StrictMode;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;
import java.net.URI;

import org.apache.hc.client5.http.classic.HttpClient;
import org.apache.hc.client5.http.classic.methods.HttpPost;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.ClassicHttpResponse;
import org.apache.hc.core5.http.ContentType;
import org.apache.hc.core5.http.HttpEntity;
import org.apache.hc.core5.http.io.entity.ByteArrayEntity;
import org.apache.hc.core5.http.io.entity.EntityUtils;
import org.apache.hc.core5.net.URIBuilder;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.ByteArrayOutputStream;


public class PositiveState extends AppCompatActivity {

    Button btnlink1, btnlink2, btnlink3, btnlink4, btnlink5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emotionstate);
        //this page is linked to PositiveState.Java

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Positive Emotions Result");

        // Back Button on the Support Action Bar is not working
        // it is not showing up even though i enabled it below and set the parent to main activity
        //The title of the activity is still not changing Professor even though you looked it over

    }

    // I changed the onclicklistener setup i had for dynamically creating buttons that would open a link in the user's default browser
    // When it wasn't working even though Professor Nixon said the code was fine, i went with your suggestions to create a method
    // And set the Onclick in the xml to the method name, that made some progress i at least got a response from the app
    // But now the app now closes every time a button is clicked, a browser window never opened
    // I even tried deleting all the buttons and dragging each button on the layout just to make sure the buttons were registered
    // And renaming them accordingly

    public void Feelgooddancelink(View View){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://open.spotify.com/playlist/2OxiMAJ6cl7CTbLgkrUDj2"));
        startActivity(browserIntent);

    }

    public void chillbtnlink(View View){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://open.spotify.com/playlist/2zyTYHcGEPVpGQHedgpLv8"));
        startActivity(browserIntent);
    }

    public void happybtnlink(View View){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://open.spotify.com/playlist/37i9dQZF1DXdPec7aLTmlC "));
        startActivity(browserIntent);
    }

    public void edbtnlink(View View){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://open.spotify.com/playlist/4LxnJvz0BYcUObqV700ctM"));
        startActivity(browserIntent);
    }

    public void dancelinkbtn(View View){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://open.spotify.com/playlist/37i9dQZF1DX4uPi2roRUwU "));
        startActivity(browserIntent);
    }

}

