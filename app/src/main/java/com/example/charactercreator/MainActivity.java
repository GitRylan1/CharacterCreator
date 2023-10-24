package com.example.charactercreator;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.InputStream;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

Button buttonRandom;
EditText editTextName;
EditText editTextRace;
EditText editTextAge;
EditText editTextGender;
EditText editTextAlign;
EditText editTextClass;
TextView textViewName;
TextView textViewRace;
TextView textViewAge;
TextView textViewGender;
TextView textViewAlign;
TextView textViewClass;
TextView textViewLooks;
ImageView imageViewLooks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupbuttonRandom();
    }

    private void setupbuttonRandom() {
        buttonRandom = findViewById(R.id.buttonRandom);

        buttonRandom.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {

            }
        });
    }
    public static Drawable LoadLooks(String url) {
        try {
            InputStream is = (InputStream) new URL(url).getContent();
            Drawable d = Drawable.createFromStream(is, "src name");
            return d;
        } catch (Exception e) {
            return null;
        }
    }
}