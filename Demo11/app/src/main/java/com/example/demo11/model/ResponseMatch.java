package com.example.demo11.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class ResponseMatch{

	@SerializedName("Matchdetail")
	private Matchdetail matchdetail;

	@SerializedName("Innings")
	private List<InningsItem> innings;

	@SerializedName("Nuggets")
	private List<String> nuggets;

	@SerializedName("Teams")
	private Teams teams;

	@SerializedName("Notes")
	private Notes notes;

	public Matchdetail getMatchdetail(){
		return matchdetail;
	}

	public List<InningsItem> getInnings(){
		return innings;
	}

	public List<String> getNuggets(){
		return nuggets;
	}

	public Teams getTeams(){
		return teams;
	}

	public Notes getNotes(){
		return notes;
	}
}