package com.example.broadcastreceivers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

    private ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image = findViewById(R.id.img_image);

        Intent intent = getIntent();
        String action = intent.getAction();
        String type = intent.getType();

        if(intent.ACTION_SEND.equals(action) && type!=null)
        {
            image.setImageURI(intent.getParcelableExtra(Intent.EXTRA_STREAM));

        }


    }
}