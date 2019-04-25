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
    public StringStack(int capacity) {
        stack = new String[capacity];
    }

    /**
     * Push the parameter onto the stack.
     *
     * @param value The value to push onto the stack.
     */
    public void push(String value) throws StackException {
        if (stackIndex < stack.length) {
            stack[stackIndex++] = value;
        } else {
            stack = Arrays.copyOf(stack, stack.length * 2);
            push(value);
        }
    }

    /**
     * Remove the last value on the stack and return it.
     *
     * @return The last value pushed onto the stack.
     */
    public String pop() throws StackException {
        String returnValue = null;
        if (stackIndex > 0) {
            returnValue = stack[--stackIndex];
        } else {
            throw new StackUnderflowException();
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
    public String[] pop(int n) throws StackException {
        String[] returnValue = null;
        int start = 0;
        int end = 0;
        if (n <= stackIndex) {
            end = stackIndex;
            start = stackIndex - n;
            stackIndex = start;
        } else {
            throw new StackUnderflowException();
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
    public String peek() throws StackException {
        String returnValue = null;
        if (stackIndex > 0) {
            returnValue = stack[stackIndex-1];
        } else {
            throw new StackUnderflowException();
        }
        return returnValue;
    }

    public class StackException extends Exception {
    
        /**
         * Constructor for objects of class StackException
         */
        public StackException(String message) {
            super(message);
        }
    }

    private class StackUnderflowException extends StackException {
        private static final String UNDERFLOW_MESSAGE = "Pop requested on empty stack";
        /**
         * Constructor for objects of class StackUnderflowException
         */
        public StackUnderflowException() {
            super(UNDERFLOW_MESSAGE);
        }
    }
}

