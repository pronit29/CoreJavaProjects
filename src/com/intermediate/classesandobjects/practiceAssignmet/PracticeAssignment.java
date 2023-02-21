package com.intermediate.classesandobjects.practiceAssignmet;

public class PracticeAssignment {

    short co2Emission;

    int price;

    boolean isDamaged;

    public PracticeAssignment(short co2Emission, int price, boolean isDamaged) {
        this.co2Emission = co2Emission;
        this.price = price;
        this.isDamaged = isDamaged;
    }

    public void carIsUsable() {
        if((co2Emission < 400) && (isDamaged == false) && (price < 20000)) {
            System.out.println("Car is in good condition and is usable");
        } else {
            System.out.println("Car is not in a good condition and is not usable");
        }
    }
}
