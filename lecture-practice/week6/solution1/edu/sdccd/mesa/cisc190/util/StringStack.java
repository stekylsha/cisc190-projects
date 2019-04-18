package edu.sdccd.mesa.cisc190.util;

import java.util.Arrays;

/**
 * A stack implementation.
 *
 * @author Steven K. Sharp
 */
public class StringStack {
    /**
     * The stack.
     */
    private String[] stack;
    
    /**
     * The index to the stack.
     */
    private int stackIndex;

    /**
     * Constructor for objects of class Stack with a capacity.
     */
    public StringStack(final int capacity) {
        stack = new String[capacity];
    }

    /**
     * Push the parameter onto the stack.
     *
     * @param value The value to push onto the stack.
     */
    public void push(final String value) {
        if (stackIndex < stack.length) {
            stack[stackIndex++] = value;
        } else {
            System.err.println("No room on the stack");
        }
    }

    /**
     * Remove the last value on the stack and return it.
     *
     * @return The last value pushed onto the stack.
     */
    public String pop() {
        String returnValue = null;
        if (stackIndex > 0) {
            returnValue = stack[--stackIndex];
        } else {
            System.err.println("Nothing on the stack");
        }
        return returnValue;
    }

    /**
     * Extra Credit
     * Remove the last n values on the stack and return
     * them as an array.
     *
     * @param n The number of values to remove from the stack.
     * @return The last n values pushed onto the stack.
     */
    public String[] pop(int n) {
        String[] returnValue = null;
        int start = 0;
        int end = 0;
        if (n < stackIndex) {
            end = stackIndex;
            start = stackIndex - n;
            stackIndex = start;
        } else {
            end = stackIndex;
            start = 0;
            stackIndex = 0;
        }
        returnValue = Arrays.copyOfRange(stack, start, end);
        Arrays.fill(stack, start, end, null);
        return returnValue;
    }

    /**
     * Return the last value on the stack without removing it.
     *
     * @return The last value pushed onto the stack.
     */
    public String peek() {
        String returnValue = null;
        if (stackIndex > 0) {
            returnValue = stack[stackIndex-1];
        } else {
            System.err.println("Nothing on the stack");
        }
        return returnValue;
    }
}
