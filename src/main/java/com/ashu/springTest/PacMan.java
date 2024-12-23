package com.ashu.springTest;

public class PacMan implements GamingConsole {
    public void gameInfo(){
        System.out.println("Playing PacMan Game");
    }

    public void up(){
        System.out.println("Jump");
        
    }
    public void down(){
        System.out.println("down");
    }
    public void right(){
        System.out.println("Move Forward");
    }
    public void left(){
        System.out.println("back");
    }
}
