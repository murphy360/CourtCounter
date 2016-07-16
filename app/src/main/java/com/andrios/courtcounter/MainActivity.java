package com.andrios.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int teamAScore = 0;
    int teamBScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void touchDownA(View v){
        teamAScore = teamAScore + 6;
        updateScore();
    }

    public void patA(View v){
        teamAScore = teamAScore + 1;
        updateScore();
    }

    public void fieldGoalA(View v){
        teamAScore = teamAScore + 3;
        updateScore();
    }
    public void safetyA(View v){
        teamAScore = teamAScore + 2;
        updateScore();
    }

    public void touchDownB(View v){
        teamBScore = teamBScore + 6;
        updateScore();
    }

    public void patB(View v){
        teamBScore = teamBScore + 1;
        updateScore();
    }

    public void fieldGoalB(View v){
        teamBScore = teamBScore + 3;
        updateScore();
    }
    public void safetyB(View v){
        teamBScore = teamBScore + 2;
        updateScore();
    }

    public void reset(View v){
        teamAScore = 0;
        teamBScore = 0;
        updateScore();
    }


    public void updateScore(){
        TextView teamATextView = (TextView) findViewById(
                R.id.teamAScoreTextView);
        teamATextView.setText("" + teamAScore);

        TextView teamBTextView = (TextView) findViewById(
                R.id.teamBScoreTextView);
        teamBTextView.setText("" + teamBScore);
    }


}
