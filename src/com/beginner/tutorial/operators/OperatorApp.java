package com.beginner.tutorial.operators;

public class OperatorApp {

    public static void main(String[] args) {

        String carModel = "Dodge Challenger SRT 392";
        int price = 14999;
        int moneyInTheBank = 100000;

        boolean isDamaged = true;

        //Arithmetic Operators
        System.out.println("Price of a " + carModel + ": $" + price);
        int increasedPrice = price + 1000;
        System.out.println("Increased price of a " + carModel + ": $" + increasedPrice);
        int decreasedPrice = price - 1000;
        System.out.println("Decreased price of a " + carModel + ": $" + decreasedPrice);
        int twoCarsPrice = price * 2;
        System.out.println("Price of two " + carModel + ": $" + twoCarsPrice);
        int dodgesYouCanBuy = moneyInTheBank / price;
        System.out.println("With the money we have, we can buy " + dodgesYouCanBuy + " " + carModel);
        int remainingMoneyInTheBank = moneyInTheBank % price;
        System.out.println("Money we should remain after buying " + dodgesYouCanBuy + " " + carModel + ": $" + remainingMoneyInTheBank);
        System.out.println();

        //Unary Operators
        int priceNegative = -14999;
        int priceNegativeWithPlusSign = +priceNegative;
        System.out.println("Negative price with plus sign: $" + priceNegativeWithPlusSign);
        int priceNegativeWithMinusSign = -priceNegative;
        System.out.println("Negative price with minus sign: $" + priceNegativeWithMinusSign);
        int priceOneIncreaseBeforeAssignment = ++price;
        System.out.println("Price after increasing by 1: " + priceOneIncreaseBeforeAssignment);
        int priceOneDecreaseBeforeAssignment = --price;
        System.out.println("Price after decreasing by 1: " + priceOneDecreaseBeforeAssignment);
        System.out.println("This car is damaged: " + !isDamaged);
        System.out.println();

        //Equality and Relational Operators
        System.out.println("Car's price equals the money in the bank: " + (price == moneyInTheBank));
        System.out.println("Car's price doesn't equals the money in the bank: " + (price != moneyInTheBank));
        System.out.println("Car's price greater than the money in the bank: " + (price > moneyInTheBank));
        System.out.println("Car's price less than the money in the bank: " + (price < moneyInTheBank));
        System.out.println("Car's price greater than or equals the money in the bank: " + (price >= moneyInTheBank));
        System.out.println("Car's price less than or equals the money in the bank: " + (price <= moneyInTheBank));
        System.out.println("The carModel variable is a dataType of String: " + (carModel instanceof String));
        System.out.println();

        //Ternary Operators
        String damageText = isDamaged ? "The car is damaged" : "The car isn't damaged";
        System.out.println("Damage Status of the car: " + damageText);

        //Logical Operators
        String worthSeeing = !isDamaged || price <= 20000 ? "It is worth seeing the car" : "It isn't worth seeing the car";
        System.out.println("Is it worth seeing the car? " + worthSeeing);
        String worthRepairing = !isDamaged && price <= 20000 ? "It is worth repairing the car" : "It isn't worth repairing the car";
        System.out.println("Is it worth repairing the car? " + worthRepairing);

        //Assignment Operators




    }
}
