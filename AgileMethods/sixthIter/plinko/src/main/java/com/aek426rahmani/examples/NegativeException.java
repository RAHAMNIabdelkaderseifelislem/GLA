/*
 * created by: aek426rahmani
 * date: 27-12-2022
 */
// this class is used to create a custom exception
package com.aek426rahmani.examples;


public class NegativeException extends Exception
{
    public NegativeException(String message)
    {
        System.out.println(message);
    }
}