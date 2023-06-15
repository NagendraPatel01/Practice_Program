package com.example.apicallingpractice.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.apicallingpractice.R;
import com.example.apicallingpractice.model.AllpostsModel;
import com.example.apicallingpractice.model.PopulationModel;

import java.util.ArrayList;
import java.util.List;

public class PopulationAdapter extends RecyclerView.Adapter<PopulationAdapter.ViewHolder> {

    Context context;
    List<PopulationModel> list ;

    public PopulationAdapter(Context context, List<PopulationModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view =inflater.inflate(R.layout.entriesdesign,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.text1.setText(list.get(position).getCountry());
        holder.text2.setText(list.get(position).getWebPages().get(0));
        holder.text3.setText(list.get(position).getName());
        holder.text4.setText(list.get(position).getDomains().get(0));

    }

    @Override
    public int getItemCount() {
        //if(list==null) return 0;
        return list.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        TextView text1,text2,text3,text4;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            text1=itemView.findViewById(R.id.text1);
            text2=itemView.findViewById(R.id.text2);
            text3=itemView.findViewById(R.id.text3);
            text4=itemView.findViewById(R.id.text4);
        }
    }
}
