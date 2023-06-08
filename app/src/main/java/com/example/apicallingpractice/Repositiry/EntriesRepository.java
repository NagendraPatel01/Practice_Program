package com.example.apicallingpractice.Repositiry;

import android.content.Context;
import android.widget.Toast;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.apicallingpractice.model.Entries;
import com.example.apicallingpractice.model.getmycustomer;
import com.example.apicallingpractice.networking.MyInterFace;
import com.example.apicallingpractice.networking.RetrofitClient;
import com.example.apicallingpractice.networking.RetrofitClientone;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class EntriesRepository {

   private MyInterFace myInterFace;
   Context context;

    public EntriesRepository() {

        myInterFace= RetrofitClient.getRetrofit().create(MyInterFace.class);
    }

    public LiveData<List<Entries.Entry>> getentries(){

        MutableLiveData<List<Entries.Entry>> mutableLiveData = new MutableLiveData<>();

      myInterFace.getdata().enqueue(new Callback<Entries>() {
          @Override
          public void onResponse(Call<Entries> call, Response<Entries> response) {

              List<Entries.Entry> list = response.body().getEntries();
              mutableLiveData.postValue(list);

              //Toast.makeText(context,list.size(), Toast.LENGTH_SHORT).show();

          }

          @Override
          public void onFailure(Call<Entries> call, Throwable t) {

              Toast.makeText(context, t.getMessage(), Toast.LENGTH_SHORT).show();
          }
      });

      return mutableLiveData;
    }

}
