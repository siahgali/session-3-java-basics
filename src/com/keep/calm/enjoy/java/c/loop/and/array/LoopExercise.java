package com.keep.calm.enjoy.java.c.loop.and.array;

public class LoopExercise {
    public static void main(String[] args) {
        /*
        *********************************
        While Loop Example
        *********************************
         */
        int someValue = 4;
        int factorial = 1;
        while(someValue > 1) {
            factorial *= someValue;
            someValue--;
        }
        System.out.println(factorial);

        /*
        *********************************
        Do-while Loop Example
        *********************************
        */
        int iVal = 5;
        do {
            System.out.print(iVal);
            System.out.print(" * 2 = ");
            iVal *= 2;
            System.out.println(iVal);
        } while(iVal < 25);

        /*
        *********************************
        For Loop Examples
        *********************************
        */
        /* The While Loop */
        int i1 = 1;
        while(i1 < 100) {
            System.out.println(i1);
            i1 *= 2;
        }

        for(int i2 = 1; i2 < 100; i2 *= 2)
            System.out.println(i2);


    }
}
