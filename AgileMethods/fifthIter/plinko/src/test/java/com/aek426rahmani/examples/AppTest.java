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

    /*
     * test an app that calculates the factorial of a number
     * number is 2
     */
    public void testFactorialOfTwo()
    {
        // arrange
        int number = 2;
        int expected = 2;

        // act
        int actual = App.factorial(number);

        // assert
        assertEquals(expected, actual);
    }

    /*
     * test an app that calculates the factorial of a number
     * number is 3
     */
    public void testFactorialOfThree()
    {
        // arrange
        int number = 3;
        int expected = 6;

        // act
        int actual = App.factorial(number);

        // assert
        assertEquals(expected, actual);
    }

    /*
     * test an app that calculates the factorial of a number
     * this time we will test the factorial of 0
     */
    public void testFactorialOfZero()
    {
        // arrange
        int number = 0;
        int expected = 1;

        // act
        int actual = App.factorial(number);

        // assert
        assertEquals(expected, actual);
    }
    /*
     * test an app that calculates the factorial of a number
     * this time we will test the factorial of -1 and we will expect an exception
     */
    @Test(expected = NegativeNumberException.class)
    public void testFactorialOfNegativeOne()
    {
        // arrange
        int number = -1;

        // act
        App.factorial(number);
    }
}
