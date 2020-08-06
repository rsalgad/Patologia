package com.unisales.patologia.Fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.unisales.patologia.Activities.MainActivity;
import com.unisales.patologia.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ParedeVerticalFragment extends Fragment {

    private View root;
    private Button voltar;

    public ParedeVerticalFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        root = inflater.inflate(R.layout.fragment_parede_vertical, container, false);
        MainActivity.paredeVerticalFragment = this;
        voltar  = root.findViewById(R.id.botao_parede_vertical_voltar);
        return root;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        MainActivity.currentFragment = this;
        MainActivity.toolbar.setTitle("Vertical");


        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(ParedeVerticalFragment.this)
                        .navigate(R.id.action_paredeVerticalFragment_to_paredeFragment);
            }
        });

        root.findViewById(R.id.botao_parede_vertical_defcivil).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.LigarDefesaCivil(ParedeVerticalFragment.this);
            }
        });
    }
}
