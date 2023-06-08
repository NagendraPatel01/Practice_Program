package com.example.apicallingpractice.Viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.apicallingpractice.model.AllpostsModel;
import com.example.apicallingpractice.Repositiry.PostRepository;

import java.util.List;

public class PostViewModel extends ViewModel {

    private PostRepository postRepository;
    //private LiveData<List<AllpostsModel>> postsLiveData;

    public PostViewModel() {
        postRepository = new PostRepository();
       // postsLiveData = new MutableLiveData<>();
    }

    public LiveData<List<AllpostsModel>> getPostsLiveData() {
        //postsLiveData=postRepository.getpost();
        return postRepository.getpost();
    }
}
