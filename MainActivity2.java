package com.example.android.cocoquiz;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }



    public void submitAnswers(View view) {


        RadioButton q1RadioButton = (RadioButton) findViewById(R.id.q1r1_radio_button);
        boolean isq1r1 = q1RadioButton.isChecked();

        RadioButton q2RadioButton = (RadioButton) findViewById(R.id.q2r3_radio_button);
        boolean isq2r3 = q2RadioButton.isChecked();

        RadioButton q3RadioButton = (RadioButton) findViewById(R.id.q3r1_radio_button);
        boolean isq3r1 = q3RadioButton.isChecked();

        RadioButton q4RadioButton = (RadioButton) findViewById(R.id.q4r3_radio_button);
        boolean isq4r3 = q4RadioButton.isChecked();

        RadioButton q5RadioButton = (RadioButton) findViewById(R.id.q5r2_radio_button);
        boolean isq5r2 = q5RadioButton.isChecked();

        RadioButton q6RadioButton = (RadioButton) findViewById(R.id.q6r2_radio_button);
        boolean isq6r2 = q6RadioButton.isChecked();

        RadioButton q7RadioButton = (RadioButton) findViewById(R.id.q7r3_radio_button);
        boolean isq7r3 = q7RadioButton.isChecked();

        RadioButton q8RadioButton = (RadioButton) findViewById(R.id.q8r2_radio_button);
        boolean isq8r2 = q8RadioButton.isChecked();

        RadioButton q9RadioButton = (RadioButton) findViewById(R.id.q9r1_radio_button);
        boolean isq9r1 = q9RadioButton.isChecked();

        RadioButton q10RadioButton = (RadioButton) findViewById(R.id.q10r2_radio_button);
        boolean isq10r2 = q10RadioButton.isChecked();

        EditText nameText = (EditText) findViewById(R.id.name_view);
        String name = nameText.getText().toString();

        int score = calculateScore(isq1r1, isq2r3, isq3r1, isq4r3, isq5r2, isq6r2, isq7r3, isq8r2, isq9r1, isq10r2);
        if (score >= 9) {
            //show message as a toast
            Toast.makeText(this, "Great job " + name + "! You are a Coco lover :)"+ "\nYou answered correctly " + score + " out of 10 questions" , Toast.LENGTH_LONG).show();
            //Exit this method early because there's nothing left to do
            return;
        } else  if (score < 9)  {
            if (score >= 6) {
            //show message as a toast
            Toast.makeText(this, "Nice job " + name + "! You know enough about Coco :)"+ "\nYou answered correctly " + score + " out of 10 questions" , Toast.LENGTH_LONG).show();
            //Exit this method early because there's nothing left to do
            return;}
         else if (score < 6) {
            //show message as a toast
            Toast.makeText(this, "Nice try " + name + "! Retry, maybe you'll be luckier :)"+ "\nYou answered correctly " + score + " out of 10 questions" , Toast.LENGTH_LONG).show();
            //Exit this method early because there's nothing left to do
            return;}
        }

        }


    private int calculateScore(boolean addIsq1r1, boolean addIsq2r3, boolean addIsq3r1, boolean addIsq4r3,
                               boolean addIsq5r2, boolean addIsq6r2, boolean addIsq7r3, boolean addIsq8r2,
                               boolean addIsq9r1, boolean addIsq10r2) {
        int baseScore = 0;

        if (addIsq1r1) {
            baseScore = baseScore + 1;
        }
        if (addIsq2r3) {
            baseScore = baseScore + 1;
        }
        if (addIsq3r1) {
            baseScore = baseScore + 1;
        }
        if (addIsq4r3) {
            baseScore = baseScore + 1;
        }
        if (addIsq5r2) {
            baseScore = baseScore + 1;
        }
        if (addIsq6r2) {
            baseScore = baseScore + 1;
        }
        if (addIsq7r3) {
            baseScore = baseScore + 1;
        }
        if (addIsq8r2) {
            baseScore = baseScore + 1;
        }
        if (addIsq9r1) {
            baseScore = baseScore + 1;
        }
        if (addIsq10r2) {
            baseScore = baseScore + 1;
        }

        return baseScore;
    }



}



