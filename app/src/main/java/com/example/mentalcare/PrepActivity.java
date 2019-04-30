package com.example.mentalcare;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PrepActivity extends AppCompatActivity {
    private static final String TAG = "MentalCare:Prep";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.prep_activity);

        TextView prepMessage = (TextView) findViewById(R.id.prep_message);

        Button proceed = (Button) findViewById(R.id.to_proceed);
        proceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToStatementsActivity();
            }
        });

        Button back = (Button) findViewById(R.id.to_quit);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goBackToMainActivity();
            }
        });

    }

    private void goBackToMainActivity() {
        Intent homeIntent = new Intent(this, MainActivity.class);
        startActivity(homeIntent);
        finish();
    }
    private void goToStatementsActivity() {
        Intent statementIntent = new Intent(this, RatingActivity.class);
        startActivity(statementIntent);
        finish();
    }
}
