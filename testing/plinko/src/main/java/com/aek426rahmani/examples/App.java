/*
 * created by: aek426rahmani
 * date: 27-12-2022
 */
/* simple application that's calculate the factoriel of an integer given by the user */
package com.aek426rahmani.examples;

import java.util.Scanner;
public class App {
    Scanner scanner = new Scanner(System.in);
    public int getNumber() {
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        return number;
    }
    public int calculateFactoriel(int number) throws NegativeException {
        if (number < 0) {
            throw new NegativeException("The number is negative");
            
        } 
        if (number ==0) {
            return 1;
        }
        return number * calculateFactoriel(number - 1);
    }

    public static void main(String[] args) {
        App app = new App();
        int number = app.getNumber();
        try {
            int result = app.calculateFactoriel(number);
            System.out.println("The factoriel of " + number + " is " + result);
        } catch (NegativeException e) {
            System.out.println(e.getMessage());
        }
    }
}