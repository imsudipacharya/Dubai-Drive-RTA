package com.techacharya.dubaidriverta;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;
import java.util.List;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MyViewHolder> {

    Context context;
    List<Movie> mData;
    List<Movie> mDatas;

    MovieItemClickListener movieItemClickListener;
    RequestOptions option;


    public MovieAdapter(Context context, List<Movie> mData, MovieItemClickListener listener) {
        this.context = context;
        this.mData = mData;
        movieItemClickListener = listener;

        option = new RequestOptions().centerCrop().placeholder(R.drawable.mov2).error(R.drawable.mov2);
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {


        View view = LayoutInflater.from(context).inflate(R.layout.item_movie, viewGroup, false);
        return new MyViewHolder(view);


    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {


        myViewHolder.TvName.setText(mData.get(i).getName());

        // Load Image from the internet and set it into Imageview using Glide
        Glide.with(context).load(mData.get(i).getImg()).apply(option).into(myViewHolder.ImgMovie);


    }

    @Override
    public int getItemCount() {
        return mData.size();

    }


    public void filterList(ArrayList<Movie> filteredList) {
        mData = filteredList;
        notifyDataSetChanged();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView TvName;
        private ImageView ImgMovie;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            TvName = itemView.findViewById(R.id.item_movie_title);
            ImgMovie = itemView.findViewById(R.id.item_movie_img);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    movieItemClickListener.onMovieClick(mData.get(getAdapterPosition()), ImgMovie);


                }
            });

        }
    }
}
