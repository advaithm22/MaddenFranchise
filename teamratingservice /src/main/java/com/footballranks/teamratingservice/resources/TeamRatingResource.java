package com.footballranks.teamratingservice.resources;

import com.footballranks.teamratingservice.models.Rating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ratings")
public class TeamRatingResource {
    @RequestMapping("/{teamId}")
    public Rating getRating(@PathVariable("teamId") String teamId){
        return new Rating(teamId, 80);
    }
}
