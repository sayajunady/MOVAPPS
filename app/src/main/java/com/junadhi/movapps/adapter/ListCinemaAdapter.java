package com.junadhi.movapps.adapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.request.RequestOptions;
import com.junadhi.movapps.R;
import com.junadhi.movapps.activity.DetailCinemaActivity;
import com.junadhi.movapps.model.Cinema;

import java.util.ArrayList;

public class ListCinemaAdapter extends RecyclerView.Adapter<ListCinemaAdapter.ListViewHolder> {
    private Context context;
    private ArrayList<Cinema> listCinema;

    public ArrayList<Cinema> getListCinema(){
        return listCinema;
    }

    public void setListCinema(ArrayList<Cinema> listCinema){
        this.listCinema = listCinema;
    }

    public ListCinemaAdapter(ArrayList<Cinema> list, Context context){
        this.listCinema = list;
        this.context = context;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_cardview_cinema, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        Cinema cinema = listCinema.get(position);
        Glide.with(holder.itemView.getContext())
                .load(cinema.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);
        holder.tvName.setText(cinema.getName());

    }

    @Override
    public int getItemCount() {
        return listCinema.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView imgPhoto;
        TextView tvName;

        ListViewHolder(View view) {
            super(view);
            imgPhoto =view.findViewById(R.id.img_item_cinema);
            tvName = view.findViewById(R.id.tv_item_cinema_name);
            view.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            int position = getAdapterPosition();
            Cinema cinema = getListCinema().get(position);
            Intent i = new Intent(context, DetailCinemaActivity.class);
            i.putExtra(DetailCinemaActivity.ITEM_EXTRA, cinema);
            context.startActivity(i);

        }
    }
}
