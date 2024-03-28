package com.example.customsimpleadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class FullImageView extends AppCompatActivity {

    ImageView imageView;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_image_view);

        imageView = (ImageView) findViewById(R.id.full_image_view);
        textView = (TextView) findViewById(R.id.full_image_text_view);

        Intent intent = getIntent();
        int img_id = intent.getIntExtra("image_id", 0);

        if(img_id != 0)
        {
            imageView.setImageResource(img_id);
        } else
        {
            Toast.makeText(this, "Invalid Image Id", Toast.LENGTH_SHORT).show();
        }
    }
}