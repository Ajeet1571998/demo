package com.example.rajeducationacademy.newTech.retrofit.model.responseGetClass;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class ResponseGetClass{

	@SerializedName("data")
	private List<DataItem> data;

	public List<DataItem> getData(){
		return data;
	}
}