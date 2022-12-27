package com.aek426rahmani.examples;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }

    /*
     * test an app that calculates the factorial of a number
     * number is 1
     */
    public void testFactorialOfOne()
    {
        // arrange
        int number = 1;
        int expected = 1;

        // act
        int actual = App.factorial(number);

        // assert
        assertEquals(expected, actual);
    }
}
