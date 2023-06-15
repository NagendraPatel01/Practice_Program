package com.example.apicallingpractice.Repositiry;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.apicallingpractice.model.AllpagesModel;
import com.example.apicallingpractice.networking.MyInterFace;
import com.example.apicallingpractice.networking.RetrofitClientAllPagesmvvm;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AllPagesReposetory {

    MyInterFace myInterFace;

    public AllPagesReposetory() {

        myInterFace = RetrofitClientAllPagesmvvm.getRetrofit().create(MyInterFace.class);
    }

    public MutableLiveData<AllpagesModel> getpages(int page, int per_page) {

        MutableLiveData<AllpagesModel> mutableLiveData = new MutableLiveData<>();

        myInterFace.Allpages(page, per_page).enqueue(new Callback<AllpagesModel>() {
            @Override
            public void onResponse(Call<AllpagesModel> call, Response<AllpagesModel> response) {

                mutableLiveData.setValue(response.body());
            }

            @Override
            public void onFailure(Call<AllpagesModel> call, Throwable t) {

            }
        });

        return mutableLiveData;
    }
}
