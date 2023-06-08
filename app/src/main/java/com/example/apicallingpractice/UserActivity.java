package com.example.apicallingpractice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import com.example.apicallingpractice.Adapter.UserAdapter;

public class UserActivity extends AppCompatActivity {

    RecyclerView recycle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        recycle=findViewById(R.id.recycle);


        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(UserActivity.this,RecyclerView.VERTICAL,false);
        recycle.setLayoutManager(linearLayoutManager);

        UserAdapter adapter = new UserAdapter(UserActivity.this);
        recycle.setAdapter(adapter);


    }
}