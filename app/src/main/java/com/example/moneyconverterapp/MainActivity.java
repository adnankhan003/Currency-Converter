package com.example.moneyconverterapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
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

    @Override
    public boolean onCreateOptionsMenu(@NonNull Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.option_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId()==R.id.contact_us){
            Intent intent = new Intent(MainActivity.this,CallActivity.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}