package com.projects.fifaApplication.service;

import com.projects.fifaApplication.entity.PlayerStats;

import java.util.List;
import java.util.Optional;

public interface PlayerStatisticsServiceInterface{
    List<PlayerStats> findAllStats();
    Optional<PlayerStats> findByStatsId(Long id);

    List<PlayerStats> findByGamesPlayed(Integer games);

    List<PlayerStats> findByMinutes(Integer minutes);
    List<PlayerStats> findByGoalScore(Integer goals);
    List<PlayerStats> findByBirthYear(Integer  birthYear);

}
