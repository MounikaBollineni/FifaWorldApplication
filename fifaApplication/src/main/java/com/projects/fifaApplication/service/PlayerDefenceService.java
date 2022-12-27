package com.projects.fifaApplication.service;

import com.projects.fifaApplication.entity.PlayerDefence;
import com.projects.fifaApplication.respository.PlayerDefenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class PlayerDefenceService implements PlayerDefenceServiceInterface {

    @Autowired
    private PlayerDefenceRepository repository;

    public PlayerDefenceService(PlayerDefenceRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<PlayerDefence> findAllPlayers() {
        return repository.findAll();
    }

    @Override
    public Optional<PlayerDefence> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<PlayerDefence> findByPosition(String position) {
        return repository.findByPosition(position);
    }

    @Override
    public List<PlayerDefence> findByTeam(String team) {
        return repository.findByTeam(team);
    }

    @Override
    public List<PlayerDefence> findByTackles(Integer tackles) {
        return repository.findByTackles(tackles);
    }

    @Override
    public List<PlayerDefence> findByTacklesWon(Integer tacklesWon) {
        return repository.findByTacklesWon(tacklesWon);
    }
}
