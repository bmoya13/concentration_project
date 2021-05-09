package com.example.androidproject;

import android.media.MediaPlayer;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mySong;
    boolean wantMusic = true;                      // boolean to keep track of if user wants music or not.
    public static int userCardInput;        // public static variable used to keep track of the desired number of cards from user.
    public static int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // Load up music to initially start playing. //
        mySong= MediaPlayer.create(getBaseContext(), R.raw.animalcrossing);
        mySong.setLooping(true);    // Music will restart when done.
        mySong.start();             // Music starts playing.


    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putInt("position", mySong.getCurrentPosition()); // Save current timestamp music is at.
        mySong.pause();                                           // Music pauses for now.
        outState.putBoolean("wantMusic", wantMusic);
        super.onSaveInstanceState(outState);
    }
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState){
        int pos = savedInstanceState.getInt("position");    // Receive timestamp from saved instance.
        mySong.seekTo(pos);                                     // Music skips to the timestamp and starts playing.
        boolean musicCheck = savedInstanceState.getBoolean("wantMusic");
        if (!musicCheck) {
            mySong.stop();
            wantMusic = false;
        }
        super.onRestoreInstanceState(savedInstanceState);
    }


    // Music on/off button //
    public void musicButton(View v) {
        if (mySong.isPlaying()) {       // If music is currently playing, stop it
            mySong.stop();
            wantMusic = false;

        } else {                        // If music is not playing, reinitialize start playing.
            mySong = MediaPlayer.create(getBaseContext(), R.raw.animalcrossing);
            mySong.setLooping(true);
            mySong.start();
            wantMusic = true;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}