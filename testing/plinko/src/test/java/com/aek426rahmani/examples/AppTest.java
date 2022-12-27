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
    // test for the getNumber method
    public void testGetNumber() {
        App app = new App();
        int number = app.getNumber();
        assertTrue(number > 0);
    }
    // test exception for the calculateFactoriel method
    public void testCalculateFactoriel() {
        App app = new App();
        try {
            int result = app.calculateFactoriel(-1);
            assertTrue(result > 0);
        } catch (NegativeException e) {
            System.out.println(e.getMessage());
        }
    }
    // test for the calculateFactoriel method
    public void testCalculateFactoriel2() {
        App app = new App();
        try {
            int result = app.calculateFactoriel(5);
            assertTrue(result > 0);
        } catch (NegativeException e) {
            System.out.println(e.getMessage());
        }
    }
    // test the factorial of 4
    public void testCalculateFactoriel3() {
        App app = new App();
        try {
            int result = app.calculateFactoriel(4);
            assertTrue(result == 24);
        } catch (NegativeException e) {
            System.out.println(e.getMessage());
        }
    }
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
}
