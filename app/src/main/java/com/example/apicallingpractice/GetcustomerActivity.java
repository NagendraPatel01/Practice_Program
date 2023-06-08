package com.example.apicallingpractice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import com.example.apicallingpractice.Adapter.GetcustomarAdapter;
import com.example.apicallingpractice.Viewmodels.GetcustomerViewModel;
import com.example.apicallingpractice.model.getmycustomer;

import java.util.List;


public class GetcustomerActivity extends AppCompatActivity {
    RecyclerView recycle;
    GetcustomerViewModel getcustomerViewModel;
    String id="10";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_getcustomer);

        recycle=findViewById(R.id.recycle);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(GetcustomerActivity.this,RecyclerView.VERTICAL,false);
        recycle.setLayoutManager(linearLayoutManager);

        getcustomerViewModel = new ViewModelProvider(this).get(GetcustomerViewModel.class);

        getcustomerViewModel.getPostsLiveData(id).observe(this, new Observer<List<getmycustomer.Datum>>() {
            @Override
            public void onChanged(List<getmycustomer.Datum> data) {

                GetcustomarAdapter adapter = new GetcustomarAdapter(GetcustomerActivity.this,data);
                recycle.setAdapter(adapter);
                adapter.notifyDataSetChanged();
            }
        });
    }
}