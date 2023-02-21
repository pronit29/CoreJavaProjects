package com.intermediate.classesandobjects.basketBallPlayer;

import java.util.Random;

public class BasketBallPlayer {

    String name;
    String nickName;
    int yearOfBorn;
    String team;

    double freeThrowPercentage;
    double pointsPerGame;
    int gamesPlayed;

    public BasketBallPlayer(String name, String nickName, int yearOfBorn, String team, double freeThrowPercentage, double pointsPerGame, int gamesPlayed) {
        this.name = name;
        this.nickName = nickName;
        this.yearOfBorn = yearOfBorn;
        this.team = team;
        this.freeThrowPercentage = freeThrowPercentage;
        this.pointsPerGame = pointsPerGame;
        this.gamesPlayed = gamesPlayed;
    }

    public void freeThrow() {

        Random randomNumberGenerator = new Random();
        if((randomNumberGenerator.nextDouble() * 100) > freeThrowPercentage) {
            System.out.println(name + " failed to score free throw.");
        } else {
            System.out.println(name + " scored free throw.");
        }
    }
}

