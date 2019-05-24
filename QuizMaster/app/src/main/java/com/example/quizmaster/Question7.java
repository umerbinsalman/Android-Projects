package com.example.quizmaster;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Question7 extends AppCompatActivity {
    String answer1;
    String answer2;
    String answer3;
    String answer4;
    String answer5;
    String answer6;
    Intent i;
    RadioButton radio1;
    RadioButton radio2;
    RadioButton radio3;
    RadioButton radio4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question7);
        Bundle bundle=getIntent().getExtras();
        answer1=bundle.getString("answer1");
        answer2=bundle.getString("answer2");
        answer3=bundle.getString("answer3");
        answer4=bundle.getString("answer4");
        answer5=bundle.getString("answer5");
        answer6=bundle.getString("answer6");
        radio1=findViewById(R.id.q7radio1);
        radio2=findViewById(R.id.q7radio2);
        radio3=findViewById(R.id.q7radio3);
        radio4=findViewById(R.id.q7radio4);
    }

    public void question8(View view) {
        if(radio1.isChecked())
        {
            i=new Intent(getApplicationContext(),Question8.class);
            i.putExtra("answer1",answer1);
            i.putExtra("answer2",answer2);
            i.putExtra("answer3",answer3);
            i.putExtra("answer4",answer4);
            i.putExtra("answer5",answer5);
            i.putExtra("answer6",answer6);
            i.putExtra("answer7",radio1.getText().toString());
            startActivity(i);
        }
        else if(radio2.isChecked())
        {
            i=new Intent(getApplicationContext(),Question8.class);
            i.putExtra("answer1",answer1);
            i.putExtra("answer2",answer2);
            i.putExtra("answer3",answer3);
            i.putExtra("answer4",answer4);
            i.putExtra("answer5",answer5);
            i.putExtra("answer6",answer6);
            i.putExtra("answer7",radio2.getText().toString());
            startActivity(i);
        }
        else if(radio3.isChecked())
        {
            i=new Intent(getApplicationContext(),Question8.class);
            i.putExtra("answer1",answer1);
            i.putExtra("answer2",answer2);
            i.putExtra("answer3",answer3);
            i.putExtra("answer4",answer4);
            i.putExtra("answer5",answer5);
            i.putExtra("answer6",answer6);
            i.putExtra("answer7",radio3.getText().toString());
            startActivity(i);
        }
        else
        {
            i=new Intent(getApplicationContext(),Question8.class);
            i.putExtra("answer1",answer1);
            i.putExtra("answer2",answer2);
            i.putExtra("answer3",answer3);
            i.putExtra("answer4",answer4);
            i.putExtra("answer5",answer5);
            i.putExtra("answer6",answer6);
            i.putExtra("answer7",radio4.getText().toString());
            startActivity(i);
        }
    }
}
