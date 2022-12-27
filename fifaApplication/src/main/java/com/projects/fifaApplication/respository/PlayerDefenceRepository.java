package com.projects.fifaApplication.respository;

import com.projects.fifaApplication.entity.PlayerDefence;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
@org.springframework.stereotype.Repository
public interface PlayerDefenceRepository extends JpaRepository<PlayerDefence,Long> {
    List<PlayerDefence> findByPosition(String position);
    List<PlayerDefence> findByTeam(String team);
    List<PlayerDefence> findByTackles(int tackles);
    List<PlayerDefence> findByTacklesWon(int tacklesWon);
}
