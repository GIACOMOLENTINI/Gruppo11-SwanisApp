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

import com.google.android.gms.common.api.Response;

public class CompilaClass extends AppCompatActivity {

    private static final int PHOTO_REQUEST_CODE = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.compila_layout);
        Button button3 = (Button)findViewById(R.id.button);
        Button btn2 = (Button) findViewById(R.id.button2);
        ImageButton button4 = (ImageButton)findViewById(R.id.imageButton20);
        ImageButton button5 = (ImageButton)findViewById(R.id.imageButton21);
        ImageButton button6 = (ImageButton)findViewById(R.id.imageButton22);
        ImageButton button7 = (ImageButton)findViewById(R.id.imageButton8);
        ImageView foto = (ImageView)findViewById(R.id.imageView2);
        ImageView utente = (ImageView)findViewById(R.id.imageView);
        utente.setImageResource(R.drawable.francesco);
        TextView person = (TextView)findViewById(R.id.textView4);
        person.setText("FRANCESCO");

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
        button7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent selectImage = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                startActivityForResult(selectImage, 1);
            }
            protected void onActivityResult(int requestCode, int resultCode, Intent data) {
                if (requestCode == 1) {
                    Uri selImg = data.getData();
                    String[]filePath = {MediaStore.Images.Media.DATA};
                    Cursor c = getContentResolver().query(selImg, filePath, null, null, null);
                    c.moveToFirst();
                    int columnIndex = c.getColumnIndex(filePath[0]);
                    String picPath = c.getString(columnIndex);
                    Bitmap pic = (BitmapFactory.decodeFile(picPath));
                    foto.setImageBitmap(pic);
                    c.close();
                }
            }
        });
    }
}