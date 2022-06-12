/**
 * (Display numbers in a pyramid pattern) Write a nested for loop that prints the
 * following output:
 *                                    1
 *                               1    3    1
 *                          1    3    9    3    1
 *                     1    3    9   27    9    3    1
 *                1    3    9   27   81   27    9    3    1
 *           1    3    9   27   81  243   81   27    9    3    1
 *      1    3    9   27   81  243  729  243   81   27    9    3    1
 * 1    3    9   27   81  243  729 2187  729  243   81   27    9    3    1
 * Created by Sven on 3/21/2019.
 */
package chapter05.Exercises;

public class Exercise05_19 {
    public static void main(String[] args) {
        int numOfLines = 8;
        for (int i = 0; i < numOfLines; i++) {
            for (int j = numOfLines - i - 1; j > 0; j--) {
                System.out.print("     ");
            }
            for (int j = 0; j <= i; j++) {
                if (j==0){
                    System.out.printf("%-1.0f", Math.pow(3, j));
                }else {
                System.out.printf("%5.0f", Math.pow(3, j));}
            }
            for (int j = i - 1; j >= 0; j--) {
                System.out.printf("%5.0f", Math.pow(3, j));
            }
            System.out.println();
        }
    }
}
