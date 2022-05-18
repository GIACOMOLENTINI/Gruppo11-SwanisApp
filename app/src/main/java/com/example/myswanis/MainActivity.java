package com.example.myswanis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton button1 = (ImageButton)findViewById(R.id.btn);
        ImageButton button2 = (ImageButton)findViewById(R.id.imageView6);
        Button button3 = (Button)findViewById(R.id.button);
        ImageButton button4 = (ImageButton)findViewById(R.id.imageButton20);
        ImageButton button5 = (ImageButton)findViewById(R.id.imageButton21);
        ImageButton button6 = (ImageButton)findViewById(R.id.imageButton22);
        ImageButton btnSrc = (ImageButton)findViewById(R.id.btnsource);
        EditText src = (EditText) findViewById(R.id.editTextTextPersonName);

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
        button3.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent openPage3 = new Intent(MainActivity.this,CompilaClass.class);
                        startActivity(openPage3);
                    };
                });
        button4.setOnClickListener(
                new ImageButton.OnClickListener() {
                    public void onClick(View v) {
                        Intent openPage2 = new Intent(MainActivity.this,ProjectActivity.class);
                        startActivity(openPage2);
                    };
                });
        button5.setOnClickListener(
                new ImageButton.OnClickListener() {
                    public void onClick(View v) {
                        Intent openPage2 = new Intent(MainActivity.this,MainActivity.class);
                        startActivity(openPage2);
                    };
                });
        btnSrc.setOnClickListener(
                new ImageButton.OnClickListener() {
                    public void onClick(View v) {
                        if(src.getText().toString().equals("alligatore")) {
                            Intent openPage3 = new Intent(MainActivity.this,DescrAnimal.class);
                            startActivity(openPage3);
                        } else
                            Toast.makeText(MainActivity.this,"NO RESULT!",Toast.LENGTH_LONG).show();
                    };
                });

        button6.setOnClickListener(
                new ImageButton.OnClickListener() {
                    public void onClick(View v) {
                            Intent openProfPage = new Intent(MainActivity.this,DescrProfile.class);
                            startActivity(openProfPage);
                    }
                });
    }
}

