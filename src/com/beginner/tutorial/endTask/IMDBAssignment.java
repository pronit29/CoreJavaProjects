package com.beginner.tutorial.endTask;

import java.time.Year;

public class IMDBAssignment {

    public static void main(String[] args) {

        String actorName = "Tom Cruise";
        int yearOfBorn = 1962;
        String[] movieTitles = {"The Firm", "Jerry Maguire", "Magnolia", "Vanilla Sky", "Mission Impossible"};
        double[] movieRatings = {6.8, 7.3, 8.0, 6.9, 7.1};

        System.out.println("Name of the actor: " + actorName);
        System.out.println(actorName + " is born in the year: " + yearOfBorn);

        int currentAge = Year.now().getValue() - yearOfBorn;
        System.out.println("Current age of " + actorName + " is: " + currentAge);

        System.out.println("List of some of the movies of " + actorName);
        for (int i = 0; i < movieTitles.length; i++) {
            System.out.println(movieTitles[i] + " = " + getRating(movieRatings[i]));
        }
    }
    
    static String getRating(double rating) {
        if (rating <= 5.0) {
            return "bad";
        } else if (rating > 5.0 && rating <= 6.5) {
            return "average";
        } else if (rating > 6.5 && rating <= 7.0) {
            return "good";
        } else if (rating > 7.0 && rating <= 8.0) {
            return "very good";
        } else {
            return "amazing";
        }
    }
}

