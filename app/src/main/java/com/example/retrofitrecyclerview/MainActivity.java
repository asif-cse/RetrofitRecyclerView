package com.example.retrofitrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private MyAdapter adapter;
    private RecyclerView recyclerView;
    private ArrayList<ItemData> itemData=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerId);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        getPlayerResponse();

    }

    private void getPlayerResponse() {
        Retrofit retrofit = new Retrofit.Builder().baseUrl("https://cricket.sportmonks.com/api/v2.0/")
                .addConverterFactory(GsonConverterFactory.create()).build();

        RequestInterface requestInterface = retrofit.create(RequestInterface.class);
        Call<ArrayDataClass> call = requestInterface.getData("wQqFZJCmB56orwySynbgVU8nq8BiR7jN1itbyg7RjABmzdrsHP16vh3tMpb0");

        call.enqueue(new Callback<ArrayDataClass>() {
            @Override
            public void onResponse(Call<ArrayDataClass> call, Response<ArrayDataClass> response) {
                itemData = new ArrayList<>(response.body().getData());
                adapter = new MyAdapter(getApplicationContext(),itemData);
                recyclerView.setAdapter(adapter);
                Log.e("id","fail");
                Toast.makeText(getApplicationContext(),"onResponse", Toast.LENGTH_SHORT).show();

            }
            @Override
            public void onFailure(Call<ArrayDataClass> call, Throwable t) {
                Toast.makeText(getApplicationContext(),"onFailure", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
