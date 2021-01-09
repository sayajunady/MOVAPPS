package com.junadhi.movapps.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.junadhi.movapps.R;
import com.junadhi.movapps.activity.DetailMovieActivity;
import com.junadhi.movapps.model.Movie;

import java.util.ArrayList;

public class CardViewMovieAdapter extends RecyclerView.Adapter<CardViewMovieAdapter.CardViewViewHolder> {
    private Context context;
    private ArrayList<Movie> listMovie;

    public ArrayList<Movie> getListMovies() {
        return listMovie;
    }

    public void setListMovie(ArrayList<Movie> listMovie) {
        this.listMovie = listMovie;
    }

    public CardViewMovieAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_cardview_movie, viewGroup, false);
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewViewHolder cardViewViewHolder, int position) {
        Movie movie = getListMovies().get(position);
        Glide.with(context)
                .load(movie.getPhoto())
                .apply(new RequestOptions().override(350, 550))
                .into(cardViewViewHolder.imgPhoto);

        cardViewViewHolder.tvTitle.setText(movie.getTitle());

    }

    @Override
    public int getItemCount() {
        return getListMovies().size();
    }

    class CardViewViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        ImageView imgPhoto;
        TextView tvTitle;

        CardViewViewHolder(@NonNull final View itemView) {
            super(itemView);

            imgPhoto = itemView.findViewById(R.id.imgPoster);
            tvTitle = itemView.findViewById(R.id.tvTitle);

            itemView.setOnClickListener(this);

        }

        @Override
        public void onClick(View v) {
            int position = getAdapterPosition();
            Movie movie = getListMovies().get(position);

            Intent intent = new Intent(context, DetailMovieActivity.class);
            intent.putExtra(DetailMovieActivity.ITEM_EXTRA, movie);
            context.startActivity(intent);


        }
    }

}


