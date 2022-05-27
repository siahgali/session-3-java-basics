package com.keep.calm.enjoy.java.b.conditional.and.block.statement.calculator.oop;

public class Subtractor extends CalculatorBase{

    public Subtractor(double firstValue, double secondValue) {
        super(firstValue, secondValue);
    }

    @Override
    public void calculate() {
        setResult(getFirstValue() - getSecondValue());
    }


}
