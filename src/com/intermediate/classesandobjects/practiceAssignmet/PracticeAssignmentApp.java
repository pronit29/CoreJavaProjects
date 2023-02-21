package com.intermediate.classesandobjects.practiceAssignmet;

public class PracticeAssignmentApp {

    public static void main(String[] args) {

        PracticeAssignment carUse1 = new PracticeAssignment((short) 300, 21000, true);
        PracticeAssignment carUse2 = new PracticeAssignment((short) 359, 18000, false);


        PracticeAssignment[] practiceAssignments = new PracticeAssignment[2];
        practiceAssignments[0] = carUse1;
        practiceAssignments[1] = carUse2;

        for(PracticeAssignment practiceAssignment : practiceAssignments) {
            practiceAssignment.carIsUsable();
        }
    }
}
