package com.example.androidproject;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class SecondFragment extends Fragment {
    int numCards;
    int numCorrect;
    int score;
    ImageView selection1, selection2;
    boolean card1selected, card2selected;
    int[] arrayCardRandom;
    int[] arrayAnimalRandom = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    Integer images[];
    boolean gameEnded;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        initializeGame(view);

        Button newGameButton = view.findViewById(R.id.newGameButton);
        Button tryAgainButton = view.findViewById(R.id.tryAgainButton);
        ImageView card1, card2, card3, card4, card5, card6, card7, card8, card9, card10, card11, card12,
                card13, card14, card15, card16, card17, card18, card19, card20;
        card1 = view.findViewById(R.id.cardback1);
        card2 = view.findViewById(R.id.cardback2);
        card3 = view.findViewById(R.id.cardback3);
        card4 = view.findViewById(R.id.cardback4);
        card5 = view.findViewById(R.id.cardback5);
        card6 = view.findViewById(R.id.cardback6);
        card7 = view.findViewById(R.id.cardback7);
        card8 = view.findViewById(R.id.cardback8);
        card9 = view.findViewById(R.id.cardback9);
        card10 = view.findViewById(R.id.cardback10);
        card11 = view.findViewById(R.id.cardback11);
        card12 = view.findViewById(R.id.cardback12);
        card13 = view.findViewById(R.id.cardback13);
        card14 = view.findViewById(R.id.cardback14);
        card15 = view.findViewById(R.id.cardback15);
        card16 = view.findViewById(R.id.cardback16);
        card17 = view.findViewById(R.id.cardback17);
        card18 = view.findViewById(R.id.cardback18);
        card19 = view.findViewById(R.id.cardback19);
        card20 = view.findViewById(R.id.cardback20);

        view.findViewById(R.id.endGameButton).setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                MainActivity.score = score;
                if (!gameEnded)
                {
                    tryAgainButton.setVisibility(View.INVISIBLE);
                    newGameButton.setVisibility(View.INVISIBLE);
                    card1selected = true;
                    card2selected = true;
                    gameEnded = true;
                    if (numCards >= 4)
                    {
                        card1.setImageResource(images[arrayCardRandom[0]]);
                        card2.setImageResource(images[arrayCardRandom[1]]);
                        card3.setImageResource(images[arrayCardRandom[2]]);
                        card4.setImageResource(images[arrayCardRandom[3]]);
                    }
                    if (numCards >= 6)
                    {
                        card5.setImageResource(images[arrayCardRandom[4]]);
                        card6.setImageResource(images[arrayCardRandom[5]]);
                    }
                    if (numCards >= 8)
                    {
                        card7.setImageResource(images[arrayCardRandom[6]]);
                        card8.setImageResource(images[arrayCardRandom[7]]);
                    }
                    if (numCards >= 10)
                    {
                        card9.setImageResource(images[arrayCardRandom[8]]);
                        card10.setImageResource(images[arrayCardRandom[9]]);
                    }
                    if (numCards >= 12)
                    {
                        card11.setImageResource(images[arrayCardRandom[10]]);
                        card12.setImageResource(images[arrayCardRandom[11]]);
                    }
                    if (numCards >= 14)
                    {
                        card13.setImageResource(images[arrayCardRandom[12]]);
                        card14.setImageResource(images[arrayCardRandom[13]]);
                    }
                    if (numCards >= 16)
                    {
                        card15.setImageResource(images[arrayCardRandom[14]]);
                        card16.setImageResource(images[arrayCardRandom[15]]);
                    }
                    if (numCards >= 18)
                    {
                        card17.setImageResource(images[arrayCardRandom[16]]);
                        card18.setImageResource(images[arrayCardRandom[17]]);
                    }
                    if (numCards >= 20)
                    {
                        card19.setImageResource(images[arrayCardRandom[18]]);
                        card20.setImageResource(images[arrayCardRandom[19]]);
                    }
                }
                else
                    NavHostFragment.findNavController(SecondFragment.this)
                            .navigate(R.id.action_SecondFragment_to_postGameFragment);
            }
        });

        view.findViewById(R.id.cardback1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView card = (ImageView) view;
                if ((!card1selected || !card2selected) && (card.getDrawable().getConstantState() ==
                        SecondFragment.this.getResources().getDrawable(R.drawable.cardback).getConstantState()))
                {
                    card.setImageResource(images[arrayCardRandom[0]]);
                    if (!card1selected) {
                        selection1 = card;
                        card1selected = true;
                    }
                    else {
                        selection2 = card;
                        card2selected = true;
                        checkMatch();
                    }
                }
            }
        });

        view.findViewById(R.id.cardback2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView card = (ImageView) view;
                if ((!card1selected || !card2selected) && (card.getDrawable().getConstantState() ==
                        SecondFragment.this.getResources().getDrawable(R.drawable.cardback).getConstantState()))
                {
                    card.setImageResource(images[arrayCardRandom[1]]);
                    if (!card1selected) {
                        selection1 = card;
                        card1selected = true;
                    }
                    else {
                        selection2 = card;
                        card2selected = true;
                        checkMatch();
                    }
                }
            }
        });

        view.findViewById(R.id.cardback3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView card = (ImageView) view;
                if ((!card1selected || !card2selected) && (card.getDrawable().getConstantState() ==
                        SecondFragment.this.getResources().getDrawable(R.drawable.cardback).getConstantState()))
                {
                    card.setImageResource(images[arrayCardRandom[2]]);
                    if (!card1selected) {
                        selection1 = card;
                        card1selected = true;
                    }
                    else {
                        selection2 = card;
                        card2selected = true;
                        checkMatch();
                    }
                }
            }
        });

        view.findViewById(R.id.cardback4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView card = (ImageView) view;
                if ((!card1selected || !card2selected) && (card.getDrawable().getConstantState() ==
                        SecondFragment.this.getResources().getDrawable(R.drawable.cardback).getConstantState()))
                {
                    card.setImageResource(images[arrayCardRandom[3]]);
                    if (!card1selected) {
                        selection1 = card;
                        card1selected = true;
                    }
                    else {
                        selection2 = card;
                        card2selected = true;
                        checkMatch();
                    }
                }
            }
        });

        view.findViewById(R.id.cardback5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView card = (ImageView) view;
                if ((!card1selected || !card2selected) && (card.getDrawable().getConstantState() ==
                        SecondFragment.this.getResources().getDrawable(R.drawable.cardback).getConstantState()))
                {
                    card.setImageResource(images[arrayCardRandom[4]]);
                    if (!card1selected) {
                        selection1 = card;
                        card1selected = true;
                    }
                    else {
                        selection2 = card;
                        card2selected = true;
                        checkMatch();
                    }
                }
            }
        });

        view.findViewById(R.id.cardback6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView card = (ImageView) view;
                if ((!card1selected || !card2selected) && (card.getDrawable().getConstantState() ==
                        SecondFragment.this.getResources().getDrawable(R.drawable.cardback).getConstantState()))
                {
                    card.setImageResource(images[arrayCardRandom[5]]);
                    if (!card1selected) {
                        selection1 = card;
                        card1selected = true;
                    }
                    else {
                        selection2 = card;
                        card2selected = true;
                        checkMatch();
                    }
                }
            }
        });

        view.findViewById(R.id.cardback7).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView card = (ImageView) view;
                if ((!card1selected || !card2selected) && (card.getDrawable().getConstantState() ==
                        SecondFragment.this.getResources().getDrawable(R.drawable.cardback).getConstantState()))
                {
                    card.setImageResource(images[arrayCardRandom[6]]);
                    if (!card1selected) {
                        selection1 = card;
                        card1selected = true;
                    }
                    else {
                        selection2 = card;
                        card2selected = true;
                        checkMatch();
                    }
                }
            }
        });

        view.findViewById(R.id.cardback8).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView card = (ImageView) view;
                if ((!card1selected || !card2selected) && (card.getDrawable().getConstantState() ==
                        SecondFragment.this.getResources().getDrawable(R.drawable.cardback).getConstantState()))
                {
                    card.setImageResource(images[arrayCardRandom[7]]);
                    if (!card1selected) {
                        selection1 = card;
                        card1selected = true;
                    }
                    else {
                        selection2 = card;
                        card2selected = true;
                        checkMatch();
                    }
                }
            }
        });

        view.findViewById(R.id.cardback9).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView card = (ImageView) view;
                if ((!card1selected || !card2selected) && (card.getDrawable().getConstantState() ==
                        SecondFragment.this.getResources().getDrawable(R.drawable.cardback).getConstantState()))
                {
                    card.setImageResource(images[arrayCardRandom[8]]);
                    if (!card1selected) {
                        selection1 = card;
                        card1selected = true;
                    }
                    else {
                        selection2 = card;
                        card2selected = true;
                        checkMatch();
                    }
                }
            }
        });

        view.findViewById(R.id.cardback10).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView card = (ImageView) view;
                if ((!card1selected || !card2selected) && (card.getDrawable().getConstantState() ==
                        SecondFragment.this.getResources().getDrawable(R.drawable.cardback).getConstantState()))
                {
                    card.setImageResource(images[arrayCardRandom[9]]);
                    if (!card1selected) {
                        selection1 = card;
                        card1selected = true;
                    }
                    else {
                        selection2 = card;
                        card2selected = true;
                        checkMatch();
                    }
                }
            }
        });

        view.findViewById(R.id.cardback11).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView card = (ImageView) view;
                if ((!card1selected || !card2selected) && (card.getDrawable().getConstantState() ==
                        SecondFragment.this.getResources().getDrawable(R.drawable.cardback).getConstantState()))
                {
                    card.setImageResource(images[arrayCardRandom[10]]);
                    if (!card1selected) {
                        selection1 = card;
                        card1selected = true;
                    }
                    else {
                        selection2 = card;
                        card2selected = true;
                        checkMatch();
                    }
                }
            }
        });

        view.findViewById(R.id.cardback12).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView card = (ImageView) view;
                if ((!card1selected || !card2selected) && (card.getDrawable().getConstantState() ==
                        SecondFragment.this.getResources().getDrawable(R.drawable.cardback).getConstantState()))
                {
                    card.setImageResource(images[arrayCardRandom[11]]);
                    if (!card1selected) {
                        selection1 = card;
                        card1selected = true;
                    }
                    else {
                        selection2 = card;
                        card2selected = true;
                        checkMatch();
                    }
                }
            }
        });

        view.findViewById(R.id.cardback13).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView card = (ImageView) view;
                if ((!card1selected || !card2selected) && (card.getDrawable().getConstantState() ==
                        SecondFragment.this.getResources().getDrawable(R.drawable.cardback).getConstantState()))
                {
                    card.setImageResource(images[arrayCardRandom[12]]);
                    if (!card1selected) {
                        selection1 = card;
                        card1selected = true;
                    }
                    else {
                        selection2 = card;
                        card2selected = true;
                        checkMatch();
                    }
                }
            }
        });

        view.findViewById(R.id.cardback14).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView card = (ImageView) view;
                if ((!card1selected || !card2selected) && (card.getDrawable().getConstantState() ==
                        SecondFragment.this.getResources().getDrawable(R.drawable.cardback).getConstantState()))
                {
                    card.setImageResource(images[arrayCardRandom[13]]);
                    if (!card1selected) {
                        selection1 = card;
                        card1selected = true;
                    }
                    else {
                        selection2 = card;
                        card2selected = true;
                        checkMatch();
                    }
                }
            }
        });

        view.findViewById(R.id.cardback15).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView card = (ImageView) view;
                if ((!card1selected || !card2selected) && (card.getDrawable().getConstantState() ==
                        SecondFragment.this.getResources().getDrawable(R.drawable.cardback).getConstantState()))
                {
                    card.setImageResource(images[arrayCardRandom[14]]);
                    if (!card1selected) {
                        selection1 = card;
                        card1selected = true;
                    }
                    else {
                        selection2 = card;
                        card2selected = true;
                        checkMatch();
                    }
                }
            }
        });

        view.findViewById(R.id.cardback16).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView card = (ImageView) view;
                if ((!card1selected || !card2selected) && (card.getDrawable().getConstantState() ==
                        SecondFragment.this.getResources().getDrawable(R.drawable.cardback).getConstantState()))
                {
                    card.setImageResource(images[arrayCardRandom[15]]);
                    if (!card1selected) {
                        selection1 = card;
                        card1selected = true;
                    }
                    else {
                        selection2 = card;
                        card2selected = true;
                        checkMatch();
                    }
                }
            }
        });

        view.findViewById(R.id.cardback17).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView card = (ImageView) view;
                if ((!card1selected || !card2selected) && (card.getDrawable().getConstantState() ==
                        SecondFragment.this.getResources().getDrawable(R.drawable.cardback).getConstantState()))
                {
                    card.setImageResource(images[arrayCardRandom[16]]);
                    if (!card1selected) {
                        selection1 = card;
                        card1selected = true;
                    }
                    else {
                        selection2 = card;
                        card2selected = true;
                        checkMatch();
                    }
                }
            }
        });

        view.findViewById(R.id.cardback18).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView card = (ImageView) view;
                if ((!card1selected || !card2selected) && (card.getDrawable().getConstantState() ==
                        SecondFragment.this.getResources().getDrawable(R.drawable.cardback).getConstantState()))
                {
                    card.setImageResource(images[arrayCardRandom[17]]);
                    if (!card1selected) {
                        selection1 = card;
                        card1selected = true;
                    }
                    else {
                        selection2 = card;
                        card2selected = true;
                        checkMatch();
                    }
                }
            }
        });

        view.findViewById(R.id.cardback19).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView card = (ImageView) view;
                if ((!card1selected || !card2selected) && (card.getDrawable().getConstantState() ==
                        SecondFragment.this.getResources().getDrawable(R.drawable.cardback).getConstantState()))
                {
                    card.setImageResource(images[arrayCardRandom[18]]);
                    if (!card1selected) {
                        selection1 = card;
                        card1selected = true;
                    }
                    else {
                        selection2 = card;
                        card2selected = true;
                        checkMatch();
                    }
                }
            }
        });

        view.findViewById(R.id.cardback20).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView card = (ImageView) view;
                if ((!card1selected || !card2selected) && (card.getDrawable().getConstantState() ==
                    SecondFragment.this.getResources().getDrawable(R.drawable.cardback).getConstantState()))
                {
                    card.setImageResource(images[arrayCardRandom[19]]);
                    if (!card1selected) {
                        selection1 = card;
                        card1selected = true;
                    }
                    else {
                        selection2 = card;
                        card2selected = true;
                        checkMatch();
                    }
                }
            }
        });

        view.findViewById(R.id.tryAgainButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (card1selected && card2selected) {
                    selection1.setImageResource(R.drawable.cardback);
                    selection2.setImageResource(R.drawable.cardback);
                    card1selected = false;
                    card2selected = false;
                }
            }
        });

        view.findViewById(R.id.newGameButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(SecondFragment.this)
                        .navigate(R.id.action_SecondFragment_self);
            }
        });
    }

    public void checkMatch() {
        if (selection1.getDrawable().getConstantState() == selection2.getDrawable().getConstantState())
        {
            card1selected = false;
            card2selected = false;
            numCorrect += 2;
            score += 2;
//            if (numCorrect == numCards)
//                NavHostFragment.findNavController(SecondFragment.this)
//                        .navigate(R.id.action_SecondFragment_to_postGameFragment);
        }
        else {
            if(score > 0)
                score--;
        }
    }

    public void arrayShuffle(int[] array)
    {
        Random rnd = new Random();
        for (int i = array.length - 1; i > 0; i--)
        {
            int index = rnd.nextInt(i + 1);
            int a = array[index];
            array[index] = array[i];
            array[i] = a;
        }
    }

    public void initializeGame(View v)
    {
        ImageView card;
        card1selected = false;
        card2selected = false;
        gameEnded = false;
        numCorrect = 0;
        numCards = MainActivity.userCardInput;
        score = 0;
        arrayCardRandom = new int[numCards];
        images = new Integer[numCards];
        int imagesIndex = 0;

        for (int i = 0; i < numCards; i++)
            arrayCardRandom[i] = i;
        arrayShuffle(arrayCardRandom);

        arrayShuffle(arrayAnimalRandom);

        for(int i = 0; i < numCards / 2; i++)
        {
            if (arrayAnimalRandom[i] == 0)
            {
                images[imagesIndex] = R.drawable.catcard;
                imagesIndex++;
                images[imagesIndex] = R.drawable.catcard;
                imagesIndex++;
            }

            if (arrayAnimalRandom[i] == 1)
            {
                images[imagesIndex] = R.drawable.deercard;
                imagesIndex++;
                images[imagesIndex] = R.drawable.deercard;
                imagesIndex++;
            }

            if (arrayAnimalRandom[i] == 2)
            {
                images[imagesIndex] = R.drawable.dodocard;
                imagesIndex++;
                images[imagesIndex] = R.drawable.dodocard;
                imagesIndex++;
            }

            if (arrayAnimalRandom[i] == 3)
            {
                images[imagesIndex] = R.drawable.dogcard;
                imagesIndex++;
                images[imagesIndex] = R.drawable.dogcard;
                imagesIndex++;
            }

            if (arrayAnimalRandom[i] == 4)
            {
                images[imagesIndex] = R.drawable.duckcard;
                imagesIndex++;
                images[imagesIndex] = R.drawable.duckcard;
                imagesIndex++;
            }

            if (arrayAnimalRandom[i] == 5)
            {
                images[imagesIndex] = R.drawable.octopuscard;
                imagesIndex++;
                images[imagesIndex] = R.drawable.octopuscard;
                imagesIndex++;
            }

            if (arrayAnimalRandom[i] == 6)
            {
                images[imagesIndex] = R.drawable.owlcard;
                imagesIndex++;
                images[imagesIndex] = R.drawable.owlcard;
                imagesIndex++;
            }

            if (arrayAnimalRandom[i] == 7)
            {
                images[imagesIndex] = R.drawable.squirrelcard;
                imagesIndex++;
                images[imagesIndex] = R.drawable.squirrelcard;
                imagesIndex++;
            }

            if (arrayAnimalRandom[i] == 8)
            {
                images[imagesIndex] = R.drawable.tanukicard;
                imagesIndex++;
                images[imagesIndex] = R.drawable.tanukicard;
                imagesIndex++;
            }

            if (arrayAnimalRandom[i] == 9)
            {
                images[imagesIndex] = R.drawable.wolfcard;
                imagesIndex++;
                images[imagesIndex] = R.drawable.wolfcard;
                imagesIndex++;
            }
        }

        if (numCards < 20)
        {
            card = (ImageView) v.findViewById(R.id.cardback20);
            card.setVisibility(View.INVISIBLE);
            v.findViewById(R.id.cardback19).setVisibility(View.INVISIBLE);
        }
        if (numCards < 18)
        {
            card = (ImageView) v.findViewById(R.id.cardback18);
            card.setVisibility(View.INVISIBLE);
            card = (ImageView) v.findViewById(R.id.cardback17);
            card.setVisibility(View.INVISIBLE);
        }
        if (numCards < 16)
        {
            card = (ImageView) v.findViewById(R.id.cardback16);
            card.setVisibility(View.INVISIBLE);
            card = (ImageView) v.findViewById(R.id.cardback15);
            card.setVisibility(View.INVISIBLE);
        }
        if (numCards < 14)
        {
            card = (ImageView) v.findViewById(R.id.cardback14);
            card.setVisibility(View.INVISIBLE);
            card = (ImageView) v.findViewById(R.id.cardback13);
            card.setVisibility(View.INVISIBLE);
        }
        if (numCards < 12)
        {
            card = (ImageView) v.findViewById(R.id.cardback12);
            card.setVisibility(View.INVISIBLE);
            card = (ImageView) v.findViewById(R.id.cardback11);
            card.setVisibility(View.INVISIBLE);
        }
        if (numCards < 10)
        {
            card = (ImageView) v.findViewById(R.id.cardback10);
            card.setVisibility(View.INVISIBLE);
            card = (ImageView) v.findViewById(R.id.cardback9);
            card.setVisibility(View.INVISIBLE);
        }
        if (numCards < 8)
        {
            card = (ImageView) v.findViewById(R.id.cardback8);
            card.setVisibility(View.INVISIBLE);
            card = (ImageView) v.findViewById(R.id.cardback7);
            card.setVisibility(View.INVISIBLE);
        }
        if (numCards < 6)
        {
            card = (ImageView) v.findViewById(R.id.cardback6);
            card.setVisibility(View.INVISIBLE);
            card = (ImageView) v.findViewById(R.id.cardback5);
            card.setVisibility(View.INVISIBLE);
        }
    }
}