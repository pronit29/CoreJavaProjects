package com.beginner.tutorial.loops;

public class LoopsApp {

    public static void main(String[] args) {

        System.out.println("<--ENTERING THE WHILE LOOP-->");
        //While loop
        int i = 1;
        while(i <= 0){

            System.out.println(i + ".BEING RIGHT SUCKS" );
            ++i;
        }
        System.out.println("Value of i: " + i);
        System.out.println();

        System.out.println("<--ENTERING THE DO-WHILE LOOP-->");
        //Do-While loop
        int j = 1;
        do {
            System.out.println(j + ".BEING RIGHT SUCKS" );
            ++j;
        }while(j <= 0);

        System.out.println("Value of j: " + j);
        System.out.println();

        System.out.println("<--ENTERING THE FOR LOOP-->");
        //For loop
        for(int a = 1; a <= 5; a++) {
            System.out.println(a + ".BEING RIGHT SUCKS" );
        }

        System.out.println("<--USING THE CONTINUE STATEMENT-->");
        //Continue Statement
        for(int a = 1; a <= 5; a++) {
            if(a == 3) {
                continue;
            }
            System.out.println(a + ".BEING RIGHT SUCKS" );
        }

        System.out.println("<--USING THE BREAK STATEMENT-->");
        //Break Statement
        for(int a = 1; a <= 5; a++) {
            if(a == 3) {
                break;
            }
            System.out.println(a + ".BEING RIGHT SUCKS" );
        }

        System.out.println("<--ENTERING THE NESTED FOR LOOP-->");
        //Nested For Loop
        for(int k = 1; k <= 5; k++) {
            for(int m = 1; m <= 2; m++) {
                System.out.println("K= " + k + " " + "M= " + m + ".BEING RIGHT SUCKS" );
        }
        }



    }
}


