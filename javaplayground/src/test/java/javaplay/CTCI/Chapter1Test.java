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
        Integer v = Integer.valueOf(0);
        v +=4;
        //System.out.print("value: "+ type(v));

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