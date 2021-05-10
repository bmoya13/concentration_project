package com.example.androidproject;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class HighScoresFragment extends Fragment {
    int numCards = MainActivity.userCardInput;
    TextView highscore1, highscore2, highscore3;
    String[] names;
    int[] scores;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_userinput, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        highscore1 = view.findViewById(R.id.highScore1);
        highscore2 = view.findViewById(R.id.highScore2);
        highscore3 = view.findViewById(R.id.highScore3);

        try {
            loadScores();
        } catch (IOException e) {
            e.printStackTrace();
        }

        highscore1.setText(names[0] + ", " + scores[0]);
        highscore1.setText(names[1] + ", " + scores[1]);
        highscore1.setText(names[2] + ", " + scores[2]);

        view.findViewById(R.id.backButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(HighScoresFragment.this)
                        .navigate(R.id.action_highScoresFragment_to_userInputFragment);
            }
        });
    }

    public void loadScores() throws IOException {
        int arrayIndex = 0;
        InputStream input = (getResources().openRawResource(R.raw.highscores));
        Scanner scan = new Scanner(input);
        for (int i = 0; i < 27; i++)
        {
            MainActivity.highscorers[i] = scan.next();
            MainActivity.highscores[i] = scan.nextInt();
        }

        scan.close();

        if (numCards == 4)
        {
            for (int i = 0; i < 3; i++)
            {
                names[arrayIndex] = MainActivity.highscorers[i];
                scores[arrayIndex] = MainActivity.highscores[i];
                arrayIndex++;
            }
        }
        if (numCards == 6)
        {
            for (int i = 3; i < 6; i++)
            {
                names[arrayIndex] = MainActivity.highscorers[i];
                scores[arrayIndex] = MainActivity.highscores[i];
                arrayIndex++;
            }
        }
        if (numCards == 8)
        {
            for (int i = 6; i < 9; i++)
            {
                names[arrayIndex] = MainActivity.highscorers[i];
                scores[arrayIndex] = MainActivity.highscores[i];
                arrayIndex++;
            }
        }
        if (numCards == 10)
        {
            for (int i = 9; i < 12; i++)
            {
                names[arrayIndex] = MainActivity.highscorers[i];
                scores[arrayIndex] = MainActivity.highscores[i];
                arrayIndex++;
            }
        }
        if (numCards == 12)
        {
            for (int i = 12; i < 15; i++)
            {
                names[arrayIndex] = MainActivity.highscorers[i];
                scores[arrayIndex] = MainActivity.highscores[i];
                arrayIndex++;
            }
        }
        if (numCards == 14)
        {
            for (int i = 15; i < 18; i++)
            {
                names[arrayIndex] = MainActivity.highscorers[i];
                scores[arrayIndex] = MainActivity.highscores[i];
                arrayIndex++;
            }
        }
        if (numCards == 16)
        {
            for (int i = 18; i < 21; i++)
            {
                names[arrayIndex] = MainActivity.highscorers[i];
                scores[arrayIndex] = MainActivity.highscores[i];
                arrayIndex++;
            }
        }
        if (numCards == 18)
        {
            for (int i = 21; i < 24; i++)
            {
                names[arrayIndex] = MainActivity.highscorers[i];
                scores[arrayIndex] = MainActivity.highscores[i];
                arrayIndex++;
            }
        }
        if (numCards == 20)
        {
            for (int i = 24; i < 27; i++)
            {
                names[arrayIndex] = MainActivity.highscorers[i];
                scores[arrayIndex] = MainActivity.highscores[i];
                arrayIndex++;
            }
        }
    }
}