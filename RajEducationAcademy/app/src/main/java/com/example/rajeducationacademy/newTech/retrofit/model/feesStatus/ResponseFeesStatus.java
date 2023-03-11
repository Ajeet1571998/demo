package com.example.rajeducationacademy.newTech.retrofit.model.feesStatus;

import com.google.gson.annotations.SerializedName;

public class ResponseFeesStatus{

	@SerializedName("msg")
	private String msg;

	@SerializedName("res")
	private String res;

	@SerializedName("data")
	private Data data;

	public String getMsg(){
		return msg;
	}

	public String getRes(){
		return res;
	}

	public Data getData(){
		return data;
	}
}