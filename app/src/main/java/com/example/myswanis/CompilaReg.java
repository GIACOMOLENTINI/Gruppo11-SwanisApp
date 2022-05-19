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
        TextView pw =(TextView) findViewById(R.id.editTextTextPersonName7);
        TextView pw2 =(TextView) findViewById(R.id.editTextTextPersonName8);


        button3.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        if(pw.getText().toString().equals(pw2.getText().toString())){
                            //correct
                            Toast.makeText(CompilaReg.this,"SIGN IN SUCCESSFUL!",Toast.LENGTH_LONG).show();
                        Intent openPage1 = new Intent(CompilaReg.this,Login.class);
                        startActivity(openPage1);
                        } else
                            Toast.makeText(CompilaReg.this, "SIGN IN FAILED!! TRY AGAIN", Toast.LENGTH_LONG).show();
                    }
                });
                }
    }
