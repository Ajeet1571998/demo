package com.example.demo11.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MyModel {

    @SerializedName("Teams")
    private Teams teams;

    @SerializedName("Match")
    private Match match;

    @SerializedName("Venue")
    private Venue venues;

    public Teams getTeams() {
        return teams;
    }

    public Match getMatch() {
        return match;
    }

    public Venue getVenues() {
        return venues;
    }

    public void setTeams(Teams teams) {
        this.teams = teams;
    }

    public void setMatch(Match match) {
        this.match = match;
    }

    public void setVenues(Venue venues) {
        this.venues = venues;
    }
}
