package com.example.androidproject;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

public class SecondFragment extends Fragment {
    ImageView selection1, selection2;
    boolean card1selected, card2selected;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        card1selected = false;
        card2selected = false;
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
                if (!card1selected || !card2selected) {
                    ImageView card = (ImageView) view;
                    card.setImageResource(R.drawable.catcard);
                    if (!card1selected) {
                        selection1 = card;
                        card1selected = true;
                    }
                    else {
                        selection2 = card;
                        card2selected = true;
                    }
                }
            }
        });

        view.findViewById(R.id.cardback2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!card1selected || !card2selected) {
                    ImageView card = (ImageView) view;
                    card.setImageResource(R.drawable.catcard);
                    if (!card1selected) {
                        selection1 = card;
                        card1selected = true;
                    }
                    else {
                        selection2 = card;
                        card2selected = true;
                    }
                }
            }
        });

        view.findViewById(R.id.cardback3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!card1selected || !card2selected) {
                    ImageView card = (ImageView) view;
                    card.setImageResource(R.drawable.deercard);
                    if (!card1selected) {
                        selection1 = card;
                        card1selected = true;
                    }
                    else {
                        selection2 = card;
                        card2selected = true;
                    }
                }
            }
        });

        view.findViewById(R.id.cardback4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!card1selected || !card2selected) {
                    ImageView card = (ImageView) view;
                    card.setImageResource(R.drawable.deercard);
                    if (!card1selected) {
                        selection1 = card;
                        card1selected = true;
                    }
                    else {
                        selection2 = card;
                        card2selected = true;
                    }
                }
            }
        });

        view.findViewById(R.id.cardback5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!card1selected || !card2selected) {
                    ImageView card = (ImageView) view;
                    card.setImageResource(R.drawable.dodocard);
                    if (!card1selected) {
                        selection1 = card;
                        card1selected = true;
                    }
                    else {
                        selection2 = card;
                        card2selected = true;
                    }
                }
            }
        });

        view.findViewById(R.id.cardback6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!card1selected || !card2selected) {
                    ImageView card = (ImageView) view;
                    card.setImageResource(R.drawable.dodocard);
                    if (!card1selected) {
                        selection1 = card;
                        card1selected = true;
                    }
                    else {
                        selection2 = card;
                        card2selected = true;
                    }
                }
            }
        });

        view.findViewById(R.id.cardback7).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!card1selected || !card2selected) {
                    ImageView card = (ImageView) view;
                    card.setImageResource(R.drawable.dogcard);
                    if (!card1selected) {
                        selection1 = card;
                        card1selected = true;
                    }
                    else {
                        selection2 = card;
                        card2selected = true;
                    }
                }
            }
        });

        view.findViewById(R.id.cardback8).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!card1selected || !card2selected) {
                    ImageView card = (ImageView) view;
                    card.setImageResource(R.drawable.dogcard);
                    if (!card1selected) {
                        selection1 = card;
                        card1selected = true;
                    }
                    else {
                        selection2 = card;
                        card2selected = true;
                    }
                }
            }
        });

        view.findViewById(R.id.cardback9).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!card1selected || !card2selected) {
                    ImageView card = (ImageView) view;
                    card.setImageResource(R.drawable.duckcard);
                    if (!card1selected) {
                        selection1 = card;
                        card1selected = true;
                    }
                    else {
                        selection2 = card;
                        card2selected = true;
                    }
                }
            }
        });

        view.findViewById(R.id.cardback10).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!card1selected || !card2selected) {
                    ImageView card = (ImageView) view;
                    card.setImageResource(R.drawable.duckcard);
                    if (!card1selected) {
                        selection1 = card;
                        card1selected = true;
                    }
                    else {
                        selection2 = card;
                        card2selected = true;
                    }
                }
            }
        });

        view.findViewById(R.id.cardback11).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!card1selected || !card2selected) {
                    ImageView card = (ImageView) view;
                    card.setImageResource(R.drawable.octopuscard);
                    if (!card1selected) {
                        selection1 = card;
                        card1selected = true;
                    }
                    else {
                        selection2 = card;
                        card2selected = true;
                    }
                }
            }
        });

        view.findViewById(R.id.cardback12).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!card1selected || !card2selected) {
                    ImageView card = (ImageView) view;
                    card.setImageResource(R.drawable.octopuscard);
                    if (!card1selected) {
                        selection1 = card;
                        card1selected = true;
                    }
                    else {
                        selection2 = card;
                        card2selected = true;
                    }
                }
            }
        });

        view.findViewById(R.id.cardback13).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!card1selected || !card2selected) {
                    ImageView card = (ImageView) view;
                    card.setImageResource(R.drawable.owlcard);
                    if (!card1selected) {
                        selection1 = card;
                        card1selected = true;
                    }
                    else {
                        selection2 = card;
                        card2selected = true;
                    }
                }
            }
        });

        view.findViewById(R.id.cardback14).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!card1selected || !card2selected) {
                    ImageView card = (ImageView) view;
                    card.setImageResource(R.drawable.owlcard);
                    if (!card1selected) {
                        selection1 = card;
                        card1selected = true;
                    }
                    else {
                        selection2 = card;
                        card2selected = true;
                    }
                }
            }
        });

        view.findViewById(R.id.cardback15).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!card1selected || !card2selected) {
                    ImageView card = (ImageView) view;
                    card.setImageResource(R.drawable.squirrelcard);
                    if (!card1selected) {
                        selection1 = card;
                        card1selected = true;
                    }
                    else {
                        selection2 = card;
                        card2selected = true;
                    }
                }
            }
        });

        view.findViewById(R.id.cardback16).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!card1selected || !card2selected) {
                    ImageView card = (ImageView) view;
                    card.setImageResource(R.drawable.squirrelcard);
                    if (!card1selected) {
                        selection1 = card;
                        card1selected = true;
                    }
                    else {
                        selection2 = card;
                        card2selected = true;
                    }
                }
            }
        });

        view.findViewById(R.id.cardback17).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!card1selected || !card2selected) {
                    ImageView card = (ImageView) view;
                    card.setImageResource(R.drawable.tanukicard);
                    if (!card1selected) {
                        selection1 = card;
                        card1selected = true;
                    }
                    else {
                        selection2 = card;
                        card2selected = true;
                    }
                }
            }
        });

        view.findViewById(R.id.cardback18).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!card1selected || !card2selected) {
                    ImageView card = (ImageView) view;
                    card.setImageResource(R.drawable.tanukicard);
                    if (!card1selected) {
                        selection1 = card;
                        card1selected = true;
                    }
                    else {
                        selection2 = card;
                        card2selected = true;
                    }
                }
            }
        });

        view.findViewById(R.id.cardback19).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!card1selected || !card2selected) {
                    ImageView card = (ImageView) view;
                    card.setImageResource(R.drawable.wolfcard);
                    if (!card1selected) {
                        selection1 = card;
                        card1selected = true;
                    }
                    else {
                        selection2 = card;
                        card2selected = true;
                    }
                }
            }
        });

        view.findViewById(R.id.cardback20).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!card1selected || !card2selected) {
                    ImageView card = (ImageView) view;
                    card.setImageResource(R.drawable.wolfcard);
                    if (!card1selected) {
                        selection1 = card;
                        card1selected = true;
                    }
                    else {
                        selection2 = card;
                        card2selected = true;
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
}