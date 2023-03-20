package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    double all_result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView result = findViewById(R.id.result);
        EditText num1 = findViewById(R.id.num1);
        EditText num2 = findViewById(R.id.num2);
        Button sum = findViewById(R.id.add);
        Button sub = findViewById(R.id.sub);
        Button mul = findViewById(R.id.mul);
        Button div = findViewById(R.id.div);
        Button clear = findViewById(R.id.clear);
        Button equal = findViewById(R.id.equal);
        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num_one = Double.parseDouble(num1.getText().toString());
                double num_two = Double.parseDouble(num2.getText().toString());
                double result_sum =num_one+num_two;
                result.setText(Double.toString(result_sum));
                all_result = result_sum;
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num_one = Double.parseDouble(num1.getText().toString());
                double num_two = Double.parseDouble(num2.getText().toString());
                double result_sum =num_one-num_two;
                result.setText(Double.toString(result_sum));
                all_result = result_sum;
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num_one = Double.parseDouble(num1.getText().toString());
                double num_two = Double.parseDouble(num2.getText().toString());
                double result_sum =num_one*num_two;
                result.setText(Double.toString(result_sum));
                all_result = result_sum;
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num_one = Double.parseDouble(num1.getText().toString());
                double num_two = Double.parseDouble(num2.getText().toString());
                double result_sum =num_one/num_two;
                result.setText(Double.toString(result_sum));
                all_result = result_sum;
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1.setText("");
                num2.setText("");
                result.setText("Simple Calculator");
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1.setText("");
                num2.setText("");
                result.setText(Double.toString(all_result));
            }
        });
    }

}