package com.example.demo11.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class PartnershipCurrent{

	@SerializedName("Batsmen")
	private List<BatsmenItem> batsmen;

	@SerializedName("Balls")
	private String balls;

	@SerializedName("Runs")
	private String runs;

	public List<BatsmenItem> getBatsmen(){
		return batsmen;
	}

	public String getBalls(){
		return balls;
	}

	public String getRuns(){
		return runs;
	}
}