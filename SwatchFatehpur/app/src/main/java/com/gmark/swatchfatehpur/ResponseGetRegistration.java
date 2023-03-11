package com.example.swatchfatehpur;

import com.google.gson.annotations.SerializedName;

public class ResponseGetRegistration{

	@SerializedName("msg")
	private String msg;

	@SerializedName("error")
	private boolean error;

	public String getMsg(){
		return msg;
	}

	public boolean isError(){
		return error;
	}
}