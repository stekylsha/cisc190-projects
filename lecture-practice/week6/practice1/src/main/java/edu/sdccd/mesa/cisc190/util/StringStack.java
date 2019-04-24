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
     * @param capacity The size of the stack.
     */
    public StringStack(int capacity) {
        // code goes here
    }

    /**
     * Push the parameter onto the stack.  If the stack is full, a message is printed.
     *
     * @param value The value to push onto the stack.
     */
    public void push(String value) {
        // code goes here
    }

    /**
     * Remove the last value on the stack and return it.  If there is nothing on the stack, a message is printed and
     * null is returned.
     *
     * @return The last value pushed onto the stack.
     */
    public String pop() {
        // code goes here
        return null;
    }

    /**
     * Remove the last {@code count} values on the stack and return them in an array.  If the number is larger than
     * the number fo things on the stack, the entire stack is returned and a message is printed out.
     *
     * @param count the number of values to remove.
     * @return The last {@code count} values pushed onto the stack.
     */
    public String[] pop(int count) {
        // code goes here
        return null;
    }

    /**
     * Return the last value on the stack without removing it.  If there is nothing on the stack, a message is
     * printed and null is returned.
     *
     * @return The last value pushed onto the stack.
     */
    public String peek() {
        // code goes here
        return null;
    }
}
