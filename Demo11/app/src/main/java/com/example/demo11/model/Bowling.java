package com.example.demo11.model;

import com.google.gson.annotations.SerializedName;

public class Bowling{

	@SerializedName("Economyrate")
	private String economyrate;

	@SerializedName("Average")
	private String average;

	@SerializedName("Style")
	private String style;

	@SerializedName("Wickets")
	private String wickets;

	public String getEconomyrate(){
		return economyrate;
	}

	public String getAverage(){
		return average;
	}

	public String getStyle(){
		return style;
	}

	public String getWickets(){
		return wickets;
	}
}