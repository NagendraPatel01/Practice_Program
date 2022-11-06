package com.notes.recyclerviewpractice.networking;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Retrofitclientone {

    private static Retrofit retrofit ;

    public  static Retrofit getRetrofitone(){

        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient.Builder client = new OkHttpClient.Builder()
                .connectTimeout(2, TimeUnit.MINUTES)
                .readTimeout(2, TimeUnit.MINUTES);

        client.addInterceptor(interceptor);

        if (retrofit==null){

            return retrofit=new Retrofit.Builder().baseUrl("https://logicaltest.website/sameer/mdaleel/api/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(client.build()).build();
        }
        return retrofit;
    }
}
