package com.example.demo11.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MyModel {

    @SerializedName("Teams")
    private List<Teams> teams;

    @SerializedName("Match")
    private List<Match> match;

    @SerializedName("Venue")
    private List<Venue> venues;

    public List<Teams> getTeams() {
        return teams;
    }

    public List<Match> getMatch() {
        return match;
    }

    public List<Venue> getVenues() {
        return venues;
    }

    public void setTeams(List<Teams> teams) {
        this.teams = teams;
    }

    public void setMatch(List<Match> match) {
        this.match = match;
    }

    public void setVenues(List<Venue> venues) {
        this.venues = venues;
    }
}
