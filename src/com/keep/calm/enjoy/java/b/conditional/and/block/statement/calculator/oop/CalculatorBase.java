package com.keep.calm.enjoy.java.b.conditional.and.block.statement.calculator.oop;

public abstract class CalculatorBase {
    private double firstValue;
    private double secondValue;
    private double result;

    public CalculatorBase() {

    }
    public CalculatorBase(double firstValue, double secondValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }

    public double getFirstValue() {
        return firstValue;
    }

    public double getSecondValue() {
        return secondValue;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public abstract void calculate();


}
