package edu.sdccd.mesa.cisc190.util;


/**
 * A stack implementation.  This stack should only throw exceptions when nothing
 * is on the stack and {@code pop} or {@code peek} are called, or for the extra
 * credit, if not enough values exist to honor the request.
 *
 * @author <you>
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
     * Push the parameter onto the stack.  If the stack is not large enough, add
     * room to the stack and then push the new value.
     *
     * @param value The value to push onto the stack.
     */
    public void push(String value) {
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
        return new String[0];
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
