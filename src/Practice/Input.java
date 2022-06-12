package Practice;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double d = input.nextDouble();
        int i = input.nextInt();
        String s = input.next();
        System.out.println("d: " + d + " i: " + i + " s: " + s);
    }
}