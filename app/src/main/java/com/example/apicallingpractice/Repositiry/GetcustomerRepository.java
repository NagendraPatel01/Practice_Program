package com.example.apicallingpractice.Repositiry;

import android.content.Context;
import android.widget.Toast;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.apicallingpractice.networking.MyInterFace;
import com.example.apicallingpractice.networking.RetrofitClientone;
import com.example.apicallingpractice.model.getmycustomer;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class GetcustomerRepository {

   private MyInterFace myInterFace;
   Context context;

    public GetcustomerRepository() {

        myInterFace= RetrofitClientone.getRetrofit().create(MyInterFace.class);
    }

    public LiveData<List<getmycustomer.Datum>> getcostumar(String id) {

        MutableLiveData<List<getmycustomer.Datum>> mutableLiveData = new MutableLiveData<>();

        myInterFace.getmycustomer(id).enqueue(new Callback<getmycustomer>() {
            @Override
            public void onResponse(Call<getmycustomer> call, Response<getmycustomer> response) {

                List<getmycustomer.Datum> customers =response.body().getData();


                if (customers!=null){
                    if (customers.size()!=0){
                        mutableLiveData.postValue(customers);
                    }else {
                        Toast.makeText(context, "List is Empty", Toast.LENGTH_SHORT).show();
                    }
                }else {
                    Toast.makeText(context, "List is Empty", Toast.LENGTH_SHORT).show();

                }

//                if (response.isSuccessful()) {
//                    getmycustomer customerResponse = response.body();
//                    if (customerResponse != null) {
//                        List<getmycustomer.Datum> customers = customerResponse.getData();
//                        mutableLiveData.setValue(customers);
//                    }
//                } else {
//                    // Handle error response
//                }
            }

            @Override
            public void onFailure(Call<getmycustomer> call, Throwable t) {
                Toast.makeText(context, t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

        return mutableLiveData;
    }
}
