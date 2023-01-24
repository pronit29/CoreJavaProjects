package com.beginner.tutorial.dataTypes;

public class ObjectReferenceApp {

    public static void main(String[] args) {

        Byte numberOfSeats = 5;
        Short horsePower = 392;
        Integer price = 14999;
        Long registrationNumber = 3245456325325L;

        Float fuelConsumptionCombined = 15.5F;
        Double fuelConsumptionPrecise = 12.345435235534;

        Boolean isDamaged = true;
        Character energyEfficiencyCategory = 'G';

        String carModel = "DodgeChallenger SRT 392";
        String carModelNew = new String("DodgeChallenger SRT 392");

        System.out.println("Number of seats: " + numberOfSeats);
        System.out.println("Horse Power: " + horsePower);
        System.out.println("Price: $" + price.floatValue());
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Combined fuel consumption: " + fuelConsumptionCombined);
        System.out.println("Precise fuel consumption: " + fuelConsumptionPrecise.intValue());
        System.out.println("This car is damaged: " + isDamaged);
        System.out.println("Energy Efficiency: " + energyEfficiencyCategory);
        System.out.println("Car Model: " + carModel);
        System.out.println("Car Model with upper case: " + carModel.toUpperCase());
        System.out.println("Car Model with lower case: " + carModel.toLowerCase());
        System.out.println("Car Model with the new keyword: " + carModelNew);
        System.out.println("Car Model with the new keyword are equal: " + carModelNew.equals(carModel));





    }
}
