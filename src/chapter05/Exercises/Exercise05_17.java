/**
 * (Display pyramid) Write a program that prompts the user to enter an integer from
 * 1 to 15 and displays a pyramid, as shown in the following sample run:
 *
 * Enter the number of lines: 7
 * 7 6 5 4 3 2 1 2 3 4 5 6 7
 * 6 5 4 3 2 1 2 3 4 5 6
 * 5 4 3 2 1 2 3 4 5
 * 4 3 2 1 2 3 4
 * 3 2 1 2 3
 * 2 1 2
 * 1
 *
 * Created by Sven on 3/19/2019.
 */
package chapter05.Exercises;

import java.util.Scanner;

public class Exercise05_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int numOfLines = input.nextInt();
        int number = numOfLines;

        while (numOfLines >= 1) {
            number = numOfLines;
            for (; number > 1; number--) {
                System.out.print(number + " ");
            }
            for (; number <= numOfLines; number++) {
                System.out.print(number + " ");
            }
            numOfLines--;
            System.out.println();
        }
    }
}
