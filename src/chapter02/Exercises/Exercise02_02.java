package chapter02.Exercises;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Exercise02_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter length of the sides and height of the Equilateral triangle: ");
        double side = input.nextDouble();
        double area = (sqrt(3.0) / 4.0) * (side * side);
        double volume = area * side;

        System.out.println("The area is " + String.format("%.2f", area));
        System.out.print("The volume of the Triangular prism is " + String.format("%.2f", volume));
    }
}
