package com.example.myswanis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ImageButton button1 = (ImageButton)findViewById(R.id.btn);
        ImageButton button2 = (ImageButton)findViewById(R.id.imageView6);
        Button button3 = (Button)findViewById(R.id.button);
        ImageButton button4 = (ImageButton)findViewById(R.id.imageButton20);
        ImageButton button5 = (ImageButton)findViewById(R.id.imageButton21);
        ImageButton button6 = (ImageButton)findViewById(R.id.imageButton22);

        button1.setOnClickListener(
                new ImageButton.OnClickListener() {
                    public void onClick(View v) {
                        Intent openPage1 = new Intent(MainActivity2.this,SpecificyClass2.class);
                        startActivity(openPage1);
                    };
                });
        button2.setOnClickListener(
                new ImageButton.OnClickListener() {
                    public void onClick(View v) {
                        Intent openPage2 = new Intent(MainActivity2.this,SpecificyClass.class);
                        startActivity(openPage2);
                    };
                });
        button3.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent openPage3 = new Intent(MainActivity2.this,CompilaClass.class);
                        startActivity(openPage3);
                    };
                });
        button4.setOnClickListener(
                new ImageButton.OnClickListener() {
                    public void onClick(View v) {
                        Intent openPage2 = new Intent(MainActivity2.this,ProjectActivityManage.class);
                        startActivity(openPage2);
                    };
                });
        button5.setOnClickListener(
                new ImageButton.OnClickListener() {
                    public void onClick(View v) {
                        Intent openPage2 = new Intent(MainActivity2.this,MainActivity.class);
                        startActivity(openPage2);
                    };
                });
        button6.setOnClickListener(
                new ImageButton.OnClickListener() {
                    public void onClick(View v) {
                        Intent openPage2 = new Intent(MainActivity2.this,Gestion.class);
                        startActivity(openPage2);
                    };
                });
    }
}

