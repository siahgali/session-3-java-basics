package com.keep.calm.enjoy.java.b.conditional.and.block.statement.calculator.oop;

public class Remain implements MathProcessing{
    @Override
    public String getKeyWord() {
        return "rem";
    }

    @Override
    public double doCalculation(double leftValue, double rightValue) {
        return leftValue % rightValue;
    }
}
