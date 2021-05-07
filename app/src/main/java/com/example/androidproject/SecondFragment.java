package com.example.androidproject;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
    ImageView selection1, selection2;
    boolean card1selected, card2selected;
    int[] arrayCardRandom;
    int[] arrayAnimalRandom = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    Integer images[];
    /*
    int[] arrayRandom = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
    Integer images[] = {
            R.drawable.catcard,
            R.drawable.catcard,
            R.drawable.deercard,
            R.drawable.deercard,
            R.drawable.dodocard,
            R.drawable.dodocard,
            R.drawable.dogcard,
            R.drawable.dogcard,
            R.drawable.duckcard,
            R.drawable.duckcard,
            R.drawable.octopuscard,
            R.drawable.octopuscard,
            R.drawable.owlcard,
            R.drawable.owlcard,
            R.drawable.squirrelcard,
            R.drawable.squirrelcard,
            R.drawable.tanukicard,
            R.drawable.tanukicard,
            R.drawable.wolfcard,
            R.drawable.wolfcard
    };
     */

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

        view.findViewById(R.id.returnButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.userCardInput = 0;
                NavHostFragment.findNavController(SecondFragment.this)
                        .navigate(R.id.action_SecondFragment_to_FirstFragment);
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
    }

    public void checkMatch() {
        if (selection1.getDrawable().getConstantState() == selection2.getDrawable().getConstantState())
        {
            card1selected = false;
            card2selected = false;
            numCorrect += 2;
            if (numCorrect == numCards)
                NavHostFragment.findNavController(SecondFragment.this)
                        .navigate(R.id.action_SecondFragment_to_FirstFragment);
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
        numCorrect = 0;
        numCards = MainActivity.userCardInput;
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