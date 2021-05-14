package com.example.uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Real extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_real);

        Button backList = (Button)findViewById(R.id.backBtn);
        backList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moreOrder = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(moreOrder);
            }
        });

        Button addMoney = (Button)findViewById(R.id.addBtn);
        addMoney.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moreMoney = new Intent(getApplicationContext(), MainActivity.class);
                EditText getNum = (EditText)findViewById(R.id.numText);
                int num = Integer.parseInt(getNum.getText().toString());
                moreMoney.putExtra("com.example.uts.money", num);
                startActivity(moreMoney);
            }
        });
    }
}