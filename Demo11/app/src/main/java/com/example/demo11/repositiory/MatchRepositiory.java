package com.example.demo11.repositiory;

import android.app.ProgressDialog;
import android.content.Context;

import com.example.demo11.constants.API_Config;
import com.example.demo11.constants.ApiServices;
import com.example.demo11.model.ResponseMatch;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MatchRepositiory {

    public void MatchRepo(Context context,getMatchResponse matchResponse){
        ProgressDialog dialog=ProgressDialog.show(context,"","loading..");
        ApiServices apiServices= API_Config.getApiClient_ByPost();
        Call<ResponseMatch> call=apiServices.Getmatch();
        call.enqueue(new Callback<ResponseMatch>() {
            @Override
            public void onResponse(Call<ResponseMatch> call, Response<ResponseMatch> response) {
                dialog.dismiss();
                if (response.isSuccessful()){
                    matchResponse.onSuccess(response.body());
                }else {
                    matchResponse.onFailure(new Throwable(response.message()));
                }

            }

            @Override
            public void onFailure(Call<ResponseMatch> call, Throwable t) {
                dialog.dismiss();
                matchResponse.onFailure(t);
            }
        });

    }


    public interface getMatchResponse{
        void onSuccess(ResponseMatch responseMatch);
        void onFailure(Throwable throwable);
    }
}
