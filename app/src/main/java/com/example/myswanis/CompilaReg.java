package com.example.myswanis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class CompilaReg extends AppCompatActivity {

    private static final int PHOTO_REQUEST_CODE = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.compila_name);
        Button button3 = (Button)findViewById(R.id.button);
        TextView pw = (TextView) findViewById(R.id.editTextTextPersonName7);
        TextView pw2 = (TextView) findViewById(R.id.editTextTextPersonName8);
        TextView name = (TextView) findViewById(R.id.editTextTextPersonName1);
        TextView surname = (TextView) findViewById(R.id.editTextTextPersonName2);
        TextView  date = (TextView) findViewById(R.id.editTextTextPersonName3);
        TextView tel = (TextView) findViewById(R.id.editTextTextPersonName5);
        TextView email = (TextView) findViewById(R.id.editTextTextPersonName6);
        String error ="CAMPO OBBLIGATORIO";

        button3.setOnClickListener(
                new Button.OnClickListener() {
                   public void onClick (View v) {

                           if (name.getText().toString().isEmpty() || (surname.getText().toString().isEmpty()) || (date.getText().toString().isEmpty()) || (tel.getText().toString().isEmpty()) || (email.getText().toString().isEmpty())) {
                               Toast.makeText(CompilaReg.this, "COMPILARE TUTTI I CAMPI", Toast.LENGTH_LONG).show();
                           }
                       else if (pw.getText().toString().equals(pw2.getText().toString()) && (!pw.getText().toString().isEmpty()) && (!pw2.getText().toString().isEmpty())) {
                           //correct
                           Toast.makeText(CompilaReg.this, "REGISTRAZIONE AVVENUTA" , Toast.LENGTH_LONG).show();
                           Intent openPage1 = new Intent(CompilaReg.this, Login.class);
                           startActivity(openPage1);
                       } else
                           Toast.makeText(CompilaReg.this, "LE PASSWORD NON COINCIDONO", Toast.LENGTH_LONG).show();
                   }
                });
                }
    }
