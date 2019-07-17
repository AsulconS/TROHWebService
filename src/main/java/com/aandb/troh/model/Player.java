package com.aandb.troh.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Data
@Entity
@Table(name = "player")
@EntityListeners(AuditingEntityListener.class)
public class Player
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotBlank
    private String username;

    @NotNull
    private int score;
    
    public Player() {}
    
    public Player(String username, int score)
    {
        this.username = username;
        this.score = score;
    }
}
