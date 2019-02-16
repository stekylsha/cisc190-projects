package edu.sdccd.mesa.cisc190.calculator.operators;

import edu.sdccd.mesa.cisc190.calculator.Operator;

public class AssignmentOperator implements Operator
{
    public int operate(int x, int y) {
        x = y;
        return x;
    }
}
