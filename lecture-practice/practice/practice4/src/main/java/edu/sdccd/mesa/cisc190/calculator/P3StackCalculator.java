package edu.sdccd.mesa.cisc190.calculator;

import edu.sdccd.mesa.cisc190.util.Stack;
import edu.sdccd.mesa.cisc190.util.StackException;

/**
 * Write a description of class SuperStackCalculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class P3StackCalculator implements Calculator {
    private Stack<Number> operands;
    private Stack<Operator> operators;

    public P3StackCalculator() {
        this.operands = new Stack<>(6);
        this.operators = new Stack<>(6);
    }

    public void addOperator(Operator operator) {
        operators.push(operator);
    }

    public void addOperand(Number operand) {
        operands.push(operand);
    }

    public Number calculate() {
        boolean done = false;
        Operator op = null;
        Number result = null;
        while (!done) {
            try {
                op = operators.pop();
            } catch (StackException se) {
                done = true;
            }
            if (op != null && !done) {
                try {
                    result = op.operate(operands.pop(), operands.pop());
                } catch (StackException se) {
                    throw new IllegalStateException("Number of operators and operands do not match.");
                }
                operands.push(result);
            }
        }
        try {
            result = operands.pop();
        } catch (StackException se) {
            throw new IllegalStateException("This should never happen.");
        }
        return result;
    }
}
