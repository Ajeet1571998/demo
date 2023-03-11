package com.example.rajeducationacademy.newTech.retrofit.model.getBanner;

import com.google.gson.annotations.SerializedName;

public class DataItem{

	@SerializedName("image")
	private String image;

	@SerializedName("is_status")
	private String isStatus;

	@SerializedName("date_added")
	private String dateAdded;

	@SerializedName("id")
	private String id;

	public String getImage(){
		return image;
	}

	public String getIsStatus(){
		return isStatus;
	}

	public String getDateAdded(){
		return dateAdded;
	}

	public String getId(){
		return id;
	}
}