package com.keep.calm.enjoy.java.b.conditional.and.block.statement.calculator.oop;

public class Divider extends CalculatorBase{
    public Divider(double firstValue, double secondValue) {
        super(firstValue, secondValue);
    }

    @Override
    public void calculate() {
        if (getSecondValue() != 0 ) {
            setResult(getFirstValue() / getSecondValue());
        } else {

        }
    }
}
