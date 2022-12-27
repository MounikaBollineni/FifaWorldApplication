package com.projects.fifaApplication.entity;

import lombok.*;

import javax.persistence.*;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name="player_stats")
public class PlayerStats {
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
    private String club ;

    @Column
    private Integer birthYear;

    @Column
    private Integer games;

    @Column
    private Integer gamesStarts;

    @Column
    private Integer minutes;

    @Column
    private Double minutes_90s;

    @Column
    private Integer goals;

    @Column
    private Integer assists;

    @Column
    private Integer goalsPens;

    @Column
    private Integer pensMade;

    @Column
    private Integer pensAtt;

    @Column
    private Integer cardsYellow;

    @Column
    private Integer cardsRed;

    @Column
    private Double goalsPer90;

    @Column
    private Double assistsPer90;

    @Column
    private Double goalsAssistsPer90;

    @Column
    private Double goalsPensPer90;

    @Column
    private Double goalsAssistsPensPer90;

    @Column
    private Double xg;

    @Column
    private Double npxg;

    @Column
    private Double xgAssist;

    @Column
    private Double npxgXgAssist;

    @Column
    private Double xgPer90;

    @Column
    private Double xgAssistPer90;

    @Column
    private Double xgXgAssistPer90;

    @Column
    private Double npxgPer90;

    @Column
    private Double npxgXgAssistPer90;
}
