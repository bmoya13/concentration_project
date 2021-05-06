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
    ImageView selection1, selection2;
    boolean card1selected, card2selected;
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

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        card1selected = false;
        card2selected = false;
        arrayShuffle(arrayRandom);
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.returnButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
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
                    card.setImageResource(images[arrayRandom[0]]);
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
                    card.setImageResource(images[arrayRandom[1]]);
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
                    card.setImageResource(images[arrayRandom[2]]);
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
                    card.setImageResource(images[arrayRandom[3]]);
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
                    card.setImageResource(images[arrayRandom[4]]);
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
                    card.setImageResource(images[arrayRandom[5]]);
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
                    card.setImageResource(images[arrayRandom[6]]);
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
                    card.setImageResource(images[arrayRandom[7]]);
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
                    card.setImageResource(images[arrayRandom[8]]);
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
                    card.setImageResource(images[arrayRandom[9]]);
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
                    card.setImageResource(images[arrayRandom[10]]);
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
                    card.setImageResource(images[arrayRandom[11]]);
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
                    card.setImageResource(images[arrayRandom[12]]);
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
                    card.setImageResource(images[arrayRandom[13]]);
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
                    card.setImageResource(images[arrayRandom[14]]);
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
                    card.setImageResource(images[arrayRandom[15]]);
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
                    card.setImageResource(images[arrayRandom[16]]);
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
                    card.setImageResource(images[arrayRandom[17]]);
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
                    card.setImageResource(images[arrayRandom[18]]);
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
                    card.setImageResource(images[arrayRandom[19]]);
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
}