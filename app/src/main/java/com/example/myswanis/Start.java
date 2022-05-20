package com.example.myswanis;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.myswanis.Login;
import com.example.myswanis.R;

public class Start extends Activity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        ImageButton on = (ImageButton)findViewById(R.id.entra);
        ImageButton on1 = (ImageButton)findViewById(R.id.entra1);

    on.setOnClickListener(
            new ImageButton.OnClickListener() {
    public void onClick(View v) {
        Intent openPage2 = new Intent(Start.this,Login.class);
        startActivity(openPage2);
    }
});

        on1.setOnClickListener(
                new ImageButton.OnClickListener() {
                    public void onClick(View v) {
                        Intent openPage2 = new Intent(Start.this,Login.class);
                        startActivity(openPage2);
                    }
                });
}
}