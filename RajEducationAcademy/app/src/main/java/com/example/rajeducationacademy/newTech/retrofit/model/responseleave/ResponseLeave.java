package com.example.rajeducationacademy.newTech.retrofit.model.responseleave;

import com.google.gson.annotations.SerializedName;

public class ResponseLeave{

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