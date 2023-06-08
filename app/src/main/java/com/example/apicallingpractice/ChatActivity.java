package com.example.apicallingpractice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.widget.EditText;
import com.example.apicallingpractice.Adapter.ChatAdapter;

public class ChatActivity extends AppCompatActivity {

   public static  RecyclerView recycle;
    EditText edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        recycle=findViewById(R.id.recycle);
        edit=findViewById(R.id.edit);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(ChatActivity.this,RecyclerView.VERTICAL,false);
        recycle.setLayoutManager(linearLayoutManager);

        linearLayoutManager.setReverseLayout(true);
        ChatAdapter adapter = new ChatAdapter(ChatActivity.this);
        recycle.setAdapter(adapter);

    }
}