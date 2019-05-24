package com.example.quizmaster;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Question1 extends AppCompatActivity {
    RadioButton radio1;
    RadioButton radio2;
    RadioButton radio3;
    RadioButton radio4;
    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question1);
        radio1=findViewById(R.id.q1radio1);
        radio2=findViewById(R.id.q1radio2);
        radio3=findViewById(R.id.q1radio3);
        radio4=findViewById(R.id.q1radio4);
    }

    public void question2(View view) {
        if(radio1.isChecked())
        {
            i=new Intent(getApplicationContext(),Question2.class);
            i.putExtra("answer1",radio1.getText().toString());
            startActivity(i);
        }
        else if(radio2.isChecked())
        {
            i=new Intent(getApplicationContext(),Question2.class);
            i.putExtra("answer1",radio2.getText().toString());
            startActivity(i);
        }
        else if(radio3.isChecked())
        {
            i=new Intent(getApplicationContext(),Question2.class);
            i.putExtra("answer1",radio3.getText().toString());
            startActivity(i);
        }
        else
        {
            i=new Intent(getApplicationContext(),Question2.class);
            i.putExtra("answer1",radio4.getText().toString());
            startActivity(i);
        }
    }
}
