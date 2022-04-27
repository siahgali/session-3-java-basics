package com.keep.calm.enjoy.java.c.loop.and.array;

public class Calculator {
    public static void main(String[] args) {
        double[] leftNumbers = {100.0d, 25.0d, 225.0d, 11.0d};
        double[] rightNumbers = {50.0d, 92.0d, 17.0d, 3.0d};
        char[] operatorCodes = {'d', 'a', 's', 'm'};
        double[] results = new double[operatorCodes.length];

        for(int i = 0; i < operatorCodes.length; i++) {
            switch (operatorCodes[i]) {
                case 'a':
                    results[i] = leftNumbers[i] + rightNumbers[i];
                    break;
                case 's':
                    results[i] = leftNumbers[i] - rightNumbers[i];
                    break;
                case 'm':
                    results[i] = leftNumbers[i] * rightNumbers[i];
                    break;
                case 'd':
                    results[i] = rightNumbers[i] != 0 ? leftNumbers[i] / rightNumbers[i] : 0.0d;
                    break;
                default:
                    System.out.println("Invalid opCode: " + operatorCodes[i]);
                    results[i] = 0.0d;
                    break;
            }
        }

        for(double currentResult : results) {
            System.out.println(currentResult);
        }
    }
}
