package com.example.newstrial;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    Context context;
    ArrayList<ModelNews> modelNewsArrayList;

    public Adapter(Context context, ArrayList<ModelNews> modelNewsArrayList) {
        this.context = context;
        this.modelNewsArrayList = modelNewsArrayList;
    }

    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.layout_item, null, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull  Adapter.ViewHolder holder, int position) {
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, webview.class);
                intent.putExtra("url",modelNewsArrayList.get(position).getUrl());
                context.startActivity(intent);
            }
        });
        holder.mtime.setText("Published At:-"+modelNewsArrayList.get(position).getPublishedAt());
        holder.mauthor.setText(modelNewsArrayList.get(position).getAuthor());
        holder.mHeading.setText(modelNewsArrayList.get(position).getTitle());
        holder.mcontent.setText(modelNewsArrayList.get(position).getDescription());
        Glide.with(context).load(modelNewsArrayList.get(position).getUrlToImage()).into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return modelNewsArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView mHeading, mcontent, mauthor, mtime;
        CardView cardView;
        ImageView imageView;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            mHeading = itemView.findViewById(R.id.mainHeading);
            mcontent = itemView.findViewById(R.id.content);
            mauthor = itemView.findViewById(R.id.author);
            mtime = itemView.findViewById(R.id.time);
            imageView = itemView.findViewById(R.id.imageview);
            cardView = itemView.findViewById(R.id.cardview);
        }
    }
}
