package com.example.apicallingpractice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.apicallingpractice.Adapter.GetmydistributerAdapter;
import com.example.apicallingpractice.model.AddmyDistibuter;
import com.example.apicallingpractice.model.GetmyDisributer;
import com.example.apicallingpractice.networking.MyInterFace;
import com.example.apicallingpractice.networking.RetrofitClientone;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MyDistributerActivity extends AppCompatActivity {

    RecyclerView recycle;
    EditText edit;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_distributer);

        recycle=findViewById(R.id.recycle);
        edit=findViewById(R.id.edit);
        btn=findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (TextUtils.isEmpty(edit.getText().toString())){
                    edit.setError("Empty");
                }
            }
        });



        RetrofitClientone.getRetrofit().create(MyInterFace.class)
                .getmydistributer("5")
                .enqueue(new Callback<GetmyDisributer>() {
                    @Override
                    public void onResponse(Call<GetmyDisributer> call, Response<GetmyDisributer> response) {

                        Log.d("hdgekgleiuhli", "onResponse: "+response);
                        Log.d("kjhgukerhgkuye", "onResponse: "+response.body());

                        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MyDistributerActivity.this,RecyclerView.VERTICAL,false);
                        recycle.setLayoutManager(linearLayoutManager);

                        GetmydistributerAdapter adapter = new GetmydistributerAdapter(MyDistributerActivity.this,response.body().getData());
                        recycle.setAdapter(adapter);

                    }

                    @Override
                    public void onFailure(Call<GetmyDisributer> call, Throwable t) {

                    }
                });

        RetrofitClientone.getRetrofit().create(MyInterFace.class)
                .mydistributer("5","sunny","sunnyonewr@gmail.com","0987609567","1234").enqueue(new Callback<AddmyDistibuter>() {
            @Override
            public void onResponse(Call<AddmyDistibuter> call, Response<AddmyDistibuter> response) {

                Log.d("hgiujdhgiuedi", "onResponse: "+response);
                Log.d("jetergierjoijo", "onResponse: "+response.body());

            }

            @Override
            public void onFailure(Call<AddmyDistibuter> call, Throwable t) {
                Log.d("fjgifdhiufjhoi", "onFailure: "+t.getMessage());

            }
        });
    }
}