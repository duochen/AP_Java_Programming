/**
 * (Find the Unicode of a character) Write a program that receives a character and
 * displays its Unicode.
 *
 * Here is a sample run:
 * Enter a character: E
 * The Unicode for the character E is 69
 *
 * Created by Sven on 10/22/2018.
 */
package chapter04.Exercises;

import java.util.Scanner;

public class Exercise04_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char character = input.next().charAt(0);
        int unicode = character;

        System.out.println("The Unicode code for the character " + character + " is " + unicode);

    }
}
