package com.example.myswanis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class Gestion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gestione_segnal);

        ImageButton button4 = (ImageButton)findViewById(R.id.imageButton20);
        ImageButton button5 = (ImageButton)findViewById(R.id.imageButton21);
        ImageButton button6 = (ImageButton)findViewById(R.id.imageButton22);
        ImageButton button7 = (ImageButton)findViewById(R.id.confirm_button);
        ImageButton button8 = (ImageButton)findViewById(R.id.mod_button);
        ImageButton button9 = (ImageButton)findViewById(R.id.delete_button);

        button4.setOnClickListener(
                new ImageButton.OnClickListener() {
                    public void onClick(View v) {
                        Intent openPage2 = new Intent(Gestion.this,ProjectActivity.class);
                        startActivity(openPage2);
                    };
                });
        button5.setOnClickListener(
                new ImageButton.OnClickListener() {
                    public void onClick(View v) {
                        Intent openPage2 = new Intent(Gestion.this,MainActivity2.class);
                        startActivity(openPage2);
                    };
                });
        button6.setOnClickListener(
                new ImageButton.OnClickListener() {
                    public void onClick(View v) {
                        Intent openPage2 = new Intent(Gestion.this,MainActivity2.class);
                        startActivity(openPage2);
                    };
                });
        button7.setOnClickListener(
                new ImageButton.OnClickListener() {
                    public void onClick(View v) {
                        Toast.makeText(getApplicationContext(), "SEGNALAZIONE CONFERMATA!!!" , Toast.LENGTH_LONG).show();
                        Intent openPage2 = new Intent(Gestion.this,Gestion.class);
                        startActivity(openPage2);
                    };
                });
        button8.setOnClickListener(
                new ImageButton.OnClickListener() {
                    public void onClick(View v) {
                        Intent openPage2 = new Intent(Gestion.this,ModSegnal.class);
                        startActivity(openPage2);
                    };
                });
        button9.setOnClickListener(
                new ImageButton.OnClickListener() {
                    public void onClick(View v) {
                        Toast.makeText(getApplicationContext(), "SEGNALAZIONE ELIMINATA CORRETTAMENTE!!!" , Toast.LENGTH_LONG).show();
                        Intent openPage2 = new Intent(Gestion.this,Gestion.class);
                        startActivity(openPage2);
                    };
                });
    }
}