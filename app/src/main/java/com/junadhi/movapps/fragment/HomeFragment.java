package com.junadhi.movapps.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.junadhi.movapps.adapter.CardViewMovieAdapter;
import com.junadhi.movapps.model.Movie;
import com.junadhi.movapps.data.MovieData;
import com.junadhi.movapps.R;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    private RecyclerView rvMovie;
    private ArrayList<Movie> list = new ArrayList<>();

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        rvMovie = view.findViewById(R.id.homeFragmentMovie);
        rvMovie.setHasFixedSize(true);

        list.addAll(MovieData.getMovieList());
        showRecyclerCardView();

        return view;

    }

    private void showRecyclerCardView(){
        rvMovie.setLayoutManager(new GridLayoutManager(this.getContext(), 2));
        CardViewMovieAdapter cardViewMovieAdapter = new CardViewMovieAdapter(this.getContext());
        cardViewMovieAdapter.setListMovie(list);
        rvMovie.setAdapter(cardViewMovieAdapter);
    }

}
