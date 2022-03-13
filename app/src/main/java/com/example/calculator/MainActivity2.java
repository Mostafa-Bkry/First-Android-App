package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity2 extends AppCompatActivity {

    int firstNum, secondNum, calc;
    Double fiNum, secNum, doubleCalc;
    EditText firstText, secondText;
    Button add, sub, mul, div;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        firstText = findViewById(R.id.firstNumber);
        secondText = findViewById(R.id.secondNumber);
        add = findViewById(R.id.add);
        sub = findViewById(R.id.sub);
        mul = findViewById(R.id.mul);
        div = findViewById(R.id.div);
        result = findViewById(R.id.result);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firstNum = Integer.parseInt(firstText.getText().toString());
                secondNum = Integer.parseInt(secondText.getText().toString());
                calc = firstNum + secondNum;
                result.setText(String.valueOf(calc));
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firstNum = Integer.parseInt(firstText.getText().toString());
                secondNum = Integer.parseInt(secondText.getText().toString());
                calc = firstNum - secondNum;
                result.setText(String.valueOf(calc));
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firstNum = Integer.parseInt(firstText.getText().toString());
                secondNum = Integer.parseInt(secondText.getText().toString());
                calc = firstNum * secondNum;
                result.setText(String.valueOf(calc));
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fiNum = Double.parseDouble(firstText.getText().toString());
                secNum = Double.parseDouble(secondText.getText().toString());
                doubleCalc = fiNum / secNum;
                result.setText(String.valueOf(doubleCalc));
            }
        });
    }
}