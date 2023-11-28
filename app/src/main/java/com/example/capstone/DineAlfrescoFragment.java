package com.example.capstone;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class DineAlfrescoFragment extends Fragment {

    CardView alFrescoCasa, alFrescoPalmeras, alFrescoSulyap;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_dine_alfresco, container, false);

        /*CardViews*/
        alFrescoCasa = view.findViewById(R.id.alFrescoCasa);
        alFrescoPalmeras = view.findViewById(R.id.alFrescoPalmeras);
        alFrescoSulyap = view.findViewById(R.id.alFrescoSulyap);

        alFrescoCasa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToDineCasaActivity (view);
            }
        });

        alFrescoPalmeras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToDinePalmerasActivity (view);
            }
        });

        alFrescoSulyap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToDineSulyapActivity (view);
            }
        });

        return view;
    }

    private void goToDinePalmerasActivity(View view) {
        Intent intent = new Intent(getActivity(), DinePalmerasActivity .class);
        startActivity(intent);
    }
    private void goToDineSulyapActivity(View view) {
        Intent intent = new Intent(getActivity(), DineSulyapActivity .class);
        startActivity(intent);
    }
    private void goToDineCasaActivity(View view) {
        Intent intent = new Intent(getActivity(), DineCasaActivity .class);
        startActivity(intent);
    }
}



