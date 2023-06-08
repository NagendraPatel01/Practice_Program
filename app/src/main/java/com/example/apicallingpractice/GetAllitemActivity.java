package com.example.apicallingpractice;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.apicallingpractice.Adapter.GetAllitemAdapter;
import com.example.apicallingpractice.model.GetAllitem;
import com.example.apicallingpractice.networking.MyInterFace;
import com.example.apicallingpractice.networking.RetrofitClientone;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class GetAllitemActivity extends AppCompatActivity {

    RecyclerView recycle;
    CardView card;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_allitem);

        recycle=findViewById(R.id.recycle);

        card=findViewById(R.id.card);

        recycle.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(GetAllitemActivity.this,RecyclerView.VERTICAL,false);
        recycle.setLayoutManager(linearLayoutManager);


        // To hide the add button on scroll
        recycle.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(@NonNull RecyclerView recyclerView, int dx, int dy) {
                if (dy > 0 || dy < 0 && card.isShown()) {
                    card.setVisibility(View.GONE);
                }
                super.onScrolled(recyclerView, dx, dy);
            }

            @Override
            public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int newState) {
                if (newState == RecyclerView.SCROLL_STATE_IDLE) {
                    card.setVisibility(View.VISIBLE);
                }
                super.onScrollStateChanged(recyclerView, newState);
            }
        });


        RetrofitClientone.getRetrofit().create(MyInterFace.class)
                .getitem().enqueue(new Callback<GetAllitem>() {
            @Override
            public void onResponse(Call<GetAllitem> call, Response<GetAllitem> response) {

                Log.d("fhudisfhw", "onResponse: "+response);
                Log.d("ejfheijghieh", "onResponse: "+response.body());

                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(GetAllitemActivity.this,RecyclerView.VERTICAL,false);
                recycle.setLayoutManager(linearLayoutManager);

                GetAllitemAdapter adapter=new GetAllitemAdapter(GetAllitemActivity.this,response.body().getData());
                recycle.setAdapter(adapter);

            }

            @Override
            public void onFailure(Call<GetAllitem> call, Throwable t) {

                Log.d("digeigej", "onFailure: "+t.getMessage());
            }
        });



    }
}