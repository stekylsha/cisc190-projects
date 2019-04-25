package edu.sdccd.mesa.cisc190.util;


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
        // code goes here
    }

    /**
     * Push the parameter onto the stack.
     *
     * @param value The value to push onto the stack.
     */
    public void push(String value) throws StackException {
        // code goes here
    }

    /**
     * Remove the last value on the stack and return it.
     *
     * @return The last value pushed onto the stack.
     */
    public String pop() throws StackException {
        // code goes here
        return "";
    }

    /**
     * Extra Credit
     * Remove the last n values on the stack and return
     * them as an array.  If the requested size is larger
     * than our array size, throw an exception.
     *
     * @param n The number of values to remove from the stack.
     * @return The last n values pushed onto the stack.
     */
    public String[] pop(int n) throws StackException {
        throw new UnsupportedOperationException("Nope.");
    }

    /**
     * Return the last value on the stack without removing it.
     *
     * @return The last value pushed onto the stack.
     */
    public String peek() throws StackException {
        // code goes here
        return "";
    }

    public class StackException extends Exception {
    
        /**
         * Constructor for objects of class StackException
         */
        public StackException(String message) {
            super(message);
        }
    }

    private class StackOverflowException extends StackException {
        private static final String OVERFLOW_MESSAGE = "Push requested on full stack";
        /**
         * Constructor for objects of class StackOverflowException
         */
        public StackOverflowException() {
            super(OVERFLOW_MESSAGE);
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
