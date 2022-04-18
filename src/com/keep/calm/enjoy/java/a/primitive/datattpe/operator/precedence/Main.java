package com.keep.calm.enjoy.java.a.primitive.datattpe.operator.precedence;

public class Main {

    public static void main(String[] args) {
        int firstValue = 450;
        int secondValue = 60;
        int thirdValue = 3;
        int forthValue = 10;

        int result1 = firstValue - secondValue / thirdValue;

        int result2 = (firstValue - secondValue) / thirdValue;

        System.out.println(result1);
        System.out.println(result2);

        int result3 = firstValue / thirdValue * forthValue + secondValue;

        int result4 = firstValue / (thirdValue * (forthValue + secondValue));

        System.out.println(result3);
        System.out.println(result4);
    }
}





