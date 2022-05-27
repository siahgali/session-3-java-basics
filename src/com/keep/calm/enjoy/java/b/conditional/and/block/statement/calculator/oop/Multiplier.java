package com.keep.calm.enjoy.java.b.conditional.and.block.statement.calculator.oop;

public class Multiplier extends CalculatorBase{
    public Multiplier(double firstValue, double secondValue) {
        super(firstValue, secondValue);
    }

    @Override
    public void calculate() {
        setResult(getFirstValue() * getSecondValue());
    }
}
