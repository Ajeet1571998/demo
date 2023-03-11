package com.example.demo11.model;

import com.google.gson.annotations.SerializedName;

public class BowlersItem{

	@SerializedName("Noballs")
	private String noballs;

	@SerializedName("Economyrate")
	private String economyrate;

	@SerializedName("Maidens")
	private String maidens;

	@SerializedName("Wickets")
	private String wickets;

	@SerializedName("Dots")
	private String dots;

	@SerializedName("Wides")
	private String wides;

	@SerializedName("Bowler")
	private String bowler;

	@SerializedName("Overs")
	private String overs;

	@SerializedName("Runs")
	private String runs;

	@SerializedName("Isbowlingtandem")
	private boolean isbowlingtandem;

	@SerializedName("ThisOver")
	private List<ThisOverItem> thisOver;

	@SerializedName("Isbowlingnow")
	private boolean isbowlingnow;

	public String getNoballs(){
		return noballs;
	}

	public String getEconomyrate(){
		return economyrate;
	}

	public String getMaidens(){
		return maidens;
	}

	public String getWickets(){
		return wickets;
	}

	public String getDots(){
		return dots;
	}

	public String getWides(){
		return wides;
	}

	public String getBowler(){
		return bowler;
	}

	public String getOvers(){
		return overs;
	}

	public String getRuns(){
		return runs;
	}

	public boolean isIsbowlingtandem(){
		return isbowlingtandem;
	}

	public List<ThisOverItem> getThisOver(){
		return thisOver;
	}

	public boolean isIsbowlingnow(){
		return isbowlingnow;
	}
}