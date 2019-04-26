package edu.sdccd.mesa.cisc190.util;

import java.util.ArrayList;
import java.util.List;

/**
 * A stack implementation.
 *
 * @author Steven K. Sharp
 */
public class Stack<Type> {
    /**
     * The stack.
     */
    private List<Type> stack;

    /**
     * Constructor for objects of class Stack with a capacity.
     */
    public Stack(int capacity) {
        stack = new ArrayList<>(capacity);
    }

    /**
     * Push the parameter onto the stack.
     *
     * @param value The value to push onto the stack.
     */
    public void push(Type value) throws StackException {
        stack.add(value);
    }

    /**
     * Remove the last value on the stack and return it.
     *
     * @return The last value pushed onto the stack.
     */
    public Type pop() throws StackException {
        Type returnValue;
        if (stack.size() > 0) {
            returnValue = stack.remove(stack.size() - 1);
        } else {
            throw new StackException.StackUnderflowException();
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
    public Type[] pop(int n) throws StackException {
        Type[] returnValue = null;
        /*
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
        */
        return returnValue;
    }

    /**
     * Return the last value on the stack without removing it.
     *
     * @return The last value pushed onto the stack.
     */
    public Type peek() throws StackException {
        Type returnValue;
        if (stack.size() > 0) {
            returnValue = stack.get(stack.size() - 1);
        } else {
            throw new StackException.StackUnderflowException();
        }
        return returnValue;
    }

}

