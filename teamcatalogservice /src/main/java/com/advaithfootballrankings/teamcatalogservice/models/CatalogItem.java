package com.advaithfootballrankings.teamcatalogservice.models;

public class CatalogItem {
    private String teamName;
    private String division;
    private int rating;

    public CatalogItem(String teamName, String division, int rating) {
        this.teamName = teamName;
        this.division = division;
        this.rating = rating;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
