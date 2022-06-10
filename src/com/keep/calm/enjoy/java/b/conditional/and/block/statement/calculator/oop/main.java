package com.keep.calm.enjoy.java.b.conditional.and.block.statement.calculator.oop;

import java.util.Locale;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
//        CalculatorBase calculatorBase = new CalculatorBase(10, 40);
//        calculatorBase.calculate('a');
//        System.out.println(calculatorBase.getResult());

//        Adder adder = new Adder(10, 40);
//        adder.calculate();
//        System.out.println(adder.getResult());


//        CalculatorBase[] calcList = {new Adder(10, 40), new Subtractor(10, 40), new Multiplier(10, 40), new Divider(10, 40)};
//        for (CalculatorBase calculator: calcList) {
//            execute(calculator);
//        }
// add 15 25

//   2022-06-09
//        Helper helper = new Helper();
//        helper.executeInteractively();

        System.out.println("Enter an operation and two numbers:");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        MathProcessing[] operators = new MathProcessing[] {
                new Adder(), new PowerOf(), new Divider(), new Subtractor(), new Remain()
        };
        Helper helper = new Helper(operators);
        helper.process(userInput);
    }
}
