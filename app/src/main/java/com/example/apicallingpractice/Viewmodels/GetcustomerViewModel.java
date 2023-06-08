package com.example.apicallingpractice.Viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.apicallingpractice.Repositiry.GetcustomerRepository;
import com.example.apicallingpractice.model.getmycustomer;

import java.util.List;

public class GetcustomerViewModel extends ViewModel {

    private GetcustomerRepository getcustomerRepository;
    //private LiveData<List<getmycustomer.Datum>> liveData;


    public GetcustomerViewModel() {

        getcustomerRepository = new GetcustomerRepository();
        //liveData=new MutableLiveData<>();
    }

    public LiveData<List<getmycustomer.Datum>> getPostsLiveData(String id) {

       /* if (liveData.getValue()==null) {
            liveData = getcustomerRepository.getcostumar(id);
        }*/
        return getcustomerRepository.getcostumar(id);
    }


}
