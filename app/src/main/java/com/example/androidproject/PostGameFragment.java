package com.example.androidproject;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.navigation.fragment.NavHostFragment;
import androidx.fragment.app.Fragment;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class PostGameFragment extends Fragment {
    EditText userNameInputField;
    int score = MainActivity.score;
    int numCards = MainActivity.userCardInput;
    String userNameInput;
    Scanner scan;
    boolean isHighScore;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_post_game, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        TextView scoreTextView;
        TextView savedLabel = view.findViewById(R.id.savedLabel);
        scoreTextView = view.findViewById(R.id.scoreTextView);
        scoreTextView.setText(String.valueOf(score));
        isHighScore = false;
        checkHighScore();
        if (isHighScore)
        {
            userNameInputField = view.findViewById(R.id.editTextName);
            userNameInputField.setVisibility(View.VISIBLE);
            view.findViewById(R.id.congratulationsLabel).setVisibility(View.VISIBLE);
            view.findViewById(R.id.saveButton).setVisibility(View.VISIBLE);
        }

        view.findViewById(R.id.endButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.userCardInput = 0;
                NavHostFragment.findNavController(PostGameFragment.this)
                        .navigate(R.id.action_postGameFragment_to_FirstFragment);
            }
        });

        view.findViewById(R.id.saveButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (checkInput()) {
                    try {
                        addScore();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                savedLabel.setVisibility(View.VISIBLE);
                view.findViewById(R.id.saveButton).setVisibility(View.INVISIBLE);
            }
        });
    }

    public void scanFile()
    {
        scan = new Scanner("raw/highscores.txt");
        for (int i = 0; i < 27; i++)
        {
            scan.next();
            MainActivity.highscores[i] = scan.nextInt();
        }
        scan.close();
    }

    public void checkHighScore()
    {
        if (numCards == 4 && score >= MainActivity.highscores[2])
            isHighScore = true;
        if (numCards == 6 && score >= MainActivity.highscores[5])
            isHighScore = true;
        if (numCards == 8 && score >= MainActivity.highscores[8])
            isHighScore = true;
        if (numCards == 10 && score >= MainActivity.highscores[11])
            isHighScore = true;
        if (numCards == 12 && score >= MainActivity.highscores[14])
            isHighScore = true;
        if (numCards == 14 && score >= MainActivity.highscores[17])
            isHighScore = true;
        if (numCards == 16 && score >= MainActivity.highscores[20])
            isHighScore = true;
        if (numCards == 18 && score >= MainActivity.highscores[23])
            isHighScore = true;
        if (numCards == 20 && score >= MainActivity.highscores[26])
            isHighScore = true;
    }

    public boolean checkInput()
    {
        String temp = userNameInputField.getText().toString();
        boolean valid = true;
        for (int i = 0; i < temp.length(); i++)
        {
            if (temp.charAt(i) == ' ' || temp.charAt(i) == '\n')
                valid = false;
        }
        return valid;
    }

    public void addScore() throws IOException {
        FileWriter outfile = new FileWriter("raw/highscores.txt");
        if (numCards == 4)
        {
            if (score >= MainActivity.highscores[0])
            {
                MainActivity.highscores[2] = MainActivity.highscores[1];
                MainActivity.highscorers[2] = MainActivity.highscorers[1];
                MainActivity.highscores[1] = MainActivity.highscores[0];
                MainActivity.highscorers[1] = MainActivity.highscorers[0];
                MainActivity.highscores[0] = score;
                MainActivity.highscorers[0] = userNameInput;
            }
            else if (score >= MainActivity.highscores[1] && score < MainActivity.highscores[0])
            {
                MainActivity.highscores[2] = MainActivity.highscores[1];
                MainActivity.highscorers[2] = MainActivity.highscorers[1];
                MainActivity.highscores[1] = score;
                MainActivity.highscorers[1] = userNameInput;
            }
            else if (score >= MainActivity.highscores[2] && score < MainActivity.highscores[1])
            {
                MainActivity.highscores[2] = score;
                MainActivity.highscorers[2] = userNameInput;
            }

        }
        if (numCards == 6)
        {
            if (score >= MainActivity.highscores[3])
            {
                MainActivity.highscores[5] = MainActivity.highscores[4];
                MainActivity.highscorers[5] = MainActivity.highscorers[4];
                MainActivity.highscores[4] = MainActivity.highscores[3];
                MainActivity.highscorers[4] = MainActivity.highscorers[3];
                MainActivity.highscores[3] = score;
                MainActivity.highscorers[3] = userNameInput;
            }
            else if (score >= MainActivity.highscores[4] && score < MainActivity.highscores[3])
            {
                MainActivity.highscores[5] = MainActivity.highscores[4];
                MainActivity.highscorers[5] = MainActivity.highscorers[4];
                MainActivity.highscores[4] = score;
                MainActivity.highscorers[4] = userNameInput;
            }
            else if (score >= MainActivity.highscores[5] && score < MainActivity.highscores[4])
            {
                MainActivity.highscores[5] = score;
                MainActivity.highscorers[5] = userNameInput;
            }
        }
        if (numCards == 8)
        {
            if (score >= MainActivity.highscores[6])
            {
                MainActivity.highscores[8] = MainActivity.highscores[7];
                MainActivity.highscorers[8] = MainActivity.highscorers[7];
                MainActivity.highscores[7] = MainActivity.highscores[6];
                MainActivity.highscorers[7] = MainActivity.highscorers[6];
                MainActivity.highscores[6] = score;
                MainActivity.highscorers[6] = userNameInput;
            }
            else if (score >= MainActivity.highscores[7] && score < MainActivity.highscores[6])
            {
                MainActivity.highscores[8] = MainActivity.highscores[7];
                MainActivity.highscorers[8] = MainActivity.highscorers[7];
                MainActivity.highscores[7] = score;
                MainActivity.highscorers[7] = userNameInput;
            }
            else if (score >= MainActivity.highscores[8] && score < MainActivity.highscores[7])
            {
                MainActivity.highscores[8] = score;
                MainActivity.highscorers[8] = userNameInput;
            }
        }
        if (numCards == 10)
        {
            if (score >= MainActivity.highscores[9])
            {
                MainActivity.highscores[11] = MainActivity.highscores[10];
                MainActivity.highscorers[11] = MainActivity.highscorers[10];
                MainActivity.highscores[10] = MainActivity.highscores[9];
                MainActivity.highscorers[10] = MainActivity.highscorers[9];
                MainActivity.highscores[9] = score;
                MainActivity.highscorers[9] = userNameInput;
            }
            else if (score >= MainActivity.highscores[10] && score < MainActivity.highscores[9])
            {
                MainActivity.highscores[11] = MainActivity.highscores[10];
                MainActivity.highscorers[11] = MainActivity.highscorers[10];
                MainActivity.highscores[10] = score;
                MainActivity.highscorers[10] = userNameInput;
            }
            else if (score >= MainActivity.highscores[11] && score < MainActivity.highscores[10])
            {
                MainActivity.highscores[11] = score;
                MainActivity.highscorers[11] = userNameInput;
            }
        }
        if (numCards == 12)
        {
            if (score >= MainActivity.highscores[12])
            {
                MainActivity.highscores[14] = MainActivity.highscores[13];
                MainActivity.highscorers[14] = MainActivity.highscorers[13];
                MainActivity.highscores[13] = MainActivity.highscores[12];
                MainActivity.highscorers[13] = MainActivity.highscorers[12];
                MainActivity.highscores[12] = score;
                MainActivity.highscorers[12] = userNameInput;
            }
            else if (score >= MainActivity.highscores[13] && score < MainActivity.highscores[12])
            {
                MainActivity.highscores[14] = MainActivity.highscores[13];
                MainActivity.highscorers[14] = MainActivity.highscorers[13];
                MainActivity.highscores[13] = score;
                MainActivity.highscorers[13] = userNameInput;
            }
            else if (score >= MainActivity.highscores[14] && score < MainActivity.highscores[13])
            {
                MainActivity.highscores[14] = score;
                MainActivity.highscorers[14] = userNameInput;
            }
        }
        if (numCards == 14)
        {
            if (score >= MainActivity.highscores[15])
            {
                MainActivity.highscores[17] = MainActivity.highscores[16];
                MainActivity.highscorers[17] = MainActivity.highscorers[16];
                MainActivity.highscores[16] = MainActivity.highscores[15];
                MainActivity.highscorers[16] = MainActivity.highscorers[15];
                MainActivity.highscores[15] = score;
                MainActivity.highscorers[15] = userNameInput;
            }
            else if (score >= MainActivity.highscores[16] && score < MainActivity.highscores[15])
            {
                MainActivity.highscores[17] = MainActivity.highscores[16];
                MainActivity.highscorers[17] = MainActivity.highscorers[16];
                MainActivity.highscores[16] = score;
                MainActivity.highscorers[16] = userNameInput;
            }
            else if (score >= MainActivity.highscores[17] && score < MainActivity.highscores[16])
            {
                MainActivity.highscores[17] = score;
                MainActivity.highscorers[17] = userNameInput;
            }
        }
        if (numCards == 16)
        {
            if (score >= MainActivity.highscores[18])
            {
                MainActivity.highscores[20] = MainActivity.highscores[19];
                MainActivity.highscorers[20] = MainActivity.highscorers[19];
                MainActivity.highscores[19] = MainActivity.highscores[18];
                MainActivity.highscorers[19] = MainActivity.highscorers[18];
                MainActivity.highscores[18] = score;
                MainActivity.highscorers[18] = userNameInput;
            }
            else if (score >= MainActivity.highscores[19] && score < MainActivity.highscores[18])
            {
                MainActivity.highscores[20] = MainActivity.highscores[19];
                MainActivity.highscorers[20] = MainActivity.highscorers[19];
                MainActivity.highscores[19] = score;
                MainActivity.highscorers[19] = userNameInput;
            }
            else if (score >= MainActivity.highscores[20] && score < MainActivity.highscores[19])
            {
                MainActivity.highscores[20] = score;
                MainActivity.highscorers[20] = userNameInput;
            }
        }
        if (numCards == 18)
        {
            if (score >= MainActivity.highscores[21])
            {
                MainActivity.highscores[23] = MainActivity.highscores[22];
                MainActivity.highscorers[23] = MainActivity.highscorers[22];
                MainActivity.highscores[22] = MainActivity.highscores[21];
                MainActivity.highscorers[22] = MainActivity.highscorers[21];
                MainActivity.highscores[21] = score;
                MainActivity.highscorers[21] = userNameInput;
            }
            else if (score >= MainActivity.highscores[22] && score < MainActivity.highscores[21])
            {
                MainActivity.highscores[23] = MainActivity.highscores[22];
                MainActivity.highscorers[23] = MainActivity.highscorers[22];
                MainActivity.highscores[22] = score;
                MainActivity.highscorers[22] = userNameInput;
            }
            else if (score >= MainActivity.highscores[23] && score < MainActivity.highscores[22])
            {
                MainActivity.highscores[23] = score;
                MainActivity.highscorers[23] = userNameInput;
            }
        }
        if (numCards == 20)
        {
            if (score >= MainActivity.highscores[24])
            {
                MainActivity.highscores[26] = MainActivity.highscores[25];
                MainActivity.highscorers[26] = MainActivity.highscorers[25];
                MainActivity.highscores[25] = MainActivity.highscores[24];
                MainActivity.highscorers[25] = MainActivity.highscorers[24];
                MainActivity.highscores[24] = score;
                MainActivity.highscorers[24] = userNameInput;
            }
            else if (score >= MainActivity.highscores[25] && score < MainActivity.highscores[24])
            {
                MainActivity.highscores[26] = MainActivity.highscores[25];
                MainActivity.highscorers[26] = MainActivity.highscorers[25];
                MainActivity.highscores[25] = score;
                MainActivity.highscorers[25] = userNameInput;
            }
            else if (score >= MainActivity.highscores[26] && score < MainActivity.highscores[25])
            {
                MainActivity.highscores[26] = score;
                MainActivity.highscorers[26] = userNameInput;
            }
        }

        for(int i = 0; i < 27; i++)
        {
            outfile.write(MainActivity.highscorers[i] + " ");
            outfile.write(MainActivity.highscores[i] + " ");
        }
        outfile.close();
    }
}