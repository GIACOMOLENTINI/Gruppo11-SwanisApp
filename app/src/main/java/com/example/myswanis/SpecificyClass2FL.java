package com.example.myswanis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class SpecificyClass2FL extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.specificyclass2);
        ImageButton button1 = (ImageButton)findViewById(R.id.btn);
        ImageButton button4 = (ImageButton)findViewById(R.id.imageButton20);
        ImageButton button5 = (ImageButton)findViewById(R.id.imageButton21);
        ImageButton button6 = (ImageButton)findViewById(R.id.imageButton22);
        ImageView utente = (ImageView)findViewById(R.id.imageView);
        utente.setImageResource(R.drawable.flavia);
        TextView person = (TextView)findViewById(R.id.textView4);
        person.setText("FLAVIA");
        ImageButton btnSrc = (ImageButton)findViewById(R.id.btnsource);
        EditText src = (EditText) findViewById(R.id.editTextTextPersonName);


        button1.setOnClickListener(
                new ImageButton.OnClickListener() {
                    public void onClick(View v) {
                        Intent openPage1 = new Intent(SpecificyClass2FL.this,DescrAnimal.class);
                        startActivity(openPage1);
                    };
                });
        button4.setOnClickListener(
                new ImageButton.OnClickListener() {
                    public void onClick(View v) {
                        Intent openPage2 = new Intent(SpecificyClass2FL.this,ProjectActivityManage.class);
                        startActivity(openPage2);
                    };
                });
        button5.setOnClickListener(
                new ImageButton.OnClickListener() {
                    public void onClick(View v) {
                        Intent openPage2 = new Intent(SpecificyClass2FL.this,MainActivity2.class);
                        startActivity(openPage2);
                    };
                });
        button6.setOnClickListener(
                new ImageButton.OnClickListener() {
                    public void onClick(View v) {
                        Intent openPage2 = new Intent(SpecificyClass2FL.this,MainActivity2.class);
                        startActivity(openPage2);
                    };
                });
    }
}
