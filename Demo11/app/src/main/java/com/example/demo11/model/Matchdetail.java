package com.example.demo11.model;

import com.google.gson.annotations.SerializedName;

public class Matchdetail{

	@SerializedName("Status")
	private String status;

	@SerializedName("Venue")
	private Venue venue;

	@SerializedName("Team_Home")
	private String teamHome;

	@SerializedName("Status_Id")
	private String statusId;

	@SerializedName("Player_Match")
	private String playerMatch;

	@SerializedName("Equation")
	private String equation;

	@SerializedName("Officials")
	private Officials officials;

	@SerializedName("Winningteam")
	private String winningteam;

	@SerializedName("Match")
	private Match match;

	@SerializedName("Result")
	private String result;

	@SerializedName("Weather")
	private String weather;

	@SerializedName("Team_Away")
	private String teamAway;

	@SerializedName("Series")
	private Series series;

	@SerializedName("Tosswonby")
	private String tosswonby;

	@SerializedName("Winmargin")
	private String winmargin;

	public String getStatus(){
		return status;
	}

	public Venue getVenue(){
		return venue;
	}

	public String getTeamHome(){
		return teamHome;
	}

	public String getStatusId(){
		return statusId;
	}

	public String getPlayerMatch(){
		return playerMatch;
	}

	public String getEquation(){
		return equation;
	}

	public Officials getOfficials(){
		return officials;
	}

	public String getWinningteam(){
		return winningteam;
	}

	public Match getMatch(){
		return match;
	}

	public String getResult(){
		return result;
	}

	public String getWeather(){
		return weather;
	}

	public String getTeamAway(){
		return teamAway;
	}

	public Series getSeries(){
		return series;
	}

	public String getTosswonby(){
		return tosswonby;
	}

	public String getWinmargin(){
		return winmargin;
	}
}