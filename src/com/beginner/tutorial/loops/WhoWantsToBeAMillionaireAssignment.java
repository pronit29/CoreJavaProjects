package com.beginner.tutorial.loops;

public class WhoWantsToBeAMillionaireAssignment {

    public static void main(String[] args) {

        char answer = 'D';

        System.out.println("Who is named as the father of light bulbs?");
        System.out.println("You marked " + answer + ". Lets see whether you are right");

        if(answer == 'C') {
            System.out.println("You were right. You won $1");
        } else {
            System.out.println("Sorry, the right answer is Thomas Edison. Thank you for participating");
        }
    }
}
