package com.footballranks.teaminfoservice.models;

public class Team {
    private String teamId;
    private String name;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
