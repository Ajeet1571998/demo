package com.example.demo11.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Notes{

	@SerializedName("1")
	private List<String> jsonMember1;

	@SerializedName("2")
	private List<String> jsonMember2;

	public List<String> getJsonMember1(){
		return jsonMember1;
	}

	public List<String> getJsonMember2(){
		return jsonMember2;
	}
}