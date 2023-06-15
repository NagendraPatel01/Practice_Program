package com.example.apicallingpractice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;

import com.example.apicallingpractice.Adapter.AllPagesAdapter;
import com.example.apicallingpractice.Viewmodels.AllpagesViewModel;
import com.example.apicallingpractice.model.AllpagesModel;
import com.example.apicallingpractice.model.GetAllitem;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

public class AllPagesActivity extends AppCompatActivity {

    RecyclerView recycle;
    AllPagesAdapter adapter;
    AllpagesViewModel allpagesViewModel;

    int id= 2;
    int userid=10;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_pages);

        recycle=findViewById(R.id.recycle);

        recycle.setLayoutManager(new LinearLayoutManager(this));

        allpagesViewModel=new ViewModelProvider(this).get(AllpagesViewModel.class);

        allpagesViewModel.getpages(id,userid).observe(this, new Observer<AllpagesModel>() {
            @Override
            public void onChanged(AllpagesModel allpagesModel) {

                List<AllpagesModel.Datum> list =allpagesModel.getData();

                adapter=new AllPagesAdapter(AllPagesActivity.this,list);
                recycle.setAdapter(adapter);
                adapter.notifyDataSetChanged();
            }
        });
    }
}