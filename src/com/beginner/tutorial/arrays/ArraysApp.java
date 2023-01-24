package com.beginner.tutorial.arrays;

public class ArraysApp {

    public static void main(String[] args) {

        int[] lotteryNumbers = new int[5];

        lotteryNumbers[0] = 17;
        lotteryNumbers[1] = 24;
        lotteryNumbers[2] = 48;
        lotteryNumbers[3] = 76;
        lotteryNumbers[4] = 89;

        for(int lotteryNumber : lotteryNumbers) {
            System.out.println(lotteryNumber);
        }

        int[][] weeklyLotteryNumbers = {

                {1,2,3,4,5},
                {10,20,30,40,50},
                {13,24,35,46,57},
                {10,23,35,48,58}
        };

        for (int i = 0; i < weeklyLotteryNumbers.length; i++) {
            for(int j = 0; j < weeklyLotteryNumbers[i].length; j++) {
                System.out.print(weeklyLotteryNumbers[i][j] + " ");
            }
            System.out.println();
        }

    }
}
