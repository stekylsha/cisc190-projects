package edu.sdccd.mesa.cisc190.calculator;

public interface Calculator {
    public void addOperator(Operator operator);

    public void addOperand(Number operand);

    public Number calculate();
}
