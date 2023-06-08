package com.example.apicallingpractice.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.apicallingpractice.R;
import com.example.apicallingpractice.model.GetAllitem;
import com.example.apicallingpractice.model.GetmyDisributer;

import java.util.List;

public class GetmydistributerAdapter extends RecyclerView.Adapter<GetmydistributerAdapter.ViewHolder> {

    Context context;
    List<GetmyDisributer.Datum> list;

    public GetmydistributerAdapter(Context context, List<GetmyDisributer.Datum> list) {
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

        holder.text1.setText(list.get(position).getDestributorName());
        holder.text2.setText(list.get(position).getEmailid());
        holder.text3.setText(list.get(position).getMobileno());
        holder.text4.setText(list.get(position).getGstNo());
    }

    @Override
    public int getItemCount() {
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
