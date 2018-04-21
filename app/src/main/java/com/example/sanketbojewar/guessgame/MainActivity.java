package com.example.sanketbojewar.guessgame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int randomNumber;

    public void makeToast(String string){

        Toast.makeText(MainActivity.this,string , Toast.LENGTH_LONG).show();
    }

    public void clickFunction(View view) {

        Log.i("info", "klo");

        EditText enterNoEditText =  (EditText) findViewById(R.id.enterNoEditText);

        int guessedNumber = Integer.parseInt(enterNoEditText.getText().toString());

        if(guessedNumber>randomNumber){

            makeToast("Lower!");
        }

        else if(guessedNumber<randomNumber){

            makeToast("Higher");
        }
        else {

            makeToast("Bulls eye ! Try again");
                        Random rand = new Random();
            randomNumber = rand.nextInt(20) + 1;
        }

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random rand = new Random();
       randomNumber = rand.nextInt(20) + 1;
    }

}