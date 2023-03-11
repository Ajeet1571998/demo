package com.example.demo11.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class InningsItem{

	@SerializedName("Bowlers")
	private List<BowlersItem> bowlers;

	@SerializedName("Batsmen")
	private List<BatsmenItem> batsmen;

	@SerializedName("Runrate")
	private String runrate;

	@SerializedName("Partnership_Current")
	private PartnershipCurrent partnershipCurrent;

	@SerializedName("PowerPlay")
	private PowerPlay powerPlay;

	@SerializedName("AllottedOvers")
	private String allottedOvers;

	@SerializedName("Penalty")
	private String penalty;

	@SerializedName("Overs")
	private String overs;

	@SerializedName("Noballs")
	private String noballs;

	@SerializedName("Target")
	private String target;

	@SerializedName("Number")
	private String number;

	@SerializedName("FallofWickets")
	private List<FallofWicketsItem> fallofWickets;

	@SerializedName("Total")
	private String total;

	@SerializedName("Battingteam")
	private String battingteam;

	@SerializedName("Wickets")
	private String wickets;

	@SerializedName("Byes")
	private String byes;

	@SerializedName("Wides")
	private String wides;

	@SerializedName("Legbyes")
	private String legbyes;

	public List<BowlersItem> getBowlers(){
		return bowlers;
	}

	public List<BatsmenItem> getBatsmen(){
		return batsmen;
	}

	public String getRunrate(){
		return runrate;
	}

	public PartnershipCurrent getPartnershipCurrent(){
		return partnershipCurrent;
	}

	public PowerPlay getPowerPlay(){
		return powerPlay;
	}

	public String getAllottedOvers(){
		return allottedOvers;
	}

	public String getPenalty(){
		return penalty;
	}

	public String getOvers(){
		return overs;
	}

	public String getNoballs(){
		return noballs;
	}

	public String getTarget(){
		return target;
	}

	public String getNumber(){
		return number;
	}

	public List<FallofWicketsItem> getFallofWickets(){
		return fallofWickets;
	}

	public String getTotal(){
		return total;
	}

	public String getBattingteam(){
		return battingteam;
	}

	public String getWickets(){
		return wickets;
	}

	public String getByes(){
		return byes;
	}

	public String getWides(){
		return wides;
	}

	public String getLegbyes(){
		return legbyes;
	}
}