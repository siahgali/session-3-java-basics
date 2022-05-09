package com.keep.calm.enjoy.java.d.methods.calculator;

public class Calculator {
    public static void main(String[] args) {
        double[] leftNumbers = {100.0d, 25.0d, 225.0d, 11.0d};
        double[] rightNumbers = {50.0d, 92.0d, 17.0d, 3.0d};
        char[] operatorCodes = {'d', 'a', 's', 'm'};
        double[] results = new double[operatorCodes.length];
        if (args.length == 0) {
            applyAllOperatorsOnInitialValues(leftNumbers, rightNumbers, operatorCodes, results);
            printResult(results);
        } else if(args.length == 3) {
            handleCommandLine(args);
        } else {
            System.out.println("Please provide an operation code and 2 numeric values");
        }
    }

    private static void applyAllOperatorsOnInitialValues(double[] leftNumbers, double[] rightNumbers, char[] operatorCodes, double[] results) {
        for (int i = 0; i < operatorCodes.length; i++) {
            results[i] = execute(operatorCodes[i], leftNumbers[i], rightNumbers[i]);
        }
    }

    private static void printResult(double[] results) {
        for (double currentResult : results) {
            System.out.println(currentResult);
        }
    }

    private static void handleCommandLine(String[] args) {
        char opCode = args[0].charAt(0);
        double leftVal = Double.parseDouble(args[1]);
        double rightVal = Double.parseDouble(args[2]);
        double result = execute(opCode, leftVal, rightVal);
        System.out.println(result);
    }

    static double execute(char opCode, double leftVal, double rightVal) {
        double result;
        switch (opCode) {
            case 'a':
                result = leftVal + rightVal;
                break;
            case 's':
                result = leftVal - rightVal;
                break;
            case 'm':
                result = leftVal * rightVal;
                break;
            case 'd':
                result = rightVal != 0 ? leftVal / rightVal : 0.0d;
                break;
            default:
                System.out.println("Invalid opCode: " + opCode);
                result = 0.0d;
                break;
        }
        return result;
    }
}
