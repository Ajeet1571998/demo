package com.example.rajeducationacademy.newTech.retrofit.model.responsePayFees;

import com.google.gson.annotations.SerializedName;

public class ResponsePayFees{

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