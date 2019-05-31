package com.aandb.troh.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aandb.troh.beans.Player;

@RestController
@CrossOrigin(origins="*")
public class PlayerController
{
    @RequestMapping("/player")
    public Player findById(@RequestParam(value="name", defaultValue="Unknown") String name,
                           @RequestParam(value="score", defaultValue="0") int score)
    {
        return new Player(name, score);
    }
}
