package com.jkb.guessmynumber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int randomNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random randomGenerator = new Random();
        randomNumber = randomGenerator.nextInt(21);
        TextView maxNum = (TextView) findViewById(R.id.maxNum);
        maxNum.setText("20");
    }
    public void checkGuess(View view){

        EditText guessNumber = (EditText) findViewById(R.id.guessNumber);

        if (guessNumber.getText().length() == 0) {
            Toast.makeText(getApplicationContext(), "Enter a number!", Toast.LENGTH_LONG).show();
        }
        else{

        String guessNumberString = guessNumber.getText().toString();
        int guessNumberInt = Integer.parseInt(guessNumberString);
        String message = "";

        if (guessNumberInt > randomNumber) {
            message = "Too high!";
        } else if (guessNumberInt < randomNumber) {
            message = "Too low!";
        } else {
            message = "Correct, well done!";
        }
        Toast.makeText(getApplicationContext(),message, Toast.LENGTH_LONG).show();
        }
    }
    public void clickTwenty(View view){
        Random randomGenerator = new Random();
        randomNumber = randomGenerator.nextInt(21);
        TextView maxNum = (TextView) findViewById(R.id.maxNum);
        maxNum.setText("20");
    }
    public void clickHundred(View view){
        Random randomGenerator = new Random();
        randomNumber = randomGenerator.nextInt(101);
        TextView maxNum = (TextView) findViewById(R.id.maxNum);
        maxNum.setText("100");
    }
    public void clickThousand(View view){
        Random randomGenerator = new Random();
        randomNumber = randomGenerator.nextInt(1001);
        TextView maxNum = (TextView) findViewById(R.id.maxNum);
        maxNum.setText("1000");
    }


    public void tryAgain(View view){
        TextView maxNum = (TextView) findViewById(R.id.maxNum);
        String maxNumString = maxNum.getText().toString();
        if (maxNumString == "20") {
            Random randomGenerator = new Random();
            randomNumber = randomGenerator.nextInt(21);
        } else if (maxNumString == "100") {
            Random randomGenerator = new Random();
            randomNumber = randomGenerator.nextInt(101);
        } else {
            Random randomGenerator = new Random();
            randomNumber = randomGenerator.nextInt(1001);
        }
    }
}
