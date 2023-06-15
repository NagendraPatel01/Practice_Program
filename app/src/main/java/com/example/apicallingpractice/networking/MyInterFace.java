package com.example.apicallingpractice.networking;

import com.example.apicallingpractice.model.AllpagesModel;
import com.example.apicallingpractice.model.AllpostsModel;
import com.example.apicallingpractice.model.AddmyDistibuter;
import com.example.apicallingpractice.model.AddmyDoctor;
import com.example.apicallingpractice.model.Entries;
import com.example.apicallingpractice.model.GetAllitem;
import com.example.apicallingpractice.model.GetmyDisributer;
import com.example.apicallingpractice.model.GetmyDoctor;
import com.example.apicallingpractice.model.PopulationModel;
import com.example.apicallingpractice.model.Signup;
import com.example.apicallingpractice.model.getmycustomer;
import com.example.apicallingpractice.model.myone;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface MyInterFace {

    //mvvm
    @GET("entries")
    Call<Entries> getdata();

    @FormUrlEncoded
    @POST("add_my_customer")
    Call<myone>getdataone(@Field("user_id")String user_id,
                          @Field("fname")String fname,
                          @Field("lname")String lname,
                          @Field("mobileno")String mobileno);


    //mvvm
    @FormUrlEncoded
    @POST("get_my_customer")
    Call<getmycustomer>getmycustomer(@Field("user_id")String user_id);

    @POST("get_all_item")
    Call<GetAllitem> getitem();

    @FormUrlEncoded
    @POST("add_my_doctor")
    Call<AddmyDoctor>Addmydoctor(@Field("vendor_id")String vendor_id,
                                 @Field("fname")String fname,
                                 @Field("lname")String lname,
                                 @Field("mobileno")String mobileno,
                                 @Field("city_state")String city_state);


    @FormUrlEncoded
    @POST("get_my_doctor")
    Call<GetmyDoctor>getmydoctor(@Field("vendor_id")String vendor_id);

    @FormUrlEncoded
    @POST("add_my_destributor")
    Call<AddmyDistibuter>mydistributer(@Field("vendor_id")String vendor_id,
                                       @Field("destributor_name")String destributor_name,
                                       @Field("emailid")String emailid,
                                       @Field("mobileno")String mobileno,
                                       @Field("gst_no")String gst_no);


    @FormUrlEncoded
    @POST("get_my_destributor")
    Call<GetmyDisributer>getmydistributer(@Field("vendor_id")String vendor_id);

    @FormUrlEncoded
    @POST("delivery_boysignup")
    Call<Signup>deliveryboysignup(@Field("name")String name,
                                  @Field("email")String email,
                                  @Field("mobile")String mobile,
                                  @Field("address")String address,
                                  @Field("pincode")String pincode,
                                  @Field("password")String password,
                                  @Field("driving_licence")String driving_licence,
                                  @Field("delivery_fee")String delivery_fee,
                                  @Field("lat")String lat,
                                  @Field("lang")String lang,
                                  @Field("fcm_id")String fcm_id,
                                  @Field("gov_id")String gov_id,
                                  @Field("status")String status);

    //mvvm
    @GET("posts")
    Call<List<AllpostsModel>> Allpost();

    //mvvm
    @GET("search")
    Call<List<PopulationModel>> NationPopulation(@Query("country") String country);

//mvvm

    @GET("users")
    Call<AllpagesModel> Allpages(@Query("page") int page , @Query("per_page")int per_page);


}
