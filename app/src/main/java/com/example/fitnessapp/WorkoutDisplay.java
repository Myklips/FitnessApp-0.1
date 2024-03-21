package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.view.View;
import android.os.Bundle;
import android.content.Intent;
import android.widget.ImageView;
import android.widget.TextView;

public class WorkoutDisplay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout_display);
        Intent intent = getIntent();
        String Choice = intent.getStringExtra(WorkoutsPage.OPTION_PICKED);
        Log.d("info", "" + Choice);
        if (Choice.equals("ARMS")){
            ((ImageView)findViewById(R.id.imageView)).setImageResource(R.drawable.tricep_dip);
            ((ImageView)findViewById(R.id.imageView2)).setImageResource(R.drawable.bicepcurls);
            ((TextView)findViewById(R.id.textView2)).setText("Arms Workouts");
            ((TextView)findViewById(R.id.textView4)).setText("Tricep Dips");
            ((TextView)findViewById(R.id.textView5)).setText("Bicep Curls");
            //These change the text and images depending on what the user clicked on
        }
        else if(Choice.equals("UPPER")){
            ((ImageView)findViewById(R.id.imageView)).setImageResource(R.drawable.pushups);
            ((ImageView)findViewById(R.id.imageView2)).setImageResource(R.drawable.situps);
            ((TextView)findViewById(R.id.textView2)).setText("Upper Body Workouts");
            ((TextView)findViewById(R.id.textView4)).setText("Push-Ups");
            ((TextView)findViewById(R.id.textView5)).setText("Sit-Ups");
        }
        else if(Choice.equals("LOWER")){
            ((ImageView)findViewById(R.id.imageView)).setImageResource(R.drawable.squats);
            ((ImageView)findViewById(R.id.imageView2)).setImageResource(R.drawable.lunges);
            ((TextView)findViewById(R.id.textView2)).setText("Leg Workouts");
            ((TextView)findViewById(R.id.textView4)).setText("Squats");
            ((TextView)findViewById(R.id.textView5)).setText("Lunges");
        }
    }

    public void MainMenuC(View v){

        Intent MainMenuC = new Intent(this, WorkoutsPage.class);
        startActivity(MainMenuC);
        //This is for the main menu button
    }


    //((ImageView)findViewById(R.id.imageView)).setImageResource(R.drawable.bicepcurls);


}