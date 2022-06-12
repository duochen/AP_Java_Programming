/**
 * (Simulation: heads or tails) Write a program that simulates flipping a coin two
 * millions times and displays the number of heads and tails.
 *
 * Created by Sven on 4/14/2019.
 */
package chapter05.Exercises;

public class Exercise05_40 {
    public static void main(String[] args) {
        int headsCounter = 0, tailsCounter = 0;
        for (int i = 0; i < 2000000; i++) {
            int flip = (int) (Math.random() * 2);
            if (flip == 0) {
                headsCounter++;
            } else {
                tailsCounter++;
            }
        }
        System.out.println("Heads: " + headsCounter + " Tails: " + tailsCounter);
    }
}
