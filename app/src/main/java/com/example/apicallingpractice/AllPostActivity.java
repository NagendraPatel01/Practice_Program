package com.example.apicallingpractice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;
import com.example.apicallingpractice.Adapter.AllpostAdapter;
import com.example.apicallingpractice.Viewmodels.PostViewModel;
import com.example.apicallingpractice.model.AllpostsModel;
import java.util.List;
public class AllPostActivity extends AppCompatActivity {

    RecyclerView recyclerview;
    PostViewModel postViewModel;
    AllpostAdapter adapter;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_post);

        recyclerview=findViewById(R.id.recyclerview);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(AllPostActivity.this,RecyclerView.VERTICAL,false);
        recyclerview.setLayoutManager(linearLayoutManager);
        linearLayoutManager.setReverseLayout(true);

        postViewModel = new ViewModelProvider(this).get(PostViewModel.class);
        postViewModel.getPostsLiveData().observe(this, new Observer<List<AllpostsModel>>() {
            @Override
            public void onChanged(List<AllpostsModel> allpostsModels) {

                adapter=new AllpostAdapter(AllPostActivity.this,allpostsModels);
                recyclerview.setAdapter(adapter);
                adapter.notifyDataSetChanged();
            }
        });
    }
}