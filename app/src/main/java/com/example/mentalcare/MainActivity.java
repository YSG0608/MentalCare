package com.example.mentalcare;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MentalCare:Home";

    private static MediaPlayer music;

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

        Button play = (Button) findViewById(R.id.playMusic);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                music = MediaPlayer.create(MainActivity.this, R.raw.music);
                music.start();
            }
        });

    }
    private void goToPrepActivity() {
        Intent intent = new Intent(this, PrepActivity.class);
        startActivity(intent);
        finish();
    }
}
