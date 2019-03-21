package edu.sdccd.mesa.cisc190.util; 

public class IntegerStack
{
    // member variables go here
    private int[] intArray;
    private int arrayPosition;

    public IntegerStack()
    {
        intArray = new int[10];
        arrayPosition = 0;
    }

    public IntegerStack(int initialCapacity)
    {
        intArray = new int[initialCapacity];
        arrayPosition = 0;
    }

    /**
     * Look at the top value in the intArray, without removing it.
     * @return The value at the top.
     */
    public int peek()
    {
        return intArray[arrayPosition-1];
    }

    /**
     * Pop a value from the intArray.
     * @return The value removed.
     */
    public int pop()
    {
        if (arrayPosition <= 0) {
            arrayPosition -= 1;
            return intArray[arrayPosition];
        }
        else
        {
            // fixme: don't return if there's no value
            return 0;
        }
    }

    /**
     * Push a value into the intArray.
     * @param value The value to push.
     */
    public void push(int value)
    {
        if (arrayPosition < intArray.length)
        {
            intArray[arrayPosition] = value;
            arrayPosition += 1;
        }
        else
        {
            // do something nasty
        }
    }
    
    public String toString()
    {
        return "{ arrayPosition : " + arrayPosition + ", intArray : " + intArray.toString() + " }";
    }
}
