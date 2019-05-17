package com.example.lab6;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SummaryActivity extends AppCompatActivity {
    String name;
    String pass;
    TextView summaryTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);
        summaryTextView=(TextView)findViewById(R.id.summary);
        Intent i=getIntent();
        name=i.getStringExtra("username");
        pass=i.getStringExtra("password");
        if(name.equals("umer") && pass.equals("secret"))
            summaryTextView.setText("login Successfull");
        else
            summaryTextView.setText("incorrect Credentials");
    }
}
