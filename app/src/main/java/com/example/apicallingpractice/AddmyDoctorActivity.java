package com.example.apicallingpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.apicallingpractice.model.AddmyDoctor;
import com.example.apicallingpractice.networking.MyInterFace;
import com.example.apicallingpractice.networking.RetrofitClientone;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AddmyDoctorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addmy_doctor);

        RetrofitClientone.getRetrofit().create(MyInterFace.class)
                .Addmydoctor("1","krish","morish","0009870009","urop").enqueue(new Callback<AddmyDoctor>() {
            @Override
            public void onResponse(Call<AddmyDoctor> call, Response<AddmyDoctor> response) {

                Log.d("jkdhfskdsufhids", "onResponse: "+response);
                Log.d("hkjdsfhkdsjfhkjk", "onResponse: "+response.body());

            }

            @Override
            public void onFailure(Call<AddmyDoctor> call, Throwable t) {

                Log.d("jkgdfkgdifijdfk", "onFailure: "+t.getMessage());

            }
        });
    }
}