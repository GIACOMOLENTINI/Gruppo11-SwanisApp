package com.example.myswanis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class ResetPw extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recupera);


        EditText username =(EditText) findViewById(R.id.email);
        Button loginbtn = (Button) findViewById(R.id.loginbtn);

        //admin and admin

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (username.getText().toString().isEmpty()){
                    Toast.makeText(ResetPw.this, "COMPILARE CAMPO", Toast.LENGTH_LONG).show();
                }else if (!username.getText().toString().isEmpty()) {
                    Toast.makeText(ResetPw.this, "INVIO MAIL RESET EFFETTUATA!", Toast.LENGTH_LONG).show();
                    Intent openPage1 = new Intent(ResetPw.this, Login.class);
                    startActivity(openPage1);
                }
                }
        });
    }
}