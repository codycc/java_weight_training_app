package com.example.codycondon.flaborfit;

import android.content.Intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_ITEM_TITLE = "extra.item.title";
    public static final String EXERCISE_WEIGHTS = "Weight lifting";
    public static final String EXERCISE_YOGA = "Yoga";
    public static final String EXERCISE_CARDIO = "Cardio";


    public RelativeLayout weightBtn;
    public RelativeLayout yogaBtn;
    public RelativeLayout cardioBtn;
    public RelativeLayout gearBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        weightBtn = (RelativeLayout)findViewById(R.id.weightBtn);
        yogaBtn = (RelativeLayout)findViewById(R.id.yogaBtn);
        cardioBtn = (RelativeLayout)findViewById(R.id.cardioBtn);
        gearBtn = (RelativeLayout)findViewById(R.id.gearBtn);

        weightBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadDetailActivity(MainActivity.EXERCISE_WEIGHTS);
            }
        });

        yogaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadDetailActivity(MainActivity.EXERCISE_YOGA);
            }
        });

        cardioBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadDetailActivity(MainActivity.EXERCISE_CARDIO);
            }
        });

        gearBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadSettingsActivity();
            }
        });
    }

    private void loadDetailActivity(String exerciseTitle) {
        Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
        //bringing info over to detail activity
        intent.putExtra(MainActivity.EXTRA_ITEM_TITLE, exerciseTitle);
        startActivity(intent);
    }

    public void loadSettingsActivity() {
        Intent intent2 = new Intent(MainActivity.this, SettingsActivity.class);
        startActivity(intent2);

    }



}
