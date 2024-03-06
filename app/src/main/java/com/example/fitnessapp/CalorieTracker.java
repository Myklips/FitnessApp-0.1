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
    public int CaloriesTracked;
    public void MainMenuB(View v){
        Intent MainMenuC = new Intent(this, MainActivity.class);
        startActivity(MainMenuC);

    }
}