package com.example.demo11.model;

import com.google.gson.annotations.SerializedName;

public class Series{

	@SerializedName("Status")
	private String status;

	@SerializedName("Tour_Name")
	private String tourName;

	@SerializedName("Id")
	private String id;

	@SerializedName("Name")
	private String name;

	@SerializedName("Tour")
	private String tour;

	public String getStatus(){
		return status;
	}

	public String getTourName(){
		return tourName;
	}

	public String getId(){
		return id;
	}

	public String getName(){
		return name;
	}

	public String getTour(){
		return tour;
	}
}