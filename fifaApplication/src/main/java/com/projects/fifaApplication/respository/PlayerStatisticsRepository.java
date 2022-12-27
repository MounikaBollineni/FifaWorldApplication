package com.projects.fifaApplication.respository;
import com.projects.fifaApplication.entity.PlayerStats;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PlayerStatisticsRepository extends JpaRepository<PlayerStats,Long> {
    List<PlayerStats> findByGames(int games);
    List<PlayerStats> findByMinutes(int minutes);
    List<PlayerStats> findByGoals(int goals);
    List<PlayerStats> findByBirthYear(int birthYear);
}
