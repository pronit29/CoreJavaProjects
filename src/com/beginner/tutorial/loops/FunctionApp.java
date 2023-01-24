package com.beginner.tutorial.loops;

public class FunctionApp {

    public static void main(String[] args) {

        sayHello();
        blackBoardPunishment(5);
        System.out.println("Price with 10% off: " + getTenPercentDiscount(20000));
        System.out.println("Price after discount in Integer: " + getDiscountPrice(20000,5));
        System.out.println("Price after discount in Double: " + getDiscountPrice(10000.25,10));

    }

    static void sayHello() {
        System.out.println("Hello!!!");
    }

    static void blackBoardPunishment(int repeatNumber) {
        for(int i = 1; i <= repeatNumber; i++) {
            System.out.println("BEING RIGHT SUCKS");
        }
    }

    static double getTenPercentDiscount(int price) {
        return price * 0.9;
    }

    static double getDiscountPrice(int price, int percentage) {
        return price * percentage / 100.0;
    }

    static double getDiscountPrice(double price, int percentage) {
        return price * percentage / 100;
    }
}
