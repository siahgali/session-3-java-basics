package com.keep.calm.enjoy.java.b.conditional.and.block.statement.calculator.oop;

public class Adder extends CalculatorBase implements MathProcessing {

    public Adder() {
    }

    public Adder(double firstValue, double secondValue) {
        super(firstValue, secondValue);
    }

    @Override
    public void calculate() {
        setResult(getFirstValue() + getSecondValue());
    }

    @Override
    public String getKeyWord() {
        return "add";
    }

    @Override
    public double doCalculation(double leftValue, double rightValue) {
        return leftValue + rightValue;
    }
}
