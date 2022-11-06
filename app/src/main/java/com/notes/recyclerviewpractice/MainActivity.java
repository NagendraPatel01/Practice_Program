package com.notes.recyclerviewpractice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.notes.recyclerviewpractice.model.AddBringRequest;
import com.notes.recyclerviewpractice.model.GetBringDetails;
import com.notes.recyclerviewpractice.model.GetBrings;
import com.notes.recyclerviewpractice.model.GetModel;
import com.notes.recyclerviewpractice.networking.Myinterface;
import com.notes.recyclerviewpractice.networking.RetrofitClient;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.http.Body;

public class MainActivity extends AppCompatActivity {

    RecyclerView recycle;
    List list;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recycle=findViewById(R.id.recycle);
        btn=findViewById(R.id.btn);
        list = new ArrayList<String>();

        RetrofitClient.getRetrofit().create(Myinterface.class).getBringData("Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImluZm9kcmVhbXdvcmtzc29mdHdhcmVzMTIzQGdtYWlsLmNvbSIsInVzZXJJZCI6MTMxNiwiX2lkIjoiNjMyODk0ZjgzOGJhMjA0MWRhZWJhZGU0IiwiYWNjb3VudFR5cGUiOiJDVVNUT01FUiIsInBsYXRmb3JtIjoiQU5EUk9JRCIsImF1dGgwSWQiOiJhdXRoMHw2MzI4OTRmODM4YmEyMDQxZGFlYmFkZTEiLCJpYXQiOjE2NjM2MDM5NjMsImV4cCI6MTY2Mzk0OTU2M30.YgSgrvRUDAnjGKEGgXz-dZELRT2FNgZsxx8n6lPFqKg")
                .enqueue(new Callback<GetBrings>() {
                    @Override
                    public void onResponse(Call<GetBrings> call, Response<GetBrings> response) {

                        Log.d("hsgdfhsd", "onResponse: "+response);
                        Log.d("hsgdfhsd", "onResponse: "+response.body());

                        LinearLayoutManager linearLayoutManager1 = new LinearLayoutManager(MainActivity.this, RecyclerView.VERTICAL, false);
                        recycle.setLayoutManager(linearLayoutManager1);
                        MyAdapter adapter = new MyAdapter(MainActivity.this, response.body().getData(), new MyAdapter.OnClick() {
                            @Override
                            public void onClickItem(String name) {
                                Log.d("hgsdfghsyey", "onClickItem: "+name);
                                list.add(name);
                            }
                        });
                        recycle.setAdapter(adapter);
                    }

                    @Override
                    public void onFailure(Call<GetBrings> call, Throwable t) {

                        Log.d("sgdhdfg", "onFailure: ");
                    }
                });


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("shgdfsdtw", "onCreate: "+list);

                if (list.size()>0) {

                    AddBringRequest addBringRequest = new AddBringRequest();
                    addBringRequest.setName(list);

                    RetrofitClient.getRetrofit().create(Myinterface.class).addBring("Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImluZm9kcmVhbXdvcmtzc29mdHdhcmVzMTIzQGdtYWlsLmNvbSIsInVzZXJJZCI6MTMxNiwiX2lkIjoiNjMyODk0ZjgzOGJhMjA0MWRhZWJhZGU0IiwiYWNjb3VudFR5cGUiOiJDVVNUT01FUiIsInBsYXRmb3JtIjoiQU5EUk9JRCIsImF1dGgwSWQiOiJhdXRoMHw2MzI4OTRmODM4YmEyMDQxZGFlYmFkZTEiLCJpYXQiOjE2NjM2MDM5NjMsImV4cCI6MTY2Mzk0OTU2M30.YgSgrvRUDAnjGKEGgXz-dZELRT2FNgZsxx8n6lPFqKg", addBringRequest)
                            .enqueue(new Callback<GetBringDetails>() {
                                @Override
                                public void onResponse(Call<GetBringDetails> call, Response<GetBringDetails> response) {
                                    Log.d("nsgshd", "onResponse: " + response);
                                    Toast.makeText(MainActivity.this, "Data added", Toast.LENGTH_SHORT).show();
                                }

                                @Override
                                public void onFailure(Call<GetBringDetails> call, Throwable t) {

                                }
                            });
                }else {
                    Toast.makeText(MainActivity.this, "Please add brings", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}