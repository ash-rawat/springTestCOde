package com.ashu.springTest;

public class GameRunner {

    private GamingConsole game;

    public GameRunner(GamingConsole game){
        this.game = game;
    }

    public void run() {
        game.gameInfo();
        game.up();
        game.down();
        game.left();
        game.right();
    }

}
