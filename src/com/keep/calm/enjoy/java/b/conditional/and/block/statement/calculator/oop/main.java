package com.keep.calm.enjoy.java.b.conditional.and.block.statement.calculator.oop;

public class main {
    public static void main(String[] args) {
//        CalculatorBase calculatorBase = new CalculatorBase(10, 40);
//        calculatorBase.calculate('a');
//        System.out.println(calculatorBase.getResult());

//        Adder adder = new Adder(10, 40);
//        adder.calculate();
//        System.out.println(adder.getResult());


        CalculatorBase[] calcList = {new Adder(10, 40), new Subtractor(10, 40), new Multiplier(10, 40), new Divider(10, 40)};
        for (CalculatorBase calculator: calcList) {
            execute(calculator);
        }

    }

    private static void execute(CalculatorBase calculator) {
        calculator.calculate();
        System.out.println(calculator.getResult());
    }
}
