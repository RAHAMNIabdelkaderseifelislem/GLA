/*
 * created by: aek426rahmani
 * date: 27-12-2022
 */

 // this class is responsible for calculate the factoriel of a number
package main.java.com.aek426rahmani.examples;

public class Calculate {
    // calculate the factoriel of a number
    public int calculateFactoriel(int number) throws NegativeException {
        if (number < 0) {
            throw new NegativeException("The number is negative");
        } 
        if (number ==0) {
            return 1;
        }
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}
