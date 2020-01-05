package javaplay.CTCI;


import static org.junit.Assert.assertTrue;

import org.junit.Test;



public class Chapter1Test{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void isUnqueTest()
    {
        assertTrue("isUniqueTest: ",Chapter1.isUnique("abc123"));
        assertTrue("Not unique", !Chapter1.isUnique("aaaa"));
    }

    @Test
    public void checkPermutationTest()
    {
        assertTrue( true );
    }


    @Test
    public void URLifyTest()
    {
        assertTrue( true );
    }
}