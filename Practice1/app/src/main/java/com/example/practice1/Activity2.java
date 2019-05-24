package com.example.practice1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Activity2 extends AppCompatActivity {
EditText edit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        edit=findViewById(R.id.edittext2);
    }

    public void sendData(View view)
    {
        MyClass obj=new MyClass();
        obj.message=edit.getText().toString();
        Intent i=getIntent();
        i.putExtra("message",obj);
        setResult(Activity2.RESULT_OK,i);
        finish();
    }
}
