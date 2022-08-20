package com.example.moneyconverterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void rupToDol(View view){
        EditText inputTextVa = findViewById(R.id.inputText);
        String userInputS = inputTextVa.getText().toString();
        double userInputD = Double.parseDouble(userInputS);
        double output = (userInputD * 0.0136);
        String outputString = Double.toString(output);
        Toast.makeText(getApplicationContext(),outputString,Toast.LENGTH_LONG).show();
    }

    public void  dolToRup(View view){
        EditText inputTextVa = findViewById(R.id.inputText);
        String userInputS = inputTextVa.getText().toString();
        double userInputD = Double.parseDouble(userInputS);
        double output = (userInputD * 73.72);
        String outputString = Double.toString(output);
        Toast.makeText(getApplicationContext(),outputString,Toast.LENGTH_LONG).show();
    }

    public void rupToPou(View view){
        EditText inputTextVa = findViewById(R.id.inputText);
        String userInputS = inputTextVa.getText().toString();
        double userInputD = Double.parseDouble(userInputS);
        double output = (userInputD * 0.0099);
        String outputString = Double.toString(output);
        Toast.makeText(getApplicationContext(),outputString,Toast.LENGTH_LONG).show();
    }

    public void pouToRup(View view){

        EditText inputTextVa = findViewById(R.id.inputText);

        String userInputS = inputTextVa.getText().toString();

        double userInputD = Double.parseDouble(userInputS);

        double output = (userInputD * 101.05);

        String outputString = Double.toString(output);

        Toast.makeText(getApplicationContext(),outputString,Toast.LENGTH_LONG).show();

    }
}