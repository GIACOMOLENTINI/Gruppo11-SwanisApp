package com.example.myswanis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class CompilaClass extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.compila_layout);
        Button button3 = (Button)findViewById(R.id.button);
        Button btn2 = (Button) findViewById(R.id.button2);
        ImageButton button4 = (ImageButton)findViewById(R.id.imageButton21);
        ImageButton button5 = (ImageButton)findViewById(R.id.imageButton21);
        ImageButton button6 = (ImageButton)findViewById(R.id.imageButton22);

        button3.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        Toast.makeText(getApplicationContext(), "INSERIMENTO AVVENUTO!!!" , Toast.LENGTH_LONG).show();
                        Intent openPage1 = new Intent(CompilaClass.this,MainActivity.class);
                        startActivity(openPage1);
                    };
                });
        button4.setOnClickListener(
                new ImageButton.OnClickListener() {
                    public void onClick(View v) {
                        Intent openPage2 = new Intent(CompilaClass.this,ProjectActivity.class);
                        startActivity(openPage2);
                    };
                });
        button5.setOnClickListener(
                new ImageButton.OnClickListener() {
                    public void onClick(View v) {
                        Intent openPage2 = new Intent(CompilaClass.this,MainActivity.class);
                        startActivity(openPage2);
                    };
                });
        button6.setOnClickListener(
                new ImageButton.OnClickListener() {
                    public void onClick(View v) {
                        Intent openPage2 = new Intent(CompilaClass.this,MainActivity.class);
                        startActivity(openPage2);
                    };
                });

        btn2.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        try {
                            Intent cameraIntent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
                            startActivity(cameraIntent);
                        }catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });
    }
}