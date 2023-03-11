package com.example.demo11.constants;


import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ApiServices {
    @POST("User/Login")
    Call<ResponseLogin> Getlogin(
            @Field("phone") String mobile,
            @Field("password") String password);



}
