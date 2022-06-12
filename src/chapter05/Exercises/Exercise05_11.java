/**
 * (Find numbers divisible by 3 or 4, but not both) Write a program that displays all
 * the numbers from 100 to 200, ten per line, that are divisible by 3 or 4, but not both.
 * Numbers are separated by exactly one space.
 *
 * Created by Sven on 3/8/2019.
 */
package chapter05.Exercises;

public class Exercise05_11 {
    public static void main(String[] args) {
        int counter = 0;
        for (int i = 100; i <= 200; i++) {
            if ((i % 3 == 0 || i % 4 == 0) && (!(i % 3 == 0 && i % 4 == 0))) {
                System.out.print(i + "\t");
                counter++;
                if (counter % 10 == 0) {
                    System.out.println();
                }
            }
        }
    }
}
