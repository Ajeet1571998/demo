package com.emergence.trackingapp.newTech.retrofit.model;

import com.google.gson.annotations.SerializedName;

public class RequestGetVendor{

	@SerializedName("location")
	private String location;

	@SerializedName("token")
	private String token;

	public void setLocation(String location){
		this.location = location;
	}

	public void setToken(String token){
		this.token = token;
	}
}