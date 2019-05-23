package edu.sdccd.mesa.cisc190.calculator;

import edu.sdccd.mesa.cisc190.superstack.SuperStack;

import java.math.BigDecimal;

/**
 * Write a description of class SuperStackCalculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SuperStackCalculator implements Calculator {
    private SuperStack<Number> operands;
    private SuperStack<Operator> operators;

    public SuperStackCalculator() {
        this.operands = new SuperStack<>(1);
        this.operators = new SuperStack<>(1);
    }

    public void addOperator(Operator operator) {
        operators.push(operator);
    }

    public void addOperand(Number operand) {
        operands.push(operand);
    }

    public Number calculate() {
        while (operators.size() > 0) {
            // get the next operator
            Operator op = operators.pop();
            // get the next two operands.  if there is only one
            // available, that's an error.
            if (operands.size() < 2) {
                throw new IllegalStateException("Number of operators and operands do not match.");
            }
            Number result = op.operate(operands.pop(), operands.pop());
            operands.push(result);
        }
        return operands.pop();
    }
}
