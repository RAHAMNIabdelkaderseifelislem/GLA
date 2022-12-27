/*
 * created by: aek426rahmani
 * date: 27-12-2022
 */
//we will extract method from the spaghetti code that we wrote in the previous snippet
import java.util.Scanner;

public class extractMethod {

    Scanner input = new Scanner(System.in);

    public extractMethod() {
        int numberOfStudents = getNumberOfStudents();
        int[] scores = getScores(numberOfStudents);
        int best = getBestScore(scores);
        showGrades(scores, best);
    }

    public int getNumberOfStudents() {
        System.out.println("Enter the number of students: ");
        int numberOfStudents = input.nextInt();
        return numberOfStudents;
    }

    public int[] getScores(int numberOfStudents) {
        int[] scores = new int[numberOfStudents];
        System.out.println("Enter " + numberOfStudents + " scores: ");
        for (int i = 0; i < numberOfStudents; i++) {
            scores[i] = input.nextInt();
        }
        return scores;
    }

    public int getBestScore(int[] scores) {
        int best = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > best) {
                best = scores[i];
            }
        }
        return best;
    }

    public void showGrades(int[] scores, int best) {
        for (int i = 0; i < scores.length; i++) {
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

    public static void main(String[] args) {
        new extractMethod();
    }

}