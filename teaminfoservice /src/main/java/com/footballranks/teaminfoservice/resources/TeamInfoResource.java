package com.footballranks.teaminfoservice.resources;

import com.footballranks.teaminfoservice.models.Team;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teams")
public class TeamInfoResource {
    @RequestMapping("/{teamId}")
    public Team getTeamInfo(@PathVariable("teamId") String teamId){
        return new Team(teamId, "Team Name");
    }
}
