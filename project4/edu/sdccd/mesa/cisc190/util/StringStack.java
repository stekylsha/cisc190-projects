package edu.sdccd.mesa.cisc190.util; 

public class StringStack
{
    // member variables go here
    private String[] stack;
    private int stackIndex;

    public StringStack()
    {
        stack = new String[10];
        stackIndex = 0;
    }

    public StringStack(int initialCapacity)
    {
        stack = new String[initialCapacity];
        stackIndex = 0;
    }

    /**
     * Look at the top value in the stack, without removing it.
     * @return The value at the top.
     */
    public String peek()
    {
        return stack[stackIndex-1];
    }

    /**
     * Pop a value from the stack.
     * @return The value removed.
     */
    public String pop()
    {
        if (stackIndex <= 0) {
            stackIndex -= 1;
            return stack[stackIndex];
        }
        else
        {
            // fixme: don't return if there's no value
            return "";
        }
    }

    /**
     * Push a value into the stack.
     * @param value The value to push.
     */
    public void push(String value)
    {
        if (stackIndex < stack.length)
        {
            stack[stackIndex] = value;
            stackIndex += 1;
        }
        else
        {
            // do something nasty
        }
    }
    
    public String toString()
    {
        return "{ stackIndex : " + stackIndex + ", stack : " + stack.toString() + " }";
    }
}
