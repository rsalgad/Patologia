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
public class PisoFragment extends Fragment {

    private View root;

    public PisoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        root = inflater.inflate(R.layout.fragment_piso, container, false);

        return root;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        MainActivity.currentFragment = this;
        MainActivity.toolbar.setTitle("Pisos");

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

        root.findViewById(R.id.image_abaulamento).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GoToAppropriateFragment("abaulamento");
            }
        });

        root.findViewById(R.id.text_abaulamento).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GoToAppropriateFragment("abaulamento");
            }
        });

        root.findViewById(R.id.image_gretamento).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GoToAppropriateFragment("gretamento");
            }
        });

        root.findViewById(R.id.text_gretamento).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GoToAppropriateFragment("gretamento");
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
            NavHostFragment.findNavController(PisoFragment.this)
                    .navigate(R.id.action_pisoFragment_to_pisoTrincaFragment);
        } else if (text == "abaulamento"){
            NavHostFragment.findNavController(PisoFragment.this)
                    .navigate(R.id.action_pisoFragment_to_pisoAbaulamentoFragment);
        } else if (text == "gretamento"){
            NavHostFragment.findNavController(PisoFragment.this)
                    .navigate(R.id.action_pisoFragment_to_pisoGretamentoFragment);
        }
        else {
            NavHostFragment.findNavController(PisoFragment.this)
                    .navigate(R.id.action_pisoFragment_to_homeFragment);
        }
    }
}
