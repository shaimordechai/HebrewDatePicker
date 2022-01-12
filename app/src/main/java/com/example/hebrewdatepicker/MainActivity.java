package com.example.hebrewdatepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String[] ARRAY_WITH_TEXT = {"1", "2"} ;
    private GridLayout gridLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*gridLayout = findViewById(R.id.month);
        for (int i = 0; i < 15 ; i++) {
            TextView textView = new TextView(this);
            textView.setText("shai");
            gridLayout.addView(textView);
        }*/

    }
}