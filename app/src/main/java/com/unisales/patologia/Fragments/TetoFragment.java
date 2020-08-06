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
public class TetoFragment extends Fragment {

    private View root;

    public TetoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        root = inflater.inflate(R.layout.fragment_teto, container, false);

        return root;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        MainActivity.currentFragment = this;
        MainActivity.toolbar.setTitle("Tetos");

        root.findViewById(R.id.image_trinca).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GoToAppropriateFragment("trinca");
            }
        });

        root.findViewById(R.id.text_trinca).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GoToAppropriateFragment("trinca");
            }
        });

        root.findViewById(R.id.image_infiltracao).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GoToAppropriateFragment("infiltracao");
            }
        });

        root.findViewById(R.id.text_infiltracao).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GoToAppropriateFragment("infiltracao");
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
        if (text == "trinca"){
            NavHostFragment.findNavController(TetoFragment.this)
                    .navigate(R.id.action_tetoFragment_to_tetoTrincaFragment);
        } else if (text == "voltar") {
            NavHostFragment.findNavController(TetoFragment.this)
                    .navigate(R.id.action_tetoFragment_to_homeFragment);
        } else {
            NavHostFragment.findNavController(TetoFragment.this)
                    .navigate(R.id.action_tetoFragment_to_tetoInfiltracaoFragment);
        }
    }
}
