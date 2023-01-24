package com.beginner.tutorial.loops;

public class FunctionAssignment1 {

    public static void main(String[] args) {

        System.out.println(getEnergyConsumption('A'));
        getCarDescription("Tesla Roadstar", 2020, "Good");
    }

    static String getEnergyConsumption(char energyConsumption) {

        switch (energyConsumption) {

            case 'A', 'a':
                return "Energy Consumption is very low";
            case 'B', 'b':
                return "Energy Consumption is low";
            case 'C', 'c':
                return "Energy Consumption is normal";
            case 'D', 'd':
                return "Energy Consumption is above normal";
            case 'E', 'e':
                return "Energy Consumption is high";
            case 'F', 'f':
                return "Energy Consumption is very high";
            case 'G', 'g':
                return "Energy Consumption is extremely high";
            default:
                return "None of the options match the energy consumption";
        }
    }

    static void getCarDescription(String model, int productionYear, String condition) {

        System.out.println("This car is a " + model);
        System.out.println("Production Year: " + productionYear);
        System.out.println("It is in a " + condition + " condition");
    }

}
