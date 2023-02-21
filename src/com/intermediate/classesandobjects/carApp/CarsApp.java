package com.intermediate.classesandobjects.carApp;

public class CarsApp {

    public static void main(String[] args) {

        DodgeChallenger dodgeChallenger = new DodgeChallenger();
//      System.out.println(dodgeChallenger.color.toUpperCase());
        dodgeChallenger.startTheEngine();

        System.out.println("----------------------------------------------------------------------");
        DodgeChallenger orangeDodgeChallenger = new DodgeChallenger("orange");
        System.out.println(orangeDodgeChallenger.color.toUpperCase());
        orangeDodgeChallenger.startTheEngine();
    }
}
