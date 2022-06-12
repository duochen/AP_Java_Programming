/**
 * (Occurrences of a specified character) Write a method that finds the number of
 * occurrences of a specified character in a string using the following header:
 * public static int count(String str, char a)
 *
 * Created by Sven on 07/16/19.
 */
package chapter06.Exercises;

import java.util.Scanner;

public class Exercise06_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        System.out.print("Enter a character: ");
        char ch = input.next().charAt(0);

        System.out.println("The number of occurrences of " + ch + " in " + str + " is " + count(str, ch));
    }

    public static int count(String str, char a) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == a) {
                count++;
            }
        }
        return count;
    }
}
