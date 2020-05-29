package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private double firstNum = 0, secondNum = 0;
    private String symb = "";

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
        final Button multiplyButton = findViewById(R.id.multiplication);
        final Button deleteButton = findViewById(R.id.deletetext);
        final Button clearButton = findViewById(R.id.cleareverything);

    final View.OnClickListener calculatorclickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            final int id = view.getId();
            switch (id)
            {
                case R.id.num0:
                    calculatorScreen.append("0");
                    break;
                case R.id.num1:
                    calculatorScreen.append("1");
                    break;
                case R.id.num2:
                    calculatorScreen.append("2");
                    break;
                case R.id.num3:
                    calculatorScreen.append("3");
                    break;
                case R.id.num4:
                    calculatorScreen.append("4");
                    break;
                case R.id.num5:
                    calculatorScreen.append("5");
                    break;
                case R.id.num6:
                    calculatorScreen.append("6");
                    break;
                case R.id.num7:
                    calculatorScreen.append("7");
                    break;
                case R.id.num8:
                    calculatorScreen.append("8");
                    break;
                case R.id.num9:
                    calculatorScreen.append("9");
                    break;
                case R.id.addition:
                    symb ="+";
                    calculatorScreen.append(symb);

                    break;
                case R.id.subtraction:
                    symb = "-";
                    calculatorScreen.append(symb);
                    break;
                case R.id.division:
                    symb = "/";
                    calculatorScreen.append(symb);
                    //calculatorScreen.setText(Double.toString(secondNum));
                    break;
                case R.id.multiplication:
                    symb = "*";
                    calculatorScreen.append(symb);
                    break;
                case R.id.modulo:
                    symb = "%";
                    calculatorScreen.append(symb);
                    break;
                case R.id.equal:
                   if(calculatorScreen.getText().toString().equals("")|| calculatorScreen.getText() == null) {
                       calculatorScreen.setText("");
                   }
                    if (symb.equals("+"))
                    {
                        splitter(calculatorScreen,symb);
                        double result = firstNum + secondNum;
                        calculatorScreen.setText(Double.toString(result));
                    }

                    if (symb.equals("-"))
                    {
                        splitter(calculatorScreen,symb);
                        double result = firstNum - secondNum;
                        calculatorScreen.setText(Double.toString(result));
                    }
                    if (symb.equals("*"))
                    {
                        splitter(calculatorScreen,symb);
                        double result = firstNum * secondNum;
                        calculatorScreen.setText(Double.toString(result));
                    }
                    if (symb.equals("/"))
                    {
                        splitter(calculatorScreen,symb);
                        double result = firstNum / secondNum;
                        calculatorScreen.setText(Double.toString(result));
                    }
                    break;

            }

        }

        private void splitter(TextView calculatorScreen,String Symb) {
            String fromScreen = calculatorScreen.getText().toString();
           // String regex = "\\"+Symb;
            if(Symb.equals("+")){
                Symb = "\\+";
            }
            else if(Symb.equals("*")){
                Symb = "\\*";
            }

            String [] wordNumb = fromScreen.split(Symb, 2);
            //Not Completed yet !!!!!!!!!
            firstNum = Double.parseDouble(wordNumb[0].toString());
            secondNum = Double.parseDouble(wordNumb[1].toString());
        }
    };

        number0.setOnClickListener(calculatorclickListener);
        number1.setOnClickListener(calculatorclickListener);
        number2.setOnClickListener(calculatorclickListener);
        number3.setOnClickListener(calculatorclickListener);
        number4.setOnClickListener(calculatorclickListener);
        number5.setOnClickListener(calculatorclickListener);
        number6.setOnClickListener(calculatorclickListener);
        number7.setOnClickListener(calculatorclickListener);
        number8.setOnClickListener(calculatorclickListener);
        number9.setOnClickListener(calculatorclickListener);
        addButton.setOnClickListener(calculatorclickListener);
        subButton.setOnClickListener(calculatorclickListener);
        multiplyButton.setOnClickListener(calculatorclickListener);
        moduloButton.setOnClickListener(calculatorclickListener);
        divisionButton.setOnClickListener(calculatorclickListener);
        equalButton.setOnClickListener(calculatorclickListener);

        deleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               //get the numbers from the screen and place into string
                String displayNum = calculatorScreen.getText().toString();
                int length = displayNum.length();
                if(length > 0 ){
                    displayNum = displayNum.substring(0,length-1);
                    calculatorScreen.setText(displayNum);
                }
            }
        });

        //Deleting everything from the screen
        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculatorScreen.setText("");

            }
        });


    }// End of Oncreate Bundle


}// end of main class
