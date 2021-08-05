package com.example.newstrial.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.newstrial.Adapter;
import com.example.newstrial.ApiUtilities;
import com.example.newstrial.ModelNews;
import com.example.newstrial.R;
import com.example.newstrial.mainNews;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class EntertainmentFragment extends Fragment {

    String apiKey = "2a6cc099d20c4255899fd5e8669f93d0";
    ArrayList<ModelNews> modelNewsArrayList;
    Adapter adapter;
    String country="us";
    private RecyclerView recyclerViewOfEntertainment;
    private String Category = "entertainment";

    @Override
    public View onCreateView(@NonNull  LayoutInflater inflater, @Nullable  ViewGroup container, @Nullable  Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.entertainmentfragment, null);

        recyclerViewOfEntertainment = v.findViewById(R.id.recyclerviewofentertainment);
        modelNewsArrayList = new ArrayList<>();
        recyclerViewOfEntertainment.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter = new Adapter(getContext(),modelNewsArrayList);
        recyclerViewOfEntertainment.setAdapter(adapter);

        findNews();

        return v;
    }

    private void findNews() {
        ApiUtilities.getApiInterface().getCategoryNews(country, Category, 100, apiKey).enqueue(new Callback<mainNews>() {
            @Override
            public void onResponse(Call<mainNews> call, Response<mainNews> response) {
                if (response.isSuccessful())
                {
                    modelNewsArrayList.addAll(response.body().getArticles());
                    adapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onFailure(Call<mainNews> call, Throwable t) {

            }
        });
    }
}