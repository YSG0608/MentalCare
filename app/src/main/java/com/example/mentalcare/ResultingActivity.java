package com.example.mentalcare;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultingActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.end);

        TextView endTitle = (TextView) findViewById(R.id.end_title);

        TextView endContent = (TextView) findViewById(R.id.end_content);

        seeYourResult();
    }

    private void seeYourResult() {
        Button checkResult = (Button) findViewById(R.id.tocheckResult);

        checkResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (RatingActivity.finalScore < 42) {
                    setContentView(R.layout.intepretation1);
                    Button startOver = (Button)findViewById(R.id.startOver);
                    startOver.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            RatingActivity.finalScore = 0;
                            startAgain();
                        }
                     });
                } else if (RatingActivity.finalScore <= 50) {
                    setContentView(R.layout.intepretation2);
                    Button startOver = (Button)findViewById(R.id.startOver);
                    startOver.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            RatingActivity.finalScore = 0;
                            startAgain();
                        }
                    });
                } else if (RatingActivity.finalScore <= 58) {
                    setContentView(R.layout.intepretation3);
                    Button startOver = (Button)findViewById(R.id.startOver);
                    startOver.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            RatingActivity.finalScore = 0;
                            startAgain();
                        }
                    });
                } else {
                    setContentView(R.layout.intepretation4);
                    Button startOver = (Button)findViewById(R.id.startOver);
                    startOver.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            RatingActivity.finalScore = 0;
                            startAgain();
                        }
                    });
                }
            }
        });
    }

    private void startAgain() {
        Intent startIntent = new Intent(this, MainActivity.class);
        startActivity(startIntent);
        finish();
    }
}
