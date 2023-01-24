package com.beginner.tutorial.dataTypes;


public class PrimitiveDataTypes {

    public static void main(String args[]){

        byte numberOfSeats = 5;
        byte numberOfDoors = 3;
        byte numberOfVehicleOwners = 1;
        byte emissionSticker = 4;

        short power = 362;
        short horsePower = 492;
        short co2Emission = 333;
        short cubicCapacity = 6417;

        int price = 29999;
        int mileage = 14999;

        long registrationNumber = 42353463453L;

        float fuelConsumptionCombined = 15.5F;
        float fuelConsumptionUrban = 21.4F;
        float FuelConsumptionExtraUrban = 13.6F;

        double fuelConsumptionPreciseAverage = 152.4234232342523e-1;

        boolean isDamaged = true;

        char energyEfficiencyCategory = 'G';

        System.out.println("2018 Dodge Challenger SRT 392");
        System.out.println("Price: €" + price + "Euro");
        System.out.println("Mileage: " + mileage + "");
        System.out.println("Car is Damaged: " + isDamaged);
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Cubic Capacity: " + cubicCapacity + "ccm");
        System.out.println("Power: " + power + "kW(" + "Horse Power:" + horsePower + "hp)");
        System.out.println("CO2 Emission: " + co2Emission + "g/km");
        System.out.println("Emission Sticker: " + emissionSticker + "( Energy efficiency category: " + energyEfficiencyCategory + ")");
        System.out.println("Combined fuel consumption: " + fuelConsumptionCombined + "l/100km" );
        System.out.println("Urban fuel consumption: " + fuelConsumptionUrban + "l/100km" );
        System.out.println("Extra urban fuel consumption: " + FuelConsumptionExtraUrban + "l/100km" );
        System.out.println("Precise average fuel consumption: " + fuelConsumptionPreciseAverage + "l/100km" );
        System.out.println("Number of previous owners: " + numberOfVehicleOwners);
        System.out.println("Number of doors: " + numberOfDoors);
        System.out.println("Number of seats: " + numberOfSeats);

        System.out.println("Conversion");

        //Widening or Automatic Primitive Data Type Conversion
        short newNumberOfSeats = numberOfSeats;
        System.out.println("The value of the new number of seats: " + newNumberOfSeats);
        double newFuelConsumptionCombined = fuelConsumptionCombined;
        System.out.println("The new value of combined fuel consumption: " + newFuelConsumptionCombined + "l/100km");

        //Narrowing or Explicit Primitive Data Type Conversion
        byte newPower = (byte) power;
        System.out.println("The value of the new power: " + newPower + "kW(" + "Horse Power:" + horsePower + "hp)");
    }


}
