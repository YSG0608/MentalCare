package com.example.mentalcare;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;


public class RatingActivity extends AppCompatActivity {
    private static final String TAG = "MentalCare:Statements";

    private int count = 1;

    private int progressCount = 0;

    public static int finalScore = 0;

    @Override
    protected void onCreate(Bundle savedInsatnceState) {
        super.onCreate(savedInsatnceState);
        setContentView(R.layout.statement1);
        changeStatements();

    }

    private void changeStatements() {
        final String[] statement = {"I feel down-hearted and blue.", "Morning is when I feel the best.", "I have trouble sleeping at night.", "I eat as much as I used to.", "I notice that I'm losing weight.", "My heart beats faster than normal.", "I get tired for no reason.", "My mind is as clear as it used to be.", "I find it easy to do things I used to.", "I am restless and I can't keep still.", "I feel hopeful about the future.", "I'm more irritable than usual.", "I find it easy to make daily decisions.", "I feel that I'm useful and needed.", "My life is full and meaningful.", "I still enjoy the things I used to do.", "I feel that others would be better off if I'm dead.",
            "I have trouble with constipation", "I have crying spells or feel like it.", "I still enjoy my social life.", " "};
        final int[][] points = {{1, 2, 3 ,4}, {4, 3, 2, 1}, {1, 2, 3 ,4}, {4, 3, 2, 1}, {1, 2, 3, 4}, {1, 2, 3 ,4}, {1, 2, 3 ,4}, {4, 3, 2, 1},
                {4, 3, 2, 1}, {1, 2, 3 ,4}, {4, 3, 2, 1}, {1, 2, 3 ,4}, {4, 3, 2, 1}, {4, 3, 2, 1}, {4, 3, 2, 1}, {4, 3, 2, 1}, {1, 2, 3, 4}, {1, 2, 3 ,4}, {1, 2, 3 ,4}, {4, 3, 2, 1}, {0, 0, 0, 0}};



        final TextView changingText  = (TextView) findViewById(R.id.statement1);

        Button option1 = (Button) findViewById(R.id.option1);

        Button option2 = (Button) findViewById(R.id.option2);

        Button option3 = (Button) findViewById(R.id.option3);

        Button option4 = (Button) findViewById(R.id.option4);

        final ProgressBar progress = (ProgressBar) findViewById(R.id.progressBar);
        option1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finalScore += points[count - 1][0];
                changingText.setText(statement[count]);
                count++;
                progressCount += 10;
                progress.setProgress(progressCount);
                if (count > 20) {
                    goToResultingActivity();
                }
            }
         });

        option2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finalScore += points[count - 1][1];
                changingText.setText(statement[count]);
                count++;
                progressCount += 10;
                progress.setProgress(progressCount);
                if (count > 20) {
                    goToResultingActivity();
                }
            }
        });

        option3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finalScore += points[count - 1][2];
                changingText.setText(statement[count]);
                count++;
                progressCount += 10;
                progress.setProgress(progressCount);
                if (count > 20) {
                    goToResultingActivity();
                }
            }
        });

        option4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finalScore += points[count - 1][3];
                changingText.setText(statement[count]);
                count++;
                progressCount += 10;
                progress.setProgress(progressCount);
                if (count > 20) {
                    goToResultingActivity();
                }
            }
        });
    }

    private void goToResultingActivity() {
        Intent resultingIntent = new Intent(this, ResultingActivity.class);
        startActivity(resultingIntent);
        finish();
    }
}
