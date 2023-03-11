package com.example.demo11.model;

import com.google.gson.annotations.SerializedName;

public class Match{

	@SerializedName("League")
	private String league;

	@SerializedName("Type")
	private String type;

	@SerializedName("Number")
	private String number;

	@SerializedName("Livecoverage")
	private String livecoverage;

	@SerializedName("Time")
	private String time;

	@SerializedName("Daynight")
	private String daynight;

	@SerializedName("Id")
	private String id;

	@SerializedName("Code")
	private String code;

	@SerializedName("Date")
	private String date;

	@SerializedName("Offset")
	private String offset;

	public String getLeague(){
		return league;
	}

	public String getType(){
		return type;
	}

	public String getNumber(){
		return number;
	}

	public String getLivecoverage(){
		return livecoverage;
	}

	public String getTime(){
		return time;
	}

	public String getDaynight(){
		return daynight;
	}

	public String getId(){
		return id;
	}

	public String getCode(){
		return code;
	}

	public String getDate(){
		return date;
	}

	public String getOffset(){
		return offset;
	}
}