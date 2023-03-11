package com.example.rajeducationacademy.newTech.retrofit.model.responseGetResult;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class ResponsegetResult{

	@SerializedName("msg")
	private String msg;

	@SerializedName("res")
	private String res;

	@SerializedName("data")
	private List<DataItem> data;

	public String getMsg(){
		return msg;
	}

	public String getRes(){
		return res;
	}

	public List<DataItem> getData(){
		return data;
	}
}