package com.unisales.patologia.Fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.unisales.patologia.Activities.MainActivity;
import com.unisales.patologia.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ParedeFragment extends Fragment {

    private View root;

    public ParedeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        root = inflater.inflate(R.layout.fragment_parede, container, false);

        return root;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        MainActivity.currentFragment = this;
        MainActivity.toolbar.setTitle("Paredes");

        root.findViewById(R.id.image_horizontal).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GoToAppropriateFragment("horizontal");
            }
        });

        root.findViewById(R.id.text_horizontal).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GoToAppropriateFragment("horizontal");
            }
        });

        root.findViewById(R.id.image_vertical).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GoToAppropriateFragment("vertical");
            }
        });

        root.findViewById(R.id.text_vertical).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GoToAppropriateFragment("vertical");
            }
        });

        root.findViewById(R.id.image_inclinado).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GoToAppropriateFragment("inclinado");
            }
        });

        root.findViewById(R.id.text_inclinado).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GoToAppropriateFragment("inclinado");
            }
        });

        root.findViewById(R.id.botao_voltar).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GoToAppropriateFragment("voltar");
            }
        });

    }

    private void GoToAppropriateFragment(String text){
        if (text == "horizontal"){
            NavHostFragment.findNavController(ParedeFragment.this)
                    .navigate(R.id.action_paredeFragment_to_paredeHorizontalFragment);
        } else if (text == "vertical"){
            NavHostFragment.findNavController(ParedeFragment.this)
                    .navigate(R.id.action_paredeFragment_to_paredeVerticalFragment);
        } else if (text == "voltar"){
            NavHostFragment.findNavController(ParedeFragment.this)
                    .navigate(R.id.action_paredeFragment_to_homeFragment);
        }
        else {
            NavHostFragment.findNavController(ParedeFragment.this)
                    .navigate(R.id.action_paredeFragment_to_paredeInclinadoFragment);
        }
    }

}
