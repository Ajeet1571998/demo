package com.example.rajeducationacademy.newTech.retrofit.model.responseGetNotes;

import com.google.gson.annotations.SerializedName;

public class DataItem{

	@SerializedName("image")
	private String image;

	@SerializedName("is_status")
	private String isStatus;

	@SerializedName("date_added")
	private String dateAdded;

	@SerializedName("subclass")
	private String subclass;

	@SerializedName("name")
	private String name;

	@SerializedName("description")
	private String description;

	@SerializedName("id")
	private String id;

	@SerializedName("class")
	private String jsonMemberClass;

	public String getImage(){
		return image;
	}

	public String getIsStatus(){
		return isStatus;
	}

	public String getDateAdded(){
		return dateAdded;
	}

	public String getSubclass(){
		return subclass;
	}

	public String getName(){
		return name;
	}

	public String getDescription(){
		return description;
	}

	public String getId(){
		return id;
	}

	public String getJsonMemberClass(){
		return jsonMemberClass;
	}
}