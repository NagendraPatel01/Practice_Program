package com.example.apicallingpractice.Viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.apicallingpractice.Repositiry.EntriesRepository;
import com.example.apicallingpractice.model.Entries;

import java.util.List;

public class EntriesViewModel extends ViewModel {

    EntriesRepository entriesRepository;

    public EntriesViewModel() {

        entriesRepository= new EntriesRepository();
    }

    public LiveData<List<Entries.Entry>> getentry(){

        return entriesRepository.getentries();
    }
}
