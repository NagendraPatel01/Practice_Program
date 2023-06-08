package com.example.apicallingpractice.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.apicallingpractice.R;
import com.example.apicallingpractice.model.Entries;
import java.util.List;

public class EntriesAdapter extends RecyclerView.Adapter<EntriesAdapter.NewViewHolder>{

    Context context;
  List<Entries.Entry> list;


    public EntriesAdapter(Context context, List<Entries.Entry> list) {
        this.context = context;
        this.list = list;
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

        holder.text1.setText(list.get(position).getApi());
        holder.text2.setText(list.get(position).getCategory());
        holder.text3.setText(list.get(position).getAuth());
        holder.text4.setText(list.get(position).getDescription());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    class NewViewHolder extends RecyclerView.ViewHolder {

        TextView text1,text2,text3,text4;
        public NewViewHolder(@NonNull View itemView) {
            super(itemView);

            text1=itemView.findViewById(R.id.text1);
            text2=itemView.findViewById(R.id.text2);
            text3=itemView.findViewById(R.id.text3);
            text4=itemView.findViewById(R.id.text4);
        }
    }

}
