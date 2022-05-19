package com.example.myswanis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        TextView username =(TextView) findViewById(R.id.username);
        TextView password =(TextView) findViewById(R.id.password);
        Button forgot = (Button) findViewById(R.id.forgotpass);
        Button loginbtn = (Button) findViewById(R.id.loginbtn);
        Button signbtn = (Button) findViewById(R.id.signbtn);

        //admin and admin

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(username.getText().toString().equals("Flavia") && password.getText().toString().equals("flavia")){
                    //correct
                    Toast.makeText(Login.this,"LOGIN SUCCESSFUL!",Toast.LENGTH_LONG).show();
                    Intent openPage1 = new Intent(Login.this,MainActivity2.class);
                    startActivity(openPage1);
                } else if(username.getText().toString().equals("Francesco") && password.getText().toString().equals("francesco")) {
                    //correct
                    Toast.makeText(Login.this, "LOGIN SUCCESSFUL!", Toast.LENGTH_LONG).show();
                    Intent openPage2 = new Intent(Login.this, MainActivity.class);
                    startActivity(openPage2);
                } else
                    Toast.makeText(Login.this, "LOGIN FAILED!! TRY AGAIN", Toast.LENGTH_LONG).show();
            }
        });
        forgot.setOnClickListener(
                new ImageButton.OnClickListener() {
                    public void onClick(View v) {
                        Intent openPage2 = new Intent(Login.this,ResetPw.class);
                        startActivity(openPage2);
                    };
                });
        signbtn.setOnClickListener(
                new ImageButton.OnClickListener() {
                    public void onClick(View v) {
                        Intent openPage2 = new Intent(Login.this,CompilaReg.class);
                        startActivity(openPage2);
                    };
                });
    }
}