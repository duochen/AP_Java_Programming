/*
    Mulitple-Choice Questions on Introductory Java Language Features
 */
package BarronAP.ch01.questions;

public class answers {

    private static void q1_01() {
        double x = 14.7;
        // int y = x;  // Can't cast double to int
    }

    private static void q1_02() {
        System.out.println("\\* This is not\n a comment *\\");
    }

    private static void q1_03() {
        int n = 0;
        int x = 100;
        int k = 0;
        if (n != 0 && x / n > 100) {
            k = 1;
        } else {
            k = 2;
        }
    }

    private static void q1_04() {
        double answer = 13.0 / 5;
        answer = 13 / (double) 5;
        answer = (double) (13/5);
    }

    private static void q1_05() {
        double x = 2.5;
        if (Math.pow(x, 0.5) == Math.sqrt(x)) {
            System.out.println("They are equal");
        } else {
            System.out.println("They are not equal");
        }
    }

    private static void q1_17() {
        int x = 10, y = 0;
        while (x > 5)
        {
            y = 3;
            while (y < x)
            {
                y *= 2;
                if (y % x == 1)
                    y += x;
            }
            x -= 3;
        }
        System.out.println(x + " " + y);
    }

    private static void q1_22() {
        int newNum = 0, temp;
        int num = 3;  // is some predefined integer value > 0
        while (num > 10)
        {
            temp = num % 10;
            num /= 10;
            newNum = newNum * 10 + temp;
        }
        System.out.println(newNum);
    }


    public static void main(String[] args) {
        q1_01();
        q1_02();
        q1_03();
        q1_04();
        q1_05();
        q1_17();
    }
}
