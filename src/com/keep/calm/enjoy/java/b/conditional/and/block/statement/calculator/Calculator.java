package com.keep.calm.enjoy.java.b.conditional.and.block.statement.calculator;

public class Calculator {
    public static void main(String[] args) {
        double firstValue = 100.0d;
        double secondValue = 0.0d;
        double result = 0.0d;
        char opCode = 'd';

        switch(opCode) {
            case 'a':
                result = firstValue + secondValue;
                break;
            case 's':
                result = firstValue - secondValue;
                break;
            case 'm':
                result = firstValue * secondValue;
                break;
            case 'd':
                result = secondValue != 0 ? firstValue / secondValue : 0.0d;
                break;
            default:
                System.out.println("Invalid opCode: " + opCode);
                result = 0.0d;
                break;
        }
        System.out.println(result);
    }

}
