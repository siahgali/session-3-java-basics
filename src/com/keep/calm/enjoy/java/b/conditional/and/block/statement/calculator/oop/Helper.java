package com.keep.calm.enjoy.java.b.conditional.and.block.statement.calculator.oop;

import java.util.Scanner;

public class Helper {
//    public static void executeInteractively() {
//        System.out.println("Enter an operation and two numbers:");
//        Scanner scanner = new Scanner(System.in);
//        String userInput = scanner.nextLine();
//        // add 15 25
//        String[] parts = userInput.split(" ");
//        MathOperation operation = MathOperation.valueOf(parts[0].toUpperCase());
//        double leftValue = Double.parseDouble(parts[1]);
//        double rightValue = Double.parseDouble(parts[2]);
//        createCalculation(operation, leftValue, rightValue);
//
//    }
//
//    private static void createCalculation(MathOperation operation, double leftValue, double rightValue) {
//        CalculatorBase calculation = null;
//        switch (operation) {
//            case ADD:
//                calculation = new Adder(leftValue, rightValue);
//                break;
//            case SUB:
//                calculation = new Subtractor(leftValue, rightValue);
//                break;
//            case MULTIPLY:
//                calculation = new Multiplier(leftValue, rightValue);
//                break;
//            case DIVIDE:
//                calculation = new Divider(leftValue, rightValue);
//                break;
//            case POWER:
//                calculation = new PowerOf(leftValue, rightValue);
//
//        }
//        calculation.calculate();
//        System.out.println(calculation.getResult());
//    }

    private final MathProcessing[] operators;

    public Helper(MathProcessing[] operators) {
        this.operators = operators;
    }

    public void process (String statement) {
        String[] parts = statement.split(MathProcessing.SEPARATOR);
        String keyword = parts[0];
        double leftValue = Double.parseDouble(parts[1]);
        double rightValue = Double.parseDouble(parts[2]);

        MathProcessing enteredOperator = null;
        for (MathProcessing operator: operators) {
            if (keyword.equalsIgnoreCase(operator.getKeyWord())) {
                enteredOperator = operator;
                break;
            }
        }

        double result = enteredOperator.doCalculation(leftValue, rightValue);

        System.out.println(result);
    }
}
