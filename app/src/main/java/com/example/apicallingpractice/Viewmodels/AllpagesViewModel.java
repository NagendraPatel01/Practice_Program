package com.example.apicallingpractice.Viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.apicallingpractice.Repositiry.AllPagesReposetory;
import com.example.apicallingpractice.model.AllpagesModel;

import java.util.List;

public class AllpagesViewModel extends ViewModel {

    AllPagesReposetory allPagesReposetory;

    public AllpagesViewModel() {

        allPagesReposetory= new AllPagesReposetory();
    }

    public MutableLiveData<AllpagesModel> getpages(int page, int per_page){

        return allPagesReposetory.getpages(page,per_page);
    }
}
