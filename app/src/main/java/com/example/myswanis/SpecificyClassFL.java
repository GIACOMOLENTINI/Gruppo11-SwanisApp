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

public class SpecificyClassFL extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.specificyclass);
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
                        Intent openPage1 = new Intent(SpecificyClassFL.this,DescrAnimal.class);
                        startActivity(openPage1);
                    };
                });
        button4.setOnClickListener(
                new ImageButton.OnClickListener() {
                    public void onClick(View v) {
                        Intent openPage2 = new Intent(SpecificyClassFL.this,ProjectActivityManage.class);
                        startActivity(openPage2);
                    };
                });
        button5.setOnClickListener(
                new ImageButton.OnClickListener() {
                    public void onClick(View v) {
                        Intent openPage2 = new Intent(SpecificyClassFL.this,MainActivity2.class);
                        startActivity(openPage2);
                    };
                });
        button6.setOnClickListener(
                new ImageButton.OnClickListener() {
                    public void onClick(View v) {
                        Intent openPage2 = new Intent(SpecificyClassFL.this,MainActivity2.class);
                        startActivity(openPage2);
                    };
                });
        btnSrc.setOnClickListener(
                new ImageButton.OnClickListener() {
                    public void onClick(View v) {
                        if(src.getText().toString().equals("alligatore")) {
                            Intent openPage3 = new Intent(SpecificyClassFL.this,DescrAnimal.class);
                            startActivity(openPage3);
                        } else if(src.getText().toString().equals("lucertola")) {
                            Intent openPage3 = new Intent(SpecificyClassFL.this,DescrAnimal2.class);
                            startActivity(openPage3);
                        } else
                            Toast.makeText(SpecificyClassFL.this,"NO RESULT!",Toast.LENGTH_LONG).show();
                    };
                });
    }
}