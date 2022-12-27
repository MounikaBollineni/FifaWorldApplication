package com.projects.fifaApplication.controller;

import com.projects.fifaApplication.entity.PlayerStats;
import com.projects.fifaApplication.service.PlayerStatisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping({"/fifa/api/v1/statistics"})
public class PlayerStatisticsController {

    @Autowired
    private PlayerStatisticsService statisticsService;

    @GetMapping("/get-all-details")
    public List<PlayerStats> getAllPlayersInfo(){
        return statisticsService.findAllStats();
    }

    @GetMapping("/get-by-id/{id}")
    public Optional<PlayerStats> findPlayerById(@PathVariable("id") Long id ){
        return statisticsService.findByStatsId(id);
    }

    @GetMapping("/get-by-games-played/")
    public List<PlayerStats> getPlayerByGamesPlayed(@RequestParam int games ){
        return statisticsService.findByGamesPlayed(games);
    }

    @GetMapping("/get-by-minutes/{minutes}")
    public List<PlayerStats> getPlayerByMinutes(@PathVariable("minutes") int minutes ){
        return statisticsService.findByMinutes(minutes);
    }

    @GetMapping("/get-by-goal-score/{goals}")
    public List<PlayerStats> getPlayerByGoalScore(@PathVariable("goals") int goals ){
        return statisticsService.findByGoalScore(goals);
    }

    @GetMapping("/get-by-birth-year/{birthYear}")
    public List<PlayerStats> getPlayerByBirthYear(@PathVariable("birthYear") int birthYear ){
        return statisticsService.findByBirthYear(birthYear);
    }
}
