package edu.sdccd.mesa.cisc190.calculator.operators;

import edu.sdccd.mesa.cisc190.calculator.Operator;

public class AdditionOperator implements Operator
{
    public Number operate(Number x, Number y) {
        return x.doubleValue() + y.doubleValue();
    }
}
