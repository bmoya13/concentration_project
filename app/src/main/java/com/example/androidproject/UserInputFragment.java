package com.example.androidproject;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.navigation.fragment.NavHostFragment;
import androidx.fragment.app.Fragment;

public class UserInputFragment extends Fragment {
    EditText userInput;         // used to read in editTextNumber.

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

        userInput = view.findViewById(R.id.editTextName);             // initialize userInput to editTextNumber.

        view.findViewById(R.id.backButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(UserInputFragment.this)
                        .navigate(R.id.action_userInputFragment_to_FirstFragment);              // back button returns back to main menu.
            }
        });

        view.findViewById(R.id.startButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (CheckUserInput())        // if start button is clicked, check the user input.
                    NavHostFragment.findNavController(UserInputFragment.this)
                            .navigate(R.id.action_userInputFragment_to_SecondFragment);
            }
        });

        view.findViewById(R.id.highScoreButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (CheckUserInput())                                                               // if start button is clicked, check the user input.
                    NavHostFragment.findNavController(UserInputFragment.this)
                            .navigate(R.id.action_userInputFragment_to_highScoresFragment);
            }
        });
    }

    public boolean CheckUserInput() {
        String temp = userInput.getText().toString();                                          // get userInput as a string.
        if (!"".equals(temp)) {
            MainActivity.userCardInput = Integer.parseInt(temp);                                              // numberCards now stores the user inputted number.
        }
        if (MainActivity.userCardInput >= 4 && MainActivity.userCardInput <= 20 && (MainActivity.userCardInput % 2) == 0)
            return true;
        else
            return false;
    }


}
