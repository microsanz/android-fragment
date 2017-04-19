package com.example.sanjaya.maps;

import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by sanjaya on 4/7/2017.
 */

public class ExampleController implements Callback<Example> {
    static final String BASE_URL = "https://maps.googleapis.com/";
    private test test1;
    public ExampleController(test abc){
        test1 = abc;
    }


    public void start() {
        Gson gson = new GsonBuilder()
                .setLenient()
                .create();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        ExampleAPI gerritAPI = retrofit.create(ExampleAPI.class);

        Call<Example> call = gerritAPI.loadChanges("3.6168301000000005,98.66968500000002");
        call.enqueue(this);

    }
    @Override
    public void onResponse(Call<Example> call, Response<Example> response) {
        if(response.isSuccessful()) {
            Example exampleList = response.body();
            test1.onSucess(exampleList);
        } else {
        }
    }

    @Override
    public void onFailure(Call<Example> call, Throwable t) {
        Log.d("qwaerty",">> " + t.getMessage());
    }
}
