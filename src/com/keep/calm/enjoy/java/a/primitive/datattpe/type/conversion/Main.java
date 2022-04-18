package com.keep.calm.enjoy.java.a.primitive.datattpe.type.conversion;

public class Main {

    public static void main(String[] args) {
        float floatNumber = 1.0f;
        double doubleNumber = 4.0d;
        byte byteNumber = 7;
        short shortNumber = 7;
        long longNumber = 5;

//        short result1 = byteNumber;
//        short result1 = longNumber;
//        short result1 = (short)longNumber;
        short result1 = (short)byteNumber;

//        short result2 = byteNumber - longNumber;
        short result2 = (short)(byteNumber - longNumber);

//        long result3 = longNumber - floatNumber;
        float result3 = longNumber - floatNumber;

        // **********************************
        // Below are some additional examples
        // beyond those shown in the video.
        // **********************************

//        float result4 = longNumber - doubleNumber;
        double result4 = longNumber - doubleNumber;

//        long result5 = shortNumber - longNumber + floatNumber + doubleNumber;
        long result5 = (long)(shortNumber - longNumber + floatNumber + doubleNumber);

        System.out.println("Success");
    }
}
