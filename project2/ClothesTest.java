

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ClothesTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ClothesTest
{
    Clothes clothes;

    /**
     * Default constructor for test class ClothesTest
     */
    public ClothesTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        clothes = new Clothes();
    }

    @Test
    public void checkCold()
    {
        String s = clothes.dressMe(Month.DECEMBER);
        assertTrue(s.contains("warm"));
    }
    
    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
}
