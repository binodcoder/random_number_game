package com.example.binod.randomnumbergame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int randomNumber;

    public void clickFunction(View view){
       EditText numberField=(EditText) findViewById(R.id.editText);
       int number=Integer.parseInt(numberField.getText().toString());


       if(randomNumber>number){
           Toast.makeText(getApplicationContext(), "Your Input is Higher".toString(),Toast.LENGTH_LONG).show();
       }else if(randomNumber<number){
           Toast.makeText(getApplicationContext(),"Your Input is Lower".toString(),Toast.LENGTH_LONG).show();
       }else{
           Toast.makeText(getApplicationContext(),"Congratulation, you are correct".toString(),Toast.LENGTH_LONG).show();
       }

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random randomGenerator=new Random();
        randomNumber=randomGenerator.nextInt(21);

    }
}
