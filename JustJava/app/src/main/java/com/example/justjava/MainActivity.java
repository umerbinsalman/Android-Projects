package com.example.justjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int quantity=2;

    public void increment(View view)
    {
        quantity++;
        displayQuantity(quantity);
//        displayPrice(quantity*5);
    }

    public void decrement(View view)
    {
        if(quantity>0)
        {
            quantity--;
            displayQuantity(quantity);
//            displayPrice(quantity*5);
        }
    }

    public void submitOrder(View view)
    {
//        displayQuantity(quantity);
//        displayPrice(quantity*5);
        displayMessage("Total: $"+quantity*5+"\nThank You!");
    }

    public void displayQuantity(int number)
    {
        TextView quantityTextView = findViewById(R.id.quantity_text_view);
        quantityTextView.setText(""+number);
    }

    public void displayPrice(int number)
    {
        TextView priceTextView = findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

    public void displayMessage(String message)
    {
        TextView priceTextView=findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }
}
