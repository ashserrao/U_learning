package com.pro_2.U_course;

public class AppGamingBasicJava {
    public static void main(String[] args){

        var superContraGame = new SuperContraGame();
        var gameRunner = new GameRunner(superContraGame);
        gameRunner.run();

    }
}
