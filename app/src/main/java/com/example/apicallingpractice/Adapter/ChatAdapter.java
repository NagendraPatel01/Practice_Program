package com.example.apicallingpractice.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.apicallingpractice.R;

import java.util.List;

public class ChatAdapter extends RecyclerView.Adapter<ChatAdapter.NewViewHolder>{

    Context context;


    public ChatAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public NewViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view =inflater.inflate(R.layout.chatdesign,parent,false);
        return new NewViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull NewViewHolder holder, int position) {


    }

    @Override
    public int getItemCount() {
        return 15;
    }


    class NewViewHolder extends RecyclerView.ViewHolder {

        public NewViewHolder(@NonNull View itemView) {
            super(itemView);


        }
    }

}
