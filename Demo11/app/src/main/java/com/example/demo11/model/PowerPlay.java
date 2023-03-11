package com.example.demo11.model;

import com.google.gson.annotations.SerializedName;

public class PowerPlay{

	@SerializedName("PP1")
	private String pP1;

	@SerializedName("PP2")
	private String pP2;

	public String getPP1(){
		return pP1;
	}

	public String getPP2(){
		return pP2;
	}
}