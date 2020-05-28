package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mylinearlayout);

        final TextView calculatorScreen = findViewById(R.id.calcScreen);
        final Button number1 = findViewById(R.id.num1);
        final Button number2 = findViewById(R.id.num2);
        final Button number3 = findViewById(R.id.num3);
        final Button number4 = findViewById(R.id.num4);
        final Button number5 = findViewById(R.id.num5);
        final Button number6 = findViewById(R.id.num6);
        final Button number7 = findViewById(R.id.num7);
        final Button number8 = findViewById(R.id.num8);
        final Button number9 = findViewById(R.id.num9);
        final Button number0 = findViewById(R.id.num0);
        final Button addButton = findViewById(R.id.addition);
        final Button subButton = findViewById(R.id.subtraction);
        final Button divisionButton = findViewById(R.id.division);
        final Button moduloButton = findViewById(R.id.modulo);
        final Button equalButton = findViewById(R.id.equal);
        final Button multiplyButton = findViewById(R.id.num1);




    }// End of Oncreate Bundle


}// end of main class
