package com.example.rajeducationacademy.newTech.retrofit.model.responseGetResult;

import com.google.gson.annotations.SerializedName;

public class DataItem{

	@SerializedName("date")
	private String date;

	@SerializedName("total_marks")
	private String totalMarks;

	@SerializedName("name")
	private String name;

	@SerializedName("marks")
	private String marks;

	public String getDate(){
		return date;
	}

	public String getTotalMarks(){
		return totalMarks;
	}

	public String getName(){
		return name;
	}

	public String getMarks(){
		return marks;
	}
}