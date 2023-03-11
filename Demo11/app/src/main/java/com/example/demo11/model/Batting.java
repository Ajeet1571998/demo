package com.example.demo11.model;

import com.google.gson.annotations.SerializedName;

public class Batting{

	@SerializedName("Strikerate")
	private String strikerate;

	@SerializedName("Average")
	private String average;

	@SerializedName("Style")
	private String style;

	@SerializedName("Runs")
	private String runs;

	public String getStrikerate(){
		return strikerate;
	}

	public String getAverage(){
		return average;
	}

	public String getStyle(){
		return style;
	}

	public String getRuns(){
		return runs;
	}
}