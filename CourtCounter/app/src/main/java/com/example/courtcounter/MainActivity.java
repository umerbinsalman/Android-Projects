package com.example.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int scoreA=0;
    int scoreB=0;

    public void updateScoreA(int scoreA)
    {
        TextView scoreViewA=findViewById(R.id.teama_score_view);
        scoreViewA.setText(""+scoreA);
    }

    public void updateScoreB(int scoreB)
    {
        TextView scoreViewB=findViewById(R.id.teamb_score_view);
        scoreViewB.setText(""+scoreB);
    }

    public void add3a(View view)
    {
        scoreA+=3;
        updateScoreA(scoreA);
    }

    public void add2a(View view)
    {
        scoreA+=2;
        updateScoreA(scoreA);
    }

    public void add1a(View view)
    {
        scoreA++;
        updateScoreA(scoreA);
    }

    public void add3b(View view)
    {
        scoreB+=3;
        updateScoreB(scoreB);
    }

    public void add2b(View view)
    {
        scoreB+=2;
        updateScoreB(scoreB);
    }

    public void add1b(View view)
    {
        scoreB++;
        updateScoreB(scoreB);
    }

    public void reset(View view)
    {
        scoreA=0;
        scoreB=0;
        updateScoreA(scoreA);
        updateScoreB(scoreB);
    }
}
