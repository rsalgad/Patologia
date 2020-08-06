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
public class EstruturaFragment extends Fragment {

    private View root;

    public EstruturaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        root = inflater.inflate(R.layout.fragment_estrutura, container, false);

        return root;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        MainActivity.currentFragment = this;
        MainActivity.toolbar.setTitle("Estruturas");

        root.findViewById(R.id.image_corrosao).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GoToAppropriateFragment("corrosao");
            }
        });

        root.findViewById(R.id.text_corrosao).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GoToAppropriateFragment("corrosao");
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
        if (text == "corrosao"){
            NavHostFragment.findNavController(EstruturaFragment.this)
                    .navigate(R.id.action_estruturaFragment_to_estruturaCorrosaoFragment);
        } else {
            NavHostFragment.findNavController(EstruturaFragment.this)
                    .navigate(R.id.action_estruturaFragment_to_homeFragment);
        }
    }
}
