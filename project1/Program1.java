
/**
 * Accumulates even numbers.
 *
 * @author Steven K. Sharp
 * @version 20190212
 */
public class Program1
{
    /**
     * Accumulate even numbers and return their sum.
     *
     * @param  intArray  An array of integers.
     * @return The accumulation of the evens.
     */
    public int accumulate(int[] intArray)
    {
        int accumulator = 0;
        //for (int ndx = 0 ; ndx < intArray.length ; ndx++)
        for (int i : intArray)
        {
            //if ((intArray[ndx] % 2) == 0)
            if ((i % 2) == 0)
            {
                //accumulator += intArray[ndx];
                accumulator += i;
            }
        }
        return accumulator;
    }

    public static void main(String[] args)
    {
        Program1 p1 = new Program1();
        System.out.println("The answer is " + p1.accumulate(new int[]{ 4, 5, 6, 7, 8, 9 }));
    }
}








