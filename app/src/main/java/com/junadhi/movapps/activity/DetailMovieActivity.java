package com.junadhi.movapps.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.junadhi.movapps.R;
import com.junadhi.movapps.model.Movie;

public class DetailMovieActivity extends AppCompatActivity {

    public static final String ITEM_EXTRA = "item_extra";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_movie);

        ImageView imgItemPhoto = findViewById(R.id.img_poster);
        TextView tvName = findViewById(R.id.tv_judul);
        TextView tvDetail = findViewById(R.id.tv_detail);
        TextView tvGenre = findViewById(R.id.tv_genre);
        TextView tvRating = findViewById(R.id.tv_rating);

        Movie movie = getIntent().getParcelableExtra(ITEM_EXTRA);

        if (movie != null) {
            Glide.with(this)
                    .load(movie.getPhoto())
                    .into(imgItemPhoto);
            tvName.setText(movie.getTitle());
            tvDetail.setText(movie.getOverview());
            tvGenre.setText(movie.getGenre());
            tvRating.setText(movie.getRating());

        }

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Detail Movie");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

    }

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}