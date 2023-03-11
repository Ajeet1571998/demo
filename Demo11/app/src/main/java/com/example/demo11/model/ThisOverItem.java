package com.example.demo11.model;

import com.google.gson.annotations.SerializedName;

public class ThisOverItem{

	@SerializedName("B")
	private String b;

	@SerializedName("T")
	private String t;

	public String getB(){
		return b;
	}

	public String getT(){
		return t;
	}
}