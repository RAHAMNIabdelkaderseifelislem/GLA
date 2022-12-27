/*
 * created by: aek426rahmani
 * date: 27-12-2022
 */
package com.aek426rahmani.examples;

/*
 * this is the second iteration of the TDD process for this project
 * we will define class that passes the first iteration and second iteration and the third iteration of the TDD process
 * we will write a new test that will fail
 */

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    /*
     * this method calculates the factorial of a number
     */
    public static int factorial(int number)
    {
        if(number == 1) return 1;
        return number * factorial(number - 1);
    }
}