/*
 * created by: aek426rahmani
 * date: 27-12-2022
 */
//this is a spaghetti code that needs to be refactored
import java.util.Scanner;

public class spaghettiCode{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int numberOfStudents = input.nextInt();
        int[] scores = new int[numberOfStudents];
        System.out.println("Enter " + numberOfStudents + " scores: ");
        for (int i = 0; i < numberOfStudents; i++) {
            scores[i] = input.nextInt();
        }
        int best = 0;
        for (int i = 0; i < numberOfStudents; i++) {
            if (scores[i] > best) {
                best = scores[i];
            }
        }
        for (int i = 0; i < numberOfStudents; i++) {
            if (scores[i] >= best - 10) {
                System.out.println("Student " + i + " score is " + scores[i] + " and grade is A");
            } else if (scores[i] >= best - 20) {
                System.out.println("Student " + i + " score is " + scores[i] + " and grade is B");
            } else if (scores[i] >= best - 30) {
                System.out.println("Student " + i + " score is " + scores[i] + " and grade is C");
            } else if (scores[i] >= best - 40) {
                System.out.println("Student " + i + " score is " + scores[i] + " and grade is D");
            } else {
                System.out.println("Student " + i + " score is " + scores[i] + " and grade is F");
            }
        }
    }

}