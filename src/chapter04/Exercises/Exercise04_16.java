/**
 * (Random character) Write a program that displays a random lowercase letter using
 * the Math.random() method.
 *
 * Created by Sven on 10/26/2018.
 */
package chapter04.Exercises;

public class Exercise04_16 {
    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * 26 + 97);
        char character = (char) randomNumber;
        System.out.println("The generated random lowercase letter is " + character);
    }
}
