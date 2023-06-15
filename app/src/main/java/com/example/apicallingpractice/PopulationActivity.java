package com.example.apicallingpractice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.example.apicallingpractice.Adapter.PopulationAdapter;
import com.example.apicallingpractice.Viewmodels.PopulationViewModel;
import com.example.apicallingpractice.model.PopulationModel;

import java.util.List;

public class PopulationActivity extends AppCompatActivity {

    RecyclerView recycle;

    PopulationViewModel populationViewModel;
    PopulationAdapter populationAdapter;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_population);

        recycle=findViewById(R.id.recycle);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(PopulationActivity.this,RecyclerView.VERTICAL,false);
        recycle.setLayoutManager(linearLayoutManager);

        populationViewModel= new ViewModelProvider(this).get(PopulationViewModel.class);

        populationViewModel.getpopulation("India").observe(this, new Observer<List<PopulationModel>>() {
            @Override
            public void onChanged(List<PopulationModel> populationModels) {

                 populationAdapter = new PopulationAdapter(PopulationActivity.this,populationModels);
                recycle.setAdapter(populationAdapter);
                populationAdapter.notifyDataSetChanged();
            }
        });

    }
}