package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class WorkoutsPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workouts_page);
    }

    public void MainMenuB(View v){

        Intent MainMenuC = new Intent(this, MainActivity.class);
        startActivity(MainMenuC);
        //This is for the main menu button
    }

    public void ArmsClicked(View v){
        Intent ArmsPage = new Intent(this, WorkoutDisplay.class);
        startActivity(ArmsPage);
    }
}