/*
 * created by: aek426rahmani
 * date: 27-12-2022
 */
// relize a spaghetti code that don't follow the SOLID principles

import java.util.Scanner;
public class calculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        if (number < 0) {
            System.out.println("The number is negative");
            System.exit(0);
        } 
        if (number ==0) {
            System.out.println("The factoriel of " + number + " is 1");
            System.exit(0);
        }
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        System.out.println("The factoriel of " + number + " is " + result);
    }
}