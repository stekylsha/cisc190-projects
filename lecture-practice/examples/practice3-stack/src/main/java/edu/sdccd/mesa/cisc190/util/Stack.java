package edu.sdccd.mesa.cisc190.util;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A stack implementation.
 *
 * @author Steven K. Sharp
 */
public class Stack<T> {
    private static final Logger LOG = LoggerFactory.getLogger(Stack.class);

    /**
     * The stack.
     */
    private List<T> stack;

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
    public void push(T value) {
        LOG.trace("Pushing value '{}' to {}", value, stack.size());
        stack.add(value);
    }

    /**
     * Remove the last value on the stack and return it.
     *
     * @return The last value pushed onto the stack.
     */
    public T pop() throws StackException {
        T returnValue;
        LOG.trace("Stack size is {}", stack.size());
        if (stack.size() > 0) {
            returnValue = stack.remove(stack.size() - 1);
            LOG.trace("Popped value '{}' from {}", returnValue, stack.size());
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
    public T[] pop(int n) throws StackException {
        throw new UnsupportedOperationException();
    }

    /**
     * Return the last value on the stack without removing it.
     *
     * @return The last value pushed onto the stack.
     */
    public T peek() throws StackException {
        T returnValue;
        if (stack.size() > 0) {
            returnValue = stack.get(stack.size() - 1);
        } else {
            throw new StackException.StackUnderflowException();
        }
        return returnValue;
    }

}

