package com.example.myswanis;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ConfirmSegn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.segnal_confirm);

        ImageButton button4 = (ImageButton)findViewById(R.id.imageButton20);
        ImageButton button5 = (ImageButton)findViewById(R.id.imageButton21);
        ImageButton button6 = (ImageButton)findViewById(R.id.imageButton22);
        ImageButton button9 = (ImageButton)findViewById(R.id.btnDelete);

        button4.setOnClickListener(
                new ImageButton.OnClickListener() {
                    public void onClick(View v) {
                        Intent openPage2 = new Intent(ConfirmSegn.this,ProjectActivityManage.class);
                        startActivity(openPage2);
                    };
                });
        button5.setOnClickListener(
                new ImageButton.OnClickListener() {
                    public void onClick(View v) {
                        Intent openPage2 = new Intent(ConfirmSegn.this,MainActivity2.class);
                        startActivity(openPage2);
                    };
                });
        button6.setOnClickListener(
                new ImageButton.OnClickListener() {
                    public void onClick(View v) {
                        Intent openPage2 = new Intent(ConfirmSegn.this,MainActivity2.class);
                        startActivity(openPage2);
                    };
                });
        button9.setOnClickListener(
                new ImageButton.OnClickListener() {
                    public void onClick(View v) {
                        Toast.makeText(getApplicationContext(), "SEGNALAZIONE ELIMINATA CORRETTAMENTE!!!" , Toast.LENGTH_LONG).show();
                        Intent openPage2 = new Intent(ConfirmSegn.this, DeleteSegn.class);
                        startActivity(openPage2);
                    };
                });
    }
}