package com.notes.recyclerviewpractice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.notes.recyclerviewpractice.model.UserrecommendedClasses;
import com.notes.recyclerviewpractice.networking.Myinterface;
import com.notes.recyclerviewpractice.networking.RetrofitClient;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SliderActivity extends AppCompatActivity {

    RecyclerView recycler;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slider);

        recycler = findViewById(R.id.recycler);

        LinearLayoutManager linearLayoutManager1 = new LinearLayoutManager(SliderActivity.this, RecyclerView.VERTICAL, false);
        recycler.setLayoutManager(linearLayoutManager1);


        RetrofitClient.getRetrofit().create(Myinterface.class).UserrecommendedClasses("Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImJodXBlbmRyYWtwYXRlbDk2QGdtYWlsLmNvbSIsInVzZXJJZCI6MjA5LCJfaWQiOiI2MzQxMmRmOGYyZjk2ZTA4ZDA2OGQyZWQiLCJhY2NvdW50VHlwZSI6IkNVU1RPTUVSIiwicGxhdGZvcm0iOiJBTkRST0lEIiwiYXV0aDBJZCI6ImF1dGgwfDYzNDEyZGY4ZjJmOTZlMDhkMDY4ZDJlYSIsImlhdCI6MTY2NTIxNjE0OSwiZXhwIjoxNjY1NTYxNzQ5fQ.k2Z5IPtZm9Exo1CLB2bjMS6z9_LmaxbWp7iyNjH8jvA")
                .enqueue(new Callback<UserrecommendedClasses>() {
                    @Override
                    public void onResponse(Call<UserrecommendedClasses> call, Response<UserrecommendedClasses> response) {
                        Log.d("shdgjhd", "onResponse: " + response);
                        Log.d("ghdighidu", "onResponse: " + response.body());

                        RecyclerAdapter recyclerAdapter = new RecyclerAdapter(SliderActivity.this, response.body().getData());
                        recycler.setAdapter(recyclerAdapter);
                    }

                    @Override
                    public void onFailure(Call<UserrecommendedClasses> call, Throwable t) {
                        Log.d("jhgdfjd", "onFailure: " + t.getMessage());
                    }
                });
    }
}