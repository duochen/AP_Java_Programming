/**
 * (Display the ASCII character table) Write a program that prints the characters in
 * the ASCII character table from ! to ~. Display 10 characters per line. The ASCII
 * table is given in Appendix B. Characters are separated by exactly one space.
 *
 * Created by Sven on 3/19/2019.
 */
package chapter05.Exercises;

public class Exercise05_15 {
    public static void main(String[] args) {
        for (int i = '!', counter = 1; i <= '~'; i++) {
            counter++;
            System.out.print((counter % 10 != 0) ? (char) i + " " : (char) i + "\n");
        }
    }
}
