package com.example.demo11.viewModel;

import android.content.Context;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.demo11.model.ResponseMatch;
import com.example.demo11.repositiory.MatchRepositiory;

public class MatchViewModel extends ViewModel {
    MutableLiveData<ResponseMatch> matchMutableLiveData=new MutableLiveData<>();
    MatchRepositiory repositiory;

   public MatchViewModel(){
   repositiory=new MatchRepositiory();
   }

   public void callMatchApi(Context context){
       repositiory.MatchRepo(context,new MatchRepositiory.getMatchResponse() {
           @Override
           public void onSuccess(ResponseMatch responseMatch) {
          matchMutableLiveData.postValue(responseMatch);
           }

           @Override
           public void onFailure(Throwable throwable) {

           }
       });

   }

   public LiveData<ResponseMatch> MatchResu(){
       return matchMutableLiveData;
   }



}
