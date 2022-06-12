/**
 * (Find the smallest n such that n^3 > 12,000) Use a while loop to find the smallest
 * integer n such that n3 is greater than 12,000.
 *
 * Created by Sven on 3/19/2019.
 */
package chapter05.Exercises;

public class Exercise05_12 {
    public static void main(String[] args) {
        int num = 0;
        while (Math.pow(num, 3) < 12000) {
            num++;
        }
        System.out.println(num + " is the smallest number such that n^3 > 12,000");
    }
}
