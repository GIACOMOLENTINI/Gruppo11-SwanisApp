package com.example.myswanis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CompilaClass extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.compila_layout);
        Button button3 = (Button)findViewById(R.id.button);


        button3.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent openPage3 = new Intent(CompilaClass.this,Pop1.class);
                        startActivity(openPage3);
                    };
                });
    }
}