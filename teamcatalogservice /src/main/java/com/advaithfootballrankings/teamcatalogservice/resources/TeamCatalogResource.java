package com.advaithfootballrankings.teamcatalogservice.resources;

import com.advaithfootballrankings.teamcatalogservice.models.CatalogItem;
import com.advaithfootballrankings.teamcatalogservice.models.Rating;
import com.advaithfootballrankings.teamcatalogservice.models.Team;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/catalog")
public class TeamCatalogResource {
    @RequestMapping("/{userId}")
    public List<CatalogItem> getCatalog(@PathVariable("userId") String teamId){
        RestTemplate restTemplate = new RestTemplate();
        List<Rating> ratings = Arrays.asList(
                new Rating("1234", 78),
                new Rating("5689", 91)
        );
        return ratings.stream().map(Rating -> {
                Team team = restTemplate.getForObject("http://localhost:8089/catalog/" + Rating.getTeamId(), Team.class);
                return new CatalogItem(Team.getName(), "information", Rating.getRating());
    }).collect(Collectors.toList());
    }
}
