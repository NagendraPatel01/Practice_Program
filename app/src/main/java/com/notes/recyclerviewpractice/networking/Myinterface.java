package com.notes.recyclerviewpractice.networking;

import com.notes.recyclerviewpractice.model.AddBringRequest;
import com.notes.recyclerviewpractice.model.MyModel;
import com.notes.recyclerviewpractice.model.GetBringDetails;
import com.notes.recyclerviewpractice.model.GetBrings;
import com.notes.recyclerviewpractice.model.GetModel;
import com.notes.recyclerviewpractice.model.LoginRequest;
import com.notes.recyclerviewpractice.model.LoginRespons;
import com.notes.recyclerviewpractice.model.PostModel;
import com.notes.recyclerviewpractice.model.UserrecommendedClasses;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface Myinterface {

    @POST("auth/mobile/signup")
    Call<GetModel> getdata(@Body PostModel postModel);

    @GET("users/brings")
    Call<GetBrings> getBringData(@Header("Authorization") String Authorization);

    @POST("users/addBringsByUserId")
    Call<GetBringDetails> addBring(@Header("Authorization") String Authorization, @Body AddBringRequest addBringRequest);

    @POST("auth/mobile/login")
    Call<LoginRespons> Loginuser (@Body LoginRequest loginRequest);



    @GET("users/recommendedClasses")
    Call<UserrecommendedClasses> UserrecommendedClasses(@Header("Authorization") String Authorization);



    @FormUrlEncoded
    @POST("add_my_customer")
    Call<MyModel> Myfield (@Field("user_id") String user_id,
                           @Field("fname") String fname,
                           @Field("lname") String lname,
                           @Field("mobileno") String mobileno);
}
