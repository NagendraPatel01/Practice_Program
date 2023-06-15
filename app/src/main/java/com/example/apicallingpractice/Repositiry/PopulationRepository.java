package com.example.apicallingpractice.Repositiry;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.apicallingpractice.model.PopulationModel;
import com.example.apicallingpractice.model.getmycustomer;
import com.example.apicallingpractice.networking.MyInterFace;
import com.example.apicallingpractice.networking.RetrofitClientPopulationmvvm;

import java.util.Collections;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PopulationRepository {

    MyInterFace myInterFace;

    public PopulationRepository() {

        myInterFace= RetrofitClientPopulationmvvm.getRetrofit().create(MyInterFace.class);
    }

    public LiveData<List<PopulationModel>> getpopulation(String country){

        MutableLiveData<List<PopulationModel>> mutableLiveData = new MutableLiveData<>();

        myInterFace.NationPopulation(country).enqueue(new Callback<List<PopulationModel>>() {
            @Override
            public void onResponse(Call<List<PopulationModel>> call, Response<List<PopulationModel>> response) {

                List<PopulationModel> list = response.body();
                mutableLiveData.postValue(list);
            }

            @Override
            public void onFailure(Call<List<PopulationModel>> call, Throwable t) {

            }
        });
        return mutableLiveData;
    }
}
