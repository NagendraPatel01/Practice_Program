package com.notes.recyclerviewpractice;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.notes.recyclerviewpractice.model.GetBrings;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    Context context;
    List<GetBrings.Datum> list;
    public OnClick onClick;

    public MyAdapter(Context context, List<GetBrings.Datum> list, OnClick onClick) {
        this.context = context;
        this.list = list;
        this.onClick = onClick;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(context);
        View view =inflater.inflate(R.layout.design,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") int position) {


        holder.name.setText(list.get(position).getName());

        if (position % 5 == 0) {
            holder.linear.setBackgroundResource(R.drawable.recbg1);
        } else if (position % 5== 1) {
            holder.linear.setBackgroundResource(R.drawable.recbg2);
        } else if (position % 5 == 2) {
            holder.linear.setBackgroundResource(R.drawable.recbg3);
        } else if (position % 5 == 3) {
            holder.linear.setBackgroundResource(R.drawable.recbg4);
        } else if (position % 5 == 4) {
            holder.linear.setBackgroundResource(R.drawable.rec5);
        }

        holder.linear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (!holder.linear.isSelected()){
                    holder.linear.setSelected(true);
                    holder.linear.setBackgroundResource(R.drawable.select);
                    onClick.onClickItem(list.get(position).getName());
                }
                else {
                    holder.linear.setSelected(false);
                    if (position % 5 == 0) {
                        holder.linear.setBackgroundResource(R.drawable.recbg1);
                    } else if (position % 5== 1) {
                        holder.linear.setBackgroundResource(R.drawable.recbg2);
                    } else if (position % 5 == 2) {
                        holder.linear.setBackgroundResource(R.drawable.recbg3);
                    } else if (position % 5 == 3) {
                        holder.linear.setBackgroundResource(R.drawable.recbg4);
                    } else if (position % 5 == 4) {
                        holder.linear.setBackgroundResource(R.drawable.rec5);
                    }

                }

            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        LinearLayout linear;
        TextView name;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            linear=itemView.findViewById(R.id.linear);
            name=itemView.findViewById(R.id.name);
        }
    }

   public interface OnClick{
        void onClickItem(String name);
    }

}
