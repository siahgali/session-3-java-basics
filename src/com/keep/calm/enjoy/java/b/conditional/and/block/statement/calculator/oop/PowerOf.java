package com.keep.calm.enjoy.java.b.conditional.and.block.statement.calculator.oop;

public class PowerOf implements MathProcessing{

    @Override
    public String getKeyWord() {
        return "power";
    }

    @Override
    public double doCalculation(double leftValue, double rightValue) {
        return Math.pow(leftValue, rightValue);
    }
}
