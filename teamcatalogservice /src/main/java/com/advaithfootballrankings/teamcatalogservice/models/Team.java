package com.advaithfootballrankings.teamcatalogservice.models;

public class Team {
    private String teamId;
    private static String name;

    public Team(String teamId, String name) {
        this.teamId = teamId;
        this.name = name;
    }

    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public static String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
