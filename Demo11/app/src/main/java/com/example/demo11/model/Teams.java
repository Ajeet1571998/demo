package com.example.demo11.model;

import com.google.gson.annotations.SerializedName;

public class Teams{

	@SerializedName("4")
	private JsonMember4 jsonMember4;

	@SerializedName("5")
	private JsonMember5 jsonMember5;

	public JsonMember4 getJsonMember4(){
		return jsonMember4;
	}

	public JsonMember5 getJsonMember5(){
		return jsonMember5;
	}
}