package com.example.practice1;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Intent i;
    EditText edit;
    TextView text;
    String text1;
    public static final String SHARED_PREFS="sharedPref";
    public static final String TEXT="text";
    BroadcastReceiver receiver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text=findViewById(R.id.textview1);
        edit=findViewById(R.id.edittext1);
        loadData();
        updateView();
        configureReceiver();
    }

    public void goToSecondActivity(View view)
    {
        i=new Intent(getApplicationContext(),Activity2.class);
        startActivityForResult(i,1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data)
    {
        MyClass obj=(MyClass)data.getSerializableExtra("message");
        edit.setText(obj.message);
        saveData(obj.message);
    }

    public void loadData()
    {
        SharedPreferences sp=getSharedPreferences(SHARED_PREFS,MODE_PRIVATE);
        text1=sp.getString(TEXT,"");
    }
    public void updateView()
    {
        edit.setText(text1);
    }
    public void saveData(String data)
    {
        SharedPreferences sp= getSharedPreferences(SHARED_PREFS,MODE_PRIVATE);
        SharedPreferences.Editor editor=sp.edit();
        editor.putString(TEXT,data);
        editor.apply();
        Toast.makeText(getApplicationContext(),"Data Saved",Toast.LENGTH_LONG).show();
    }

    public void configureReceiver()
    {
        IntentFilter filter=new IntentFilter();
        filter.addAction("lab10");
        receiver=new MyReceiver();
        registerReceiver(receiver,filter);
    }

    public void loadDataFromBroadCastReceiver(View view)
    {
        text.setText(MyReceiver.message);
    }
}
