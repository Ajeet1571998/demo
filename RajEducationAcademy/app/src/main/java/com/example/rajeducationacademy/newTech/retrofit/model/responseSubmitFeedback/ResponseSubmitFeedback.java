package com.example.rajeducationacademy.newTech.retrofit.model.responseSubmitFeedback;

import com.google.gson.annotations.SerializedName;

public class ResponseSubmitFeedback{

	@SerializedName("msg")
	private String msg;

	@SerializedName("res")
	private String res;

	public String getMsg(){
		return msg;
	}

	public String getRes(){
		return res;
	}
}