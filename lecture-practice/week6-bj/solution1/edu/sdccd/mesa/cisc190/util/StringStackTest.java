package edu.sdccd.mesa.cisc190.util;

import java.util.Arrays;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class StringStackTest.
 *
 * @author  (your name)
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
    @Before
    public void setUp() {
        stack = new StringStack(TEST_LENGTH);
    }

    @Test
    public void testPushPop() throws StringStack.StackException {
        fillStack(1);
        String popped = stack.pop();
        assertEquals(TEST_VALUES[0], popped);
    }

    @Test
    public void testPushOverLength() throws StringStack.StackException {
        // push one more than we should
        fillStack(TEST_VALUES.length);
        String popped = stack.pop();
        assertEquals(TEST_VALUES[TEST_VALUES.length - 2], popped);
    }

    @Test
    public void testPopEmpty() throws StringStack.StackException {
        String popped = stack.pop();
        assertEquals(null, popped);
    }

    @Test
    public void testPopOverPush() throws StringStack.StackException {
        fillStack(2);
        String popped = null;
        for (int i = 0 ; i < 3 ; i++) {
            popped = stack.pop();
        }
        assertEquals(null, popped);
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
        String[] popped = stack.pop(5);
        assertEquals(4, popped.length);
        String[] expected = new String[] {
            TEST_VALUES[0],
            TEST_VALUES[1],
            TEST_VALUES[2],
            TEST_VALUES[3]
        };
        assertArrayEquals(expected, popped);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown() {
    }
    
    /**
     * Fill the stack to the correct number of items.  This alters the
     * stack in place.
     * 
     * @param stack The stack to fill.
     * @param count The number of things to put in the stack.
     */
    private void fillStack(int count) throws StringStack.StackException{
        for (int i = 0 ; i < count ; i++) {
            this.stack.push(TEST_VALUES[i % TEST_VALUES.length]);
        }
    }
}
