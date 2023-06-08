package com.example.apicallingpractice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.example.apicallingpractice.Adapter.EntriesAdapter;
import com.example.apicallingpractice.Viewmodels.EntriesViewModel;
import com.example.apicallingpractice.model.Entries;
import com.example.apicallingpractice.model.myone;
import com.example.apicallingpractice.networking.MyInterFace;
import com.example.apicallingpractice.networking.RetrofitClient;
import com.example.apicallingpractice.networking.RetrofitClientone;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    RecyclerView recycle;
    EntriesViewModel entriesViewModel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recycle=findViewById(R.id.recycle);

        RetrofitClientone.getRetrofit().create(MyInterFace.class)
                .getdataone("1","jonney","jorden","2349875675").enqueue(new Callback<myone>() {
            @Override
            public void onResponse(Call<myone> call, Response<myone> response) {

                if (response.code()==200){
                    if (response.body()!=null){
                        Log.d("isuiebi", "onResponse: "+response);
                        Log.d("jerhturehyiur", "onResponse: "+response.body());

                    }
                }

            }

            @Override
            public void onFailure(Call<myone> call, Throwable t) {
                Log.d("jerhturehyiur", "onResponse: "+t.getMessage());
            }
        });

        //=============================================================================================================================


        //======================================================================================================================

       /* RetrofitClient.getRetrofit().create(MyInterFace.class)
                .getdata().enqueue(new Callback<Entries>() {
            @Override
            public void onResponse(Call<Entries> call, Response<Entries> response) {

                if (response.code()==200){

                    if (response.body()!=null){

                        Log.d("dufgihgiu", "onResponse: "+response);

                        Log.d("dufgihgiu", "onResponse: "+response.body());

                        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MainActivity.this,RecyclerView.VERTICAL,false);
                        recycle.setLayoutManager(linearLayoutManager);

                        EntriesAdapter adapter = new EntriesAdapter(MainActivity.this,response.body().getEntries());
                        recycle.setAdapter(adapter);
                    }
                }


            }

            @Override
            public void onFailure(Call<Entries> call, Throwable t) {

                Log.d("jdghiuhgi", "onResponse: "+t.getMessage());
            }
        });

*/

        entriesViewModel= new ViewModelProvider(this).get(EntriesViewModel.class);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MainActivity.this,RecyclerView.VERTICAL,false);
        recycle.setLayoutManager(linearLayoutManager);


        entriesViewModel.getentry().observe(this, new Observer<List<Entries.Entry>>() {
            @Override
            public void onChanged(List<Entries.Entry> entries) {

                String abhi = entries.get(1).getApi();
                Log.d("ggherhr", "onChanged: "+abhi);
                EntriesAdapter adapter = new EntriesAdapter(MainActivity.this,entries);
                recycle.setAdapter(adapter);
                adapter.notifyDataSetChanged();
            }
        });
    }
}