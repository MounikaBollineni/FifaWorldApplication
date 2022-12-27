package com.projects.fifaApplication.controller;

import com.projects.fifaApplication.entity.PlayerDefence;
import com.projects.fifaApplication.service.PlayerDefenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping({"/fifa/api/v1/defence"})
public class PlayerDefenceController {

    @Autowired
    private  PlayerDefenceService userService;

    public PlayerDefenceController(PlayerDefenceService userService) {
        this.userService = userService;
    }

    @GetMapping("/get-all-details")
    public List<PlayerDefence> getAllPlayersInfo(){
        return userService.findAllPlayers();
    }

    @GetMapping("/get-by-id/{id}")
    public Optional<PlayerDefence> findPlayerById(@PathVariable("id") Long id ){
        return userService.findById(id);
    }

    @GetMapping("/get-by-position/")
    public List<PlayerDefence> findPlayerByPosition(@RequestParam String position ){
        return userService.findByPosition(position);
    }

    @GetMapping("/get-by-team/{team}")
    public List<PlayerDefence> findPlayerByTeam(@PathVariable("team") String team ){
        return userService.findByTeam(team);
    }

    @GetMapping("/get-by-tackles/{tackles}")
    public List<PlayerDefence> findPlayerByTackles(@PathVariable("tackles") int tackles ){
        return userService.findByTackles(tackles);
    }

    @GetMapping("/get-by-tacklesWon/{tacklesWon}")
    public List<PlayerDefence> findPlayerByTacklesWon(@PathVariable("tacklesWon") int tacklesWon ){
        return userService.findByTacklesWon(tacklesWon);
    }
}
