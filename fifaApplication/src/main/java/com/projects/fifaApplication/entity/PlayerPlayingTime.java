package com.projects.fifaApplication.entity;

import lombok.*;

import javax.persistence.*;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Table(name="player_playing_time")
public class PlayerPlayingTime {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String player;

    @Column
    private String position;

    @Column
    private String team ;

    @Column
    private String age ;

    @Column
    private Integer birthYear;

    @Column
    private Integer games;

    @Column
    private Integer minutes;

    @Column
    private Integer minutesPerGame;

    @Column
    private Double minutesPct;

    @Column
    private Double minutes90s;

    @Column
    private Integer gamesStarts;

    @Column
    private Integer minutesPerStart;

    @Column
    private Integer gamesComplete;

    @Column
    private Integer gamesSubs;

    @Column
    private Integer minutesPerSub;

    @Column
    private Integer unusedSubs;

    @Column
    private Double pointsPerGame;

    @Column
    private Integer onGoalsFor;

    @Column
    private Integer onGoalsAgainst;

    @Column
    private Integer plusMinus;

    @Column
    private Double plusMinusPer90;

    @Column
    private Double plusMinusWowy;

    @Column
    private Double onXgFor;

    @Column
    private Double onXgAgainst;

    @Column
    private Double xgPlusMinus;

    @Column
    private Double xgPlusMinusPer90;

    @Column
    private Double xgPlusMinusWowy;
}
