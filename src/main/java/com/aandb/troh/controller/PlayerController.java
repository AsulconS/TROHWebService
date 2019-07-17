package com.aandb.troh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.aandb.troh.model.Player;
import com.aandb.troh.model.exception.PlayerNotFoundException;
import com.aandb.troh.repository.PlayerRepository;

@RestController
@CrossOrigin(origins="*")
public class PlayerController
{
    @Autowired
    private final PlayerRepository repository;
    
    public PlayerController(PlayerRepository repository)
    {
        this.repository = repository;
    }
    
    @GetMapping("/players")
    public List<Player> all()
    {
        return repository.findAll();
    }
    
    @PostMapping("/players")
    public Player newPlayer(@RequestBody Player player)
    {
        return repository.save(player);
    }
    
    @GetMapping("/players/{id}")
    public Player one(@PathVariable Long id)
    {
        return repository.findById(id).orElseThrow(() -> new PlayerNotFoundException(id));
    }
    
    @PutMapping("/players/{id}")
    public Player replacePlayer(@RequestBody Player newPlayer, @PathVariable Long id)
    {
        return repository.findById(id).map(player ->
        {
            player.setUsername(newPlayer.getUsername());
            player.setScore(newPlayer.getScore());
            return repository.save(player);
        }).orElseGet(() ->
        {
            newPlayer.setId(id);
            return repository.save(newPlayer);
        });
    }
    
    @DeleteMapping("/players/{id}")
    public void deletePlayer(@PathVariable Long id)
    {
        repository.deleteById(id);
    }
}
