package com.example.root.calculadorareal;


import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;
import android.widget.EditText;


/*O App atual funciona com as 4 operações básicas porém sem trabalharem de forma combinatória
* ,ou seja, sem ordem de prioridade das operações.*/

public class Principal extends AppCompatActivity {

    Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9,
            buttonMultiply, buttonPlus, buttonMinus, buttonEqual, buttonSquared, buttonPercent,
            buttonComa, buttonClear;
    EditText InputExpression;
    Calculadora calc;



    public void initialize() {

        calc = new Calculadora();

        //InputTextField
        InputExpression = (EditText) findViewById(R.id.InputExpressionTextField);
        //Operands
        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        //Operators
        buttonMinus = (Button) findViewById(R.id.buttonMinus);
        buttonPlus = (Button) findViewById(R.id.buttonPlus);
        buttonEqual = (Button) findViewById(R.id.buttonEqual);
        buttonComa = (Button) findViewById(R.id.buttonComa);
        buttonPercent = (Button) findViewById(R.id.buttonPercent);
        buttonClear = (Button) findViewById(R.id.buttonClear);
        buttonMultiply = (Button) findViewById(R.id.buttonMultiply);
        buttonSquared = (Button) findViewById(R.id.buttonSquared);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        initialize();

    }


    public void insertNumber(View v) {

        switch (v.getId()) {
            case R.id.button0:
                InputExpression.setText(InputExpression.getText() + "0");
                break;
            case R.id.button1:
                InputExpression.setText(InputExpression.getText() + "1");
                break;
            case R.id.button2:
                InputExpression.setText(InputExpression.getText() + "2");
                break;
            case R.id.button3:
                InputExpression.setText(InputExpression.getText() + "3");
                break;
            case R.id.button4:
                InputExpression.setText(InputExpression.getText() + "4");
                break;
            case R.id.button5:
                InputExpression.setText(InputExpression.getText() + "5");
                break;
            case R.id.button6:
                InputExpression.setText(InputExpression.getText() + "6");
                break;
            case R.id.button7:
                InputExpression.setText(InputExpression.getText() + "7");
                break;
            case R.id.button8:
                InputExpression.setText(InputExpression.getText() + "8");
                break;
            case R.id.button9:
                InputExpression.setText(InputExpression.getText() + "9");
                break;
        }
        InputExpression.setSelection(InputExpression.getText().length());
    }

    public void insertOperator(View v) {
        switch (v.getId()) {
            case R.id.buttonPlus:
                calc.addOperator(InputExpression.getText().toString(), '+');
                InputExpression.setText(InputExpression.getText() + "+");
                break;
            case R.id.buttonMinus:
                calc.addOperator(InputExpression.getText().toString(), '-');
                InputExpression.setText(InputExpression.getText() + "-");
                break;
            case R.id.buttonDivision:
                calc.addOperator(InputExpression.getText().toString(), '/');
                InputExpression.setText(InputExpression.getText() + "/");
                break;
            case R.id.buttonMultiply:
                calc.addOperator(InputExpression.getText().toString(), 'x');
                InputExpression.setText(InputExpression.getText() + "x");
                break;

        }

    }

    public void selfOperations(View v) {
        switch (v.getId()) {
            case R.id.buttonClear:
                InputExpression.setText("");
                calc.clearCalc();
                calc.clearResult();
                break;
        }
    }

    public void calcOperation(View v) {
        calc.CalculateExpression(InputExpression.getText().toString());
        InputExpression.setText("");
        InputExpression.setText(Integer.toString(calc.result));
    }



}
