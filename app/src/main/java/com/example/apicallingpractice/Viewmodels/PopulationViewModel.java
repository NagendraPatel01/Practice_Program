package com.example.apicallingpractice.Viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.apicallingpractice.Repositiry.PopulationRepository;
import com.example.apicallingpractice.model.PopulationModel;

import java.util.List;

public class PopulationViewModel extends ViewModel {

    PopulationRepository populationRepository;

    public PopulationViewModel() {

        populationRepository= new PopulationRepository();
    }

    public LiveData<List<PopulationModel>> getpopulation(String country){

        return populationRepository.getpopulation(country);
    }
}
