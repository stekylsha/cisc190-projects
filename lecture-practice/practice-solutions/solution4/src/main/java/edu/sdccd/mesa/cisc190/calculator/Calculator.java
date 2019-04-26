package edu.sdccd.mesa.cisc190.calculator;

import edu.sdccd.mesa.cisc190.util.Stack;

/**
 * Write a description of class Calculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Calculator {
    private Stack<Operator> operatorStack = new Stack<>(10);
    private Stack<Number> operandStack = new Stack<>(10);
}
