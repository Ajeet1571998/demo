package com.example.demo11.constants;


import com.example.demo11.model.ResponseMatch;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ApiServices {
    @GET("nzin01312019187360.json")
    Call<ResponseMatch> Getmatch();



}
