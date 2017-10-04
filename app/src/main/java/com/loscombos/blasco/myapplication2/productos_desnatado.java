package com.loscombos.blasco.myapplication2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class productos_desnatado extends AppCompatActivity {

    int quantity = 1;
    double price = 0.35;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productos_desnatado);
    }
    public void decrease(View view) {
        if (quantity <= 0) {
            quantity = 0;
            display(0);
            displayPrice(0);
        } else {
            quantity--;
            display(quantity);
            displayPrice(quantity * price);
        }
    }

    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }


    private void displayPrice(double number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

    public void increase(View view) {
        quantity++;
        display(quantity);
        displayPrice(quantity * price);
    }
}
