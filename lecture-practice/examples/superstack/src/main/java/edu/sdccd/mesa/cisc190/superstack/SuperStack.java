package edu.sdccd.mesa.cisc190.superstack;

import java.util.Collections;
import java.util.List;
import java.util.Stack;
import java.util.EmptyStackException;

public class SuperStack<E> extends Stack<E> {

    public SuperStack(int capacity) {
        super();
        //setSize(capacity);
    }

    /**
     * Return the last "n" things pushed onto the stack.
     *
     * @param n How many to pop.
     * @return An array of the items popped.
     * @throws EmptyStackException If there are not as many items on the
     * stack as have been requested.
     */
    public List<E> pop(int n) {
        if (n > size()) {
            throw new EmptyStackException();
        }
        List<E> subList = List.copyOf(subList(size() - n, size()));
        removeRange(size() - n, size());
        //E[] array = this.<E>toArray(new E[0]);
        return subList;
    }
}
