package com.example.lab5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Integer> numberList=new ArrayList<Integer>();
    ArrayList<String> operandList=new ArrayList<String>();
    int temp1;
    int temp2;
    int ans;
    String op;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void myToast(View view)
    {
        Toast t = Toast.makeText(this,"hello",Toast.LENGTH_LONG);
        t.setGravity(Gravity.CENTER_VERTICAL,0,0);
        t.show();
    }

    public void button7(View view) {
        TextView result=findViewById(R.id.result_text_view);
        if(result.getText().toString().equals("0"))
        {
            result.setText("7");
            ans=Integer.parseInt(result.getText().toString());
        }
        else
        {
            result.append("7");
            ans=Integer.parseInt(result.getText().toString());
        }
    }

    public void button8(View view)
    {
        TextView result=findViewById(R.id.result_text_view);
        if(result.getText().toString().equals("0"))
        {
            result.setText("8");
            temp2=Integer.parseInt(result.getText().toString());
        }
        else
        {
            result.append("8");
            String str=result.getText().toString();
            int index=str.indexOf('*');
            temp2=Integer.parseInt(str.substring(index+1));
        }
    }

    public void button9(View view) {
    }

    public void buttonDivide(View view) {
    }

    public void button6(View view) {
    }

    public void button5(View view) {
    }

    public void button4(View view) {
    }

    public void buttonMultiply(View view)
    {
        TextView result=findViewById(R.id.result_text_view);
        if(result.getText().toString().equals("0"))
        {
            result.setText("*");
            op="*";
        }
        else
        {
            result.append("*");
            op="*";
        }
    }

    public void button3(View view) {
    }

    public void button2(View view) {
    }

    public void button1(View view) {
    }

    public void buttonEqual(View view)
    {
        TextView result=findViewById(R.id.result_text_view);
        if(op.equals("*"))
        {
            ans=ans*temp2;
        }
        result.setText(Integer.toString(ans));
    }

    public void buttonSubtract(View view) {
    }

    public void buttonClear(View view) {
    }

    public void button0(View view) {
    }

    public void buttonAdd(View view) {
    }
}
