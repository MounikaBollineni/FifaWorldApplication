package com.projects.fifaApplication.service;

import com.projects.fifaApplication.entity.PlayerDefence;

import java.util.List;
import java.util.Optional;

public interface PlayerDefenceServiceInterface {
    List<PlayerDefence> findAllPlayers();
    Optional<PlayerDefence> findById(Long id);

    List<PlayerDefence> findByPosition(String position);
    List<PlayerDefence> findByTeam(String team);
    List<PlayerDefence> findByTackles(Integer tackles);
    List<PlayerDefence> findByTacklesWon(Integer  tacklesWon);
}
