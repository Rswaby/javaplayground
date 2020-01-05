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
        
        assertTrue("Is A Permutation", Chapter1.checkPermutation("rohan", "ronha") );
        assertTrue("Not a Permuttion", !Chapter1.checkPermutation("rohan", "rohen"));
    }


    @Test
    public void URLifyTest()
    {
        assertTrue( true );
    }
}