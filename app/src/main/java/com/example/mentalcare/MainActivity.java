package com.example.mentalcare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MentalCare:Home";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView title = (TextView) findViewById(R.id.is_title);

        TextView subhead = (TextView) findViewById(R.id.is_subhead);

        ImageView homeImage  = (ImageView) findViewById(R.id.klkl);

        Button start = (Button) findViewById(R.id.to_start);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToPrepActivity();
            }
        });
    }
    private void goToPrepActivity() {
        Intent intent = new Intent(this, PrepActivity.class);
        startActivity(intent);
        finish();
    }
}
