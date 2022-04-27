package com.keep.calm.enjoy.java.c.loop.and.array;

public class ArrayExercise {
    public static void main(String[] args) {
        /*
         *****************************************
         * Initialize arrays long-hand
         * Use Traditional For loop
         *****************************************
         */
        float[] theVals1 = new float[3];
        theVals1[0] = 10.0f;
        theVals1[1] = 20.0f;
        theVals1[2] = 15.0f;
        float sum1 = 0.0f;
        for(int index = 0; index < theVals1.length; index = index +1) {
            sum1 += theVals1[index]; // sum1 = sum1 + theVals1[index];
        }
        System.out.println(sum1); // displays 45

        /*
         *****************************************
         * Initialize arrays short-hand
         * Use Traditional For loop
         *****************************************
         */
        float[] theVals2 = new float[3];
        theVals2[0] = 10.0f;
        theVals2[1] = 20.0f;
        theVals2[2] = 15.0f;
        float sum2 = 0.0f;
        for(int index = 0; index < theVals2.length; index++) {
            sum2 += theVals2[index];
        }
        System.out.println(sum2); // displays 45

        /*
         *****************************************
         * ILoop through arrays with for-each
         *****************************************
         */
        float sum3 = 0.0f;
        for(float currentVal1 : theVals1)
            sum3 += currentVal1;
        System.out.println(sum3); // displays 45

        float sum4 = 0.0f;
        for(float currentVal2 : theVals2)
            sum4 += currentVal2;
        System.out.println(sum4); // displays 45


        float[] theVals3 = new float[3];
        for (float element:theVals3) { // for(int index = 0; index < theVals2.length; index++)
            
        }
    }
}
