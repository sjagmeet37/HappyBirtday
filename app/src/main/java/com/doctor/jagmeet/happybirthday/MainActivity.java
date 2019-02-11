package com.doctor.jagmeet.happybirthday;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    //TextView bday;
    MediaPlayer mediaPlayer;
    int TIME_OUT = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        overridePendingTransition( android.R.anim.fade_out ,android.R.anim.slide_in_left);

        //    bday = findViewById(R.id.mtext);

        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.bdaysong);
        mediaPlayer.start();
        mediaPlayer.isLooping();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(i);
                finish();
            }
        }, TIME_OUT);

    }




}
