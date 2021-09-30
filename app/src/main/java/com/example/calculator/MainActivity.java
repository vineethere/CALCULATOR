package com.example.calculator;

import static com.example.calculator.R.id.*;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;

import android.widget.EditText;

import android.os.Bundle;
import android.widget.TextView ;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
     private Button Add;
     private TextView textView5;
    private TextView textView6;
    private EditText i1;
    private EditText i2;
    private TextView Result;
    private Button Subtract;
    private Button Multiply;
    private Button Devide;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Add=findViewById(R.id.Add);
        Subtract=findViewById(R.id.Subtract);
        textView5=findViewById(R.id.textView5);
        i1=findViewById(R.id.i1);
        i2=findViewById(R.id.i2);
        Result = findViewById(R.id.Result);
        Multiply=findViewById(R.id.Multiply);
        Devide=findViewById(R.id.Devide);
        textView6=findViewById(R.id.textView6);


        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             String s1=i1.getText().toString();
                Double v1;
                Double v2;
                 String s2=i2.getText().toString();
                
                   v2 = Double.parseDouble(s2);
                v1= Double.parseDouble(s1);
                Double res=v1+v2;
                Result.setText(Double.toString(res));
            }
        });

        Subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = i1.getText().toString();
                Double v1;
                Double v2;

                v1 = Double.parseDouble(s1);
                String s2=i2.getText().toString();
                v2 = Double.parseDouble(s2);


                Double res = v1 - v2;
                Result.setText(Double.toString(res));
            }



        });
        Multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = i1.getText().toString();
                Double v1;
                Double v2;

                v1 = Double.parseDouble(s1);

                v2 = Double.parseDouble(i2.getText().toString());

                Double res = v1* v2;
                Result.setText(Double.toString(res));
            }
        });
        Devide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = i1.getText().toString();
                Double v1;
                Double v2;

                v1 = Double.parseDouble(s1);

                v2 = Double.parseDouble(i2.getText().toString());

                Double res = v1/v2;
                Result.setText(Double.toString(res));
            }
        });


    }
}