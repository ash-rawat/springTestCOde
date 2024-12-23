package com.ashu.springTest.App01Gaming;

import java.beans.BeanProperty;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ashu.springTest.GameRunner;
import com.ashu.springTest.GamingConsole;
import com.ashu.springTest.PacMan;

@Configuration
public class gamingConfiguration {
    
    @Bean
    public GamingConsole game(){
        var game = new PacMan();
        return game;
    }

    public GameRunner gameRunner(){
        var gameRunner = new GameRunner(game());
        return gameRunner;
    }
}
