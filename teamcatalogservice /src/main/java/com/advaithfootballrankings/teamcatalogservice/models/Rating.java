package com.advaithfootballrankings.teamcatalogservice.models;

public class Rating {
    private static String teamId;
    private static int rating;

    public Rating(String teamId, int rating) {
        this.teamId = teamId;
        this.rating = rating;
    }

    public static String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public static int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
