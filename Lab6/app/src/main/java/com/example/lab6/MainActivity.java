package com.example.lab6;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public String username;
    public String password;
    EditText passwordEditText;
    EditText usernameEditText;
    Button loginButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usernameEditText=(EditText)findViewById(R.id.usernameEdit);
        passwordEditText=(EditText)findViewById(R.id.passwordEdit);
        loginButton=(Button)findViewById(R.id.loginButton);
        loginButton.setEnabled(false);
        passwordEditText.setEnabled(false);

        usernameEditText.addTextChangedListener(usernameWatcher);
        passwordEditText.addTextChangedListener(passwordWatcher);
    }

    public final TextWatcher usernameWatcher =new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            passwordEditText.setEnabled(true);
        }

        @Override
        public void afterTextChanged(Editable s) {
            if(s.length()==0)
                passwordEditText.setEnabled(false);
            else
                username=(usernameEditText.getText().toString());
        }
    };

    public final TextWatcher passwordWatcher=new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            loginButton.setEnabled(true);
        }

        @Override
        public void afterTextChanged(Editable s) {
            if(s.length()==0)
                loginButton.setEnabled(false);
            else
            {
                loginButton.setEnabled(true);
                password=(passwordEditText.getText().toString());
            }
        }
    };

    public void login(View view)
    {
        Intent i=new Intent(getApplicationContext(),SummaryActivity.class);
        i.putExtra("username",username);
        i.putExtra("password",password);
        startActivity(i);
    }
}
