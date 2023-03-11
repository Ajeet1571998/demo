package com.example.demo11.model;

import com.google.gson.annotations.SerializedName;

public class JsonMember5{

	@SerializedName("Name_Short")
	private String nameShort;

	@SerializedName("Name_Full")
	private String nameFull;

	@SerializedName("Players")
	private Players players;

	public String getNameShort(){
		return nameShort;
	}

	public String getNameFull(){
		return nameFull;
	}

	public Players getPlayers(){
		return players;
	}
}