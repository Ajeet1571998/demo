package com.example.demo11.model;

import com.google.gson.annotations.SerializedName;

public class Venue{

	@SerializedName("Id")
	private String id;

	@SerializedName("Name")
	private String name;

	public String getId(){
		return id;
	}

	public String getName(){
		return name;
	}
}