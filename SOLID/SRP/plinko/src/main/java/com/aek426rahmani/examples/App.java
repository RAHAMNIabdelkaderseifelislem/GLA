/*
 * created by: aek426rahmani
 * date: 27-12-2022
 */

 // relize a code that follow the Single Responsibility Principle (SRP)
package com.aek426rahmani.examples;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        Calculate calculate = new Calculate();
        try {
            int result = calculate.calculateFactoriel(number);
            System.out.println("The factoriel of " + number + " is " + result);
        } catch (NegativeException e) {
            System.out.println(e.getMessage());
        }
    }
}