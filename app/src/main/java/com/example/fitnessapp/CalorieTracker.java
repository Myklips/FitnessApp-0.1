package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class CalorieTracker extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calorie_tracker);
    }
    public int CaloriesTracked; //Sets int for tracking calories
    public void MainMenuB(View v){
        Intent MainMenuC = new Intent(this, MainActivity.class);
        startActivity(MainMenuC);
        //This is for the main menu button
    }
    public void CaloriesEntered (View v){
        //This is going to add the calories together and display them when entered by a user

    }

}