package com.pro_2.U_course;

public class GameRunner {
    MarioGame game;

    public GameRunner(MarioGame game){
        this.game = game;
    }
    public void run() {
        System.out.println("Running gamer" + game);
        game.up();
        game.down();
        game.left();
        game.right();
    }
}