package com.example.quizmaster;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Result extends AppCompatActivity {
    int count=0;
    String ans1="12";
    String ans2="7";
    String ans3="365";
    String ans4="4";
    String ans5="7";
    String ans6="Saturday";
    String ans7="26";
    String ans8="Nose";
    String ans9="Mars";
    String answer1;
    String answer2;
    String answer3;
    String answer4;
    String answer5;
    String answer6;
    String answer7;
    String answer8;
    String answer9;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Bundle bundle=getIntent().getExtras();
        answer1=bundle.getString("answer1");
        answer2=bundle.getString("answer2");
        answer3=bundle.getString("answer3");
        answer4=bundle.getString("answer4");
        answer5=bundle.getString("answer5");
        answer6=bundle.getString("answer6");
        answer7=bundle.getString("answer7");
        answer8=bundle.getString("answer8");
        answer9=bundle.getString("answer9");
        calculateResult();
    }

    public void calculateResult()
    {
        if(ans1.equals(answer1))
            count++;
        if(ans2.equals(answer2))
            count++;
        if(ans3.equals(answer3))
            count++;
        if(ans4.equals(answer4))
            count++;
        if(ans5.equals(answer5))
            count++;
        if(ans6.equals(answer6))
            count++;
        if(ans7.equals(answer7))
            count++;
        if(ans8.equals(answer8))
            count++;
        if(ans9.equals(answer9))
            count++;
        result=findViewById(R.id.result);
        result.setText(count);
    }
}
