package com.example.demo11.model;

import com.google.gson.annotations.SerializedName;

public class Officials{

	@SerializedName("Umpires")
	private String umpires;

	@SerializedName("Referee")
	private String referee;

	public String getUmpires(){
		return umpires;
	}

	public String getReferee(){
		return referee;
	}
}