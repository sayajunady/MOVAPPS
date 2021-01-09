package com.junadhi.movapps.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.junadhi.movapps.R;
import com.junadhi.movapps.adapter.ListCinemaAdapter;
import com.junadhi.movapps.data.CinemaData;
import com.junadhi.movapps.model.Cinema;

import java.util.ArrayList;


public class CinemaFragment extends Fragment {
    private RecyclerView rvCinema;
    private ArrayList<Cinema> list = new ArrayList<>();


    public CinemaFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_cinema, container, false);
        rvCinema = view.findViewById(R.id.cinemaFragment);
        rvCinema.setHasFixedSize(true);

        list.addAll(CinemaData.getCinemsList());
        showRecyclerList();

        return view;
    }

    private void showRecyclerList() {
        rvCinema.setLayoutManager(new LinearLayoutManager(this.getContext()));
        ListCinemaAdapter listCinemaAdapter = new ListCinemaAdapter(list, requireContext());
        listCinemaAdapter.setListCinema(list);
        rvCinema.setAdapter(listCinemaAdapter);

    }
}