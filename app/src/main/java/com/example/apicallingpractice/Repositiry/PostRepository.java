package com.example.apicallingpractice.Repositiry;

import android.util.Log;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.example.apicallingpractice.model.AllpostsModel;
import com.example.apicallingpractice.networking.MyInterFace;
import com.example.apicallingpractice.networking.RetrofitClientmvvm;
import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PostRepository {
    private MyInterFace myInterFace;

    public PostRepository() {

        myInterFace= RetrofitClientmvvm.getRetrofit().create(MyInterFace.class);
    }

    public LiveData<List<AllpostsModel>> getpost(){

        MutableLiveData<List<AllpostsModel>> mutableLiveData=new MutableLiveData<>();
        Call<List<AllpostsModel>> call = myInterFace.Allpost();

        call.enqueue(new Callback<List<AllpostsModel>>() {
            @Override
            public void onResponse(Call<List<AllpostsModel>> call, Response<List<AllpostsModel>> response) {

                Log.d("ygeyhgu", "onResponse: "+response);
                Log.d("wgygekuy", "onResponse: "+response.body());
                if (response.isSuccessful()) {
                    mutableLiveData.postValue(response.body());
                }
            }

            @Override
            public void onFailure(Call<List<AllpostsModel>> call, Throwable t) {

                Log.d("dhgeuhgiue", "onFailure: "+t.getMessage());
            }
        });

        return mutableLiveData;
    }
}
