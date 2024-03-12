package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;
import android.widget.TextView;
import android.content.SharedPreferences;

public class CalorieTracker extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calorie_tracker);
        SharedPreferences pref1 = getPreferences((Context.MODE_PRIVATE));
        CaloriesTracked = pref1.getInt("saved_calories_tracked", defaultVal);
        //uses Shared Preferences to keep track of the calories counter after the activity ends
    }

    public int CaloriesTracked; //Sets int for tracking calories
    public int defaultVal = 1;
    public String calDisp;

    public void MainMenuB(View v){
        SharedPreferences sharedPref = getPreferences(Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt("saved_calories_tracked", CaloriesTracked);
        editor.apply();
        //Adds the current calories tracked to the preferences database
        //int dispCalls = sharedPref.getInt("saved_calories_tracked", defaultVal);
        //Log.d("info", "num1 = " + dispCalls );
        //The above checks if it is storing the calories properly
        Intent MainMenuC = new Intent(this, MainActivity.class);
        startActivity(MainMenuC);
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

        Log.d("info", "Num = " + calDisp);


    }

}