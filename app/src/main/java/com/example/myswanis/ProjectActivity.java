package com.example.myswanis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class ProjectActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project);

        ImageButton button4 = (ImageButton)findViewById(R.id.imageButton20);
        ImageButton button5 = (ImageButton)findViewById(R.id.imageButton21);
        ImageButton button6 = (ImageButton)findViewById(R.id.imageButton22);
        Button button7 = (Button)findViewById(R.id.btt1);
        Button button8 = (Button)findViewById(R.id.btt2);

        button4.setOnClickListener(
                new ImageButton.OnClickListener() {
                    public void onClick(View v) {
                        Intent openPage2 = new Intent(ProjectActivity.this,ProjectActivity.class);
                        startActivity(openPage2);
                    };
                });
        button5.setOnClickListener(
                new ImageButton.OnClickListener() {
                    public void onClick(View v) {
                        Intent openPage2 = new Intent(ProjectActivity.this,MainActivity.class);
                        startActivity(openPage2);
                    };
                });
        button6.setOnClickListener(
                new ImageButton.OnClickListener() {
                    public void onClick(View v) {
                        Intent openPage2 = new Intent(ProjectActivity.this,MainActivity.class);
                        startActivity(openPage2);
                    };
                });
        button7.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent openPage2 = new Intent(ProjectActivity.this,ProjectClass.class);
                        startActivity(openPage2);
                    };
                });
        button8.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        Toast.makeText(getApplicationContext(), "PARTECIPAZIONE CONFERMATA!!!" , Toast.LENGTH_LONG).show();
                        Intent openPage2 = new Intent(ProjectActivity.this,MainActivity.class);
                        startActivity(openPage2);
                    };
                });

    }
}