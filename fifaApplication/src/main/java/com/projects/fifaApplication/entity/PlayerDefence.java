package com.projects.fifaApplication.entity;

import lombok.*;

import javax.persistence.*;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name="player_defence")
public class PlayerDefence {
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
    private Double minutes_90s;

    @Column
    private Integer tackles;

    @Column
    private Integer tacklesWon;

    @Column
    private Integer tacklesDef_3rd;

    @Column
    private Integer tacklesMid_3rd;

    @Column
    private Integer tacklesAtt_3rd;

    @Column
    private Integer dribbleTackles;

    @Column
    private Integer dribblesVs;

    @Column
    private Double dribbleTacklesPct;

    @Column
    private Integer dribbledPast;

    @Column
    private Integer blocks;

    @Column
    private Integer blockedShots;

    @Column
    private Integer blockedPasses;

    @Column
    private Integer interceptions;

    @Column
    private Integer tacklesInterceptions;

    @Column
    private Integer clearances;

    @Column
    private Integer errors;
}
