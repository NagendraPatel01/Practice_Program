package com.example.apicallingpractice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.example.apicallingpractice.Adapter.GetMyDoctorAdapter;
import com.example.apicallingpractice.model.GetmyDoctor;
import com.example.apicallingpractice.networking.MyInterFace;
import com.example.apicallingpractice.networking.RetrofitClientone;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class GetMyDoctorActivity extends AppCompatActivity {

    RecyclerView recycle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_my_doctor);

        recycle=findViewById(R.id.recycle);

        RetrofitClientone.getRetrofit().create(MyInterFace.class)
                .getmydoctor("1").enqueue(new Callback<GetmyDoctor>() {
            @Override
            public void onResponse(Call<GetmyDoctor> call, Response<GetmyDoctor> response) {

                Log.d("fhjguihwie", "onResponse: "+response);
                Log.d("uethuiewyhtiwe", "onResponse: "+response.body());

                LinearLayoutManager linearLayoutManager=new LinearLayoutManager(GetMyDoctorActivity.this,RecyclerView.VERTICAL,false);
                recycle.setLayoutManager(linearLayoutManager);

                GetMyDoctorAdapter adapter = new GetMyDoctorAdapter(GetMyDoctorActivity.this,response.body().getData());
                recycle.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<GetmyDoctor> call, Throwable t) {
                Log.d("ewgyteuytuieh", "onFailure: "+t.getMessage());

            }
        });


    }
}