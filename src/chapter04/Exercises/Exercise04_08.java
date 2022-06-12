/**
 * (Find the character of an ASCII code) Write a program that receives a character
 * and displays its ASCII code (an integer between 0 and 127).
 *
 * Here is a sample run:
 * Enter a character: E
 * The ASCII code for character E is 69
 *
 * Created by Sven on 10/22/2018.
 */
package chapter04.Exercises;

import java.util.Scanner;

public class Exercise04_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char character = input.next().charAt(0);
        int ascii = character;

        System.out.println("The ASCII code for character " + character + " is " + ascii);
    }
}
