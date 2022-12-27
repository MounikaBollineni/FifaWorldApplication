package com.projects.fifaApplication.service;

import com.projects.fifaApplication.entity.PlayerStats;
import com.projects.fifaApplication.respository.PlayerStatisticsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlayerStatisticsService implements PlayerStatisticsServiceInterface{

    @Autowired
    private PlayerStatisticsRepository statisticsRepository;

    @Override
    public List<PlayerStats> findAllStats() {
        return statisticsRepository.findAll();
    }

    @Override
    public Optional<PlayerStats> findByStatsId(Long id) {
        return statisticsRepository.findById(id);
    }

    @Override
    public List<PlayerStats> findByGamesPlayed(Integer games) {
        return statisticsRepository.findByGames(games);
    }

    @Override
    public List<PlayerStats> findByMinutes(Integer minutes) {
        return statisticsRepository.findByMinutes(minutes);
    }

    @Override
    public List<PlayerStats> findByGoalScore(Integer goals) {
        return statisticsRepository.findByGoals(goals);
    }

    @Override
    public List<PlayerStats> findByBirthYear(Integer birthYear) {
        return statisticsRepository.findByBirthYear(birthYear);
    }
}
