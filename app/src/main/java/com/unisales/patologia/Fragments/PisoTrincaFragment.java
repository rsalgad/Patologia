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
public class PisoTrincaFragment extends Fragment {

    private View root;

    public PisoTrincaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        root = inflater.inflate(R.layout.fragment_piso_trinca, container, false);
        MainActivity.pisoTrincaFragment = this;

        return root;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        MainActivity.currentFragment = this;
        MainActivity.toolbar.setTitle("Trinca");

        root.findViewById(R.id.botao_piso_trinca_voltar).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(PisoTrincaFragment.this)
                        .navigate(R.id.action_pisoTrincaFragment_to_pisoFragment);
            }
        });

        root.findViewById(R.id.botao_piso_trinca_defcivil).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.LigarDefesaCivil(PisoTrincaFragment.this);
            }
        });
    }
}
