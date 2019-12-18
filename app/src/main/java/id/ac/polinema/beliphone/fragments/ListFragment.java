package id.ac.polinema.beliphone.fragments;


import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import id.ac.polinema.beliphone.R;
import id.ac.polinema.beliphone.activities.AksesorisActivity;
import id.ac.polinema.beliphone.activities.HPActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class ListFragment extends Fragment {


    public ListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View  view  = inflater.inflate(R.layout.fragment_list, container, false);

        CardView hp =  view.findViewById(R.id.hp);
        hp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getActivity(), HPActivity.class );
                startActivity(in);
            }
        });

        CardView aksesoris = view.findViewById(R.id.aksesoris);
        aksesoris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getActivity(), AksesorisActivity.class );
                startActivity(in);
            }
        });



        return view;
    }

}
