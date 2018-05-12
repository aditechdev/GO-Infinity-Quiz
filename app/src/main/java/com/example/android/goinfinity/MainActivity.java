package com.example.android.goinfinity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.RadioButton;
import java.util.Scanner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private final String answerSeven = "Narendra Modi";
    String scoreMessage;
    int quantity = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void clickQ1(View view) {
        boolean question1 = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.q1option2:
                if (question1)
                    quantity = quantity + 2;

                break;
            case R.id.q1option1:
                if (question1)

                    break;
            case R.id.q1option3:
                if (question1)

                    break;
            case R.id.q1option4:
                if (question1)

                    break;
        }
    }


    public void clickQ2(View view) {

        boolean question2 = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.q2option2:
                if (question2)
                    quantity = quantity + 2;

                break;
            case R.id.q2option1:
                if (question2)

                    break;
            case R.id.q2option3:
                if (question2)

                    break;
            case R.id.q2option4:
                if (question2)

                    break;
        }
    }

    public void clickQ3(View view) {
        boolean question3 = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.q3option3:
                if (question3)
                    quantity = quantity + 2;

                break;
            case R.id.q3option1:
                if (question3)

                    break;
            case R.id.q3option2:
                if (question3)

                    break;
            case R.id.q3option4:
                if (question3)

                    break;
        }
    }

    public void clickQ4(View view) {
        boolean question4 = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.q4option1:
                if (question4)
                    quantity = quantity + 2;

                break;
            case R.id.q4option2:
                if (question4)

                    break;
            case R.id.q4option3:
                if (question4)

                    break;
            case R.id.q4option4:
                if (question4)

                    break;
        }
    }

    public void clickQ5(View view) {
        boolean question5 = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.q5option4:
                if (question5)
                    quantity = quantity + 2;

                break;
            case R.id.q5option1:
                if (question5)

                    break;
            case R.id.q5option2:
                if (question5)

                    break;
            case R.id.q5option3:
                if (question5)

                    break;
        }
    }

    public void clickQ6(View view) {
        CheckBox checkBox1 = findViewById(R.id.q6option1);
        CheckBox checkBox3 = findViewById(R.id.q6option2);
        CheckBox checkBox4 = findViewById(R.id.q6option3);
        CheckBox checkBox2 = findViewById(R.id.q6option1);
        if (checkBox1.isChecked()) {
            if (checkBox2.isChecked()) {
                if (checkBox4.isChecked()) {
                    quantity = quantity + 1;
                    if (checkBox3.isChecked()) {
                        quantity = quantity - 1;
                    }
                }
            }
        }
    }
    

    public int editText(View view) {
        EditText name = findViewById(R.id.q7_edit_text);
        String userAnswer = name.getText().toString();
        if (userAnswer.equals(answerSeven)) {
            quantity = quantity + 1;
            return quantity;
        }
        return quantity;
    }

    public String message(String message, int score) {
        scoreMessage = score + "\nQuestions correct :" + quantity;
        scoreMessage = scoreMessage + "\nScore " + score;
        scoreMessage = scoreMessage + "\nThank You !";
        Toast.makeText(this, scoreMessage, Toast.LENGTH_LONG).show();
        return scoreMessage;
    }

    public int calculateScore() {
        int score = quantity * 10;
        return score;
    }

    public void submit(View view) {


        int score = calculateScore();
        String message = message(scoreMessage, score);

    }
}