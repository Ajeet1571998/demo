package com.example.rajeducationacademy.newTech.retrofit.model.responseGetNotification;

import com.google.gson.annotations.SerializedName;

public class DataItem{

	@SerializedName("date")
	private String date;

	@SerializedName("image")
	private String image;

	@SerializedName("address")
	private String address;

	@SerializedName("pphone")
	private String pphone;

	@SerializedName("gender")
	private String gender;

	@SerializedName("student")
	private String student;

	@SerializedName("session")
	private String session;

	@SerializedName("class_id")
	private String classId;

	@SerializedName("father")
	private String father;

	@SerializedName("birth")
	private String birth;

	@SerializedName("pay")
	private String pay;

	@SerializedName("description")
	private String description;

	@SerializedName("type")
	private String type;

	@SerializedName("is_status")
	private String isStatus;

	@SerializedName("password")
	private String password;

	@SerializedName("phone")
	private String phone;

	@SerializedName("name")
	private String name;

	@SerializedName("id")
	private String id;

	@SerializedName("class_name")
	private String className;

	@SerializedName("email")
	private String email;

	public String getDate(){
		return date;
	}

	public String getImage(){
		return image;
	}

	public String getAddress(){
		return address;
	}

	public String getPphone(){
		return pphone;
	}

	public String getGender(){
		return gender;
	}

	public String getStudent(){
		return student;
	}

	public String getSession(){
		return session;
	}

	public String getClassId(){
		return classId;
	}

	public String getFather(){
		return father;
	}

	public String getBirth(){
		return birth;
	}

	public String getPay(){
		return pay;
	}

	public String getDescription(){
		return description;
	}

	public String getType(){
		return type;
	}

	public String getIsStatus(){
		return isStatus;
	}

	public String getPassword(){
		return password;
	}

	public String getPhone(){
		return phone;
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

	public String getEmail(){
		return email;
	}
}