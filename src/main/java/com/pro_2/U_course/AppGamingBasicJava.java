package com.pro_2.U_course;

public class AppGamingBasicJava {
    public static void main(String[] args){

        var marioGame = new MarioGame();
        var gameRunner = new GameRunner(marioGame);
        gameRunner.run();

    }
}
