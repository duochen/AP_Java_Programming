/**
 * (Process a string) Write a program that prompts the user to enter a string and displays
 * its length and its last character.
 *
 * Created by Sven on 10/30/2018.
 */
package chapter04.Exercises;

import java.util.Scanner;

public class Exercise04_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = input.nextLine();
        System.out.println("The length of the string is " + string.length());
        System.out.println("The last character of the string is " + string.charAt(string.length() - 1));
    }
}
