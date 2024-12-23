package com.ashu.springTest;

public class AppGaminBasicJava {

    public static void main(String[] args) {
        
        var newGame= new Mario();
        // var newGame = new SuperContra();
        // var newGame = new PacMan(); 
        var gameRunner = new GameRunner(newGame);
        gameRunner.run();

    }
    
}
