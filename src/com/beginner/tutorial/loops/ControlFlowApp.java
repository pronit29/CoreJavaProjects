package com.beginner.tutorial.loops;

public class ControlFlowApp {

    public static void main(String[] args) {

        boolean isDamaged = false;
        String carColor = "Purple";
        char energyEfficiencyCategory = 'Z';

        if (isDamaged) {

            System.out.println("Damaged Car");
        } else {

            System.out.println("Car is not damaged");
        }

        if (carColor.equalsIgnoreCase("red")) {

            System.out.println("This is a RED car");
        } else if (carColor.equalsIgnoreCase("green")) {

            System.out.println("This is a GREEN car");
        } else {

            System.out.println("This is a PURPLE car");
        }

        switch (energyEfficiencyCategory) {

            case 'A':
            case 'B':
                System.out.println("Low energy consumption");
                break;
            case 'G':
                System.out.println("Very high energy consumption");
                break;
            default:
                System.out.println("I have no idea about the energy consumption of this car");

        }

    }
}
