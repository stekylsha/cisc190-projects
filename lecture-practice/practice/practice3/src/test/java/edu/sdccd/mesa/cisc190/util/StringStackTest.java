package edu.sdccd.mesa.cisc190.util;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * The test class StringStackTest.
 *
 * @author  Steven K. Sharp
 */
public class StringStackTest {
    private static final String[] TEST_VALUES = {
        "red",
        "green",
        "yellow",
        "blue",
        "purple",
        "orange"
    };
    private static final int TEST_LENGTH = TEST_VALUES.length - 1;

    private StringStack stack;

    /**
     * Default constructor for test class StringStackTest
     */
    public StringStackTest() {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp() {
        stack = new StringStack(TEST_LENGTH);
    }

    @Test
    public void testPushPop() throws StringStack.StackException {
        String last = fillStack(1);
        String popped = stack.pop();
        assertEquals(last, popped);
    }

    @Test
    public void testPushOverLength() throws StringStack.StackException {
        // push one more than we should
        String last = fillStack(TEST_VALUES.length);
        String popped = stack.pop();
        assertEquals(last, popped);
    }

    @Test
    public void testPopEmpty() throws StringStack.StackException {
        assertThrows(StringStack.StackException.class, stack::pop);
    }

    @Test
    public void testPopOverPush() throws StringStack.StackException {
        fillStack(2);
        for (int i = 0 ; i < 2 ; i++) {
            stack.pop();
        }
        assertThrows(StringStack.StackException.class, stack::pop);
    }

    @Test
    public void testPopCount() throws StringStack.StackException {
        fillStack(4);
        String[] popped = stack.pop(2);
        assertEquals(2, popped.length);
        assertArrayEquals(new String[] { TEST_VALUES[2], TEST_VALUES[3] }, popped);
    }

    @Test
    public void testPopCountAll() throws StringStack.StackException {
        fillStack(4);
        String[] popped = stack.pop(4);
        assertEquals(4, popped.length);
        String[] expected = new String[] {
            TEST_VALUES[0],
            TEST_VALUES[1],
            TEST_VALUES[2],
            TEST_VALUES[3]
        };
        assertArrayEquals(expected, popped);
    }

    @Test
    public void testPopCountOver() throws StringStack.StackException {
        fillStack(4);
        assertThrows(StringStack.StackException.class, () -> stack.pop(5));
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown() {
    }
    
    /**
     * Fill the stack to the correct number of items.  This alters the
     * stack in place.
     * 
     * @param count The number of things to put in the stack.
     * @return The last item pushed.
     */
    private String fillStack(int count) throws StringStack.StackException {
        String last = null;
        for (int i = 0 ; i < count ; i++) {
            last = TEST_VALUES[i % TEST_VALUES.length];
            this.stack.push(last);
        }
        return last;
    }
}
