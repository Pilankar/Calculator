package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView Input;
    String inputentered = Input.getText().toString();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator);

        Input = findViewById(R.id.input);

    }

    public void no1(View view) {
        Input.setText(inputentered + "1");
    }
    public void no2(View view) {
        Input.setText(inputentered + "2");
    }
    public void no3(View view) {
        Input.setText(inputentered + "3");
    }
    public void no4(View view) {
        Input.setText(inputentered + "4");
    }
    public void no5(View view) {
        Input.setText(inputentered + "5");
    }
    public void no6(View view) {
        Input.setText(inputentered + "6");
    }
    public void no7(View view) {
        Input.setText(inputentered + "7");
    }
    public void no8(View view) {
        Input.setText(inputentered + "8");
    }
    public void no9(View view) {
        Input.setText(inputentered + "9");
    }
    public void plus_minus(View view) {
        Input.setText(inputentered + "-");
    }
    public void zero(View view) {
        Input.setText(inputentered + "0");
    }
    public void addition(View view) {
        Input.setText(inputentered + "+");
    }
    public void sub(View view) {
        Input.setText(inputentered + "-");
    }
    public void division(View view) {
        Input.setText(inputentered + "/");
    }
    public void multiply(View view) {
        Input.setText(inputentered + "x");
    }
    public void dot(View view) {
        Input.setText(inputentered + ".");
    }
    public void equals(View view) {
        Input.setText(inputentered + "=");
    }
    public void brackets(View view) {
        Input.setText(inputentered + "(");
    }
    public void clear(View view) {
        inputentered = "";
        Input.setText(inputentered + "0");
    }
    public void percentage(View view) {
        Input.setText(inputentered + "%");
    }

}
