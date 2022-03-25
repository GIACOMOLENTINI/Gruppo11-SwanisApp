package com.example.myswanis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton button1 = (ImageButton)findViewById(R.id.btn);
        ImageButton button2 = (ImageButton)findViewById(R.id.imageView6);

        button1.setOnClickListener(
                new ImageButton.OnClickListener() {
                    public void onClick(View v) {
                        Intent openPage1 = new Intent(MainActivity.this,SpecificyClass2.class);
                        startActivity(openPage1);
                    };
            });
        button2.setOnClickListener(
                new ImageButton.OnClickListener() {
                    public void onClick(View v) {
                        Intent openPage2 = new Intent(MainActivity.this,SpecificyClass.class);
                        startActivity(openPage2);
                    };
                });
    }
}

