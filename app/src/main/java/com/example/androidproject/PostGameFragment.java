package com.example.androidproject;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.navigation.fragment.NavHostFragment;
import androidx.fragment.app.Fragment;

public class PostGameFragment extends Fragment {
    int score = MainActivity.score;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_post_game, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        TextView scoreTextView;
        scoreTextView = view.findViewById(R.id.scoreTextView);
        scoreTextView.setText(String.valueOf(score));

        view.findViewById(R.id.endButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.userCardInput = 0;
                NavHostFragment.findNavController(PostGameFragment.this)
                        .navigate(R.id.action_postGameFragment_to_FirstFragment);
            }
        });
    }
}