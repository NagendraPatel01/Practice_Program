package com.example.apicallingpractice.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.apicallingpractice.ChatActivity;
import com.example.apicallingpractice.R;
import com.example.apicallingpractice.model.Entries;

import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.NewViewHolder>{

    Context context;

    public UserAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public NewViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view =inflater.inflate(R.layout.entriesdesign,parent,false);
        return new NewViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull NewViewHolder holder, int position) {

        holder.linear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                context.startActivity(new Intent(context, ChatActivity.class));
            }
        });


    }

    @Override
    public int getItemCount() {
        return 15;
    }


    class NewViewHolder extends RecyclerView.ViewHolder {


        LinearLayout linear;
        public NewViewHolder(@NonNull View itemView) {
            super(itemView);

            linear=itemView.findViewById(R.id.linear);
        }
    }

}
