package com.aandb.troh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aandb.troh.model.Player;

public interface PlayerRepository extends JpaRepository<Player, Long>
{
    
}
