package com.pro_2.U_course;

public class App01GamingBasicJava {
    public static void main(String[] args){

//        var game = new MarioGame();
        var game = new PacMan();
//        var game = new SuperContraGame();
        var gameRunner = new GameRunner(game);
        gameRunner.run();


    }
}
