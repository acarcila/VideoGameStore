package com.video_game.store.model.entities;

import javax.persistence.*;

@Entity
public class Appearance {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer idAppearance;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_character")
    private Character character;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_video_game")
    private VideoGame videoGame;
}
