package com.keep.calm.enjoy.java.b.conditional.and.block.statement.calculator.oop;

public class Divider implements MathProcessing {

    public Divider() {

    }

    @Override
    public String getKeyWord() {
        return "divide";
    }

    @Override
    public double doCalculation(double leftValue, double rightValue) {
        if (rightValue != 0 ) {
            return  leftValue / rightValue;
        } else {
            return 0;
        }
    }
}
