package com.example.charactercreator;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import com.squareup.picasso.Picasso;
import java.io.InputStream;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

Button buttonSave;
Spinner spinnerRace;
EditText editTextName;
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

        imageViewLooks = findViewById(R.id.imageViewLooks);

        String imageUrl = "https://www.dndbeyond.com/avatars/thumbnails/6/254/420/618/636271781394265550.png";

        Picasso.get().load(imageUrl).into(imageViewLooks);

        setupbuttonSave();
        setupSpinnerRace();
    }


    private void callArray() {
        String raceImage[] = getResources().getStringArray(R.array.raceimage_array);
    }

    private void setupSpinnerRace() {
        spinnerRace = (Spinner) findViewById(R.id.spinnerRace);
        String raceName[] = getResources().getStringArray(R.array.racename_array);
        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, raceName);
        itemsAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerRace.setAdapter(itemsAdapter);

        spinnerRace.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }


    private void setupbuttonSave() {
        buttonSave = findViewById(R.id.buttonSave);

        buttonSave.setOnClickListener(new View.OnClickListener()
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