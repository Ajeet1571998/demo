package com.example.rajeducationacademy.newTech.retrofit.model.responseGetToppers;

import com.google.gson.annotations.SerializedName;

public class DataItem{

	@SerializedName("image")
	private String image;

	@SerializedName("student")
	private String student;

	@SerializedName("percentage")
	private String percentage;

	@SerializedName("id")
	private String id;

	@SerializedName("class")
	private String jsonMemberClass;

	public String getImage(){
		return image;
	}

	public String getStudent(){
		return student;
	}

	public String getPercentage(){
		return percentage;
	}

	public String getId(){
		return id;
	}

	public String getJsonMemberClass(){
		return jsonMemberClass;
	}
}