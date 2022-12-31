package com.footballranks.teamratingservice.models;

public class Rating {
    private String teamId;
    private int rating;

    public Rating(String teamId, int rating) {
        this.teamId = teamId;
        this.rating = rating;
    }

    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
