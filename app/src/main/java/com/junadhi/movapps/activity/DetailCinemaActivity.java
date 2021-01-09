package com.junadhi.movapps.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.junadhi.movapps.R;
import com.junadhi.movapps.model.Cinema;

public class DetailCinemaActivity extends AppCompatActivity implements OnMapReadyCallback {
    private Cinema cinema;
    public static final String ITEM_EXTRA = "item_extra";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_cinema);

        ImageView imgItemPhoto = findViewById(R.id.img_item_photo);
        TextView tvName = findViewById(R.id.tv_item_name);
        TextView tvAddress = findViewById(R.id.tv_item_address);
        SupportMapFragment mapFragment = (SupportMapFragment)
                getSupportFragmentManager().findFragmentById(R.id.map_detail);
        if (mapFragment != null) {
            mapFragment.getMapAsync(this);
        }

        cinema = getIntent().getParcelableExtra(ITEM_EXTRA);

        if (cinema != null) {
            Glide.with(this)
                    .load(cinema.getPhoto())
                    .into(imgItemPhoto);
            tvName.setText(cinema.getName());
            Log.e("LAT", String.valueOf(cinema.getLatitude()));
            Log.e("LNG", String.valueOf(cinema.getLongitude()));
            tvAddress.setText(cinema.getAddress());
        }

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Detail Cinema");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

    }

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        LatLng latLng;
        if (cinema != null) {
            latLng = new LatLng(cinema.getLatitude(), cinema.getLongitude());
        } else {
            latLng = new LatLng(0.448707, 101.397632);
        }
        MarkerOptions options = new MarkerOptions();
        options.position(latLng).title(cinema.getAddress());
        googleMap.addMarker(options);
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(latLng));
    }
}
