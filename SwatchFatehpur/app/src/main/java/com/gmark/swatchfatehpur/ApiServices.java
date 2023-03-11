package com.example.swatchfatehpur;


import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ApiServices {
    @POST("getEmigrates")
    @FormUrlEncoded
    Call<ResponseGetRegistration> Getlogin(
            @Field("name") String name,
            @Field("mname") String mname,
            @Field("email") String email,
            @Field("phone") String phone,
            @Field("pass_no") String pass_no,
            @Field("dob") String dob,
            @Field("ineter_pass_year") String ineter_pass_year,
            @Field("ineter_pass_mark") String ineter_pass_mark,
            @Field("gradua_pass_year") String gradua_pass_year,
            @Field("gradua_pass_mark") String gradua_pass_mark,
            @Field("address") String address,
            @Field("fname") String fname);


}
