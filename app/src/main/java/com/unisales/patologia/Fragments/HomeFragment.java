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
public class HomeFragment extends Fragment {

    private View root;
    private Button botao_parede;
    private Button botao_piso;
    private Button botao_teto;
    private Button botao_estrutura;

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        root = inflater.inflate(R.layout.fragment_home, container, false);
        MainActivity.homeFragment = this;
        botao_parede = root.findViewById(R.id.botao_parede);
        botao_parede.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.topMenu.getItem(0).setVisible(false);
                NavHostFragment.findNavController(HomeFragment.this)
                        .navigate(R.id.action_homeFragment_to_paredeFragment);
            }
        });
        botao_teto = root.findViewById(R.id.botao_teto);
        botao_teto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.topMenu.getItem(0).setVisible(false);
                NavHostFragment.findNavController(HomeFragment.this)
                        .navigate(R.id.action_homeFragment_to_tetoFragment);
            }
        });
        botao_piso = root.findViewById(R.id.botao_piso);
        botao_piso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.topMenu.getItem(0).setVisible(false);
                NavHostFragment.findNavController(HomeFragment.this)
                        .navigate(R.id.action_homeFragment_to_pisoFragment);
            }
        });
        botao_estrutura = root.findViewById(R.id.botao_estrutura);
        botao_estrutura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.topMenu.getItem(0).setVisible(false);
                NavHostFragment.findNavController(HomeFragment.this)
                        .navigate(R.id.action_homeFragment_to_estruturaFragment);
            }
        });
        MainActivity.topMenu.getItem(0).setVisible(true);
        return root;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        MainActivity.currentFragment = this;
        MainActivity.toolbar.setVisibility(View.VISIBLE);
        MainActivity.toolbar.setTitle("Patologias");
    }


}
