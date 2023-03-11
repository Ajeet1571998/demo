package com.example.demo11.model;

import com.google.gson.annotations.SerializedName;

public class FallofWicketsItem{

	@SerializedName("Score")
	private String score;

	@SerializedName("Batsman")
	private String batsman;

	@SerializedName("Overs")
	private String overs;

	public String getScore(){
		return score;
	}

	public String getBatsman(){
		return batsman;
	}

	public String getOvers(){
		return overs;
	}
}