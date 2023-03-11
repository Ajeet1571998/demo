package com.example.demo11.model;

import com.google.gson.annotations.SerializedName;

public class JsonMember10167{

	@SerializedName("Bowling")
	private Bowling bowling;

	@SerializedName("Position")
	private String position;

	@SerializedName("Batting")
	private Batting batting;

	@SerializedName("Name_Full")
	private String nameFull;

	@SerializedName("Iskeeper")
	private boolean iskeeper;

	public Bowling getBowling(){
		return bowling;
	}

	public String getPosition(){
		return position;
	}

	public Batting getBatting(){
		return batting;
	}

	public String getNameFull(){
		return nameFull;
	}

	public boolean isIskeeper(){
		return iskeeper;
	}
}