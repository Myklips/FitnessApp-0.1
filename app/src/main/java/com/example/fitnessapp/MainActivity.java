package com.example.fitnessapp;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void CalorieClicked(View view){
        Intent CalorieCounterClick = new Intent(this, CalorieTracker.class);
        startActivity(CalorieCounterClick);
        //This is to change over to the Calorie Tracker
    }

    public void WorkoutsClicked(View view){
        Intent WorkoutsPageClicked = new Intent(this, WorkoutsPage.class);
        startActivity(WorkoutsPageClicked);
    }
}