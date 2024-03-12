package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;
import android.widget.TextView;

public class CalorieTracker extends AppCompatActivity {
    public final static String CURRENT_CALORIES = "com.example.fitnessapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calorie_tracker);
        ((TextView)findViewById(R.id.CaloriesNumber)).setText(calDisp);
    }
    public int CaloriesTracked; //Sets int for tracking calories
    public String calDisp;
    public void MainMenuB(View v){
        Intent MainMenuC = new Intent(this, MainActivity.class);
        startActivity(MainMenuC);
        MainMenuC.putExtra(CURRENT_CALORIES, calDisp);
        //This is for the main menu button
    }
    public void CaloriesEntered (View v){
        //This adds the calories together and display them when entered by a user
        EditText calView = findViewById(R.id.CaloriesInput);
        String input = calView.getText().toString();
        int actualOutput = Integer.parseInt(input);
        //Reads the entered value then converts it into an integer value
        CaloriesTracked = CaloriesTracked + actualOutput;
        calDisp = String.valueOf(CaloriesTracked);
        ((TextView)findViewById(R.id.CaloriesNumber)).setText(calDisp);

        Log.v("info", "Num = " + calDisp);


    }

}