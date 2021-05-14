package com.example.uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(getIntent().hasExtra("com.example.uts.money")) {
            TextView number = (TextView)findViewById(R.id.saldoView);
            Integer text = getIntent().getExtras().getInt("com.example.uts.money");
            number.setText("Rp. " + text);
        } else {
            TextView number = (TextView)findViewById(R.id.saldoView);
            number.setText("Rp. 0");
        }

        Button orderList = (Button)findViewById(R.id.orderBtn);
        orderList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startOrder = new Intent(getApplicationContext(), MyOrder.class);
                startActivity(startOrder);
            }
        });
        Button drinkList = (Button)findViewById(R.id.drinkBtn);
        drinkList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startDrink = new Intent(getApplicationContext(), Drink.class);
                startActivity(startDrink);
            }
        });
        Button foodList = (Button)findViewById(R.id.foodBtn);
        foodList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startFood = new Intent(getApplicationContext(), Food.class);
                startActivity(startFood);
            }
        });
        Button snackList = (Button)findViewById(R.id.snackBtn);
        snackList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startSnack = new Intent(getApplicationContext(), Snack.class);
                startActivity(startSnack);
            }
        });
        Button topUp = (Button)findViewById(R.id.topupBtn);
        topUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startTop = new Intent(getApplicationContext(), TopUp.class);
                startActivity(startTop);
            }
        });
        Button real = (Button)findViewById(R.id.realBtn);
        real.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startReal = new Intent(getApplicationContext(), Real.class);
                startActivity(startReal);
            }
        });
        Button map = (Button)findViewById(R.id.mapBtn);
        real.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startMap = new Intent(getApplicationContext(), Peta.class);
                startActivity(startMap);
            }
        });
    }
}