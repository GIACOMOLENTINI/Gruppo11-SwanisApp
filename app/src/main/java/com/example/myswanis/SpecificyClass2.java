package com.example.myswanis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class SpecificyClass2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.specificyclass2);
        ImageButton button1 = (ImageButton)findViewById(R.id.btn);
        ImageButton button4 = (ImageButton)findViewById(R.id.imageButton21);
        ImageButton button5 = (ImageButton)findViewById(R.id.imageButton21);
        ImageButton button6 = (ImageButton)findViewById(R.id.imageButton22);


        button1.setOnClickListener(
                new ImageButton.OnClickListener() {
                    public void onClick(View v) {
                        Intent openPage1 = new Intent(SpecificyClass2.this,DescrAnimal.class);
                        startActivity(openPage1);
                    };
                });
        button4.setOnClickListener(
                new ImageButton.OnClickListener() {
                    public void onClick(View v) {
                        Intent openPage2 = new Intent(SpecificyClass2.this,ProjectActivity.class);
                        startActivity(openPage2);
                    };
                });
        button5.setOnClickListener(
                new ImageButton.OnClickListener() {
                    public void onClick(View v) {
                        Intent openPage2 = new Intent(SpecificyClass2.this,MainActivity.class);
                        startActivity(openPage2);
                    };
                });
        button6.setOnClickListener(
                new ImageButton.OnClickListener() {
                    public void onClick(View v) {
                        Intent openPage2 = new Intent(SpecificyClass2.this,MainActivity2.class);
                        startActivity(openPage2);
                    };
                });
    }
}
