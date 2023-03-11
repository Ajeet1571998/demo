package com.example.rajeducationacademy.newTech.retrofit.model.responseGetSubject;

import com.google.gson.annotations.SerializedName;

public class DataItem{

	@SerializedName("image")
	private String image;

	@SerializedName("is_status")
	private String isStatus;

	@SerializedName("date_added")
	private String dateAdded;

	@SerializedName("class_id")
	private String classId;

	@SerializedName("name")
	private String name;

	@SerializedName("id")
	private String id;

	@SerializedName("class_name")
	private String className;

	public String getImage(){
		return image;
	}

	public String getIsStatus(){
		return isStatus;
	}

	public String getDateAdded(){
		return dateAdded;
	}

	public String getClassId(){
		return classId;
	}

	public String getName(){
		return name;
	}

	public String getId(){
		return id;
	}

	public String getClassName(){
		return className;
	}
}