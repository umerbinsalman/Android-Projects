package com.example.quizmaster;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class Question2 extends AppCompatActivity {
    String answer1;
    RadioButton radio1;
    RadioButton radio2;
    RadioButton radio3;
    RadioButton radio4;
    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);
        Bundle bundle=getIntent().getExtras();
        answer1=bundle.getString("answer1");
        radio1=findViewById(R.id.q2radio1);
        radio2=findViewById(R.id.q2radio2);
        radio3=findViewById(R.id.q2radio3);
        radio4=findViewById(R.id.q2radio4);
        Toast.makeText(getApplicationContext(),answer1,Toast.LENGTH_LONG).show();
    }

    public void question3(View view) {
        if(radio1.isChecked())
        {
            i=new Intent(getApplicationContext(),Question3.class);
            i.putExtra("answer1",answer1);
            i.putExtra("answer2",radio1.getText().toString());
            startActivity(i);
        }
        else if(radio2.isChecked())
        {
            i=new Intent(getApplicationContext(),Question3.class);
            i.putExtra("answer1",answer1);
            i.putExtra("answer2",radio2.getText().toString());
            startActivity(i);
        }
        else if(radio3.isChecked())
        {
            i=new Intent(getApplicationContext(),Question3.class);
            i.putExtra("answer1",answer1);
            i.putExtra("answer2",radio3.getText().toString());
            startActivity(i);
        }
        else
        {
            i=new Intent(getApplicationContext(),Question3.class);
            i.putExtra("answer1",answer1);
            i.putExtra("answer2",radio4.getText().toString());
            startActivity(i);
        }
    }
}
