package com.example.demo11.model;

import com.google.gson.annotations.SerializedName;

public class BatsmenItem{

	@SerializedName("Fours")
	private String fours;

	@SerializedName("Sixes")
	private String sixes;

	@SerializedName("Strikerate")
	private String strikerate;

	@SerializedName("Batsman")
	private String batsman;

	@SerializedName("Fielder")
	private String fielder;

	@SerializedName("Dismissal")
	private String dismissal;

	@SerializedName("Dots")
	private String dots;

	@SerializedName("Balls")
	private String balls;

	@SerializedName("Bowler")
	private String bowler;

	@SerializedName("Howout")
	private String howout;

	@SerializedName("Runs")
	private String runs;

	@SerializedName("Isonstrike")
	private boolean isonstrike;

	public String getFours(){
		return fours;
	}

	public String getSixes(){
		return sixes;
	}

	public String getStrikerate(){
		return strikerate;
	}

	public String getBatsman(){
		return batsman;
	}

	public String getFielder(){
		return fielder;
	}

	public String getDismissal(){
		return dismissal;
	}

	public String getDots(){
		return dots;
	}

	public String getBalls(){
		return balls;
	}

	public String getBowler(){
		return bowler;
	}

	public String getHowout(){
		return howout;
	}

	public String getRuns(){
		return runs;
	}

	public boolean isIsonstrike(){
		return isonstrike;
	}
}