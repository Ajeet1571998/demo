package com.emergence.trackingapp.newTech.retrofit;


import com.emergence.trackingapp.newTech.retrofit.model.responseAddCustomer.ResponseAddCustomer;
import com.emergence.trackingapp.newTech.retrofit.model.responseCollection.ResponseCollection;
import com.emergence.trackingapp.newTech.retrofit.model.responseComplaint.ResponseComplaint;
import com.emergence.trackingapp.newTech.retrofit.model.responseGEtWard.ResponseGetWard;
import com.emergence.trackingapp.newTech.retrofit.model.responseGetCollection.ResponseGetCollection;
import com.emergence.trackingapp.newTech.retrofit.model.responseGetCommercial.ResponseGetCommercial;
import com.emergence.trackingapp.newTech.retrofit.model.responseGetComplaint.ResponseGetComplaint;
import com.emergence.trackingapp.newTech.retrofit.model.responseGetCustomer.ResponseGetCustomer;
import com.emergence.trackingapp.newTech.retrofit.model.responseLogin.Responselogin;
import com.emergence.trackingapp.newTech.retrofit.model.responsePrint.ResponsePrint;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ApiServices {
    @POST("login")
    @FormUrlEncoded
    Call<Responselogin> Getlogin(
            @Field("mobile") String mobile,
            @Field("password") String password);


    @POST("get_Type")
    @FormUrlEncoded
    Call<ResponseGetWard> GetWard(
            @Field("user_id") String user_id ,
            @Field("type") String type);

    @POST("get_Commercial_Data")
    @FormUrlEncoded
    Call<ResponseGetCommercial> GetCommercia(
            @Field("user_id") String user_id ,
            @Field("type") String type);

    @POST("Complain")
    @FormUrlEncoded
    Call<ResponseComplaint> complaint(
            @Field("name") String name ,
            @Field("query") String query ,
            @Field("mobile") String mobile);

    @POST("get_complain")
    Call<ResponseGetComplaint> getcomplaint();

    @POST("get_custumers")
    @FormUrlEncoded
    Call<ResponseGetCustomer> GetCustomer(
            @Field("ward_id") String ward_id);

    @POST("add_custumers")
    @FormUrlEncoded
    Call<ResponseAddCustomer> addCustomer(
            @Field("user_id") String user_id ,
            @Field("name") String name ,
            @Field("house_no") String house_no ,
            @Field("ward_id") String ward_id,
            @Field("amount") String amount,
            @Field("type") String type,
            @Field("mobile") String mobile);
    @POST("Collection")
    @FormUrlEncoded
    Call<ResponseCollection> Collection(
            @Field("name") String name ,
            @Field("house_no") String house_no ,
            @Field("ward_id") String ward_id,
            @Field("amount") String amount,
            @Field("type") String type,
            @Field("user_id") String user_id,
            @Field("remark") String remark,
            @Field("complain_id") String complain_id,
            @Field("mobile") String mobile);

    @POST("get_collection")
    @FormUrlEncoded
    Call<ResponseGetCollection> GetCollection(
            @Field("user_id") String user_id);
    @POST("print_collection")
    @FormUrlEncoded
    Call<ResponsePrint> print(
            @Field("collection_id") String collection_id);


}
