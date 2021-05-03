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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        mySong= MediaPlayer.create(getBaseContext(), R.raw.animalcrossing);
        mySong.setLooping(true);
        mySong.start();

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putInt("position", mySong.getCurrentPosition());
        mySong.pause();
        super.onSaveInstanceState(outState);
    }
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState){
        int pos = savedInstanceState.getInt("position");
        mySong.seekTo(pos);
        super.onRestoreInstanceState(savedInstanceState);
    }
    public void musicButton(View v) {
        if (mySong.isPlaying()) {
            mySong.stop();
            mySong = MediaPlayer.create(getBaseContext(), R.raw.animalcrossing);
        } else {
            mySong.setLooping(true);
            mySong.start();
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