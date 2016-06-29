package com.example.codycondon.flaborfit;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;


public class SettingsActivity extends AppCompatActivity {

    RelativeLayout nightBtn = (RelativeLayout)findViewById(R.id.nightBtn);
    //details activity backgroundc
    LinearLayout mainBG = (LinearLayout)findViewById(R.id.mainBG);
    //main activity 3 backgrounds
    RelativeLayout weightBtn = (RelativeLayout)findViewById(R.id.weightBtn);
    RelativeLayout yogaBtn = (RelativeLayout)findViewById(R.id.yogaBtn);
    RelativeLayout cardioBtn = (RelativeLayout)findViewById(R.id.cardioBtn);
    RelativeLayout gearBtn = (RelativeLayout)findViewById(R.id.gearBtn);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        Intent intent = getIntent();
        nightBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nightBtn.setBackgroundColor(Color.parseColor("#737272"));
                weightBtn.setBackgroundColor(Color.parseColor("#737272"));
                yogaBtn.setBackgroundColor(Color.parseColor("#737272"));
                cardioBtn.setBackgroundColor(Color.parseColor("#737272"));
                gearBtn.setBackgroundColor(Color.parseColor("#737272"));
                mainBG.setBackgroundColor(Color.parseColor("#737272"));

            }
        });
    }

}
