package com.keep.calm.enjoy.java.b.conditional.and.block.statement.calculator.oop;

import java.util.Scanner;

public class Helper {
    public static void executeInteractively() {
        System.out.println("Enter an operation and two numbers:");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        // add 15 25
        String[] parts = userInput.split(" ");
        MathOperation operation = MathOperation.valueOf(parts[0].toUpperCase());
        double leftValue = Double.parseDouble(parts[1]);
        double rightValue = Double.parseDouble(parts[2]);
        createCalculation(operation, leftValue, rightValue);

    }

    private static void createCalculation(MathOperation operation, double leftValue, double rightValue) {
        CalculatorBase calculation = null;
        switch (operation) {
            case ADD:
                calculation = new Adder(leftValue, rightValue);
                break;
            case SUB:
                calculation = new Subtractor(leftValue, rightValue);
                break;
            case MULTIPLY:
                calculation = new Multiplier(leftValue, rightValue);
                break;
            case DIVIDE:
                calculation = new Divider(leftValue, rightValue);
                break;

        }
        calculation.calculate();
        System.out.println(calculation.getResult());
    }
}
